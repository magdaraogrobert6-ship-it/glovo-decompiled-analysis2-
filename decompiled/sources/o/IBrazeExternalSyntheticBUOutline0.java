package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeExternalSyntheticBUOutline0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String serializer;
    public final IBrazeEndpointProvider write;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public IBrazeExternalSyntheticBUOutline0(NetworkBody networkBody) {
        this.serializer = (String) networkBody.IconCompatParcelizer;
        this.write = (IBrazeEndpointProvider) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "OffTheGridEvent{offthegrid_id=" + this.serializer + ", property=" + this.write + "}";
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
            boolean r2 = r5 instanceof o.IBrazeExternalSyntheticBUOutline0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.IBrazeExternalSyntheticBUOutline0 r5 = (o.IBrazeExternalSyntheticBUOutline0) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.IBrazeEndpointProvider r5 = r5.write
            o.IBrazeEndpointProvider r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IBrazeExternalSyntheticBUOutline0.equals(java.lang.Object):boolean");
    }
}
