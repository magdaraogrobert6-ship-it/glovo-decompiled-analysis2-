package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getIsPopup extends getIsDialog {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final getIsPopup serializer = new getIsPopup();
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "NewUser";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return -322049928;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.getIsPopup) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 57;
        o.getIsPopup.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r1 = r1 + 73;
        o.getIsPopup.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
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
            int r1 = o.getIsPopup.write
            int r2 = r1 + 37
            int r3 = r2 % 128
            o.getIsPopup.read = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 34
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r6 = r6 instanceof o.getIsPopup
            if (r6 != 0) goto L25
            int r1 = r1 + 57
            int r6 = r1 % 128
            o.getIsPopup.read = r6
            int r1 = r1 % r0
            return r4
        L25:
            int r1 = r1 + 73
            int r6 = r1 % 128
            o.getIsPopup.read = r6
            int r1 = r1 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIsPopup.equals(java.lang.Object):boolean");
    }
}
