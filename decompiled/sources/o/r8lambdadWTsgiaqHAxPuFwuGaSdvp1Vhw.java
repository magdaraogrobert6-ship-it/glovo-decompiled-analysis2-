package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o write = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(28);
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.read;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.serializer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw(setPhoneNumberlambda3 setphonenumberlambda3) {
        this.IconCompatParcelizer = setphonenumberlambda3.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = setphonenumberlambda3.write;
        this.read = setphonenumberlambda3.IconCompatParcelizer;
        this.serializer = setphonenumberlambda3.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoundaryElement{category=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ended=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", start=");
        sb.append(this.read);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw r5 = (o.r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            java.lang.String r5 = r5.serializer
            java.lang.String r2 = r4.serializer
            if (r2 == r5) goto L49
            if (r2 == 0) goto L48
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdadWTsgiaqHAxPuFwuGaSdvp1Vhw.equals(java.lang.Object):boolean");
    }
}
