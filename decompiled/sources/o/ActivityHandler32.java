package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler32 implements ActivityHandler30 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String write;

    public ActivityHandler32(String str) {
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = IconCompatParcelizer + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("OpenWebView(url=", this.write, ")");
            int i3 = serializer + 19;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("OpenWebView(url=", this.write, ")");
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if ((!r5.write.equals(((o.ActivityHandler32) r6).write)) != true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ActivityHandler32.IconCompatParcelizer
            int r2 = r1 + 29
            int r3 = r2 % 128
            o.ActivityHandler32.serializer = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L3b
            r2 = 1
            if (r5 != r6) goto L13
            goto L2c
        L13:
            boolean r4 = r6 instanceof o.ActivityHandler32
            if (r4 != 0) goto L1f
            int r1 = r1 + 47
            int r6 = r1 % 128
            o.ActivityHandler32.serializer = r6
            int r1 = r1 % r0
            goto L2d
        L1f:
            o.ActivityHandler32 r6 = (o.ActivityHandler32) r6
            java.lang.String r1 = r5.write
            java.lang.String r6 = r6.write
            boolean r6 = r1.equals(r6)
            r6 = r6 ^ r2
            if (r6 == r2) goto L2d
        L2c:
            return r2
        L2d:
            int r6 = o.ActivityHandler32.serializer
            int r6 = r6 + 27
            int r1 = r6 % 128
            o.ActivityHandler32.IconCompatParcelizer = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L3a
            r6 = 0
            return r6
        L3a:
            throw r3
        L3b:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ActivityHandler32.equals(java.lang.Object):boolean");
    }
}
