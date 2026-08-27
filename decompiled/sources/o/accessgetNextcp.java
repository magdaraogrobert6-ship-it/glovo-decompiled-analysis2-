package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetNextcp {
    public final String IconCompatParcelizer;
    public final CharSequence MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final boolean ParcelableVolumeInfo;
    public final long[] PlaybackStateCompat;
    public final Uri PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final AudioAttributes read;
    public final String serializer;
    public final String write;

    public final NotificationChannel RemoteActionCompatParcelizer() {
        String str;
        String str2;
        NotificationChannel notificationChannel = new NotificationChannel(this.serializer, this.MediaBrowserCompatMediaItem, this.RatingCompat);
        notificationChannel.setDescription(this.RemoteActionCompatParcelizer);
        notificationChannel.setGroup(this.IconCompatParcelizer);
        notificationChannel.setShowBadge(this.ParcelableVolumeInfo);
        notificationChannel.setSound(this.PlaybackStateCompatCustomAction, this.read);
        notificationChannel.enableLights(this.MediaMetadataCompat);
        notificationChannel.setLightColor(this.MediaDescriptionCompat);
        notificationChannel.setVibrationPattern(this.PlaybackStateCompat);
        notificationChannel.enableVibration(this.MediaSessionCompatResultReceiverWrapper);
        if (Build.VERSION.SDK_INT >= 30 && (str = this.MediaSessionCompatQueueItem) != null && (str2 = this.write) != null) {
            FocusRequesterCompanionFocusRequesterFactory.IconCompatParcelizer(notificationChannel, str, str2);
        }
        return notificationChannel;
    }

    public accessgetNextcp(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        this.ParcelableVolumeInfo = true;
        this.PlaybackStateCompatCustomAction = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.MediaDescriptionCompat = 0;
        id.getClass();
        this.serializer = id;
        this.RatingCompat = importance;
        this.read = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.MediaBrowserCompatMediaItem = notificationChannel.getName();
        this.RemoteActionCompatParcelizer = notificationChannel.getDescription();
        this.IconCompatParcelizer = notificationChannel.getGroup();
        this.ParcelableVolumeInfo = notificationChannel.canShowBadge();
        this.PlaybackStateCompatCustomAction = notificationChannel.getSound();
        this.read = notificationChannel.getAudioAttributes();
        this.MediaMetadataCompat = notificationChannel.shouldShowLights();
        this.MediaDescriptionCompat = notificationChannel.getLightColor();
        this.MediaSessionCompatResultReceiverWrapper = notificationChannel.shouldVibrate();
        this.PlaybackStateCompat = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.MediaSessionCompatQueueItem = FocusRequesterCompanionFocusRequesterFactory.read(notificationChannel);
            this.write = FocusRequesterCompanionFocusRequesterFactory.RemoteActionCompatParcelizer(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            accessgetRightcp.serializer(notificationChannel);
        }
        if (i >= 30) {
            FocusRequesterCompanionFocusRequesterFactory.IconCompatParcelizer(notificationChannel);
        }
    }
}
