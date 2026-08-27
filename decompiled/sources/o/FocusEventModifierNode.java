package o;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FocusEventModifierNode {
    public static String IconCompatParcelizer(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static NotificationChannel read(NotificationManager notificationManager, String str, String str2) {
        return notificationManager.getNotificationChannel(str, str2);
    }
}
