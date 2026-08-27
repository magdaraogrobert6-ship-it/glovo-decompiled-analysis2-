package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setExitSharedElementCallback extends removeStaleIds {
    private static int read = 1;
    private static int serializer;
    public final int IconCompatParcelizer;
    public final long write;

    public setExitSharedElementCallback(int i) {
        long jM758getUnspecified0d7_KjU = androidx.compose.ui.graphics.Color.Companion.m758getUnspecified0d7_KjU();
        this.IconCompatParcelizer = i;
        this.write = jM758getUnspecified0d7_KjU;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) >>> (Integer.hashCode(this.IconCompatParcelizer) >> 53);
        }
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(r6.write, r7.write) != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r6 != r7) goto L7
            goto L2e
        L7:
            boolean r2 = r7 instanceof o.setExitSharedElementCallback
            if (r2 != 0) goto Lc
            goto L1f
        Lc:
            o.setExitSharedElementCallback r7 = (o.setExitSharedElementCallback) r7
            int r2 = r6.IconCompatParcelizer
            int r3 = r7.IconCompatParcelizer
            if (r2 == r3) goto L15
            goto L1f
        L15:
            long r2 = r6.write
            long r4 = r7.write
            boolean r7 = androidx.compose.ui.graphics.Color.m723equalsimpl0(r2, r4)
            if (r7 == r1) goto L2e
        L1f:
            int r7 = o.setExitSharedElementCallback.serializer
            int r7 = r7 + 101
            int r1 = r7 % 128
            o.setExitSharedElementCallback.read = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L2c
            r7 = 0
            return r7
        L2c:
            r7 = 0
            throw r7
        L2e:
            int r7 = o.setExitSharedElementCallback.serializer
            int r7 = r7 + 35
            int r2 = r7 % 128
            o.setExitSharedElementCallback.read = r2
            int r7 = r7 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExitSharedElementCallback.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Resource(drawableRes=" + this.IconCompatParcelizer + ", tint=" + androidx.compose.ui.graphics.Color.m730toStringimpl(this.write) + ")";
        int i2 = read + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
