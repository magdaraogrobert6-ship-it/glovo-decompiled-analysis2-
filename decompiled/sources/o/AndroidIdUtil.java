package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidIdUtil extends setTimer {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public AndroidIdUtil(String str, String str2) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NotWorking(title=", this.read, ", description=", this.RemoteActionCompatParcelizer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NotWorking(title=", this.read, ", description=", this.RemoteActionCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        int i4 = serializer + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r4 != r5) goto L15
            int r5 = o.AndroidIdUtil.IconCompatParcelizer
            int r5 = r5 + 37
            int r2 = r5 % 128
            o.AndroidIdUtil.serializer = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L32
            r5 = 5
            int r5 = r5 / 4
            goto L32
        L15:
            boolean r2 = r5 instanceof o.AndroidIdUtil
            if (r2 != 0) goto L1a
            goto L31
        L1a:
            o.AndroidIdUtil r5 = (o.AndroidIdUtil) r5
            java.lang.String r2 = r4.read
            java.lang.String r3 = r5.read
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L31
        L27:
            java.lang.String r2 = r4.RemoteActionCompatParcelizer
            java.lang.String r5 = r5.RemoteActionCompatParcelizer
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L32
        L31:
            return r1
        L32:
            int r5 = o.AndroidIdUtil.IconCompatParcelizer
            int r5 = r5 + 123
            int r2 = r5 % 128
            o.AndroidIdUtil.serializer = r2
            int r5 = r5 % r0
            r0 = 1
            if (r5 != 0) goto L41
            r5 = 54
            int r5 = r5 / r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AndroidIdUtil.equals(java.lang.Object):boolean");
    }
}
