package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SaversKtExternalSyntheticLambda2 implements getTextUnitTypeSaver {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final ddefault read;
    public final String serializer;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        throw null;
    }

    public final ddefault read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ddefault ddefaultVar = this.read;
        int i5 = i2 + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return ddefaultVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SaversKtExternalSyntheticLambda2(String str, ddefault ddefaultVar) {
        this.serializer = str;
        this.read = ddefaultVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode = this.serializer.hashCode();
            return Integer.hashCode(0) + ((this.read.hashCode() / (iHashCode + 56)) >>> 6);
        }
        int iHashCode2 = this.serializer.hashCode();
        return Integer.hashCode(0) + ((this.read.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(message=" + this.serializer + ", snackBarType=" + this.read + ", duration=0)";
        int i2 = IconCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.SaversKtExternalSyntheticLambda2) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.SaversKtExternalSyntheticLambda2) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r5.serializer.equals(r6.serializer) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = o.SaversKtExternalSyntheticLambda2.write + 123;
        o.SaversKtExternalSyntheticLambda2.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5.read.equals(r6.read) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r6 = o.SaversKtExternalSyntheticLambda2.write + 81;
        o.SaversKtExternalSyntheticLambda2.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
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
            int r1 = o.SaversKtExternalSyntheticLambda2.write
            int r1 = r1 + 71
            int r2 = r1 % 128
            o.SaversKtExternalSyntheticLambda2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            r1 = 59
            int r1 = r1 / r2
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof o.SaversKtExternalSyntheticLambda2
            if (r1 != 0) goto L1e
            goto L3e
        L1e:
            o.SaversKtExternalSyntheticLambda2 r6 = (o.SaversKtExternalSyntheticLambda2) r6
            java.lang.String r1 = r5.serializer
            java.lang.String r4 = r6.serializer
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L34
            int r6 = o.SaversKtExternalSyntheticLambda2.write
            int r6 = r6 + 123
            int r1 = r6 % 128
            o.SaversKtExternalSyntheticLambda2.IconCompatParcelizer = r1
            int r6 = r6 % r0
            goto L3e
        L34:
            o.ddefault r1 = r5.read
            o.ddefault r6 = r6.read
            boolean r6 = r1.equals(r6)
            if (r6 == r3) goto L3f
        L3e:
            return r2
        L3f:
            int r6 = o.SaversKtExternalSyntheticLambda2.write
            int r6 = r6 + 81
            int r1 = r6 % 128
            o.SaversKtExternalSyntheticLambda2.IconCompatParcelizer = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SaversKtExternalSyntheticLambda2.equals(java.lang.Object):boolean");
    }
}
