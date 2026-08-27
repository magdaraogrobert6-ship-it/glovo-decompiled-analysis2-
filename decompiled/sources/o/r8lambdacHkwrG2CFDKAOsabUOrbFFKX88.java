package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdacHkwrG2CFDKAOsabUOrbFFKX88 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(6);
    public final Short MediaBrowserCompatMediaItem;
    public final Short RatingCompat;
    public final Integer RemoteActionCompatParcelizer;
    public final Integer read;
    public final Integer serializer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        Short sh = this.write;
        int iHashCode4 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.RatingCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (sh3 != null ? sh3.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdacHkwrG2CFDKAOsabUOrbFFKX88(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.RemoteActionCompatParcelizer = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.read = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.serializer = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
        this.write = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.MediaBrowserCompatMediaItem = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.RatingCompat = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "TransportWaypoint{timestamp_offset=" + this.RemoteActionCompatParcelizer + ", latitude=" + this.read + ", longitude=" + this.serializer + ", horizontal_accuracy=" + this.write + ", speed_cm_per_sec=" + this.MediaBrowserCompatMediaItem + ", speed_limit_cm_per_sec=" + this.RatingCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdacHkwrG2CFDKAOsabUOrbFFKX88
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdacHkwrG2CFDKAOsabUOrbFFKX88 r5 = (o.r8lambdacHkwrG2CFDKAOsabUOrbFFKX88) r5
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L1b:
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L27:
            java.lang.Integer r2 = r5.serializer
            java.lang.Integer r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L33:
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L41
            if (r3 == 0) goto L5e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L41:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L4f
            if (r3 == 0) goto L5e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L4f:
            java.lang.Short r5 = r5.RatingCompat
            java.lang.Short r2 = r4.RatingCompat
            if (r2 == r5) goto L5f
            if (r2 == 0) goto L5e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            return r1
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdacHkwrG2CFDKAOsabUOrbFFKX88.equals(java.lang.Object):boolean");
    }
}
