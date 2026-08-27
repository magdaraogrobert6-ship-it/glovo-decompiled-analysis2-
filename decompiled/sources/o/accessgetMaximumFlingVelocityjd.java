package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetMaximumFlingVelocityjd {
    public static HashMap IconCompatParcelizer(HashMap map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(write((String) entry.getKey()), entry.getValue());
        }
        return map2;
    }

    public static String RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, com.adjust.sdk.Constants.ENCODING);
        char[] cArr = new char[androidx.compose.ui.graphics.Fields.TransformOrigin];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public static ViewCompositionStrategy_androidKtinstallForLifecycle2 RemoteActionCompatParcelizer(String str, String str2) {
        byte b;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle2 = ViewCompositionStrategy_androidKtinstallForLifecycle2.write;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle3 = ViewCompositionStrategy_androidKtinstallForLifecycle2.serializer;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle4 = ViewCompositionStrategy_androidKtinstallForLifecycle2.IconCompatParcelizer;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle5 = ViewCompositionStrategy_androidKtinstallForLifecycle2.read;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle6 = ViewCompositionStrategy_androidKtinstallForLifecycle2.RemoteActionCompatParcelizer;
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return viewCompositionStrategy_androidKtinstallForLifecycle2;
                }
                if (str2.contains("connect-dre")) {
                    return viewCompositionStrategy_androidKtinstallForLifecycle3;
                }
                if (str2.contains("connect-drru")) {
                    return viewCompositionStrategy_androidKtinstallForLifecycle4;
                }
                if (str2.contains("connect-dra")) {
                    return viewCompositionStrategy_androidKtinstallForLifecycle5;
                }
            }
            return viewCompositionStrategy_androidKtinstallForLifecycle6;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 2155) {
            if (iHashCode != 2177) {
                if (iHashCode != 2627) {
                    if (iHashCode == 2644 && str.equals("SG")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("RU")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("DE")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("CN")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return viewCompositionStrategy_androidKtinstallForLifecycle2;
        }
        if (b == 1) {
            return viewCompositionStrategy_androidKtinstallForLifecycle3;
        }
        if (b != 2) {
            return b != 3 ? viewCompositionStrategy_androidKtinstallForLifecycle6 : viewCompositionStrategy_androidKtinstallForLifecycle5;
        }
        return viewCompositionStrategy_androidKtinstallForLifecycle4;
    }

    public static void serializer(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                SentryLogcatAdapter.serializer("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }

    public static String write(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/".concat(str.substring(i));
    }
}
