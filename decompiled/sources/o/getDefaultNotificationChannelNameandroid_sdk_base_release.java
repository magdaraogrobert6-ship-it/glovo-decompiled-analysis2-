package o;

import com.sentiance.core.model.events.I$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultNotificationChannelNameandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getCustomHtmlWebViewActivityClassNameandroid_sdk_base_release read = new getCustomHtmlWebViewActivityClassNameandroid_sdk_base_release();
    public final Boolean IconCompatParcelizer;
    public final Short MediaBrowserCompatMediaItem;
    public final Boolean MediaDescriptionCompat;
    public final Boolean MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final Map MediaSessionCompatResultReceiverWrapper;
    public final requestBannersRefreshdefault PlaybackStateCompat;
    public final Boolean PlaybackStateCompatCustomAction;
    public final Map RatingCompat;
    public final Boolean RemoteActionCompatParcelizer;
    public final Boolean serializer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode6 = this.MediaSessionCompatQueueItem.hashCode();
        Map map = this.RatingCompat;
        int iHashCode7 = map == null ? 0 : map.hashCode();
        Boolean bool = this.MediaDescriptionCompat;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.MediaMetadataCompat;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.PlaybackStateCompatCustomAction;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        requestBannersRefreshdefault requestbannersrefreshdefault = this.PlaybackStateCompat;
        int iHashCode11 = requestbannersrefreshdefault == null ? 0 : requestbannersrefreshdefault.hashCode();
        Map map2 = this.MediaSessionCompatResultReceiverWrapper;
        return (((((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ iHashCode11) * (-2128831035)) ^ (map2 != null ? map2.hashCode() : 0)) * (-2128831035);
    }

    public getDefaultNotificationChannelNameandroid_sdk_base_release(I$b i$b) {
        this.RemoteActionCompatParcelizer = (Boolean) i$b.IconCompatParcelizer;
        this.write = (Boolean) i$b.read;
        this.serializer = (Boolean) i$b.serializer;
        this.IconCompatParcelizer = (Boolean) i$b.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (Short) i$b.write;
        this.MediaSessionCompatQueueItem = Collections.unmodifiableList((ArrayList) i$b.MediaDescriptionCompat);
        HashMap map = (HashMap) i$b.RatingCompat;
        this.RatingCompat = map == null ? null : Collections.unmodifiableMap(map);
        this.MediaDescriptionCompat = (Boolean) i$b.MediaMetadataCompat;
        this.MediaMetadataCompat = (Boolean) i$b.MediaBrowserCompatMediaItem;
        this.PlaybackStateCompatCustomAction = (Boolean) i$b.MediaSessionCompatResultReceiverWrapper;
        this.PlaybackStateCompat = (requestBannersRefreshdefault) i$b.PlaybackStateCompat;
        HashMap map2 = (HashMap) i$b.MediaSessionCompatQueueItem;
        this.MediaSessionCompatResultReceiverWrapper = map2 != null ? Collections.unmodifiableMap(map2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripConfiguration{screen_events=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", call_events=");
        sb.append(this.write);
        sb.append(", bluetooth_events=");
        sb.append(this.serializer);
        sb.append(", crash_detection=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", location_fix_interval=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", enabled_sensors=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", resample_frequencies=");
        sb.append(this.RatingCompat);
        sb.append(", sensor_batching=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", stay_awake_for_locations=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", run_in_foreground=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", batch_configuration=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", enabled_sensors_and_sampling_rates=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaSessionCompatResultReceiverWrapper, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        r2 = r5.PlaybackStateCompatCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        r5 = r5.MediaSessionCompatResultReceiverWrapper;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.getDefaultNotificationChannelNameandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getDefaultNotificationChannelNameandroid_sdk_base_release r5 = (o.getDefaultNotificationChannelNameandroid_sdk_base_release) r5
            java.lang.Boolean r2 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L1b:
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L27:
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L33:
            java.lang.Boolean r2 = r5.IconCompatParcelizer
            java.lang.Boolean r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L3f:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L4b:
            java.util.List r2 = r5.MediaSessionCompatQueueItem
            java.util.List r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L57
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L57:
            java.util.Map r2 = r5.RatingCompat
            java.util.Map r3 = r4.RatingCompat
            if (r3 == r2) goto L65
            if (r3 == 0) goto Lac
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L65:
            java.lang.Boolean r2 = r5.MediaDescriptionCompat
            java.lang.Boolean r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L73
            if (r3 == 0) goto Lac
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L73:
            java.lang.Boolean r2 = r5.MediaMetadataCompat
            java.lang.Boolean r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L81
            if (r3 == 0) goto Lac
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L81:
            java.lang.Boolean r2 = r5.PlaybackStateCompatCustomAction
            java.lang.Boolean r3 = r4.PlaybackStateCompatCustomAction
            if (r3 == r2) goto L8f
            if (r3 == 0) goto Lac
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L8f:
            o.requestBannersRefreshdefault r2 = r5.PlaybackStateCompat
            o.requestBannersRefreshdefault r3 = r4.PlaybackStateCompat
            if (r3 == r2) goto L9d
            if (r3 == 0) goto Lac
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lac
        L9d:
            java.util.Map r5 = r5.MediaSessionCompatResultReceiverWrapper
            java.util.Map r2 = r4.MediaSessionCompatResultReceiverWrapper
            if (r2 == r5) goto Lad
            if (r2 == 0) goto Lac
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto Lac
            goto Lad
        Lac:
            return r1
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDefaultNotificationChannelNameandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
