package o;

import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg {
    public static void IconCompatParcelizer(String str) {
        RemoteActionCompatParcelizer();
    }

    public static String RemoteActionCompatParcelizer() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static void read(Serializable serializable) {
        SentryLogcatAdapter.serializer("RootBeer", RemoteActionCompatParcelizer().concat(String.valueOf(serializable)));
        SentryLogcatAdapter.serializer("QLog", RemoteActionCompatParcelizer().concat(String.valueOf(serializable)));
    }

    public static String write(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public static void IconCompatParcelizer(Exception exc) {
        exc.printStackTrace();
    }
}
