package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ScrollbarHelper extends shouldBeKeptAsChild {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final shouldIgnore serializer;

    public final shouldIgnore RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        shouldIgnore shouldignore = this.serializer;
        int i4 = i2 + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return shouldignore;
        }
        throw null;
    }

    public ScrollbarHelper(shouldIgnore shouldignore) {
        shouldignore.getClass();
        this.serializer = shouldignore;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer.hashCode();
            throw null;
        }
        int iHashCode = this.serializer.hashCode();
        int i3 = read + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenAssignShiftConfirmationDialog(shift=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r13 instanceof o.ScrollbarHelper) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r10 = new java.lang.Object[]{r12.serializer, ((o.ScrollbarHelper) r13).serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 89;
        o.ScrollbarHelper.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ScrollbarHelper.IconCompatParcelizer
            int r2 = r1 + 45
            int r3 = r2 % 128
            o.ScrollbarHelper.read = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L15
            r2 = 1
            int r2 = r2 / r3
            if (r12 != r13) goto L1f
            goto L17
        L15:
            if (r12 != r13) goto L1f
        L17:
            int r1 = r1 + 89
            int r13 = r1 % 128
            o.ScrollbarHelper.read = r13
            int r1 = r1 % r0
            return r4
        L1f:
            boolean r0 = r13 instanceof o.ScrollbarHelper
            if (r0 != 0) goto L24
            return r3
        L24:
            o.ScrollbarHelper r13 = (o.ScrollbarHelper) r13
            o.shouldIgnore r0 = r12.serializer
            o.shouldIgnore r13 = r13.serializer
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L51
            return r3
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScrollbarHelper.equals(java.lang.Object):boolean");
    }
}
