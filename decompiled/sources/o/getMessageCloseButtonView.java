package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import net.danlew.android.joda.R$raw;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class getMessageCloseButtonView implements org.joda.time.tz.Provider {
    public final ConcurrentHashMap RemoteActionCompatParcelizer;
    public final Context serializer;

    public final InputStream read(String str) throws IOException {
        Map concurrentHashMap;
        int iIntValue;
        Context context = this.serializer;
        if (context == null) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Need to call JodaTimeAndroid.init() before using joda-time-android");
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = IInAppMessageView.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.append(BundleUtil.UNDERLINE_TAG);
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(java.util.Locale.US));
        String string = sb.toString();
        ConcurrentHashMap concurrentHashMap3 = IInAppMessageView.IconCompatParcelizer;
        if (concurrentHashMap3.containsKey(R$raw.class)) {
            concurrentHashMap = (Map) concurrentHashMap3.get(R$raw.class);
        } else {
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap3.put(R$raw.class, concurrentHashMap);
        }
        if (concurrentHashMap.containsKey(string)) {
            iIntValue = ((Integer) concurrentHashMap.get(string)).intValue();
        } else {
            try {
                iIntValue = R$raw.class.getField(string).getInt(null);
                if (iIntValue != 0) {
                    concurrentHashMap.put(string, Integer.valueOf(iIntValue));
                }
            } catch (Exception e) {
                SentryLogcatAdapter.read("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + string, e);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            return context.getResources().openRawResource(iIntValue);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Resource not found: \"", str, "\" (resName: \"", string, "\")"));
        return null;
    }

    @Override // org.joda.time.tz.Provider
    public final Set getAvailableIDs() {
        return new TreeSet(this.RemoteActionCompatParcelizer.keySet());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:9:0x001a */
    public final DateTimeZone IconCompatParcelizer(String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = read(str);
                try {
                    DateTimeZone from = DateTimeZoneBuilder.readFrom(inputStream, str);
                    concurrentHashMap.put(str, new SoftReference(from));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return from;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            throw th;
        }
    }

    @Override // org.joda.time.tz.Provider
    public final DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.RemoteActionCompatParcelizer.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return IconCompatParcelizer(str);
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            return dateTimeZone != null ? dateTimeZone : IconCompatParcelizer(str);
        }
        return getZone((String) obj);
    }

    public getMessageCloseButtonView(Context context) throws IOException {
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Context must not be null");
            throw null;
        }
        this.serializer = context.getApplicationContext();
        InputStream inputStream = read("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i = 0; i < unsignedShort; i++) {
                strArr[i] = dataInputStream.readUTF().intern();
            }
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            for (int i2 = 0; i2 < unsignedShort2; i2++) {
                try {
                    concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Corrupt zone info map");
                    dataInputStream.close();
                    concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
                    this.RemoteActionCompatParcelizer = concurrentHashMap;
                }
            }
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            this.RemoteActionCompatParcelizer = concurrentHashMap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
