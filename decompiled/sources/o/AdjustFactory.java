package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustFactory extends AdjustEventSuccess {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    public static final AdjustFactory serializer = new AdjustFactory();
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 17;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return "NavigateBackWithSuccessfulResult";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 626515891;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r7 = 68 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((r7 instanceof o.AdjustFactory) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r3 = r3 + 57;
        o.AdjustFactory.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 13;
        o.AdjustFactory.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L11;
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
            int r1 = o.AdjustFactory.read
            int r2 = r1 + 59
            int r3 = r2 % 128
            o.AdjustFactory.write = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L15
            r2 = 2
            int r2 = r2 / r5
            if (r6 != r7) goto L24
            goto L17
        L15:
            if (r6 != r7) goto L24
        L17:
            int r1 = r1 + 13
            int r7 = r1 % 128
            o.AdjustFactory.write = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L23
            r7 = 68
            int r7 = r7 / r5
        L23:
            return r4
        L24:
            boolean r7 = r7 instanceof o.AdjustFactory
            if (r7 != 0) goto L30
            int r3 = r3 + 57
            int r7 = r3 % 128
            o.AdjustFactory.read = r7
            int r3 = r3 % r0
            return r5
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdjustFactory.equals(java.lang.Object):boolean");
    }
}
