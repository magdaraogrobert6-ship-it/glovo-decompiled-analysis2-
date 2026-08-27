package o;

import com.sentiance.core.model.events.H$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeExternalSyntheticLambda5 serializer = new BrazeExternalSyntheticLambda5(15);
    public final Long RemoteActionCompatParcelizer;
    public final Double read;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU(H$b h$b) {
        this.RemoteActionCompatParcelizer = (Long) h$b.serializer;
        this.read = (Double) h$b.write;
    }

    public final String toString() {
        return "LikelyVenue{venue_id=" + this.RemoteActionCompatParcelizer + ", likelihood=" + this.read + "}";
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
            boolean r2 = r5 instanceof o.r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU r5 = (o.r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU) r5
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Double r5 = r5.read
            java.lang.Double r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda4mwgvCOSzz69yvs_Eb4pIBqMbQU.equals(java.lang.Object):boolean");
    }
}
