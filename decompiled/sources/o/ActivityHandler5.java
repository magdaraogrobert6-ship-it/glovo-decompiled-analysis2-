package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler5 extends ActivityHandler49 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final ActivityHandler5 write = new ActivityHandler5();

    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return "Empty";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return -124086984;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.ActivityHandler5) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = r1 + 37;
        o.ActivityHandler5.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r1 = r1 + 3;
        o.ActivityHandler5.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
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
            int r1 = o.ActivityHandler5.serializer
            int r2 = r1 + 61
            int r3 = r2 % 128
            o.ActivityHandler5.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 24
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r6 = r6 instanceof o.ActivityHandler5
            if (r6 != 0) goto L33
            int r6 = r1 + 37
            int r2 = r6 % 128
            o.ActivityHandler5.IconCompatParcelizer = r2
            int r6 = r6 % r0
            int r1 = r1 + 3
            int r6 = r1 % 128
            o.ActivityHandler5.IconCompatParcelizer = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L2e
            return r4
        L2e:
            r6 = 0
            r6.hashCode()
            throw r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ActivityHandler5.equals(java.lang.Object):boolean");
    }
}
