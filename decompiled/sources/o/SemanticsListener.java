package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsListener {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 125;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SemanticsListener(int i, String str, String str2) {
        str.getClass();
        this.write = i;
        this.read = str;
        this.serializer = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode() - af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.write) >>> 29, 22, this.read);
        } else {
            iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.write) * 31, 31, this.read);
        }
        int i3 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Analytics(daysUntilMigration=", this.write, ", bannerVariant=", this.read, ", migrationPhase="), this.serializer, ")");
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r11.serializer.equals(r12.serializer) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.SemanticsListener.RemoteActionCompatParcelizer
            int r1 = r1 + 77
            int r2 = r1 % 128
            o.SemanticsListener.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 19
            int r1 = r1 / r2
            if (r11 != r12) goto L18
            goto L5c
        L15:
            if (r11 != r12) goto L18
            goto L5c
        L18:
            boolean r1 = r12 instanceof o.SemanticsListener
            if (r1 != 0) goto L1d
            goto L5b
        L1d:
            o.SemanticsListener r12 = (o.SemanticsListener) r12
            int r1 = r11.write
            int r3 = r12.write
            if (r1 == r3) goto L26
            goto L5b
        L26:
            java.lang.String r1 = r11.read
            java.lang.String r3 = r12.read
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L51
            goto L5b
        L51:
            java.lang.String r1 = r11.serializer
            java.lang.String r12 = r12.serializer
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L5c
        L5b:
            return r2
        L5c:
            int r12 = o.SemanticsListener.RemoteActionCompatParcelizer
            int r12 = r12 + 3
            int r1 = r12 % 128
            o.SemanticsListener.IconCompatParcelizer = r1
            int r12 = r12 % r0
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SemanticsListener.equals(java.lang.Object):boolean");
    }
}
