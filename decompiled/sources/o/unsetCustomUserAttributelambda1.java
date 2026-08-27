package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetCustomUserAttributelambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE serializer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(17);
    public final Long RemoteActionCompatParcelizer;
    public final Long write;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public unsetCustomUserAttributelambda1(NetworkBody networkBody) {
        this.RemoteActionCompatParcelizer = (Long) networkBody.IconCompatParcelizer;
        this.write = (Long) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Sleep{start=" + this.RemoteActionCompatParcelizer + ", stop=" + this.write + "}";
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
            boolean r2 = r5 instanceof o.unsetCustomUserAttributelambda1
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.unsetCustomUserAttributelambda1 r5 = (o.unsetCustomUserAttributelambda1) r5
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Long r5 = r5.write
            java.lang.Long r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unsetCustomUserAttributelambda1.equals(java.lang.Object):boolean");
    }
}
