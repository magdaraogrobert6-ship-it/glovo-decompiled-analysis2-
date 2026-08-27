package o;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class MulticastConsumer {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    private static byte read = -112;
    public final enclosingTransactionruntime IconCompatParcelizer;
    public final Application RemoteActionCompatParcelizer;
    public Notification serializer;
    public ExtensionWindowAreaPresentationRequirements write;

    public MulticastConsumer(Application application, enclosingTransactionruntime enclosingtransactionruntime) {
        this.RemoteActionCompatParcelizer = application;
        this.IconCompatParcelizer = enclosingtransactionruntime;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final Notification read(ExtensionWindowAreaPresentationRequirements extensionWindowAreaPresentationRequirements) {
        Notification notificationSerializer;
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if ((extensionWindowAreaPresentationRequirements == null || extensionWindowAreaPresentationRequirements == this.write) && (notificationSerializer = this.serializer) != null) {
            if (notificationSerializer == null) {
                removeNodeAtDepth.serializer(RemoteMessageConst.NOTIFICATION);
                throw null;
            }
        } else if (extensionWindowAreaPresentationRequirements == null) {
            notificationSerializer = serializer(ExtensionWindowAreaPresentationRequirements.WORKING);
        } else {
            this.write = extensionWindowAreaPresentationRequirements;
            notificationSerializer = serializer(extensionWindowAreaPresentationRequirements);
        }
        this.serializer = notificationSerializer;
        int i4 = RatingCompat + 103;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return notificationSerializer;
    }

    public final Notification serializer(ExtensionWindowAreaPresentationRequirements extensionWindowAreaPresentationRequirements) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 13;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Application application = this.RemoteActionCompatParcelizer;
        androidx.core.app.NotificationManagerCompat notificationManagerCompatFrom = androidx.core.app.NotificationManagerCompat.from(application);
        notificationManagerCompatFrom.getClass();
        if (notificationManagerCompatFrom.getNotificationChannel("com.foodora.location") == null) {
            notificationManagerCompatFrom.createNotificationChannel(new NotificationChannel("com.foodora.location", "Location Service", 2));
        }
        getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(application, "com.foodora.location");
        String string = application.getString(extensionWindowAreaPresentationRequirements.getTitleRes());
        if (string.startsWith("%('")) {
            int i4 = RatingCompat + 71;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        getenterdhqq8s.PlaybackStateCompatCustomAction = getEnterdhqQ8s.serializer((CharSequence) string);
        String string2 = application.getString(extensionWindowAreaPresentationRequirements.getTextRes());
        if (string2.startsWith("%('")) {
            Object[] objArr3 = new Object[1];
            a(string2.substring(3), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        getenterdhqq8s.MediaDescriptionCompat = getEnterdhqQ8s.serializer((CharSequence) string2);
        getenterdhqq8s.write(2, true);
        getenterdhqq8s.write(16, false);
        getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = com.logistics.rider.glovo.R.drawable.ic_bold_large_notification_roadrunner;
        getenterdhqq8s.MediaMetadataCompat = PendingIntent.getActivity(application, 104, ((getActionViewIntentlambda0) this.IconCompatParcelizer).read(application, null, null, null, null, null, null, null, null), 67108864);
        Notification notificationWrite = getenterdhqq8s.write();
        notificationWrite.getClass();
        return notificationWrite;
    }
}
