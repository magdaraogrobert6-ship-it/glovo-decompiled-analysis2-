package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.init.SentianceOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DelayedInitDetector")
public class setNotificationChannelId {
    private final Context IconCompatParcelizer;
    private SentianceOptions MediaDescriptionCompat;
    private StackTraceElement[] RatingCompat;
    private boolean RemoteActionCompatParcelizer = false;
    private final NotificationManager read;
    private final configureFromServerConfiglambda1 serializer;
    private final parseLonglambda0 write;

    public final boolean RemoteActionCompatParcelizer() {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer) {
                this.write.IconCompatParcelizer("SDK init is delayed due to incorrect init thread", new Object[0]);
                return true;
            }
            if (this.RatingCompat == null) {
                this.write.IconCompatParcelizer("The stack trace is null", new Object[0]);
                return false;
            }
            ArrayList<setPushDeliveryEnabled> arrayList = new ArrayList();
            arrayList.add(new setNotificationReceivedTimestampMillis());
            arrayList.add(new setNotificationVisibility());
            for (setPushDeliveryEnabled setpushdeliveryenabled : arrayList) {
                for (StackTraceElement stackTraceElement : this.RatingCompat) {
                    if (setpushdeliveryenabled.serializer(this.IconCompatParcelizer, stackTraceElement)) {
                        return false;
                    }
                }
            }
            this.write.IconCompatParcelizer("SDK init is delayed because the stack trace did not match the rules.", new Object[0]);
            return true;
        }
    }

    public final void read() {
        SentianceOptions sentianceOptions = this.MediaDescriptionCompat;
        parseLonglambda0 parselonglambda0 = this.write;
        NotificationManager notificationManager = this.read;
        if (sentianceOptions == null || sentianceOptions.isIncorrectInitializationNotificationDisabled()) {
            parselonglambda0.IconCompatParcelizer("SDK init delay notification has been disabled.", new Object[0]);
            notificationManager.deleteNotificationChannel("com.sentiance.sdk.debug");
            return;
        }
        if (this.serializer.read()) {
            parselonglambda0.IconCompatParcelizer("Notifying the user about the delayed SDK init.", new Object[0]);
            Context context = this.IconCompatParcelizer;
            int i = context.getApplicationInfo().icon;
            NotificationChannel notificationChannel = new NotificationChannel("com.sentiance.sdk.debug", "Sentiance SDK (debug)", 4);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            Notification.Builder builder = new Notification.Builder(context, "com.sentiance.sdk.debug");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://docs.sentiance.com/important-topics/sdk/appendix/sdk-initialization"));
            builder.setContentTitle("Incorrect SDK initialization").setContentText("The Sentiance SDK was initialized incorrectly. Tap for more info.").setSmallIcon(i).setShowWhen(false).setOngoing(false).setOnlyAlertOnce(true).setContentIntent(PendingIntent.getActivity(context, 0, intent, 67108864));
            notificationManager.notify(3066669, builder.build());
        }
    }

    public setNotificationChannelId(Context context, NotificationManager notificationManager, configureFromServerConfiglambda1 configurefromserverconfiglambda1, parseLonglambda0 parselonglambda0) {
        this.write = parselonglambda0;
        this.IconCompatParcelizer = context;
        this.serializer = configurefromserverconfiglambda1;
        this.read = notificationManager;
    }

    public final void read(SentianceOptions sentianceOptions) {
        this.RemoteActionCompatParcelizer = !(Looper.myLooper() == Looper.getMainLooper());
        this.MediaDescriptionCompat = sentianceOptions;
        this.RatingCompat = Thread.currentThread().getStackTrace();
    }
}
