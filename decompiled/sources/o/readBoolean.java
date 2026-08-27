package o;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public class readBoolean {
    private static final containsandroid_sdk_base_release IconCompatParcelizer = new containsandroid_sdk_base_release("main", Looper.getMainLooper());

    public static void IconCompatParcelizer(Runnable runnable, long j) {
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = IconCompatParcelizer;
        if (j > 0) {
            containsandroid_sdk_base_releaseVar.IconCompatParcelizer(runnable, j);
        } else {
            containsandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(runnable);
        }
    }

    public static void read(Runnable runnable) {
        if (setNotificationBadgeNumber.read().IconCompatParcelizer()) {
            IconCompatParcelizer(runnable, 0L);
        }
    }

    public static void serializer(Runnable runnable) {
        if (setNotificationBadgeNumber.read().write()) {
            IconCompatParcelizer(runnable, 0L);
        }
    }

    public static void write(Runnable runnable) {
        IconCompatParcelizer(runnable, 0L);
    }
}
