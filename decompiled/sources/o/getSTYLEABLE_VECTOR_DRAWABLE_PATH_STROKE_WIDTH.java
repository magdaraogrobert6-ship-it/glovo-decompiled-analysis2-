package o;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH implements SemanticsInfo {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final Object IconCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final /* synthetic */ int write = 1;

    public getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(androidx.emoji2.text.EmojiProcessor emojiProcessor, setTransactionSuccessful settransactionsuccessful) {
        settransactionsuccessful.getClass();
        this.serializer = emojiProcessor;
        this.read = new String[]{settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.channel_notification_location_id), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.channel_notification_ably_id)};
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(6, settransactionsuccessful));
    }

    public getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(Application application, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, transferSessionPackageI transfersessionpackagei) {
        transactionwithresultsuspendimpl.getClass();
        transfersessionpackagei.getClass();
        this.serializer = application;
        this.read = transactionwithresultsuspendimpl;
        this.IconCompatParcelizer = transfersessionpackagei;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.read;
        Object obj2 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        if (i2 != 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                int i3 = MediaBrowserCompatMediaItem + 113;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj3);
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SCREEN_SHOT_DETECTION_LOGGING_ENABLED)) {
                    ((Application) obj2).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write());
                }
            }
            return createfromparcel;
        }
        androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) obj2;
        isAdapterPositionOnScreen isadapterpositiononscreen = (isAdapterPositionOnScreen) emojiProcessor.read;
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        int i5 = MediaBrowserCompatMediaItem + 97;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < length) {
            String str = strArr[i7];
            str.getClass();
            ((NotificationManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).deleteNotificationChannel(str);
            i7++;
            int i8 = RemoteActionCompatParcelizer + 123;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        for (HapticFeedbackType hapticFeedbackType : (List) ((isAdapterPositionOnScreen) obj3).MediaSessionCompatResultReceiverWrapper()) {
            hapticFeedbackType.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(hapticFeedbackType.read, hapticFeedbackType.write, 4);
            notificationChannel.setDescription(hapticFeedbackType.serializer);
            notificationChannel.enableVibration(true);
            notificationChannel.enableLights(true);
            notificationChannel.setImportance(4);
            notificationChannel.setLightColor(hapticFeedbackType.RemoteActionCompatParcelizer);
            Application application = (Application) emojiProcessor.serializer;
            String resourceName = application.getResources().getResourceName(hapticFeedbackType.IconCompatParcelizer);
            Uri uri = Uri.parse("android.resource://" + application.getPackageName() + "/raw/" + resourceName);
            Object objMediaSessionCompatResultReceiverWrapper = ((isAdapterPositionOnScreen) emojiProcessor.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            notificationChannel.setSound(uri, (AudioAttributes) objMediaSessionCompatResultReceiverWrapper);
            ((NotificationManager) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).createNotificationChannel(notificationChannel);
        }
        int i10 = MediaBrowserCompatMediaItem + 99;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return createfromparcel;
    }
}
