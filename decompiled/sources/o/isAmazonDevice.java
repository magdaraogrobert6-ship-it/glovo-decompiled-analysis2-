package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.k$c;

/* JADX INFO: loaded from: classes3.dex */
public final class isAmazonDevice implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw RemoteActionCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(24);
    public final Double IconCompatParcelizer;
    public final Double MediaBrowserCompatMediaItem;
    public final Double MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final Double read;
    public final Double serializer;
    public final Double write;

    public final int hashCode() {
        Double d = this.write;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.serializer;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.IconCompatParcelizer;
        int iHashCode3 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.read;
        int iHashCode4 = d4 == null ? 0 : d4.hashCode();
        Double d5 = this.MediaDescriptionCompat;
        int iHashCode5 = d5 == null ? 0 : d5.hashCode();
        String str = this.RatingCompat;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Double d6 = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = d6 == null ? 0 : d6.hashCode();
        String str2 = this.MediaSessionCompatQueueItem;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (str2 != null ? str2.hashCode() : 0)) * (-2128831035);
    }

    public isAmazonDevice(k$c k_c) {
        this.write = (Double) k_c.RemoteActionCompatParcelizer;
        this.serializer = (Double) k_c.write;
        this.IconCompatParcelizer = (Double) k_c.IconCompatParcelizer;
        this.read = (Double) k_c.read;
        this.MediaDescriptionCompat = (Double) k_c.serializer;
        this.RatingCompat = (String) k_c.MediaSessionCompatQueueItem;
        this.MediaBrowserCompatMediaItem = (Double) k_c.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatQueueItem = (String) k_c.MediaDescriptionCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AugmentedTransportWaypoint{accuracy=");
        sb.append(this.write);
        sb.append(", altitude=");
        sb.append(this.serializer);
        sb.append(", distance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", latitude=");
        sb.append(this.read);
        sb.append(", longitude=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", provider=");
        sb.append(this.RatingCompat);
        sb.append(", speed=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", timestamp=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
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
            boolean r2 = r5 instanceof o.isAmazonDevice
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.isAmazonDevice r5 = (o.isAmazonDevice) r5
            java.lang.Double r2 = r5.write
            java.lang.Double r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L1d:
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L2b:
            java.lang.Double r2 = r5.IconCompatParcelizer
            java.lang.Double r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L39:
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L47
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L47:
            java.lang.Double r2 = r5.MediaDescriptionCompat
            java.lang.Double r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L55:
            java.lang.String r2 = r5.RatingCompat
            java.lang.String r3 = r4.RatingCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L63:
            java.lang.Double r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Double r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L71
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L71:
            java.lang.String r5 = r5.MediaSessionCompatQueueItem
            java.lang.String r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L81
            if (r2 == 0) goto L80
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L80
            goto L81
        L80:
            return r1
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isAmazonDevice.equals(java.lang.Object):boolean");
    }
}
