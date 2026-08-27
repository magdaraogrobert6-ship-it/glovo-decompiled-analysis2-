package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getTestTagsAsResourceId extends SemanticsPropertiesPaneTitle1 {
    private static int IconCompatParcelizer = 1;
    public static final getTestTagsAsResourceId RemoteActionCompatParcelizer = new getTestTagsAsResourceId();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 17;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "LogoutStarted";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 1031760385;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.getTestTagsAsResourceId) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 51;
        o.getTestTagsAsResourceId.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
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
            int r1 = o.getTestTagsAsResourceId.serializer
            int r2 = r1 + 121
            int r3 = r2 % 128
            o.getTestTagsAsResourceId.write = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 27
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 51
            int r6 = r1 % 128
            o.getTestTagsAsResourceId.write = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r6 = r6 instanceof o.getTestTagsAsResourceId
            if (r6 != 0) goto L25
            return r4
        L25:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTestTagsAsResourceId.equals(java.lang.Object):boolean");
    }
}
