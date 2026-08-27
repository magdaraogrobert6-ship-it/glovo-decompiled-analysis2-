package o;

/* JADX INFO: loaded from: classes3.dex */
public final class createIconWithBackground implements createColoredBitmap {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final constructCompatStyleByName read;
    public final generatePOSTBodyString write;

    public createIconWithBackground(generatePOSTBodyString generatepostbodystring, constructCompatStyleByName constructcompatstylebyname) {
        this.write = generatepostbodystring;
        this.read = constructcompatstylebyname;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.write.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(entity=" + this.write + ", bonusInfo=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((!r4.read.equals(r5.read)) != true) goto L13;
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
            r1 = 1
            if (r4 != r5) goto L7
            goto L2d
        L7:
            boolean r2 = r5 instanceof o.createIconWithBackground
            if (r2 != 0) goto Lc
            goto L2e
        Lc:
            o.createIconWithBackground r5 = (o.createIconWithBackground) r5
            o.generatePOSTBodyString r2 = r4.write
            o.generatePOSTBodyString r3 = r5.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            int r5 = o.createIconWithBackground.IconCompatParcelizer
            int r5 = r5 + 119
            int r1 = r5 % 128
            o.createIconWithBackground.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r0
            goto L2e
        L22:
            o.constructCompatStyleByName r2 = r4.read
            o.constructCompatStyleByName r5 = r5.read
            boolean r5 = r2.equals(r5)
            r5 = r5 ^ r1
            if (r5 == r1) goto L2e
        L2d:
            return r1
        L2e:
            int r5 = o.createIconWithBackground.RemoteActionCompatParcelizer
            int r5 = r5 + 91
            int r1 = r5 % 128
            o.createIconWithBackground.IconCompatParcelizer = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createIconWithBackground.equals(java.lang.Object):boolean");
    }
}
