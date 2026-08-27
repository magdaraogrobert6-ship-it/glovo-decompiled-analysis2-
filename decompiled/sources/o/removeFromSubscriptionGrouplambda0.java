package o;

/* JADX INFO: loaded from: classes3.dex */
public final class removeFromSubscriptionGrouplambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(10);
    public final Short IconCompatParcelizer;
    public final Short MediaMetadataCompat;
    public final removeFromCustomAttributeArraylambda1 MediaSessionCompatQueueItem;
    public final Long RemoteActionCompatParcelizer;
    public final Long serializer;
    public final setHomeCitylambda1 write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        Long l = this.RemoteActionCompatParcelizer;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Short sh = this.IconCompatParcelizer;
        int iHashCode4 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.MediaMetadataCompat;
        int iHashCode5 = sh2 == null ? 0 : sh2.hashCode();
        removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1 = this.MediaSessionCompatQueueItem;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (removefromcustomattributearraylambda1 != null ? removefromcustomattributearraylambda1.hashCode() : 0)) * (-2128831035);
    }

    public removeFromSubscriptionGrouplambda0(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.write = (setHomeCitylambda1) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.serializer = (Long) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Long) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.MediaMetadataCompat = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaSessionCompatQueueItem = (removeFromCustomAttributeArraylambda1) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        return "Waypoint{location=" + this.write + ", timestamp=" + this.serializer + ", base=" + this.RemoteActionCompatParcelizer + ", speed=" + this.IconCompatParcelizer + ", direction=" + this.MediaMetadataCompat + ", wifi_info=" + this.MediaSessionCompatQueueItem + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
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
            boolean r2 = r5 instanceof o.removeFromSubscriptionGrouplambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.removeFromSubscriptionGrouplambda0 r5 = (o.removeFromSubscriptionGrouplambda0) r5
            o.setHomeCitylambda1 r2 = r5.write
            o.setHomeCitylambda1 r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L1b:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L27:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L35:
            java.lang.Short r2 = r5.IconCompatParcelizer
            java.lang.Short r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L43:
            java.lang.Short r2 = r5.MediaMetadataCompat
            java.lang.Short r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L51:
            o.removeFromCustomAttributeArraylambda1 r5 = r5.MediaSessionCompatQueueItem
            o.removeFromCustomAttributeArraylambda1 r2 = r4.MediaSessionCompatQueueItem
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
        throw new UnsupportedOperationException("Method not decompiled: o.removeFromSubscriptionGrouplambda0.equals(java.lang.Object):boolean");
    }
}
