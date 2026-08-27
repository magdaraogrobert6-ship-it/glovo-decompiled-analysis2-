package o;

/* JADX INFO: loaded from: classes3.dex */
public final class addToCustomAttributeArraylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE IconCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(8);
    public final Boolean MediaBrowserCompatMediaItem;
    public final Integer MediaSessionCompatQueueItem;
    public final Integer RatingCompat;
    public final Integer RemoteActionCompatParcelizer;
    public final Integer read;
    public final String serializer;
    public final Boolean write;

    public final int hashCode() {
        String str = this.serializer;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.read;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.write;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.RatingCompat;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Boolean bool2 = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Integer num4 = this.MediaSessionCompatQueueItem;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (num4 != null ? num4.hashCode() : 0)) * (-2128831035);
    }

    public addToCustomAttributeArraylambda0(r8lambdamXVT_jugIlUrYH44s7scl52H3aY r8lambdamxvt_jugiluryh44s7scl52h3ay) {
        this.serializer = r8lambdamxvt_jugiluryh44s7scl52h3ay.serializer;
        this.read = r8lambdamxvt_jugiluryh44s7scl52h3ay.read;
        this.RemoteActionCompatParcelizer = r8lambdamxvt_jugiluryh44s7scl52h3ay.IconCompatParcelizer;
        this.write = r8lambdamxvt_jugiluryh44s7scl52h3ay.write;
        this.RatingCompat = r8lambdamxvt_jugiluryh44s7scl52h3ay.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaMetadataCompat;
        this.MediaSessionCompatQueueItem = r8lambdamxvt_jugiluryh44s7scl52h3ay.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrowSmoke{battery=");
        sb.append(this.serializer);
        sb.append(", id=");
        sb.append(this.read);
        sb.append(", rssi=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", smoke_detection=");
        sb.append(this.write);
        sb.append(", status=");
        sb.append(this.RatingCompat);
        sb.append(", tamper=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", temperature=");
        return IconCompatParcelizer.write(this.MediaSessionCompatQueueItem, "}", sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
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
            boolean r2 = r5 instanceof o.addToCustomAttributeArraylambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addToCustomAttributeArraylambda0 r5 = (o.addToCustomAttributeArraylambda0) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L1d:
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L2b:
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L39:
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L47
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L47:
            java.lang.Integer r2 = r5.RatingCompat
            java.lang.Integer r3 = r4.RatingCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L55:
            java.lang.Boolean r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Boolean r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L63
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L63:
            java.lang.Integer r5 = r5.MediaSessionCompatQueueItem
            java.lang.Integer r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L73
            if (r2 == 0) goto L72
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L72
            goto L73
        L72:
            return r1
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addToCustomAttributeArraylambda0.equals(java.lang.Object):boolean");
    }
}
