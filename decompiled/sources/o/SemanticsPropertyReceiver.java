package o;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertyReceiver extends SemanticsRegion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    public static final SemanticsPropertyReceiver serializer = new SemanticsPropertyReceiver();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 69;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "DecryptPassword";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return 896690653;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r6 instanceof o.SemanticsPropertyReceiver) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r1 = r1 + 25;
        o.SemanticsPropertyReceiver.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 1;
        o.SemanticsPropertyReceiver.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
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
            int r1 = o.SemanticsPropertyReceiver.write
            int r2 = r1 + 45
            int r3 = r2 % 128
            o.SemanticsPropertyReceiver.read = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L16
            r2 = 75
            int r2 = r2 / r3
            if (r5 != r6) goto L1f
            goto L18
        L16:
            if (r5 != r6) goto L1f
        L18:
            int r1 = r1 + r4
            int r6 = r1 % 128
            o.SemanticsPropertyReceiver.read = r6
            int r1 = r1 % r0
            return r4
        L1f:
            boolean r6 = r6 instanceof o.SemanticsPropertyReceiver
            if (r6 != 0) goto L2e
            int r1 = r1 + 25
            int r6 = r1 % 128
            o.SemanticsPropertyReceiver.read = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L2d
            r3 = r4
        L2d:
            return r3
        L2e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SemanticsPropertyReceiver.equals(java.lang.Object):boolean");
    }
}
