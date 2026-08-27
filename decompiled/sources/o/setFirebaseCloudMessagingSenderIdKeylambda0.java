package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setFirebaseCloudMessagingSenderIdKeylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE serializer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(29);
    public final Integer IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final Byte MediaDescriptionCompat;
    public final Integer MediaMetadataCompat;
    public final Byte MediaSessionCompatQueueItem;
    public final Integer RemoteActionCompatParcelizer;
    public final Long read;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        Integer num = this.IconCompatParcelizer;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.MediaMetadataCompat;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Byte b = this.MediaDescriptionCompat;
        int iHashCode6 = b == null ? 0 : b.hashCode();
        List list = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        Byte b2 = this.MediaSessionCompatQueueItem;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (b2 != null ? b2.hashCode() : 0)) * (-2128831035);
    }

    public setFirebaseCloudMessagingSenderIdKeylambda0(r8lambdaZA7Eh514LyJrawNusHpVw7pA98 r8lambdaza7eh514lyjrawnushpvw7pa98) {
        this.write = r8lambdaza7eh514lyjrawnushpvw7pa98.read;
        this.read = r8lambdaza7eh514lyjrawnushpvw7pa98.write;
        this.IconCompatParcelizer = r8lambdaza7eh514lyjrawnushpvw7pa98.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = r8lambdaza7eh514lyjrawnushpvw7pa98.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaDescriptionCompat;
        this.MediaDescriptionCompat = r8lambdaza7eh514lyjrawnushpvw7pa98.serializer;
        ArrayList arrayList = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.MediaSessionCompatQueueItem = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaMetadataCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportSegment{start_time=");
        sb.append(this.write);
        sb.append(", end_time=");
        sb.append(this.read);
        sb.append(", distance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", average_speed=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", top_speed=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", speeding_events_count=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", hard_events=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", mode=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006d, code lost:
    
        r5 = r5.MediaSessionCompatQueueItem;
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
            boolean r2 = r5 instanceof o.setFirebaseCloudMessagingSenderIdKeylambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setFirebaseCloudMessagingSenderIdKeylambda0 r5 = (o.setFirebaseCloudMessagingSenderIdKeylambda0) r5
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L1b:
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L27:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L7c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L35:
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L7c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L43:
            java.lang.Integer r2 = r5.MediaMetadataCompat
            java.lang.Integer r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto L7c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L51:
            java.lang.Byte r2 = r5.MediaDescriptionCompat
            java.lang.Byte r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L5f
            if (r3 == 0) goto L7c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L5f:
            java.util.List r2 = r5.MediaBrowserCompatMediaItem
            java.util.List r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L6d
            if (r3 == 0) goto L7c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7c
        L6d:
            java.lang.Byte r5 = r5.MediaSessionCompatQueueItem
            java.lang.Byte r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L7d
            if (r2 == 0) goto L7c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L7c
            goto L7d
        L7c:
            return r1
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFirebaseCloudMessagingSenderIdKeylambda0.equals(java.lang.Object):boolean");
    }
}
