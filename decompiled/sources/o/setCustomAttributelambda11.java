package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributelambda11 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o serializer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(12);
    public final setCustomEndpoint IconCompatParcelizer;
    public final unsetLocationCustomAttributelambda2 read;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public setCustomAttributelambda11(NetworkBody networkBody) {
        this.IconCompatParcelizer = (setCustomEndpoint) networkBody.IconCompatParcelizer;
        this.read = (unsetLocationCustomAttributelambda2) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "SDKInstalledEdge{person=" + this.IconCompatParcelizer + ", install=" + this.read + "}";
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
            boolean r2 = r5 instanceof o.setCustomAttributelambda11
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomAttributelambda11 r5 = (o.setCustomAttributelambda11) r5
            o.setCustomEndpoint r2 = r5.IconCompatParcelizer
            o.setCustomEndpoint r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.unsetLocationCustomAttributelambda2 r5 = r5.read
            o.unsetLocationCustomAttributelambda2 r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomAttributelambda11.equals(java.lang.Object):boolean");
    }
}
