package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class handleIncomingIntentlambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Double RemoteActionCompatParcelizer;
    public final Short serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public handleIncomingIntentlambda1(FormBody.Builder builder) {
        this.serializer = (Short) builder.serializer;
        this.RemoteActionCompatParcelizer = (Double) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "VenueTypeProbability{venueType=" + this.serializer + ", likelihood=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.handleIncomingIntentlambda1
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.handleIncomingIntentlambda1 r5 = (o.handleIncomingIntentlambda1) r5
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Double r5 = r5.RemoteActionCompatParcelizer
            java.lang.Double r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.handleIncomingIntentlambda1.equals(java.lang.Object):boolean");
    }
}
