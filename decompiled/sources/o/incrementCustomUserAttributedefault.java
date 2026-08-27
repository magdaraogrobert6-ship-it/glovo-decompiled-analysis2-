package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class incrementCustomUserAttributedefault implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o read = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(10);
    public final setBadNetworkIntervalandroid_sdk_base_release IconCompatParcelizer;
    public final setCountrylambda0 write;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public incrementCustomUserAttributedefault(NetworkBody networkBody) {
        this.IconCompatParcelizer = (setBadNetworkIntervalandroid_sdk_base_release) networkBody.IconCompatParcelizer;
        this.write = (setCountrylambda0) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "Data{pedigree=" + this.IconCompatParcelizer + ", dataunit=" + this.write + "}";
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
            boolean r2 = r5 instanceof o.incrementCustomUserAttributedefault
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.incrementCustomUserAttributedefault r5 = (o.incrementCustomUserAttributedefault) r5
            o.setBadNetworkIntervalandroid_sdk_base_release r2 = r5.IconCompatParcelizer
            o.setBadNetworkIntervalandroid_sdk_base_release r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setCountrylambda0 r5 = r5.write
            o.setCountrylambda0 r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.incrementCustomUserAttributedefault.equals(java.lang.Object):boolean");
    }
}
