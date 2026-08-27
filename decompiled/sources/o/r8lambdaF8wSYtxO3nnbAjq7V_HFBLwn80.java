package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeExternalSyntheticLambda5 RemoteActionCompatParcelizer = new BrazeExternalSyntheticLambda5(16);
    public final Byte IconCompatParcelizer;
    public final Byte serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Byte b = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b == null ? 0 : b.hashCode())) * (-2128831035);
    }

    public r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80(r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs r8lambdarbug8qioncpygcsl25td35mcmxs) {
        this.IconCompatParcelizer = r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer;
        this.serializer = r8lambdarbug8qioncpygcsl25td35mcmxs.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationAuthorizationChangeEvent{authorizationStatus=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accuracyAuthorization=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
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
            boolean r2 = r5 instanceof o.r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80 r5 = (o.r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80) r5
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaF8wSYtxO3nnbAjq7V_HFBLwn80.equals(java.lang.Object):boolean");
    }
}
