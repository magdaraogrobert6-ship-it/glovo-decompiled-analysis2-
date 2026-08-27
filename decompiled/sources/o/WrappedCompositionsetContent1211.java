package o;

import android.os.Process;
import android.util.Log;
import androidx.transition.Transition$1;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.sentiance.okhttp3.u$a;
import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WrappedCompositionsetContent1211 {
    public static final i$d.a IconCompatParcelizer = new i$d.a(16);

    public static void IconCompatParcelizer(String str, String str2) {
        Object obj = IconCompatParcelizer.read;
        Transition$1.RemoteActionCompatParcelizer(4, str, str2);
        createApplier.RemoteActionCompatParcelizer(str, createApplier.IconCompatParcelizer(str, str2));
        accessgetNodeToNodeStatep.read(str, str2);
    }

    public static void RemoteActionCompatParcelizer(String str, String str2) {
        Object obj = IconCompatParcelizer.read;
        Transition$1.RemoteActionCompatParcelizer(4, str, str2);
        accessgetNodeToNodeStatep.read(str, str2);
    }

    public static void read() {
        IconCompatParcelizer.getClass();
    }

    public static void serializer(String str, String str2) {
        Object obj = IconCompatParcelizer.read;
        Transition$1.RemoteActionCompatParcelizer(6, str, str2);
        createApplier.RemoteActionCompatParcelizer(str, createApplier.IconCompatParcelizer(str, str2));
        accessgetNodeToNodeStatep.serializer(str, str2);
    }

    public static void write(u$a u_a) {
        String string;
        IconCompatParcelizer.getClass();
        ArrayList arrayList = u_a.IconCompatParcelizer;
        StringBuffer stringBuffer = new StringBuffer();
        if (arrayList.isEmpty()) {
            stringBuffer.append("|\r\n");
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i != arrayList.size() - 1) {
                    stringBuffer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    stringBuffer.append((String) arrayList.get(i));
                } else {
                    stringBuffer.append("\r\n");
                }
            }
        }
        Transition$1.RemoteActionCompatParcelizer(6, "ActivityRecognitionClientImpl", stringBuffer.toString());
        ArrayList arrayList2 = u_a.IconCompatParcelizer;
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        byte[] bytes = new byte[0];
        try {
            if (arrayList2.isEmpty()) {
                string = str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + "ActivityRecognitionClientImpl\r\n";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer(str);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 != arrayList2.size() - 1) {
                        stringBuffer2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        stringBuffer2.append((String) arrayList2.get(i2));
                    } else {
                        stringBuffer2.append('\r');
                        stringBuffer2.append('\n');
                    }
                }
                string = stringBuffer2.toString();
            }
            bytes = string.getBytes(com.adjust.sdk.Constants.ENCODING);
        } catch (UnsupportedEncodingException unused) {
            write("LogCache", "putStr() UnsupportedEncodingException");
        }
        createApplier.RemoteActionCompatParcelizer("ActivityRecognitionClientImpl", bytes);
    }

    public static void write(String str, String str2) {
        Object obj = IconCompatParcelizer.read;
        Transition$1.RemoteActionCompatParcelizer(5, str, str2);
        if (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write) {
            int iMyPid = Process.myPid();
            int iMyTid = Process.myTid();
            Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = Wrapper_androidKtsetContent1.RemoteActionCompatParcelizer;
            wrapper_androidKtsetContent1.serializer.offer(new Wrapper_androidKt("W", accessgetNodeToNodeStatep.IconCompatParcelizer(iMyPid, iMyTid, str), str2));
        }
    }

    public static void read(String str, String str2) {
        Object obj = IconCompatParcelizer.read;
        Transition$1.RemoteActionCompatParcelizer(6, str, str2);
        accessgetNodeToNodeStatep.serializer(str, str2);
    }

    public static void write(String str, String str2, Throwable th) {
        Object obj = IconCompatParcelizer.read;
        WrappedCompositionsetContent1221 wrappedCompositionsetContent1221 = new WrappedCompositionsetContent1221(6, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("LITE_SDK-", str));
        StringBuilder sb = wrappedCompositionsetContent1221.write;
        sb.append((Object) str2);
        sb.append((Object) '\n');
        sb.append((Object) Log.getStackTraceString(th));
        StringBuilder sb2 = new StringBuilder();
        wrappedCompositionsetContent1221.IconCompatParcelizer(sb2);
        Log.println(6, str, Normalizer.normalize(sb2.toString().concat(" ".concat(sb.toString())), Normalizer.Form.NFKC).replace("\\n", "").replace("\\r", ""));
        accessgetNodeToNodeStatep.serializer(str, str2);
    }
}
