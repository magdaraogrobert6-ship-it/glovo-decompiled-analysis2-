package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isFinite0680j_4annotations extends PointerInteropFilterpointerInputFilter1stopDispatching1 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final isFinite0680j_4annotations serializer = new isFinite0680j_4annotations();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "InvalidPin";
    }

    @Override // o.PointerInteropFilterpointerInputFilter1stopDispatching1
    public final String write() {
        int i = 2 % 2;
        int i2 = read + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return "invalid_pin";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return -937547941;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.isFinite0680j_4annotations) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r1 = r1 + 67;
        o.isFinite0680j_4annotations.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return false;
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
            int r1 = o.isFinite0680j_4annotations.read
            int r2 = r1 + 89
            int r3 = r2 % 128
            o.isFinite0680j_4annotations.write = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 50
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r6 = r6 instanceof o.isFinite0680j_4annotations
            if (r6 == 0) goto L1e
            return r3
        L1e:
            int r1 = r1 + 67
            int r6 = r1 % 128
            o.isFinite0680j_4annotations.write = r6
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isFinite0680j_4annotations.equals(java.lang.Object):boolean");
    }
}
