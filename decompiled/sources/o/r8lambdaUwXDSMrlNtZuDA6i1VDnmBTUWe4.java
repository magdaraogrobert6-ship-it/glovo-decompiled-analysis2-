package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(5);
    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    public final clearInstanceandroid_sdk_base_release write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        clearInstanceandroid_sdk_base_release clearinstanceandroid_sdk_base_release = this.write;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (clearinstanceandroid_sdk_base_release == null ? 0 : clearinstanceandroid_sdk_base_release.hashCode())) * (-2128831035);
    }

    public r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4(NetworkBody networkBody) {
        this.RemoteActionCompatParcelizer = (BrazeCompanionExternalSyntheticLambda4) networkBody.IconCompatParcelizer;
        this.write = (clearInstanceandroid_sdk_base_release) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "TransportClassificationLocation{location=" + this.RemoteActionCompatParcelizer + ", gis_features=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4 r5 = (o.r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4) r5
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r5.RemoteActionCompatParcelizer
            o.BrazeCompanionExternalSyntheticLambda4 r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            o.clearInstanceandroid_sdk_base_release r5 = r5.write
            o.clearInstanceandroid_sdk_base_release r2 = r4.write
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaUwXDSMrlNtZuDA6i1VDnmBTUWe4.equals(java.lang.Object):boolean");
    }
}
