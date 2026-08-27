package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getIntentFlags implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw write = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(26);
    public final Byte IconCompatParcelizer;
    public final unsetLocationCustomAttributelambda0 serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        unsetLocationCustomAttributelambda0 unsetlocationcustomattributelambda0 = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (unsetlocationcustomattributelambda0 == null ? 0 : unsetlocationcustomattributelambda0.hashCode())) * (-2128831035);
    }

    public getIntentFlags(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.IconCompatParcelizer = (Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.serializer = (unsetLocationCustomAttributelambda0) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "TileConfig{zoom_level=" + this.IconCompatParcelizer + ", credentials=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.getIntentFlags
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getIntentFlags r5 = (o.getIntentFlags) r5
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            o.unsetLocationCustomAttributelambda0 r5 = r5.serializer
            o.unsetLocationCustomAttributelambda0 r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.getIntentFlags.equals(java.lang.Object):boolean");
    }
}
