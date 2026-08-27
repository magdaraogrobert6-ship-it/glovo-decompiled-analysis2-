package o;

import android.util.Pair;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class setAccentColorIfPresentAndSupportedlambda0 extends logBaiduNotificationClicklambda1 {
    private final setSoundIfPresentAndSupportedlambda1 IconCompatParcelizer;
    private final long MediaBrowserCompatMediaItem;
    private final DetectionTrigger MediaDescriptionCompat;
    private final Byte MediaMetadataCompat;
    private final parseLonglambda0 MediaSessionCompatQueueItem;
    private final boolean MediaSessionCompatResultReceiverWrapper;
    private final sendPushActionIntentlambda0 MediaSessionCompatToken;
    private final getTrackingStringandroid_sdk_base_releaseannotations ParcelableVolumeInfo;
    private final ConfigurationManager PlaybackStateCompat;
    private final setTickerIfPresent PlaybackStateCompatCustomAction;
    private final DetectionTrigger RatingCompat;
    private final getVerticalAccuracy RemoteActionCompatParcelizer;
    private final Map<Long, String> read;
    private final component4android_sdk_base_release serializer;
    private final getCooldownEnterSeconds write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        Map<Long, String> map = this.read;
        Object[] objArr = {Integer.valueOf(map.size())};
        parseLonglambda0 parselonglambda0 = this.MediaSessionCompatQueueItem;
        parselonglambda0.IconCompatParcelizer("Creating Trip iterator with %d chunks:", objArr);
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            parselonglambda0.IconCompatParcelizer(" - %s starting at %s", entry.getValue(), com.sentiance.sdk.util.x.c(entry.getKey().longValue()));
        }
        return new setAccentColorIfPresentAndSupported(this.IconCompatParcelizer, this.write, this.serializer, this.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.RatingCompat, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.PlaybackStateCompat, this.ParcelableVolumeInfo, this.MediaSessionCompatResultReceiverWrapper, this.PlaybackStateCompatCustomAction, this.MediaSessionCompatToken);
    }

    public setAccentColorIfPresentAndSupportedlambda0(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, Map<Long, String> map, getVerticalAccuracy getverticalaccuracy, long j, DetectionTrigger detectionTrigger, DetectionTrigger detectionTrigger2, Byte b, parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, getTrackingStringandroid_sdk_base_releaseannotations gettrackingstringandroid_sdk_base_releaseannotations, boolean z, setTickerIfPresent settickerifpresent, sendPushActionIntentlambda0 sendpushactionintentlambda0) {
        this.IconCompatParcelizer = setsoundifpresentandsupportedlambda1;
        this.write = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = getverticalaccuracy;
        this.serializer = component4android_sdk_base_releaseVar;
        this.read = map;
        this.MediaBrowserCompatMediaItem = j;
        this.MediaDescriptionCompat = detectionTrigger;
        this.RatingCompat = detectionTrigger2;
        this.MediaMetadataCompat = b;
        this.MediaSessionCompatQueueItem = parselonglambda0;
        this.PlaybackStateCompat = configurationManager;
        this.ParcelableVolumeInfo = gettrackingstringandroid_sdk_base_releaseannotations;
        this.PlaybackStateCompatCustomAction = settickerifpresent;
        this.MediaSessionCompatResultReceiverWrapper = z;
        this.MediaSessionCompatToken = sendpushactionintentlambda0;
    }
}
