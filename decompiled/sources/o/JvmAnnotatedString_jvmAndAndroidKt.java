package o;

/* JADX INFO: loaded from: classes3.dex */
public final class JvmAnnotatedString_jvmAndAndroidKt implements getLinkInteractionListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final JvmAnnotatedString_jvmAndAndroidKt read = new JvmAnnotatedString_jvmAndAndroidKt();
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return "Abort";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = i3 + 83;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 377904533;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r7 instanceof o.JvmAnnotatedString_jvmAndAndroidKt)) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r3 = r3 + 123;
        o.JvmAnnotatedString_jvmAndAndroidKt.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 95;
        o.JvmAnnotatedString_jvmAndAndroidKt.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = o.JvmAnnotatedString_jvmAndAndroidKt.write
            int r2 = r1 + 7
            int r3 = r2 % 128
            o.JvmAnnotatedString_jvmAndAndroidKt.serializer = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L16
            r2 = 75
            int r2 = r2 / r4
            if (r6 != r7) goto L20
            goto L18
        L16:
            if (r6 != r7) goto L20
        L18:
            int r1 = r1 + 95
            int r7 = r1 % 128
            o.JvmAnnotatedString_jvmAndAndroidKt.serializer = r7
            int r1 = r1 % r0
            return r5
        L20:
            boolean r7 = r7 instanceof o.JvmAnnotatedString_jvmAndAndroidKt
            r7 = r7 ^ r5
            if (r7 == 0) goto L2d
            int r3 = r3 + 123
            int r7 = r3 % 128
            o.JvmAnnotatedString_jvmAndAndroidKt.write = r7
            int r3 = r3 % r0
            return r4
        L2d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JvmAnnotatedString_jvmAndAndroidKt.equals(java.lang.Object):boolean");
    }
}
