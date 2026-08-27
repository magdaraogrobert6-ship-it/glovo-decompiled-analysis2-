package o;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusRequesterCompanionFocusRequesterFactory {
    public static String IconCompatParcelizer(Context context) {
        return context.getAttributionTag();
    }

    public static void IconCompatParcelizer(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }

    public static void IconCompatParcelizer(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }

    public static String RemoteActionCompatParcelizer(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static Context read(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static String read(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static void write(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void read(android.graphics.Outline outline, android.graphics.Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }
}
