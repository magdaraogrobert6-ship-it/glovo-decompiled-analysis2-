package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class makeContentView implements makeBigContentView {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String RemoteActionCompatParcelizer;
    public final generatePOSTBodyString serializer;
    public final boolean write;

    public makeContentView(generatePOSTBodyString generatepostbodystring, String str, boolean z) {
        this.serializer = generatepostbodystring;
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.write) - af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() - 79, 67, this.RemoteActionCompatParcelizer);
        }
        return Boolean.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Available(entity=");
        sb.append(this.serializer);
        sb.append(", confirmationText=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", dontShowAgain=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.write, ")");
        int i2 = read + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.write == r5.write) goto L21;
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
            int r1 = o.makeContentView.read
            int r1 = r1 + 11
            int r2 = r1 % 128
            o.makeContentView.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 46
            int r1 = r1 / r2
            if (r4 != r5) goto L18
            goto L3c
        L15:
            if (r4 != r5) goto L18
            goto L3c
        L18:
            boolean r1 = r5 instanceof o.makeContentView
            if (r1 != 0) goto L1d
            goto L3b
        L1d:
            o.makeContentView r5 = (o.makeContentView) r5
            o.generatePOSTBodyString r1 = r4.serializer
            o.generatePOSTBodyString r3 = r5.serializer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a
            goto L3b
        L2a:
            java.lang.String r1 = r4.RemoteActionCompatParcelizer
            java.lang.String r3 = r5.RemoteActionCompatParcelizer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L35
            goto L3b
        L35:
            boolean r1 = r4.write
            boolean r5 = r5.write
            if (r1 == r5) goto L3c
        L3b:
            return r2
        L3c:
            int r5 = o.makeContentView.IconCompatParcelizer
            int r5 = r5 + 45
            int r1 = r5 % 128
            o.makeContentView.read = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L49
            r5 = 1
            return r5
        L49:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.makeContentView.equals(java.lang.Object):boolean");
    }
}
