package o;

/* JADX INFO: loaded from: classes3.dex */
public final class parseLanguageTag {
    public static final parseLanguageTag IconCompatParcelizer = new parseLanguageTag();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 53;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return "CloseAction";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 402688960;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((!(r6 instanceof o.parseLanguageTag)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = r2 + 79;
        o.parseLanguageTag.write = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r2 = r2 + 115;
        o.parseLanguageTag.write = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
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
            int r1 = o.parseLanguageTag.write
            int r1 = r1 + 11
            int r2 = r1 % 128
            o.parseLanguageTag.read = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L15
            r1 = 4
            int r1 = r1 / r3
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r4
        L18:
            boolean r6 = r6 instanceof o.parseLanguageTag
            r6 = r6 ^ r4
            if (r6 == 0) goto L2c
            int r6 = r2 + 79
            int r1 = r6 % 128
            o.parseLanguageTag.write = r1
            int r6 = r6 % r0
            int r2 = r2 + 115
            int r6 = r2 % 128
            o.parseLanguageTag.write = r6
            int r2 = r2 % r0
            return r3
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.parseLanguageTag.equals(java.lang.Object):boolean");
    }
}
