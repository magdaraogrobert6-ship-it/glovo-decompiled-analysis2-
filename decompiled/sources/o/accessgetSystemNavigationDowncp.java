package o;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetSystemNavigationDowncp {
    public static final Object IconCompatParcelizer = new Object();
    public static boolean RemoteActionCompatParcelizer;
    public static int read;

    public static void IconCompatParcelizer(boolean z) {
        if (z) {
            return;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
    }

    public static void IconCompatParcelizer(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void write(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            c8$$ExternalSyntheticOutline0.m(sb, "Must be called on ", name2, " thread, but got ", name);
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.write(sb, ".");
        }
    }

    public static void IconCompatParcelizer(Object obj) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null reference");
    }

    public static void serializer(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void serializer(String str, boolean z) {
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void RemoteActionCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given String is empty or null");
        }
    }

    public static void serializer(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
    }

    public static void RemoteActionCompatParcelizer(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str2);
        }
    }

    public static void write(String str, boolean z) {
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
    }

    public static void RemoteActionCompatParcelizer(boolean z) {
        if (z) {
            return;
        }
        DrawableTransformation.write();
    }
}
