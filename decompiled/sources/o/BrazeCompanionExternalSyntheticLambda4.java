package o;

import com.sentiance.core.model.events.I$b;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeCompanionExternalSyntheticLambda4 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 IconCompatParcelizer = new BrazeCompanionExternalSyntheticLambda21(16);
    public final Short MediaBrowserCompatMediaItem;
    public final Byte MediaDescriptionCompat;
    public final Short MediaMetadataCompat;
    public final Short MediaSessionCompatQueueItem;
    public final Short ParcelableVolumeInfo;
    public final Short PlaybackStateCompat;
    public final Short PlaybackStateCompatCustomAction;
    public final Short RatingCompat;
    public final Long RemoteActionCompatParcelizer;
    public final Integer read;
    public final Short serializer;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.write.hashCode();
        Short sh = this.serializer;
        int iHashCode4 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.MediaMetadataCompat;
        int iHashCode7 = sh4 == null ? 0 : sh4.hashCode();
        Short sh5 = this.RatingCompat;
        int iHashCode8 = sh5 == null ? 0 : sh5.hashCode();
        Byte b = this.MediaDescriptionCompat;
        int iHashCode9 = b == null ? 0 : b.hashCode();
        Short sh6 = this.PlaybackStateCompatCustomAction;
        int iHashCode10 = sh6 == null ? 0 : sh6.hashCode();
        Short sh7 = this.ParcelableVolumeInfo;
        int iHashCode11 = sh7 == null ? 0 : sh7.hashCode();
        Short sh8 = this.PlaybackStateCompat;
        return (((((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ iHashCode11) * (-2128831035)) ^ (sh8 != null ? sh8.hashCode() : 0)) * (-2128831035);
    }

    public BrazeCompanionExternalSyntheticLambda4(I$b i$b) {
        this.RemoteActionCompatParcelizer = (Long) i$b.IconCompatParcelizer;
        this.read = (Integer) i$b.read;
        this.write = (Integer) i$b.serializer;
        this.serializer = (Short) i$b.write;
        this.MediaSessionCompatQueueItem = (Short) i$b.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (Short) i$b.MediaDescriptionCompat;
        this.MediaMetadataCompat = (Short) i$b.RatingCompat;
        this.RatingCompat = (Short) i$b.MediaMetadataCompat;
        this.MediaDescriptionCompat = (Byte) i$b.MediaSessionCompatQueueItem;
        this.PlaybackStateCompatCustomAction = (Short) i$b.MediaBrowserCompatMediaItem;
        this.ParcelableVolumeInfo = (Short) i$b.MediaSessionCompatResultReceiverWrapper;
        this.PlaybackStateCompat = (Short) i$b.PlaybackStateCompat;
    }

    public final String toString() {
        return "Location{timestamp=" + this.RemoteActionCompatParcelizer + ", latitude=" + this.read + ", longitude=" + this.write + ", horizontal_accuracy=" + this.serializer + ", vertical_accuracy=" + this.MediaSessionCompatQueueItem + ", elevation=" + this.MediaBrowserCompatMediaItem + ", direction=" + this.MediaMetadataCompat + ", speed=" + this.RatingCompat + ", provider=" + this.MediaDescriptionCompat + ", speed_centimeter=" + this.PlaybackStateCompatCustomAction + ", direction_accuracy_centi=" + this.ParcelableVolumeInfo + ", speed_accuracy_centimeter=" + this.PlaybackStateCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0079, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        r2 = r5.PlaybackStateCompatCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r2 = r5.ParcelableVolumeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a3, code lost:
    
        r5 = r5.PlaybackStateCompat;
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
            boolean r2 = r5 instanceof o.BrazeCompanionExternalSyntheticLambda4
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeCompanionExternalSyntheticLambda4 r5 = (o.BrazeCompanionExternalSyntheticLambda4) r5
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L1b:
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L27:
            java.lang.Integer r2 = r5.write
            java.lang.Integer r3 = r4.write
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L33:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L41
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L41:
            java.lang.Short r2 = r5.MediaSessionCompatQueueItem
            java.lang.Short r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4f
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L4f:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L5d
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L5d:
            java.lang.Short r2 = r5.MediaMetadataCompat
            java.lang.Short r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L6b
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L6b:
            java.lang.Short r2 = r5.RatingCompat
            java.lang.Short r3 = r4.RatingCompat
            if (r3 == r2) goto L79
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L79:
            java.lang.Byte r2 = r5.MediaDescriptionCompat
            java.lang.Byte r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L87
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L87:
            java.lang.Short r2 = r5.PlaybackStateCompatCustomAction
            java.lang.Short r3 = r4.PlaybackStateCompatCustomAction
            if (r3 == r2) goto L95
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        L95:
            java.lang.Short r2 = r5.ParcelableVolumeInfo
            java.lang.Short r3 = r4.ParcelableVolumeInfo
            if (r3 == r2) goto La3
            if (r3 == 0) goto Lb2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb2
        La3:
            java.lang.Short r5 = r5.PlaybackStateCompat
            java.lang.Short r2 = r4.PlaybackStateCompat
            if (r2 == r5) goto Lb3
            if (r2 == 0) goto Lb2
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r1
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeCompanionExternalSyntheticLambda4.equals(java.lang.Object):boolean");
    }
}
