package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getRuntimeFeatureKeys {
    public static final getRuntimeFeatureKeys IconCompatParcelizer;
    public static final getRuntimeFeatureKeys MediaMetadataCompat;
    public static final getRuntimeFeatureKeys RemoteActionCompatParcelizer;
    public static final getRuntimeFeatureKeys read;
    public static final getRuntimeFeatureKeys serializer;
    public static final getRuntimeFeatureKeys write;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final getEvent MediaSessionCompatQueueItem;
    public final getFeaturesUpdateTime MediaSessionCompatToken;
    public final int PlaybackStateCompat;
    public final int PlaybackStateCompatCustomAction;
    public final int RatingCompat;

    static {
        getFeaturesUpdateTime getfeaturesupdatetime = getFeaturesUpdateTime.CLASSIC;
        RemoteActionCompatParcelizer = new getRuntimeFeatureKeys(3, getfeaturesupdatetime);
        getFeaturesUpdateTime getfeaturesupdatetime2 = getFeaturesUpdateTime.CIRCUMZENITHAL;
        IconCompatParcelizer = new getRuntimeFeatureKeys(3, getfeaturesupdatetime2);
        getFeaturesUpdateTime getfeaturesupdatetime3 = getFeaturesUpdateTime.COMPRESSED;
        serializer = new getRuntimeFeatureKeys(3, getfeaturesupdatetime3);
        write = new getRuntimeFeatureKeys(5, getfeaturesupdatetime);
        read = new getRuntimeFeatureKeys(5, getfeaturesupdatetime2);
        MediaMetadataCompat = new getRuntimeFeatureKeys(5, getfeaturesupdatetime3);
    }

    public getRuntimeFeatureKeys(int i, getFeaturesUpdateTime getfeaturesupdatetime) {
        if (i == 3) {
            this.PlaybackStateCompatCustomAction = 68;
            this.RatingCompat = 32;
            this.PlaybackStateCompat = 48;
            getEvent getevent = new getEvent(CustomerChatModulefetchUserFeatures1.ANY);
            CustomerChatModulesendMessage2.serializer();
            getevent.IconCompatParcelizer();
            this.MediaSessionCompatQueueItem = getevent;
        } else {
            if (i != 5) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No valid version. Please choose one of the following: 3, 5");
                throw null;
            }
            this.PlaybackStateCompatCustomAction = 96;
            this.RatingCompat = 36;
            this.PlaybackStateCompat = 64;
            this.MediaSessionCompatQueueItem = new getEvent();
        }
        int i2 = this.PlaybackStateCompatCustomAction;
        int i3 = this.RatingCompat;
        int i4 = this.PlaybackStateCompat;
        this.MediaBrowserCompatMediaItem = i2 + i3 + i4;
        this.MediaDescriptionCompat = i3 + i4;
        this.MediaSessionCompatToken = getfeaturesupdatetime;
    }
}
