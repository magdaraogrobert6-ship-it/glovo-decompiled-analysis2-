package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLineId implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(23);
    public final removeFromCustomAttributeArraylambda1 RemoteActionCompatParcelizer;
    public final Long serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1 = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (removefromcustomattributearraylambda1 == null ? 0 : removefromcustomattributearraylambda1.hashCode())) * (-2128831035);
    }

    public setLineId(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.serializer = (Long) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.RemoteActionCompatParcelizer = (removeFromCustomAttributeArraylambda1) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "StationaryStart{start=" + this.serializer + ", wifi_info=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setLineId
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLineId r5 = (o.setLineId) r5
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            o.removeFromCustomAttributeArraylambda1 r5 = r5.RemoteActionCompatParcelizer
            o.removeFromCustomAttributeArraylambda1 r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLineId.equals(java.lang.Object):boolean");
    }
}
