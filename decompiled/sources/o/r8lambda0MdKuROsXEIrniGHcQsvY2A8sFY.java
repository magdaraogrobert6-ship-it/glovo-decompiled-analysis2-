package o;

import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 IconCompatParcelizer = new stopInstancelambda11(23);
    public final String RemoteActionCompatParcelizer;
    public final Byte read;
    public final Short serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY(N$b n$b) {
        this.RemoteActionCompatParcelizer = (String) n$b.read;
        this.write = (String) n$b.write;
        this.read = (Byte) n$b.IconCompatParcelizer;
        this.serializer = (Short) n$b.serializer;
    }

    public final String toString() {
        return "Pedigree{userid=" + this.RemoteActionCompatParcelizer + ", sdk_version=" + this.write + ", os=" + this.read + ", timezone=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY r5 = (o.r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY) r5
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L1b:
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L27:
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L33:
            java.lang.Short r5 = r5.serializer
            java.lang.Short r2 = r4.serializer
            if (r2 == r5) goto L41
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda0MdKuROsXEIrniGHcQsvY2A8sFY.equals(java.lang.Object):boolean");
    }
}
