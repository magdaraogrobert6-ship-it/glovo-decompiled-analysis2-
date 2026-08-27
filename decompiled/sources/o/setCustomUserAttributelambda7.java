package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda7 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o IconCompatParcelizer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(13);
    public final setHomeCitylambda0 RemoteActionCompatParcelizer;
    public final setEmaillambda0 read;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public setCustomUserAttributelambda7(FormBody.Builder builder) {
        this.RemoteActionCompatParcelizer = (setHomeCitylambda0) builder.serializer;
        this.read = (setEmaillambda0) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "SdkAuth{token=" + this.RemoteActionCompatParcelizer + ", configuration=" + this.read + "}";
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
            boolean r2 = r5 instanceof o.setCustomUserAttributelambda7
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributelambda7 r5 = (o.setCustomUserAttributelambda7) r5
            o.setHomeCitylambda0 r2 = r5.RemoteActionCompatParcelizer
            o.setHomeCitylambda0 r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setEmaillambda0 r5 = r5.read
            o.setEmaillambda0 r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributelambda7.equals(java.lang.Object):boolean");
    }
}
