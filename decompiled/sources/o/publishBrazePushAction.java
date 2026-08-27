package o;

import com.sentiance.core.model.events.ThriftBool;

/* JADX INFO: loaded from: classes3.dex */
public final class publishBrazePushAction implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final logPushDelivery IconCompatParcelizer = new logPushDelivery();
    public final ThriftBool MediaBrowserCompatMediaItem;
    public final ThriftBool MediaDescriptionCompat;
    public final Integer MediaMetadataCompat;
    public final ThriftBool MediaSessionCompatQueueItem;
    public final ThriftBool ParcelableVolumeInfo;
    public final Long RatingCompat;
    public final Byte RemoteActionCompatParcelizer;
    public final Byte read;
    public final Byte serializer;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        int iHashCode4 = this.read.hashCode();
        ThriftBool thriftBool = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = thriftBool == null ? 0 : thriftBool.hashCode();
        Integer num = this.MediaMetadataCompat;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Long l = this.RatingCompat;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        ThriftBool thriftBool2 = this.MediaDescriptionCompat;
        int iHashCode8 = thriftBool2 == null ? 0 : thriftBool2.hashCode();
        ThriftBool thriftBool3 = this.MediaSessionCompatQueueItem;
        int iHashCode9 = thriftBool3 == null ? 0 : thriftBool3.hashCode();
        ThriftBool thriftBool4 = this.ParcelableVolumeInfo;
        return (((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ (thriftBool4 != null ? thriftBool4.hashCode() : 0)) * (-2128831035);
    }

    public publishBrazePushAction(r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q) {
        this.RemoteActionCompatParcelizer = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat;
        this.write = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer;
        this.serializer = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer;
        this.read = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.write;
        this.MediaMetadataCompat = (Integer) r8lambdabirsljoagmyxhikohl5z5hht12q.read;
        this.RatingCompat = (Long) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat;
        this.MediaDescriptionCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat;
        this.MediaSessionCompatQueueItem = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem;
        this.ParcelableVolumeInfo = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "SdkStatus{detection_status=" + this.RemoteActionCompatParcelizer + ", sdk_disk_quota_status=" + this.write + ", sdk_wifi_quota_status=" + this.serializer + ", sdk_mobile_quota_status=" + this.read + ", is_accurate_location_available=" + this.MediaBrowserCompatMediaItem + ", ondevice_data_sync_pending_payload_count=" + this.MediaMetadataCompat + ", ondevice_data_sync_oldest_pending_payload_epoch=" + this.RatingCompat + ", allowed_to_use_mobile_data=" + this.MediaDescriptionCompat + ", can_monitor_geofences=" + this.MediaSessionCompatQueueItem + ", is_background_refresh_enabled=" + this.ParcelableVolumeInfo + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        r5 = r5.ParcelableVolumeInfo;
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
            boolean r2 = r5 instanceof o.publishBrazePushAction
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.publishBrazePushAction r5 = (o.publishBrazePushAction) r5
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L1b:
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L27:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L33:
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L3f:
            com.sentiance.core.model.events.ThriftBool r2 = r5.MediaBrowserCompatMediaItem
            com.sentiance.core.model.events.ThriftBool r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L4d
            if (r3 == 0) goto L94
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L4d:
            java.lang.Integer r2 = r5.MediaMetadataCompat
            java.lang.Integer r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L5b
            if (r3 == 0) goto L94
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L5b:
            java.lang.Long r2 = r5.RatingCompat
            java.lang.Long r3 = r4.RatingCompat
            if (r3 == r2) goto L69
            if (r3 == 0) goto L94
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L69:
            com.sentiance.core.model.events.ThriftBool r2 = r5.MediaDescriptionCompat
            com.sentiance.core.model.events.ThriftBool r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L77
            if (r3 == 0) goto L94
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L77:
            com.sentiance.core.model.events.ThriftBool r2 = r5.MediaSessionCompatQueueItem
            com.sentiance.core.model.events.ThriftBool r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L85
            if (r3 == 0) goto L94
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
        L85:
            com.sentiance.core.model.events.ThriftBool r5 = r5.ParcelableVolumeInfo
            com.sentiance.core.model.events.ThriftBool r2 = r4.ParcelableVolumeInfo
            if (r2 == r5) goto L95
            if (r2 == 0) goto L94
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L94
            goto L95
        L94:
            return r1
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.publishBrazePushAction.equals(java.lang.Object):boolean");
    }
}
