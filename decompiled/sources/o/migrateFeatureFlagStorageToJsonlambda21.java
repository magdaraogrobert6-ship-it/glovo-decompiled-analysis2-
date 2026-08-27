package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TransportMode;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class migrateFeatureFlagStorageToJsonlambda21 {
    private final List<createNotification> IconCompatParcelizer;
    private final List<setCustomUserAttributelambda4> MediaBrowserCompatMediaItem;
    private final List<setCustomWebViewActivityClass> MediaDescriptionCompat;
    private final List<removeFromSubscriptionGrouplambda0> MediaMetadataCompat;
    private final List<setDefaultNotificationChannelDescriptionlambda0> MediaSessionCompatQueueItem;
    private final TransportMode MediaSessionCompatToken;
    private final Map<String, String> ParcelableVolumeInfo;
    private final long PlaybackStateCompat;
    private final long PlaybackStateCompatCustomAction;
    private final List<getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations> RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final Byte read;
    private final DetectionTrigger serializer;
    private final DetectionTrigger write;

    public final getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release RemoteActionCompatParcelizer() {
        getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release getautomaticgeofencerequestsenabledandroid_sdk_base_release = new getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release();
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaDescriptionCompat = this.ParcelableVolumeInfo;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaBrowserCompatMediaItem = this.MediaSessionCompatToken;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatQueueItem = this.IconCompatParcelizer;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.RatingCompat = this.MediaMetadataCompat;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.MediaDescriptionCompat;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaMetadataCompat = this.RatingCompat;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.PlaybackStateCompatCustomAction = this.MediaBrowserCompatMediaItem;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.ParcelableVolumeInfo = this.MediaSessionCompatQueueItem;
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_id' cannot be null");
            return null;
        }
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.write = str;
        DetectionTrigger detectionTrigger = this.write;
        if (detectionTrigger == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_open_trigger' cannot be null");
            return null;
        }
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.IconCompatParcelizer = detectionTrigger;
        DetectionTrigger detectionTrigger2 = this.serializer;
        if (detectionTrigger2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_close_trigger' cannot be null");
            return null;
        }
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.read = detectionTrigger2;
        DetectionTrigger detectionTrigger3 = DetectionTrigger.EXTERNAL;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper = Byte.valueOf(detectionTrigger == detectionTrigger3 ? (byte) 2 : (byte) 1);
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Byte.valueOf(detectionTrigger2 != detectionTrigger3 ? (byte) 1 : (byte) 2);
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatToken = this.read;
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.RemoteActionCompatParcelizer = Long.valueOf(this.PlaybackStateCompat);
        getautomaticgeofencerequestsenabledandroid_sdk_base_release.serializer = Long.valueOf(this.PlaybackStateCompatCustomAction);
        return getautomaticgeofencerequestsenabledandroid_sdk_base_release;
    }

    public migrateFeatureFlagStorageToJsonlambda21(String str, DetectionTrigger detectionTrigger, DetectionTrigger detectionTrigger2, Byte b, List<removeFromSubscriptionGrouplambda0> list, List<getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations> list2, List<setCustomUserAttributelambda4> list3, List<setDefaultNotificationChannelDescriptionlambda0> list4, List<createNotification> list5, List<setCustomWebViewActivityClass> list6, long j, long j2, Map<String, String> map, TransportMode transportMode) {
        this.IconCompatParcelizer = list5;
        this.MediaMetadataCompat = list;
        this.RatingCompat = list2;
        this.MediaBrowserCompatMediaItem = list3;
        this.MediaSessionCompatQueueItem = list4;
        this.RemoteActionCompatParcelizer = str;
        this.write = detectionTrigger;
        this.serializer = detectionTrigger2;
        this.read = b;
        this.MediaDescriptionCompat = list6;
        this.PlaybackStateCompat = j;
        this.PlaybackStateCompatCustomAction = j2;
        this.ParcelableVolumeInfo = map;
        this.MediaSessionCompatToken = transportMode;
    }
}
