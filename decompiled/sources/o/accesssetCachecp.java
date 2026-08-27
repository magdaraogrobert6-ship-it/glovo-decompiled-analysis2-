package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetCachecp {
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public accesssetCachecp(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("LocalServerSession(baseUrl=", this.RemoteActionCompatParcelizer, ", token=REDACTED, releaseId=", this.IconCompatParcelizer, ")");
        int i4 = serializer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
        int i4 = serializer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r20.IconCompatParcelizer, r1.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue()) != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.accesssetCachecp.serializer
            int r3 = r3 + 55
            int r4 = r3 % 128
            o.accesssetCachecp.read = r4
            int r3 = r3 % r2
            r3 = 1
            if (r0 != r1) goto L14
            goto L78
        L14:
            boolean r4 = r1 instanceof o.accesssetCachecp
            if (r4 != 0) goto L19
            goto L79
        L19:
            o.accesssetCachecp r1 = (o.accesssetCachecp) r1
            java.lang.String r4 = r0.RemoteActionCompatParcelizer
            java.lang.String r5 = r1.RemoteActionCompatParcelizer
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L26
            goto L79
        L26:
            java.lang.String r4 = r0.write
            java.lang.String r5 = r1.write
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r14
            r8 = r15
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L53
            goto L79
        L53:
            java.lang.String r4 = r0.IconCompatParcelizer
            java.lang.String r1 = r1.IconCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r1}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            if (r1 == r3) goto L79
        L78:
            return r3
        L79:
            int r1 = o.accesssetCachecp.serializer
            int r1 = r1 + 87
            int r3 = r1 % 128
            o.accesssetCachecp.read = r3
            int r1 = r1 % r2
            r2 = 0
            if (r1 != 0) goto L88
            r1 = 64
            int r1 = r1 / r2
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesssetCachecp.equals(java.lang.Object):boolean");
    }
}
