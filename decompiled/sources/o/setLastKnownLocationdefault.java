package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastKnownLocationdefault implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String RemoteActionCompatParcelizer;
    public final Double write;

    public final int hashCode() {
        Double d = this.write;
        int iHashCode = d == null ? 0 : d.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (str != null ? str.hashCode() : 0)) * (-2128831035);
    }

    public setLastKnownLocationdefault(IOParser$Decoder iOParser$Decoder) {
        this.write = (Double) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (String) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinalResult{score=");
        sb.append(this.write);
        sb.append(", label=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "}");
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
            boolean r2 = r5 instanceof o.setLastKnownLocationdefault
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLastKnownLocationdefault r5 = (o.setLastKnownLocationdefault) r5
            java.lang.Double r2 = r5.write
            java.lang.Double r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.String r5 = r5.RemoteActionCompatParcelizer
            java.lang.String r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setLastKnownLocationdefault.equals(java.lang.Object):boolean");
    }
}
