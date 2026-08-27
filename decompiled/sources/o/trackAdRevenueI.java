package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class trackAdRevenueI extends teardownAttributionS {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public trackAdRevenueI(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = read + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("SnackBarError(message=", this.serializer, ")");
        int i4 = read + 121;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((!r3.serializer.equals(((o.trackAdRevenueI) r4).serializer)) != true) goto L10;
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
            r1 = 1
            if (r3 != r4) goto L7
            goto L22
        L7:
            boolean r2 = r4 instanceof o.trackAdRevenueI
            if (r2 != 0) goto L15
            int r4 = o.trackAdRevenueI.read
            int r4 = r4 + 111
            int r1 = r4 % 128
            o.trackAdRevenueI.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            goto L2c
        L15:
            o.trackAdRevenueI r4 = (o.trackAdRevenueI) r4
            java.lang.String r2 = r3.serializer
            java.lang.String r4 = r4.serializer
            boolean r4 = r2.equals(r4)
            r4 = r4 ^ r1
            if (r4 == r1) goto L2c
        L22:
            int r4 = o.trackAdRevenueI.RemoteActionCompatParcelizer
            int r4 = r4 + 5
            int r2 = r4 % 128
            o.trackAdRevenueI.read = r2
            int r4 = r4 % r0
            return r1
        L2c:
            int r4 = o.trackAdRevenueI.read
            int r4 = r4 + 111
            int r1 = r4 % 128
            o.trackAdRevenueI.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L39
            r4 = 0
            return r4
        L39:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.trackAdRevenueI.equals(java.lang.Object):boolean");
    }
}
