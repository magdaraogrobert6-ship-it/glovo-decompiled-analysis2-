package o;

/* JADX INFO: loaded from: classes3.dex */
public final class lh extends ArrangementCenter1 {
    private static int IconCompatParcelizer = 1;
    public static final lh RemoteActionCompatParcelizer = new lh();
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 23;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 83;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "ApiCanceled";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return -410378275;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.lh) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 1;
        o.lh.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r3 = r3 + 115;
        o.lh.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if ((r3 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r7 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
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
            int r1 = o.lh.serializer
            int r2 = r1 + 73
            int r3 = r2 % 128
            o.lh.write = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 34
            int r2 = r2 / r5
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r4
        L19:
            boolean r7 = r7 instanceof o.lh
            if (r7 != 0) goto L28
            int r1 = r1 + r4
            int r7 = r1 % 128
            o.lh.write = r7
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            return r5
        L26:
            r7 = 0
            throw r7
        L28:
            int r3 = r3 + 115
            int r7 = r3 % 128
            o.lh.serializer = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L34
            r7 = 20
            int r7 = r7 / r5
        L34:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lh.equals(java.lang.Object):boolean");
    }
}
