package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setAttributionDatalambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o serializer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(11);
    public final setLocationCustomAttributelambda1 RemoteActionCompatParcelizer;
    public final setLanguagelambda0 write;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public setAttributionDatalambda0(FormBody.Builder builder) {
        this.RemoteActionCompatParcelizer = (setLocationCustomAttributelambda1) builder.serializer;
        this.write = (setLanguagelambda0) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "RegisteredSensorEdge{hub=" + this.RemoteActionCompatParcelizer + ", sensor=" + this.write + "}";
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
            boolean r2 = r5 instanceof o.setAttributionDatalambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setAttributionDatalambda0 r5 = (o.setAttributionDatalambda0) r5
            o.setLocationCustomAttributelambda1 r2 = r5.RemoteActionCompatParcelizer
            o.setLocationCustomAttributelambda1 r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setLanguagelambda0 r5 = r5.write
            o.setLanguagelambda0 r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAttributionDatalambda0.equals(java.lang.Object):boolean");
    }
}
