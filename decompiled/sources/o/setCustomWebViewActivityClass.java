package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomWebViewActivityClass implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release write = new setCustomLocationProviderNamesandroid_sdk_base_release(0);
    public final Long IconCompatParcelizer;
    public final Short MediaBrowserCompatMediaItem;
    public final Short MediaDescriptionCompat;
    public final Short MediaMetadataCompat;
    public final Byte MediaSessionCompatQueueItem;
    public final Short ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final Short RatingCompat;
    public final removeFromSubscriptionGrouplambda0 RemoteActionCompatParcelizer;
    public final List read;
    public final createNotification serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = removefromsubscriptiongrouplambda0 == null ? 0 : removefromsubscriptiongrouplambda0.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        List list = this.read;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Short sh = this.MediaMetadataCompat;
        int iHashCode5 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.MediaDescriptionCompat;
        int iHashCode6 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.RatingCompat;
        int iHashCode7 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.MediaBrowserCompatMediaItem;
        int iHashCode8 = sh4 == null ? 0 : sh4.hashCode();
        Byte b = this.MediaSessionCompatQueueItem;
        int iHashCode9 = b == null ? 0 : b.hashCode();
        String str = this.PlaybackStateCompat;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        Short sh5 = this.ParcelableVolumeInfo;
        return (((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ (sh5 != null ? sh5.hashCode() : 0)) * (-2128831035);
    }

    public setCustomWebViewActivityClass(setCountrylambda1 setcountrylambda1) {
        this.IconCompatParcelizer = (Long) setcountrylambda1.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (removeFromSubscriptionGrouplambda0) setcountrylambda1.read;
        this.serializer = (createNotification) setcountrylambda1.write;
        List list = (List) setcountrylambda1.MediaSessionCompatQueueItem;
        this.read = list == null ? null : Collections.unmodifiableList(list);
        this.MediaMetadataCompat = (Short) setcountrylambda1.MediaMetadataCompat;
        this.MediaDescriptionCompat = (Short) setcountrylambda1.RatingCompat;
        this.RatingCompat = (Short) setcountrylambda1.PlaybackStateCompatCustomAction;
        this.MediaBrowserCompatMediaItem = (Short) setcountrylambda1.serializer;
        this.MediaSessionCompatQueueItem = (Byte) setcountrylambda1.IconCompatParcelizer;
        this.PlaybackStateCompat = (String) setcountrylambda1.MediaBrowserCompatMediaItem;
        this.ParcelableVolumeInfo = (Short) setcountrylambda1.MediaDescriptionCompat;
    }

    public final String toString() {
        return "CrashEvent{timestamp=" + this.IconCompatParcelizer + ", waypoint=" + this.RemoteActionCompatParcelizer + ", sensor_data=" + this.serializer + ", models=" + this.read + ", max_magnitude=" + this.MediaMetadataCompat + ", confidence=" + this.MediaDescriptionCompat + ", speed_at_impact=" + this.RatingCompat + ", delta_v=" + this.MediaBrowserCompatMediaItem + ", crash_event_origin=" + this.MediaSessionCompatQueueItem + ", crash_severity=" + this.PlaybackStateCompat + ", max_magnitude_g=" + this.ParcelableVolumeInfo + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0097, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomWebViewActivityClass
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomWebViewActivityClass r5 = (o.setCustomWebViewActivityClass) r5
            java.lang.Long r2 = r5.IconCompatParcelizer
            java.lang.Long r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L1b:
            o.removeFromSubscriptionGrouplambda0 r2 = r5.RemoteActionCompatParcelizer
            o.removeFromSubscriptionGrouplambda0 r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L29
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L29:
            o.createNotification r2 = r5.serializer
            o.createNotification r3 = r4.serializer
            if (r3 == r2) goto L35
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L35:
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L43
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L43:
            java.lang.Short r2 = r5.MediaMetadataCompat
            java.lang.Short r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L51:
            java.lang.Short r2 = r5.MediaDescriptionCompat
            java.lang.Short r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L5f
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L5f:
            java.lang.Short r2 = r5.RatingCompat
            java.lang.Short r3 = r4.RatingCompat
            if (r3 == r2) goto L6d
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L6d:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L7b
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L7b:
            java.lang.Byte r2 = r5.MediaSessionCompatQueueItem
            java.lang.Byte r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L89
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L89:
            java.lang.String r2 = r5.PlaybackStateCompat
            java.lang.String r3 = r4.PlaybackStateCompat
            if (r3 == r2) goto L97
            if (r3 == 0) goto La6
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto La6
        L97:
            java.lang.Short r5 = r5.ParcelableVolumeInfo
            java.lang.Short r2 = r4.ParcelableVolumeInfo
            if (r2 == r5) goto La7
            if (r2 == 0) goto La6
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto La6
            goto La7
        La6:
            return r1
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomWebViewActivityClass.equals(java.lang.Object):boolean");
    }
}
