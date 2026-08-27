package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(8);
    public final String IconCompatParcelizer;
    public final Integer MediaBrowserCompatMediaItem;
    public final Boolean RatingCompat;
    public final Boolean RemoteActionCompatParcelizer;
    public final Integer serializer;
    public final Integer write;

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.RemoteActionCompatParcelizer;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.serializer;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.write;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Boolean bool2 = this.RatingCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (bool2 != null ? bool2.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.IconCompatParcelizer = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.RemoteActionCompatParcelizer = (Boolean) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.serializer = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.write = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaBrowserCompatMediaItem = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
        this.RatingCompat = (Boolean) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrowPIR{battery=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", detection=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", id=");
        sb.append(this.serializer);
        sb.append(", rssi=");
        sb.append(this.write);
        sb.append(", status=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", tamper=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.RatingCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r5 = r5.RatingCompat;
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
            boolean r2 = r5 instanceof o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r5 = (o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L1d:
            java.lang.Boolean r2 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L2b:
            java.lang.Integer r2 = r5.serializer
            java.lang.Integer r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L39:
            java.lang.Integer r2 = r5.write
            java.lang.Integer r3 = r4.write
            if (r3 == r2) goto L47
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L47:
            java.lang.Integer r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Integer r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L55:
            java.lang.Boolean r5 = r5.RatingCompat
            java.lang.Boolean r2 = r4.RatingCompat
            if (r2 == r5) goto L65
            if (r2 == 0) goto L64
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L64
            goto L65
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA.equals(java.lang.Object):boolean");
    }
}
