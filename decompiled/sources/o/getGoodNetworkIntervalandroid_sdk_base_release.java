package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getGoodNetworkIntervalandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 write = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(2);
    public final Integer IconCompatParcelizer;
    public final Short MediaDescriptionCompat;
    public final Byte MediaMetadataCompat;
    public final Integer RemoteActionCompatParcelizer;
    public final Short read;
    public final Short serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Short sh = this.read;
        int iHashCode3 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.serializer;
        int iHashCode4 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.MediaDescriptionCompat;
        int iHashCode5 = sh3 == null ? 0 : sh3.hashCode();
        Byte b = this.MediaMetadataCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public getGoodNetworkIntervalandroid_sdk_base_release(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.IconCompatParcelizer = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Integer) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.read = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.serializer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = (Byte) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoLocation{mega_latitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mega_longitude=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", elevation=");
        sb.append(this.read);
        sb.append(", horizontal_accuracy=");
        sb.append(this.serializer);
        sb.append(", vertical_accuracy=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", provider=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.MediaMetadataCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r5 = r5.MediaMetadataCompat;
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
            boolean r2 = r5 instanceof o.getGoodNetworkIntervalandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getGoodNetworkIntervalandroid_sdk_base_release r5 = (o.getGoodNetworkIntervalandroid_sdk_base_release) r5
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L1b:
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L27:
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L35
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L35:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L43:
            java.lang.Short r2 = r5.MediaDescriptionCompat
            java.lang.Short r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L51:
            java.lang.Byte r5 = r5.MediaMetadataCompat
            java.lang.Byte r2 = r4.MediaMetadataCompat
            if (r2 == r5) goto L61
            if (r2 == 0) goto L60
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L60
            goto L61
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGoodNetworkIntervalandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}
