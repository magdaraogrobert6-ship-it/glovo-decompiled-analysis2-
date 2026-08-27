package o;

/* JADX INFO: loaded from: classes3.dex */
public final class addToSubscriptionGroup implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Double read;
    public final Double serializer;

    public final int hashCode() {
        Double d = this.read;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (d2 != null ? d2.hashCode() : 0)) * (-2128831035);
    }

    public addToSubscriptionGroup(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.read = (Double) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.serializer = (Double) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "InterpolatedTrajectoryElement{latitude=" + this.read + ", longitude=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.addToSubscriptionGroup
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addToSubscriptionGroup r5 = (o.addToSubscriptionGroup) r5
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Double r5 = r5.serializer
            java.lang.Double r2 = r4.serializer
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addToSubscriptionGroup.equals(java.lang.Object):boolean");
    }
}
