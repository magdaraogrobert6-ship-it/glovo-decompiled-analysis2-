package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onEndApplyChanges {
    public static final onPreLayoutNodeReused RemoteActionCompatParcelizer = onPreLayoutNodeReused.WARN;

    public static void RemoteActionCompatParcelizer(String str, String str2, Object... objArr) {
        write(onPreLayoutNodeReused.WARN, str, str2, objArr);
    }

    public static boolean RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer.ordinal() >= onPreLayoutNodeReused.DEBUG.ordinal();
    }

    public static void read(String str, String str2, Object... objArr) {
        write(onPreLayoutNodeReused.DEBUG, str, str2, objArr);
    }

    public static void write(onPreLayoutNodeReused onprelayoutnodereused, String str, String str2, Object... objArr) {
        if (onprelayoutnodereused.ordinal() >= RemoteActionCompatParcelizer.ordinal()) {
            String strM = ff$$ExternalSyntheticOutline0.m("(26.1.1) [", str, "]: ");
            if (objArr.length > 0) {
                str2 = String.format(str2, objArr);
            }
            String strConcat = strM.concat(str2);
            int i = onPostLayoutNodeReused.IconCompatParcelizer[onprelayoutnodereused.ordinal()];
            if (i == 2) {
                SentryLogcatAdapter.IconCompatParcelizer("Firestore", strConcat);
            } else {
                if (i != 3) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Trying to log something on level NONE");
            }
        }
    }
}
