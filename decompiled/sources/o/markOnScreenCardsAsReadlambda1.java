package o;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class markOnScreenCardsAsReadlambda1 {
    public static final boolean write(Context context) {
        return FocusListener.write(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    public static void read(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = r8lambda7GmUMp17UWm7j4LNO1nwTjU10.read;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = r8lambdaAJV8kW28VZgFhlyTLNptIpMUvs.write;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static String RemoteActionCompatParcelizer(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
