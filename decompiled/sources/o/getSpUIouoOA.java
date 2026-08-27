package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpUIouoOA {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final getSpUIouoOA read = new getSpUIouoOA();
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 61;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Close";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 1253284267;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r6 instanceof o.getSpUIouoOA)) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 19;
        o.getSpUIouoOA.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
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
            int r1 = o.getSpUIouoOA.IconCompatParcelizer
            int r1 = r1 + 9
            int r2 = r1 % 128
            o.getSpUIouoOA.serializer = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            r1 = 54
            int r1 = r1 / r3
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r2 = r2 + 19
            int r6 = r2 % 128
            o.getSpUIouoOA.IconCompatParcelizer = r6
            int r2 = r2 % r0
            return r4
        L20:
            boolean r6 = r6 instanceof o.getSpUIouoOA
            r6 = r6 ^ r4
            if (r6 == r4) goto L26
            return r4
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSpUIouoOA.equals(java.lang.Object):boolean");
    }
}
