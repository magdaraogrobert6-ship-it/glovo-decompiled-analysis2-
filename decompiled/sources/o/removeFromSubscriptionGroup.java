package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class removeFromSubscriptionGroup implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Double RemoteActionCompatParcelizer;
    public final Double serializer;

    public final int hashCode() {
        Double d = this.serializer;
        int iHashCode = d == null ? 0 : d.hashCode();
        Double d2 = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (d2 != null ? d2.hashCode() : 0)) * (-2128831035);
    }

    public removeFromSubscriptionGroup(FormBody.Builder builder) {
        this.serializer = (Double) builder.serializer;
        this.RemoteActionCompatParcelizer = (Double) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "SmoothTrajectoryElement{latitude=" + this.serializer + ", longitude=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.removeFromSubscriptionGroup
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.removeFromSubscriptionGroup r5 = (o.removeFromSubscriptionGroup) r5
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Double r5 = r5.RemoteActionCompatParcelizer
            java.lang.Double r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.removeFromSubscriptionGroup.equals(java.lang.Object):boolean");
    }
}
