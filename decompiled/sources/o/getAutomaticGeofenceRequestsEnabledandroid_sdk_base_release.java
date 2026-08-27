package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TransportMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release {
    public Boolean ComponentActivity;
    public DetectionTrigger IconCompatParcelizer;
    public TransportMode MediaBrowserCompatMediaItem;
    public Map MediaDescriptionCompat;
    public List MediaMetadataCompat;
    public List MediaSessionCompatQueueItem;
    public Byte MediaSessionCompatResultReceiverWrapper;
    public Byte MediaSessionCompatToken;
    public List ParcelableVolumeInfo;
    public HashMap PlaybackStateCompat;
    public List PlaybackStateCompatCustomAction;
    public List RatingCompat;
    public Long RemoteActionCompatParcelizer;
    public List r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Byte r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public DetectionTrigger read;
    public Long serializer;
    public String write;

    public final getBadNetworkIntervalandroid_sdk_base_release IconCompatParcelizer() {
        if (this.write == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_id' is missing");
            return null;
        }
        if (this.RemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
            return null;
        }
        if (this.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'stop' is missing");
            return null;
        }
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_open_trigger' is missing");
            return null;
        }
        if (this.read != null) {
            return new getBadNetworkIntervalandroid_sdk_base_release(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'trip_close_trigger' is missing");
        return null;
    }
}
