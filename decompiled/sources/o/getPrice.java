package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPrice extends AdjustPlayStorePurchase {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.read;
            int i4 = 39 / 0;
        } else {
            str = this.read;
        }
        int i5 = i2 + 15;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 91;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 109;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return str;
    }

    public getPrice(String str, String str2, String str3) {
        this.read = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode() % af$$ExternalSyntheticOutline0.m(this.read.hashCode() + 122, 39, this.write);
        }
        return this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.write);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BecomeUnavailable(title=", this.read, ", description=", this.write, ", buttonText="), this.RemoteActionCompatParcelizer, ")");
        int i4 = IconCompatParcelizer + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if ((!r4.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r4 != r5) goto L7
            goto L43
        L7:
            boolean r2 = r5 instanceof o.getPrice
            if (r2 != 0) goto Lc
            goto L38
        Lc:
            o.getPrice r5 = (o.getPrice) r5
            java.lang.String r2 = r4.read
            java.lang.String r3 = r5.read
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L19
            goto L38
        L19:
            java.lang.String r2 = r4.write
            java.lang.String r3 = r5.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            int r5 = o.getPrice.serializer
            int r5 = r5 + 31
            int r1 = r5 % 128
            o.getPrice.IconCompatParcelizer = r1
            int r5 = r5 % r0
            goto L38
        L2d:
            java.lang.String r2 = r4.RemoteActionCompatParcelizer
            java.lang.String r5 = r5.RemoteActionCompatParcelizer
            boolean r5 = r2.equals(r5)
            r5 = r5 ^ r1
            if (r5 == 0) goto L43
        L38:
            int r5 = o.getPrice.IconCompatParcelizer
            int r5 = r5 + 35
            int r1 = r5 % 128
            o.getPrice.serializer = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPrice.equals(java.lang.Object):boolean");
    }
}
