package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class awaitStarted extends getOutputTransform {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String write;

    public awaitStarted(String str) {
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = serializer + 39;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("ErrorState(errorMessage=", this.write, ")");
        int i4 = IconCompatParcelizer + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2.write.equals(((o.awaitStarted) r3).write) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r2 != r3) goto L6
            goto L37
        L6:
            boolean r1 = r3 instanceof o.awaitStarted
            if (r1 != 0) goto L19
            int r3 = o.awaitStarted.IconCompatParcelizer
            int r3 = r3 + 21
            int r1 = r3 % 128
            o.awaitStarted.serializer = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L25
            r3 = 5
            int r3 = r3 / 3
            goto L25
        L19:
            o.awaitStarted r3 = (o.awaitStarted) r3
            java.lang.String r1 = r2.write
            java.lang.String r3 = r3.write
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L37
        L25:
            int r3 = o.awaitStarted.serializer
            int r3 = r3 + 51
            int r1 = r3 % 128
            o.awaitStarted.IconCompatParcelizer = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            r3 = 0
            return r3
        L32:
            r3 = 0
            r3.hashCode()
            throw r3
        L37:
            int r3 = o.awaitStarted.IconCompatParcelizer
            int r3 = r3 + 7
            int r1 = r3 % 128
            o.awaitStarted.serializer = r1
            int r3 = r3 % r0
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.awaitStarted.equals(java.lang.Object):boolean");
    }
}
