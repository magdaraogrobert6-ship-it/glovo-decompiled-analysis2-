package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutlibFontResourceLoader {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String serializer;
    public final String write;

    public LayoutlibFontResourceLoader(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PickUpDropOffErrorUiItem(errorImage=2131231924, errorTitle=", this.IconCompatParcelizer, ", errorMessage=", this.write, ", buttonText="), this.serializer, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PickUpDropOffErrorUiItem(errorImage=2131231924, errorTitle=", this.IconCompatParcelizer, ", errorMessage=", this.write, ", buttonText="), this.serializer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(com.logistics.rider.glovo.R.drawable.ic_no_connection) * 31, 31, this.IconCompatParcelizer), 31, this.write);
        int i4 = RemoteActionCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.LayoutlibFontResourceLoader.RemoteActionCompatParcelizer
            int r3 = r3 + 15
            int r4 = r3 % 128
            o.LayoutlibFontResourceLoader.read = r4
            int r3 = r3 % r2
            if (r3 != 0) goto Lb7
            r3 = 0
            if (r0 != r1) goto L17
            goto La8
        L17:
            boolean r4 = r1 instanceof o.LayoutlibFontResourceLoader
            if (r4 != 0) goto L1d
            goto L99
        L1d:
            o.LayoutlibFontResourceLoader r1 = (o.LayoutlibFontResourceLoader) r1
            java.lang.String r4 = r0.IconCompatParcelizer
            java.lang.String r5 = r1.IconCompatParcelizer
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r4
            r8 = r5
            java.lang.Object r6 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4c
            goto L99
        L4c:
            java.lang.String r6 = r0.write
            java.lang.String r7 = r1.write
            java.lang.Object[] r18 = new java.lang.Object[]{r6, r7}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r4
            r15 = r5
            java.lang.Object r6 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L73
            goto L99
        L73:
            java.lang.String r6 = r0.serializer
            java.lang.String r1 = r1.serializer
            java.lang.Object[] r18 = new java.lang.Object[]{r6, r1}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r4
            r15 = r5
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto La8
        L99:
            int r1 = o.LayoutlibFontResourceLoader.read
            int r1 = r1 + 117
            int r4 = r1 % 128
            o.LayoutlibFontResourceLoader.RemoteActionCompatParcelizer = r4
            int r1 = r1 % r2
            if (r1 != 0) goto La7
            r1 = 57
            int r1 = r1 / r3
        La7:
            return r3
        La8:
            int r1 = o.LayoutlibFontResourceLoader.RemoteActionCompatParcelizer
            int r1 = r1 + 33
            int r4 = r1 % 128
            o.LayoutlibFontResourceLoader.read = r4
            int r1 = r1 % r2
            r2 = 1
            if (r1 == 0) goto Lb6
            r1 = 5
            int r1 = r1 / r3
        Lb6:
            return r2
        Lb7:
            r1 = 0
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutlibFontResourceLoader.equals(java.lang.Object):boolean");
    }
}
