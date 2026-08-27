package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextGeometricTransformSaverlambda1 extends Throwable {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final Throwable write;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Throwable th = this.write;
        int i5 = i3 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return th;
    }

    public TextGeometricTransformSaverlambda1(Throwable th) {
        super(th);
        this.write = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Throwable th = this.write;
        if (th != null) {
            return th.hashCode();
        }
        int i5 = i2 + 17;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        String str = "DeliveryAcceptanceError(cause=" + this.write + ")";
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r13 instanceof o.TextGeometricTransformSaverlambda1)) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r12.write, ((o.TextGeometricTransformSaverlambda1) r13).write}, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r13 = o.TextGeometricTransformSaverlambda1.IconCompatParcelizer + 55;
        o.TextGeometricTransformSaverlambda1.serializer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if ((r13 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r2 = r2 + 123;
        o.TextGeometricTransformSaverlambda1.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
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
            int r1 = o.TextGeometricTransformSaverlambda1.IconCompatParcelizer
            int r1 = r1 + 27
            int r2 = r1 % 128
            o.TextGeometricTransformSaverlambda1.serializer = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L16
            r1 = 14
            int r1 = r1 / r3
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r4
        L19:
            boolean r1 = r13 instanceof o.TextGeometricTransformSaverlambda1
            r1 = r1 ^ r4
            if (r1 == r4) goto L58
            o.TextGeometricTransformSaverlambda1 r13 = (o.TextGeometricTransformSaverlambda1) r13
            java.lang.Throwable r1 = r12.write
            java.lang.Throwable r13 = r13.write
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L57
            int r13 = o.TextGeometricTransformSaverlambda1.IconCompatParcelizer
            int r13 = r13 + 55
            int r1 = r13 % 128
            o.TextGeometricTransformSaverlambda1.serializer = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L56
            return r4
        L56:
            return r3
        L57:
            return r4
        L58:
            int r2 = r2 + 123
            int r13 = r2 % 128
            o.TextGeometricTransformSaverlambda1.IconCompatParcelizer = r13
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TextGeometricTransformSaverlambda1.equals(java.lang.Object):boolean");
    }
}
