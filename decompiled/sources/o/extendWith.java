package o;

/* JADX INFO: loaded from: classes3.dex */
public final class extendWith extends PaintExtensions_androidKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final extendWith serializer = new extendWith();
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "Hidden";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return -46130234;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof o.extendWith) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r3 = r3 + 27;
        o.extendWith.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r6 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
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
            int r1 = o.extendWith.IconCompatParcelizer
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            o.extendWith.write = r3
            int r1 = r1 % r0
            r4 = 0
            if (r1 == 0) goto L15
            r1 = 9
            int r1 = r1 / r4
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r2
        L18:
            boolean r6 = r6 instanceof o.extendWith
            if (r6 != 0) goto L1d
            return r4
        L1d:
            int r3 = r3 + 27
            int r6 = r3 % 128
            o.extendWith.IconCompatParcelizer = r6
            int r3 = r3 % r0
            if (r3 != 0) goto L29
            r6 = 11
            int r6 = r6 / r4
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.extendWith.equals(java.lang.Object):boolean");
    }
}
