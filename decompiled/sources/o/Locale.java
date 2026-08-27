package o;

/* JADX INFO: loaded from: classes3.dex */
public final class Locale extends createPrecomposedSlotHandle {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final accessgetGocp read;
    public final String serializer;

    public final accessgetGocp IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 39;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetGocp accessgetgocp = this.read;
        int i5 = i2 + 73;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetgocp;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            str = this.serializer;
            int i4 = 2 / 0;
        } else {
            str = this.serializer;
        }
        int i5 = i3 + 13;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public Locale(accessgetGocp accessgetgocp, String str) {
        accessgetgocp.getClass();
        this.read = accessgetgocp;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 123;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.read.hashCode() * 31);
        int i4 = write + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DisplayWithLabel(destination=" + this.read + ", destinationLabel=" + this.serializer + ")";
        int i2 = write + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if ((!r12.serializer.equals(r13.serializer)) == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.Locale.RemoteActionCompatParcelizer
            int r1 = r1 + 107
            int r2 = r1 % 128
            o.Locale.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L60
            r1 = 0
            r2 = 1
            if (r12 != r13) goto L13
            goto L50
        L13:
            boolean r3 = r13 instanceof o.Locale
            if (r3 != 0) goto L18
            goto L5f
        L18:
            o.Locale r13 = (o.Locale) r13
            o.accessgetGocp r3 = r12.read
            o.accessgetGocp r4 = r13.read
            java.lang.Object[] r10 = new java.lang.Object[]{r3, r4}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L45
            goto L5f
        L45:
            java.lang.String r3 = r12.serializer
            java.lang.String r13 = r13.serializer
            boolean r13 = r3.equals(r13)
            r13 = r13 ^ r2
            if (r13 == r2) goto L5f
        L50:
            int r13 = o.Locale.write
            int r13 = r13 + 101
            int r3 = r13 % 128
            o.Locale.RemoteActionCompatParcelizer = r3
            int r13 = r13 % r0
            if (r13 == 0) goto L5e
            r13 = 12
            int r13 = r13 / r1
        L5e:
            return r2
        L5f:
            return r1
        L60:
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Locale.equals(java.lang.Object):boolean");
    }
}
