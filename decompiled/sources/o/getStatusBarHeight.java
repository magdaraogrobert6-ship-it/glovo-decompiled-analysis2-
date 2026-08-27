package o;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getStatusBarHeight {
    public static final Map IconCompatParcelizer;
    public static final CopyOnWriteArraySet write = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(r8lambdaD2YkNW9uAe_tDQz1ikCscnnqHvM.class.getName(), "okhttp.Http2");
        linkedHashMap.put(InAppMessageHtmlFullView.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        IconCompatParcelizer = onMove.serializer(linkedHashMap);
    }

    public static void read(int i, String str, String str2, Throwable th) {
        int iMin;
        String strWrite = (String) IconCompatParcelizer.get(str);
        if (strWrite == null) {
            strWrite = hideCurrentlyDisplayingInAppMessage.write(23, str);
        }
        if (Log.isLoggable(strWrite, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, '\n', i2, false, 4);
                if (iWrite == -1) {
                    iWrite = length;
                }
                while (true) {
                    iMin = Math.min(iWrite, i2 + 4000);
                    Log.println(i, strWrite, str2.substring(i2, iMin));
                    if (iMin >= iWrite) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
