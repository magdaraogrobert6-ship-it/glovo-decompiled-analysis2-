package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(7);
    public final Short MediaBrowserCompatMediaItem;
    public final Integer MediaDescriptionCompat;
    public final Short MediaMetadataCompat;
    public final Integer MediaSessionCompatQueueItem;
    public final Map MediaSessionCompatResultReceiverWrapper;
    public final List MediaSessionCompatToken;
    public final Integer ParcelableVolumeInfo;
    public final List PlaybackStateCompat;
    public final Short RatingCompat;
    public final Short RemoteActionCompatParcelizer;
    public final Short read;
    public final Short serializer;
    public final Short write;

    public final int hashCode() {
        Short sh = this.read;
        int iHashCode = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.serializer;
        int iHashCode2 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.write;
        int iHashCode4 = sh4 == null ? 0 : sh4.hashCode();
        Short sh5 = this.RatingCompat;
        int iHashCode5 = sh5 == null ? 0 : sh5.hashCode();
        Short sh6 = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = sh6 == null ? 0 : sh6.hashCode();
        Short sh7 = this.MediaMetadataCompat;
        int iHashCode7 = sh7 == null ? 0 : sh7.hashCode();
        Integer num = this.MediaDescriptionCompat;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.MediaSessionCompatQueueItem;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.ParcelableVolumeInfo;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        List list = this.PlaybackStateCompat;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        List list2 = this.MediaSessionCompatToken;
        int iHashCode12 = list2 == null ? 0 : list2.hashCode();
        Map map = this.MediaSessionCompatResultReceiverWrapper;
        return (((((((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ iHashCode11) * (-2128831035)) ^ iHashCode12) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI(r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg) {
        this.read = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.read;
        this.serializer = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer;
        this.RemoteActionCompatParcelizer = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.IconCompatParcelizer;
        this.write = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer;
        this.RatingCompat = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatQueueItem;
        this.MediaBrowserCompatMediaItem = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat;
        this.MediaMetadataCompat = (Short) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = (Integer) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = (Integer) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaMetadataCompat;
        this.ParcelableVolumeInfo = (Integer) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken;
        ArrayList arrayList = (ArrayList) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.PlaybackStateCompat;
        this.PlaybackStateCompat = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        ArrayList arrayList2 = (ArrayList) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatResultReceiverWrapper;
        this.MediaSessionCompatToken = arrayList2 == null ? null : Collections.unmodifiableList(arrayList2);
        HashMap map = (HashMap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo;
        this.MediaSessionCompatResultReceiverWrapper = map != null ? Collections.unmodifiableMap(map) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripProfilingConfiguration{transition_duration_threshold=");
        sb.append(this.read);
        sb.append(", allowed_starting_gap=");
        sb.append(this.serializer);
        sb.append(", speed_stationary_threshold=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", speed_no_vehicle_threshold=");
        sb.append(this.write);
        sb.append(", max_speed=");
        sb.append(this.RatingCompat);
        sb.append(", horizontal_accuracy_threshold=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", max_acceleration=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", hard_event_trip_edges_threshold=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", hard_event_duration_threshold_to_filter=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", hard_event_duration_threshold_to_merge=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", wifi_eligible_payloads=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", mobile_eligible_payloads=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", payload_submission_category=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaSessionCompatResultReceiverWrapper, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        r2 = r5.ParcelableVolumeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
    
        r2 = r5.MediaSessionCompatToken;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI r5 = (o.r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI) r5
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L1d:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L2b:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L39:
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L47
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L47:
            java.lang.Short r2 = r5.RatingCompat
            java.lang.Short r3 = r4.RatingCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L55:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L63
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L63:
            java.lang.Short r2 = r5.MediaMetadataCompat
            java.lang.Short r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L71
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L71:
            java.lang.Integer r2 = r5.MediaDescriptionCompat
            java.lang.Integer r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L7f
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L7f:
            java.lang.Integer r2 = r5.MediaSessionCompatQueueItem
            java.lang.Integer r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L8d
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L8d:
            java.lang.Integer r2 = r5.ParcelableVolumeInfo
            java.lang.Integer r3 = r4.ParcelableVolumeInfo
            if (r3 == r2) goto L9b
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        L9b:
            java.util.List r2 = r5.PlaybackStateCompat
            java.util.List r3 = r4.PlaybackStateCompat
            if (r3 == r2) goto La9
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        La9:
            java.util.List r2 = r5.MediaSessionCompatToken
            java.util.List r3 = r4.MediaSessionCompatToken
            if (r3 == r2) goto Lb7
            if (r3 == 0) goto Lc6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lc6
        Lb7:
            java.util.Map r5 = r5.MediaSessionCompatResultReceiverWrapper
            java.util.Map r2 = r4.MediaSessionCompatResultReceiverWrapper
            if (r2 == r5) goto Lc7
            if (r2 == 0) goto Lc6
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto Lc6
            goto Lc7
        Lc6:
            return r1
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdayRbQ7QfQWGgIRqExwjVfCaJEGI.equals(java.lang.Object):boolean");
    }
}
