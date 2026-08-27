package o;

/* JADX INFO: loaded from: classes3.dex */
public final class checkAttributionI extends getAndroidId {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public checkAttributionI(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() % (ddefault.IconCompatParcelizer.hashCode() - 42);
        }
        return this.read.hashCode() + (ddefault.IconCompatParcelizer.hashCode() * 31);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r3.read.equals(((o.checkAttributionI) r4).read) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.checkAttributionI.RemoteActionCompatParcelizer
            int r1 = r1 + 43
            int r2 = r1 % 128
            o.checkAttributionI.serializer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 14
            int r1 = r1 / r2
            if (r3 != r4) goto L18
            goto L2c
        L15:
            if (r3 != r4) goto L18
            goto L2c
        L18:
            boolean r1 = r4 instanceof o.checkAttributionI
            if (r1 != 0) goto L1d
            goto L2b
        L1d:
            o.checkAttributionI r4 = (o.checkAttributionI) r4
            o.ddefault r1 = o.ddefault.serializer
            java.lang.String r1 = r3.read
            java.lang.String r4 = r4.read
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L2c
        L2b:
            return r2
        L2c:
            int r4 = o.checkAttributionI.RemoteActionCompatParcelizer
            int r4 = r4 + 85
            int r1 = r4 % 128
            o.checkAttributionI.serializer = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L39
            r4 = 1
            return r4
        L39:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.checkAttributionI.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + ddefault.IconCompatParcelizer + ", message=" + this.read + ")";
        int i2 = serializer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
