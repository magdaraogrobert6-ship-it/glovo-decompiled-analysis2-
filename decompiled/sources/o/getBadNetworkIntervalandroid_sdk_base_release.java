package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.TransportMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getBadNetworkIntervalandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getCustomEndpointandroid_sdk_base_release write = new getCustomEndpointandroid_sdk_base_release();
    public final Byte ComponentActivity;
    public final String IconCompatParcelizer;
    public final DetectionTrigger MediaBrowserCompatMediaItem;
    public final TransportMode MediaDescriptionCompat;
    public final List MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final Map MediaSessionCompatResultReceiverWrapper;
    public final List MediaSessionCompatToken;
    public final Map ParcelableVolumeInfo;
    public final Byte PlaybackStateCompat;
    public final List PlaybackStateCompatCustomAction;
    public final List RatingCompat;
    public final DetectionTrigger RemoteActionCompatParcelizer;
    public final List ResultReceiver;
    public final Boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Byte r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final Long read;
    public final Long serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode5 = this.MediaBrowserCompatMediaItem.hashCode();
        TransportMode transportMode = this.MediaDescriptionCompat;
        int iHashCode6 = transportMode == null ? 0 : transportMode.hashCode();
        List list = this.MediaSessionCompatQueueItem;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        List list2 = this.MediaMetadataCompat;
        int iHashCode8 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.RatingCompat;
        int iHashCode9 = list3 == null ? 0 : list3.hashCode();
        Map map = this.MediaSessionCompatResultReceiverWrapper;
        int iHashCode10 = map == null ? 0 : map.hashCode();
        Byte b = this.PlaybackStateCompat;
        int iHashCode11 = b == null ? 0 : b.hashCode();
        Map map2 = this.ParcelableVolumeInfo;
        int iHashCode12 = map2 == null ? 0 : map2.hashCode();
        List list4 = this.MediaSessionCompatToken;
        int iHashCode13 = list4 == null ? 0 : list4.hashCode();
        List list5 = this.PlaybackStateCompatCustomAction;
        int iHashCode14 = list5 == null ? 0 : list5.hashCode();
        Byte b2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iHashCode15 = b2 == null ? 0 : b2.hashCode();
        Byte b3 = this.ComponentActivity;
        int iHashCode16 = b3 == null ? 0 : b3.hashCode();
        List list6 = this.ResultReceiver;
        int iHashCode17 = list6 == null ? 0 : list6.hashCode();
        Boolean bool = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int iHashCode18 = bool == null ? 0 : bool.hashCode();
        String str = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        return (((((((((((((((((((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ iHashCode11) * (-2128831035)) ^ iHashCode12) * (-2128831035)) ^ iHashCode13) * (-2128831035)) ^ iHashCode14) * (-2128831035)) ^ iHashCode15) * (-2128831035)) ^ iHashCode16) * (-2128831035)) ^ iHashCode17) * (-2128831035)) ^ iHashCode18) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public getBadNetworkIntervalandroid_sdk_base_release(getAutomaticGeofenceRequestsEnabledandroid_sdk_base_release getautomaticgeofencerequestsenabledandroid_sdk_base_release) {
        this.IconCompatParcelizer = getautomaticgeofencerequestsenabledandroid_sdk_base_release.write;
        this.serializer = getautomaticgeofencerequestsenabledandroid_sdk_base_release.RemoteActionCompatParcelizer;
        this.read = getautomaticgeofencerequestsenabledandroid_sdk_base_release.serializer;
        this.RemoteActionCompatParcelizer = getautomaticgeofencerequestsenabledandroid_sdk_base_release.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = getautomaticgeofencerequestsenabledandroid_sdk_base_release.read;
        this.MediaDescriptionCompat = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaBrowserCompatMediaItem;
        List list = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = list == null ? null : Collections.unmodifiableList(list);
        List list2 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.RatingCompat;
        this.MediaMetadataCompat = list2 == null ? null : Collections.unmodifiableList(list2);
        List list3 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaMetadataCompat;
        this.RatingCompat = list3 == null ? null : Collections.unmodifiableList(list3);
        Map map = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaDescriptionCompat;
        this.MediaSessionCompatResultReceiverWrapper = map == null ? null : Collections.unmodifiableMap(map);
        this.PlaybackStateCompat = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatToken;
        HashMap map2 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.PlaybackStateCompat;
        this.ParcelableVolumeInfo = map2 == null ? null : Collections.unmodifiableMap(map2);
        List list4 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.ParcelableVolumeInfo;
        this.MediaSessionCompatToken = list4 == null ? null : Collections.unmodifiableList(list4);
        List list5 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.PlaybackStateCompatCustomAction;
        this.PlaybackStateCompatCustomAction = list5 == null ? null : Collections.unmodifiableList(list5);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getautomaticgeofencerequestsenabledandroid_sdk_base_release.MediaSessionCompatResultReceiverWrapper;
        this.ComponentActivity = getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        List list6 = getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        this.ResultReceiver = list6 != null ? Collections.unmodifiableList(list6) : null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getautomaticgeofencerequestsenabledandroid_sdk_base_release.ComponentActivity;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getautomaticgeofencerequestsenabledandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trip{trip_id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", start=");
        sb.append(this.serializer);
        sb.append(", stop=");
        sb.append(this.read);
        sb.append(", trip_open_trigger=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", trip_close_trigger=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", transport_mode_hint=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", sensor_data=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", waypoints=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", motion_activities=");
        sb.append(this.RatingCompat);
        sb.append(", metadata=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", close_reason=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", m7_data=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", calls=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", screen_events=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", trip_start_cause=");
        sb.append(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        sb.append(", trip_stop_cause=");
        sb.append(this.ComponentActivity);
        sb.append(", crash_events=");
        sb.append(this.ResultReceiver);
        sb.append(", isSensorDataInStore=");
        sb.append(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        sb.append(", reference=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        r2 = r5.MediaSessionCompatResultReceiverWrapper;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0091, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        r2 = r5.ParcelableVolumeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ad, code lost:
    
        r2 = r5.MediaSessionCompatToken;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
    
        r2 = r5.PlaybackStateCompatCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c9, code lost:
    
        r2 = r5.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d7, code lost:
    
        r2 = r5.ComponentActivity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e5, code lost:
    
        r2 = r5.ResultReceiver;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f3, code lost:
    
        r2 = r5.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0101, code lost:
    
        r5 = r5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBadNetworkIntervalandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
