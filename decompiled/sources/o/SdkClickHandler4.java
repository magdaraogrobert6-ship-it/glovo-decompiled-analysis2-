package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkClickHandler4 implements sendNextSdkClick {
    private static int read = 1;
    private static int write;
    public final String serializer;

    public SdkClickHandler4(String str) {
        ddefault ddefaultVar = ddefault.serializer;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = Integer.hashCode(0) + ((ddefault.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = read + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.SdkClickHandler4) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r5.serializer.equals(((o.SdkClickHandler4) r6).serializer) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r6 = o.ddefault.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 39;
        o.SdkClickHandler4.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
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
            int r1 = o.SdkClickHandler4.write
            int r2 = r1 + 3
            int r3 = r2 % 128
            o.SdkClickHandler4.read = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 93
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 39
            int r6 = r1 % 128
            o.SdkClickHandler4.read = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r0 = r6 instanceof o.SdkClickHandler4
            if (r0 != 0) goto L25
            goto L31
        L25:
            o.SdkClickHandler4 r6 = (o.SdkClickHandler4) r6
            java.lang.String r0 = r5.serializer
            java.lang.String r6 = r6.serializer
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L32
        L31:
            return r4
        L32:
            o.ddefault r6 = o.ddefault.serializer
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SdkClickHandler4.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(text=" + this.serializer + ", snackBarType=" + ddefault.IconCompatParcelizer + ", length=0)";
        int i2 = read + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
