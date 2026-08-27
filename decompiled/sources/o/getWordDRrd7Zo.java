package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getWordDRrd7Zo implements setAnimations {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final LayoutCompatBreakStrategy IconCompatParcelizer;
    public final setExitSharedElementCallback serializer;
    public final String write;

    public getWordDRrd7Zo(setExitSharedElementCallback setexitsharedelementcallback, String str, LayoutCompatJustificationMode layoutCompatJustificationMode) {
        this.serializer = setexitsharedelementcallback;
        this.write = str;
        this.IconCompatParcelizer = layoutCompatJustificationMode;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write);
        LayoutCompatBreakStrategy layoutCompatBreakStrategy = this.IconCompatParcelizer;
        if (layoutCompatBreakStrategy == null) {
            int i2 = read + 77;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = layoutCompatBreakStrategy.hashCode();
        }
        int i7 = iM + iHashCode;
        int i8 = RemoteActionCompatParcelizer + 43;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return i7;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EarningsExpandedBubbleItem(imageSource=" + this.serializer + ", title=" + this.write + ", earningsItem=" + this.IconCompatParcelizer + ")";
        int i2 = read + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r10.IconCompatParcelizer, r11.IconCompatParcelizer}, o.getCieXyz.write())).booleanValue()) != true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getWordDRrd7Zo.read
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.getWordDRrd7Zo.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L6f
            r1 = 1
            if (r10 != r11) goto L12
            goto L5a
        L12:
            boolean r2 = r11 instanceof o.getWordDRrd7Zo
            if (r2 != 0) goto L17
            goto L64
        L17:
            o.getWordDRrd7Zo r11 = (o.getWordDRrd7Zo) r11
            o.setExitSharedElementCallback r2 = r10.serializer
            o.setExitSharedElementCallback r3 = r11.serializer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
            goto L64
        L24:
            java.lang.String r2 = r10.write
            java.lang.String r3 = r11.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L64
        L2f:
            o.LayoutCompatBreakStrategy r2 = r10.IconCompatParcelizer
            o.LayoutCompatBreakStrategy r11 = r11.IconCompatParcelizer
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r11}
            int r3 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r6 = o.getCieXyz.write()
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r11 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ r1
            if (r11 == r1) goto L64
        L5a:
            int r11 = o.getWordDRrd7Zo.read
            int r11 = r11 + 61
            int r2 = r11 % 128
            o.getWordDRrd7Zo.RemoteActionCompatParcelizer = r2
            int r11 = r11 % r0
            return r1
        L64:
            int r11 = o.getWordDRrd7Zo.read
            int r11 = r11 + 65
            int r1 = r11 % 128
            o.getWordDRrd7Zo.RemoteActionCompatParcelizer = r1
            int r11 = r11 % r0
            r11 = 0
            return r11
        L6f:
            r11 = 0
            r11.hashCode()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWordDRrd7Zo.equals(java.lang.Object):boolean");
    }
}
