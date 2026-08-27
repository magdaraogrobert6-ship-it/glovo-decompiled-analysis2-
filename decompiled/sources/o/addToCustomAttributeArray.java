package o;

import com.sentiance.core.model.thrift.k$c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class addToCustomAttributeArray implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(19);
    public final Double IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final Double MediaDescriptionCompat;
    public final Double MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final Double RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.RemoteActionCompatParcelizer;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str2 = this.serializer;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Double d2 = this.IconCompatParcelizer;
        int iHashCode4 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = d3 == null ? 0 : d3.hashCode();
        String str3 = this.RatingCompat;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Double d4 = this.MediaDescriptionCompat;
        int iHashCode7 = d4 == null ? 0 : d4.hashCode();
        List list = this.MediaBrowserCompatMediaItem;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (list != null ? list.hashCode() : 0)) * (-2128831035);
    }

    public addToCustomAttributeArray(k$c k_c) {
        this.write = (String) k_c.MediaSessionCompatQueueItem;
        this.RemoteActionCompatParcelizer = (Double) k_c.RemoteActionCompatParcelizer;
        this.serializer = (String) k_c.MediaDescriptionCompat;
        this.IconCompatParcelizer = (Double) k_c.write;
        this.MediaSessionCompatQueueItem = (Double) k_c.IconCompatParcelizer;
        this.RatingCompat = (String) k_c.serializer;
        this.MediaDescriptionCompat = (Double) k_c.read;
        ArrayList arrayList = (ArrayList) k_c.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartSenseMulti{acceleration=");
        sb.append(this.write);
        sb.append(", battery=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", contact=");
        sb.append(this.serializer);
        sb.append(", lqi=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", rssi=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", status=");
        sb.append(this.RatingCompat);
        sb.append(", temperature=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", three_axis=");
        return MediaSessionCompatQueueItem.read(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
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
            boolean r2 = r5 instanceof o.addToCustomAttributeArray
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addToCustomAttributeArray r5 = (o.addToCustomAttributeArray) r5
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L1d:
            java.lang.Double r2 = r5.RemoteActionCompatParcelizer
            java.lang.Double r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L2b:
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L39:
            java.lang.Double r2 = r5.IconCompatParcelizer
            java.lang.Double r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L47:
            java.lang.Double r2 = r5.MediaSessionCompatQueueItem
            java.lang.Double r3 = r4.MediaSessionCompatQueueItem
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
            java.lang.Double r2 = r5.MediaDescriptionCompat
            java.lang.Double r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L71
            if (r3 == 0) goto L80
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L80
        L71:
            java.util.List r5 = r5.MediaBrowserCompatMediaItem
            java.util.List r2 = r4.MediaBrowserCompatMediaItem
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
        throw new UnsupportedOperationException("Method not decompiled: o.addToCustomAttributeArray.equals(java.lang.Object):boolean");
    }
}
