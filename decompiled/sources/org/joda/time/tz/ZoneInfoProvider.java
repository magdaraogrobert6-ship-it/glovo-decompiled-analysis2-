package org.joda.time.tz;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import o.getActiveFocusTargetNode;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class ZoneInfoProvider implements Provider {
    private final File iFileDir;
    private final ClassLoader iLoader;
    private final String iResourcePath;
    private final Set<String> iZoneInfoKeys;
    private final Map<String, Object> iZoneInfoMap;

    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    private DateTimeZone loadZoneData(String str) throws Throwable {
        InputStream inputStreamOpenResource;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStreamOpenResource = openResource(str);
                try {
                    DateTimeZone from = DateTimeZoneBuilder.readFrom(inputStreamOpenResource, str);
                    this.iZoneInfoMap.put(str, new SoftReference(from));
                    if (inputStreamOpenResource != null) {
                        try {
                            inputStreamOpenResource.close();
                        } catch (IOException unused) {
                        }
                    }
                    return from;
                } catch (IOException e) {
                    e = e;
                    uncaughtException(e);
                    this.iZoneInfoMap.remove(str);
                    if (inputStreamOpenResource != null) {
                        try {
                            inputStreamOpenResource.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamOpenResource = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    @Override // org.joda.time.tz.Provider
    public Set<String> getAvailableIDs() {
        return this.iZoneInfoKeys;
    }

    public void uncaughtException(Exception exc) {
        exc.printStackTrace();
    }

    private static Map<String, Object> loadZoneInfoMap(InputStream inputStream) throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            readZoneInfoMap(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static void readZoneInfoMap(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Corrupt zone info map");
                return;
            }
        }
    }

    @Override // org.joda.time.tz.Provider
    public DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.iZoneInfoMap.get(str)) == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            return dateTimeZone != null ? dateTimeZone : loadZoneData(str);
        }
        if (str.equals(obj)) {
            return loadZoneData(str);
        }
        return getZone((String) obj);
    }

    public ZoneInfoProvider(File file) throws IOException {
        if (file == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No file directory provided");
            throw null;
        }
        if (!file.exists()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file, "File directory doesn't exist: ");
            throw null;
        }
        if (!file.isDirectory()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file, "File doesn't refer to a directory: ");
            throw null;
        }
        this.iFileDir = file;
        this.iResourcePath = null;
        this.iLoader = null;
        Map<String, Object> mapLoadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
        this.iZoneInfoMap = mapLoadZoneInfoMap;
        this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(mapLoadZoneInfoMap.keySet()));
    }

    private InputStream openResource(String str) throws IOException {
        File file = this.iFileDir;
        if (file != null) {
            File file2 = new File(file, str);
            return getActiveFocusTargetNode.write(file2, new FileInputStream(file2));
        }
        final String strConcat = this.iResourcePath.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.joda.time.tz.ZoneInfoProvider.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public InputStream run() {
                return ZoneInfoProvider.this.iLoader != null ? ZoneInfoProvider.this.iLoader.getResourceAsStream(strConcat) : ClassLoader.getSystemResourceAsStream(strConcat);
            }
        });
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(strConcat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader = this.iLoader;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new IOException(sb.toString());
    }

    public ZoneInfoProvider() throws IOException {
        this(DateTimeZone.DEFAULT_TZ_DATA_PATH);
    }

    public ZoneInfoProvider(String str) throws IOException {
        this(str, null, false);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader) throws IOException {
        this(str, classLoader, true);
    }

    private ZoneInfoProvider(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str != null) {
            str = str.endsWith("/") ? str : str.concat("/");
            this.iFileDir = null;
            this.iResourcePath = str;
            if (classLoader == null && !z) {
                classLoader = getClass().getClassLoader();
            }
            this.iLoader = classLoader;
            Map<String, Object> mapLoadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            this.iZoneInfoMap = mapLoadZoneInfoMap;
            this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(mapLoadZoneInfoMap.keySet()));
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No resource path provided");
        throw null;
    }
}
