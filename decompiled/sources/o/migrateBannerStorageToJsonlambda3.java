package o;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sentiance.sdk.services.ServiceForegroundState;

/* JADX INFO: loaded from: classes3.dex */
public class migrateBannerStorageToJsonlambda3 {
    public static Notification read(Context context) {
        String string = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        int i = context.getApplicationInfo().icon;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.sentiance.sdk.detections", string, 2));
        }
        Notification.Builder builder = new Notification.Builder(context, "com.sentiance.sdk.detections");
        builder.setContentTitle(string).setSmallIcon(i).setShowWhen(false).setPriority(-2);
        return builder.build();
    }

    public static ServiceForegroundState serializer(ActivityManager activityManager, Class cls) {
        try {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                if (runningServiceInfo.service.getClassName().equals(cls.getName())) {
                    if (runningServiceInfo.foreground) {
                        return ServiceForegroundState.FOREGROUNDED;
                    }
                    return ServiceForegroundState.BACKGROUNDED;
                }
            }
            return ServiceForegroundState.NOT_STARTED;
        } catch (SecurityException unused) {
            return ServiceForegroundState.NOT_STARTED;
        }
    }
}
