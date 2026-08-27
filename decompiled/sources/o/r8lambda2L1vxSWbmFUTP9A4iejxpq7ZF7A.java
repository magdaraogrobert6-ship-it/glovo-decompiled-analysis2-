package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY IconCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(0);
    public final Byte read;
    public final Byte serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        Byte b = this.read;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b == null ? 0 : b.hashCode())) * (-2128831035);
    }

    public r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.serializer = (Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.read = (Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallEvent{type=");
        sb.append(this.serializer);
        sb.append(", call_protocol=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.read;
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
            boolean r2 = r5 instanceof o.r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r5 = (o.r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A) r5
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.equals(java.lang.Object):boolean");
    }
}
