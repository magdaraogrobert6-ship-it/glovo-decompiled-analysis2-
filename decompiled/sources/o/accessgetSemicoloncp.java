package o;

import android.util.Log;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSemicoloncp {
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();
    public static final toZui_graphics write = new toZui_graphics("LibraryVersion", "");
    public static final accessgetSemicoloncp read = new accessgetSemicoloncp();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.InputStream] */
    public final String IconCompatParcelizer(String str) throws Throwable {
        String str2;
        ?? resourceAsStream;
        toZui_graphics tozui_graphics = write;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.serializer;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        ?? properties = new Properties();
        String property = null;
        property = null;
        property = null;
        property = null;
        ?? r5 = 0;
        try {
            try {
                resourceAsStream = accessgetSemicoloncp.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != 0) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(property);
                        String string = sb.toString();
                        if (Log.isLoggable(tozui_graphics.serializer, 2)) {
                            tozui_graphics.read(string);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb2.append("Failed to get app version for libraryName: ");
                        sb2.append(str);
                        String string2 = sb2.toString();
                        if (Log.isLoggable(tozui_graphics.serializer, 5)) {
                            SentryLogcatAdapter.IconCompatParcelizer("LibraryVersion", tozui_graphics.read(string2));
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    str2 = property;
                    r5 = resourceAsStream;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb3.append("Failed to get app version for libraryName: ");
                    sb3.append(str);
                    tozui_graphics.RemoteActionCompatParcelizer("LibraryVersion", sb3.toString(), e);
                    String str3 = str2;
                    resourceAsStream = r5;
                    property = str3;
                } catch (Throwable th) {
                    th = th;
                    if (resourceAsStream != 0) {
                        try {
                            resourceAsStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resourceAsStream = property;
            }
        } catch (IOException e2) {
            e = e2;
            str2 = null;
        }
        if (resourceAsStream != 0) {
            try {
                resourceAsStream.close();
            } catch (IOException unused2) {
            }
        }
        if (property == null) {
            if (Log.isLoggable(tozui_graphics.serializer, 3)) {
                tozui_graphics.read(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            property = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        concurrentHashMap.put(str, property);
        return property;
    }
}
