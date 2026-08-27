package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw RemoteActionCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(5);
    public final Byte IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final Integer MediaMetadataCompat;
    public final Byte MediaSessionCompatQueueItem;
    public final Integer RatingCompat;
    public final Integer read;
    public final Long serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        Integer num = this.read;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.MediaMetadataCompat;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.RatingCompat;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        Byte b = this.MediaSessionCompatQueueItem;
        int iHashCode7 = b == null ? 0 : b.hashCode();
        List list = this.MediaBrowserCompatMediaItem;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (list != null ? list.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE(r8lambdaZA7Eh514LyJrawNusHpVw7pA98 r8lambdaza7eh514lyjrawnushpvw7pa98) {
        this.write = r8lambdaza7eh514lyjrawnushpvw7pa98.read;
        this.serializer = r8lambdaza7eh514lyjrawnushpvw7pa98.write;
        this.IconCompatParcelizer = r8lambdaza7eh514lyjrawnushpvw7pa98.serializer;
        this.read = r8lambdaza7eh514lyjrawnushpvw7pa98.IconCompatParcelizer;
        this.MediaMetadataCompat = r8lambdaza7eh514lyjrawnushpvw7pa98.RemoteActionCompatParcelizer;
        this.RatingCompat = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaMetadataCompat;
        ArrayList arrayList = r8lambdaza7eh514lyjrawnushpvw7pa98.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportSegment{start_time=");
        sb.append(this.write);
        sb.append(", end_time=");
        sb.append(this.serializer);
        sb.append(", type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", distance=");
        sb.append(this.read);
        sb.append(", average_speed=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", top_speed=");
        sb.append(this.RatingCompat);
        sb.append(", speeding_events_count=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", hard_events=");
        return MediaSessionCompatQueueItem.read(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        r5 = r5.MediaBrowserCompatMediaItem;
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
            boolean r2 = r5 instanceof o.r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE r5 = (o.r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE) r5
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L1b:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L27:
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L33:
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L41
            if (r3 == 0) goto L7a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L41:
            java.lang.Integer r2 = r5.MediaMetadataCompat
            java.lang.Integer r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L4f
            if (r3 == 0) goto L7a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L4f:
            java.lang.Integer r2 = r5.RatingCompat
            java.lang.Integer r3 = r4.RatingCompat
            if (r3 == r2) goto L5d
            if (r3 == 0) goto L7a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L5d:
            java.lang.Byte r2 = r5.MediaSessionCompatQueueItem
            java.lang.Byte r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L6b
            if (r3 == 0) goto L7a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L7a
        L6b:
            java.util.List r5 = r5.MediaBrowserCompatMediaItem
            java.util.List r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L7b
            if (r2 == 0) goto L7a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L7a
            goto L7b
        L7a:
            return r1
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaYCpCax7c0Cs_kAm0o8Re2fZmjhE.equals(java.lang.Object):boolean");
    }
}
