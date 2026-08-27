package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class getD50Xyzui_graphics {
    public static final getC write = new getC();

    public static void IconCompatParcelizer(String str) {
        write.getClass();
        HashSet hashSet = getC.RemoteActionCompatParcelizer;
        if (hashSet.contains(str)) {
            return;
        }
        SentryLogcatAdapter.write("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void IconCompatParcelizer(String str, Throwable th) {
        write.getClass();
        HashSet hashSet = getC.RemoteActionCompatParcelizer;
        if (hashSet.contains(str)) {
            return;
        }
        SentryLogcatAdapter.write("LOTTIE", str, th);
        hashSet.add(str);
    }
}
