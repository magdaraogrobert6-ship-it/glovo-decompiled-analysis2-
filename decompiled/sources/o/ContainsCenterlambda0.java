package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ContainsCenterlambda0 extends ContainsAlllambda0 {
    private static int IconCompatParcelizer = 1;
    public static final ContainsCenterlambda0 RemoteActionCompatParcelizer = new ContainsCenterlambda0();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = read + 37;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "NotAvailable";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 19;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 2105158217;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r7 instanceof o.ContainsCenterlambda0)) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r3 = r3 + 69;
        o.ContainsCenterlambda0.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 73;
        o.ContainsCenterlambda0.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
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
            int r1 = o.ContainsCenterlambda0.serializer
            int r2 = r1 + 35
            int r3 = r2 % 128
            o.ContainsCenterlambda0.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L16
            r2 = 12
            int r2 = r2 / r4
            if (r6 != r7) goto L20
            goto L18
        L16:
            if (r6 != r7) goto L20
        L18:
            int r1 = r1 + 73
            int r7 = r1 % 128
            o.ContainsCenterlambda0.IconCompatParcelizer = r7
            int r1 = r1 % r0
            return r5
        L20:
            boolean r7 = r7 instanceof o.ContainsCenterlambda0
            r7 = r7 ^ r5
            if (r7 == r5) goto L34
            int r3 = r3 + 69
            int r7 = r3 % 128
            o.ContainsCenterlambda0.serializer = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L2f
            return r5
        L2f:
            r7 = 0
            r7.hashCode()
            throw r7
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContainsCenterlambda0.equals(java.lang.Object):boolean");
    }
}
