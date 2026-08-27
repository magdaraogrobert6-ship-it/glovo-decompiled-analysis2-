package o;

import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributedefault implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(11);
    public final unsetLocationCustomAttributelambda2 IconCompatParcelizer;
    public final setCustomEndpoint RemoteActionCompatParcelizer;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.IconCompatParcelizer.hashCode()) * (-2128831035);
    }

    public setCustomAttributedefault(IOParser$Decoder iOParser$Decoder) {
        this.RemoteActionCompatParcelizer = (setCustomEndpoint) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (unsetLocationCustomAttributelambda2) iOParser$Decoder.read;
    }

    public final String toString() {
        return "SDKActivatedEdge{person=" + this.RemoteActionCompatParcelizer + ", install=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.IconCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setCustomAttributedefault
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomAttributedefault r5 = (o.setCustomAttributedefault) r5
            o.setCustomEndpoint r2 = r5.RemoteActionCompatParcelizer
            o.setCustomEndpoint r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.unsetLocationCustomAttributelambda2 r5 = r5.IconCompatParcelizer
            o.unsetLocationCustomAttributelambda2 r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomAttributedefault.equals(java.lang.Object):boolean");
    }
}
