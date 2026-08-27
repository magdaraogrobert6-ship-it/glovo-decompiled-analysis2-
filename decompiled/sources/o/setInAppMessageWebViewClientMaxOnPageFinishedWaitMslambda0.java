package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw IconCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(29);
    public final Double read;
    public final Double serializer;
    public final String write;

    public final int hashCode() {
        Double d = this.serializer;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.read;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        String str = this.write;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str != null ? str.hashCode() : 0)) * (-2128831035);
    }

    public setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0(addAliaslambda1 addaliaslambda1) {
        this.serializer = addaliaslambda1.serializer;
        this.read = addaliaslambda1.write;
        this.write = addaliaslambda1.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutlierDetection{score=");
        sb.append(this.serializer);
        sb.append(", threshold=");
        sb.append(this.read);
        sb.append(", label=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0 r5 = (o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0) r5
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.String r5 = r5.write
            java.lang.String r2 = r4.write
            if (r2 == r5) goto L3b
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInAppMessageWebViewClientMaxOnPageFinishedWaitMslambda0.equals(java.lang.Object):boolean");
    }
}
