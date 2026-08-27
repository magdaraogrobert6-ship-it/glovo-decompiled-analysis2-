package o;

import android.app.Notification;
import android.app.NotificationChannel;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetRightcp {
    public static void serializer(NotificationChannel notificationChannel) {
        notificationChannel.canBubble();
    }

    public static void write(getAdd0d7_KjU getadd0d7_kju, int i, Notification notification, int i2) {
        getadd0d7_kju.startForeground(i, notification, i2);
    }
}
