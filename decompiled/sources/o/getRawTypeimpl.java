package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getRawTypeimpl extends divkPz2Gy4 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String read;

    public getRawTypeimpl(String str) {
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i2 + 3;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("SetResultAndDismiss(clickedPictureUri=", this.read, ")");
        }
        ff$$ExternalSyntheticOutline0.m("SetResultAndDismiss(clickedPictureUri=", this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.getRawTypeimpl) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 3;
        r13 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.getRawTypeimpl.IconCompatParcelizer = r13;
        r1 = r1 % 2;
        r13 = r13 + 63;
        o.getRawTypeimpl.write = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r13 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r13 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r10 = new java.lang.Object[]{r12.read, ((o.getRawTypeimpl) r13).read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = o.getRawTypeimpl.write
            int r2 = r1 + 77
            int r3 = r2 % 128
            o.getRawTypeimpl.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 51
            int r2 = r2 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r13 instanceof o.getRawTypeimpl
            if (r2 != 0) goto L31
            int r1 = r1 + 3
            int r13 = r1 % 128
            o.getRawTypeimpl.IconCompatParcelizer = r13
            int r1 = r1 % r0
            int r13 = r13 + 63
            int r1 = r13 % 128
            o.getRawTypeimpl.write = r1
            int r13 = r13 % r0
            if (r13 == 0) goto L30
            r13 = 66
            int r13 = r13 / r4
        L30:
            return r4
        L31:
            o.getRawTypeimpl r13 = (o.getRawTypeimpl) r13
            java.lang.String r0 = r12.read
            java.lang.String r13 = r13.read
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
            if (r13 == 0) goto L5e
            return r3
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRawTypeimpl.equals(java.lang.Object):boolean");
    }
}
