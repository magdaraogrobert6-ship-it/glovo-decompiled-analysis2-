package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttribute implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o write = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(21);
    public final Short IconCompatParcelizer;
    public final Short MediaSessionCompatQueueItem;
    public final Short RatingCompat;
    public final Short RemoteActionCompatParcelizer;
    public final Short read;
    public final Short serializer;

    public final int hashCode() {
        Short sh = this.serializer;
        int iHashCode = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.read;
        int iHashCode2 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.IconCompatParcelizer;
        int iHashCode3 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.RemoteActionCompatParcelizer;
        int iHashCode4 = sh4 == null ? 0 : sh4.hashCode();
        Short sh5 = this.RatingCompat;
        int iHashCode5 = sh5 == null ? 0 : sh5.hashCode();
        Short sh6 = this.MediaSessionCompatQueueItem;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (sh6 != null ? sh6.hashCode() : 0)) * (-2128831035);
    }

    public setCustomUserAttribute(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.serializer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.read = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.RemoteActionCompatParcelizer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.RatingCompat = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaSessionCompatQueueItem = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        return "StationaryConfiguration{ios_stationary_confirm_delay=" + this.serializer + ", ios_geofence_radius=" + this.read + ", ios_geofence_fallback_radius=" + this.IconCompatParcelizer + ", ios_centroid_distance=" + this.RemoteActionCompatParcelizer + ", android_stationary_confirm_delay=" + this.RatingCompat + ", android_inaccurate_stationary_confirm_delay=" + this.MediaSessionCompatQueueItem + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomUserAttribute
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttribute r5 = (o.setCustomUserAttribute) r5
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L1d:
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L2b:
            java.lang.Short r2 = r5.IconCompatParcelizer
            java.lang.Short r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L39:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L47:
            java.lang.Short r2 = r5.RatingCompat
            java.lang.Short r3 = r4.RatingCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L55:
            java.lang.Short r5 = r5.MediaSessionCompatQueueItem
            java.lang.Short r2 = r4.MediaSessionCompatQueueItem
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
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttribute.equals(java.lang.Object):boolean");
    }
}
