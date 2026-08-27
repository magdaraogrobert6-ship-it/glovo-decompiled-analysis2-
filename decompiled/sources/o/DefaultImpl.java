package o;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultImpl extends ComposeClickableSpan {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final DefaultImpl read = new DefaultImpl();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 19;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "OpenNavigationSettings";
        }
        int i3 = 70 / 0;
        return "OpenNavigationSettings";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return -948677235;
        }
        int i3 = 85 / 0;
        return -948677235;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r7 instanceof o.DefaultImpl)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 99;
        o.DefaultImpl.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r3 = r3 + 51;
        o.DefaultImpl.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if ((r3 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r7 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = o.DefaultImpl.IconCompatParcelizer
            int r2 = r1 + 93
            int r3 = r2 % 128
            o.DefaultImpl.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L16
            r2 = 81
            int r2 = r2 / r5
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r4
        L19:
            boolean r7 = r7 instanceof o.DefaultImpl
            r7 = r7 ^ r4
            if (r7 == 0) goto L26
            int r1 = r1 + 99
            int r7 = r1 % 128
            o.DefaultImpl.RemoteActionCompatParcelizer = r7
            int r1 = r1 % r0
            return r5
        L26:
            int r3 = r3 + 51
            int r7 = r3 % 128
            o.DefaultImpl.IconCompatParcelizer = r7
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            r7 = 92
            int r7 = r7 / r5
        L32:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DefaultImpl.equals(java.lang.Object):boolean");
    }
}
