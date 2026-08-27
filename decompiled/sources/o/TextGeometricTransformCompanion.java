package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TextGeometricTransformCompanion implements getNoneui_text {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final String serializer;
    public final String write;

    public TextGeometricTransformCompanion(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Available(title=", this.IconCompatParcelizer, ", description=", this.write, ", primaryCta="), this.serializer, ", isCancellable=false)");
        int i4 = RemoteActionCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(false) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.serializer);
        int i4 = read + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.TextGeometricTransformCompanion) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.TextGeometricTransformCompanion) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r5.IconCompatParcelizer.equals(r6.IconCompatParcelizer) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.write.equals(r6.write) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = o.TextGeometricTransformCompanion.RemoteActionCompatParcelizer + 125;
        o.TextGeometricTransformCompanion.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r5.serializer.equals(r6.serializer) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
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
            int r1 = o.TextGeometricTransformCompanion.RemoteActionCompatParcelizer
            int r1 = r1 + 87
            int r2 = r1 % 128
            o.TextGeometricTransformCompanion.read = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 91
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof o.TextGeometricTransformCompanion
            if (r1 != 0) goto L1e
            goto L49
        L1e:
            o.TextGeometricTransformCompanion r6 = (o.TextGeometricTransformCompanion) r6
            java.lang.String r1 = r5.IconCompatParcelizer
            java.lang.String r4 = r6.IconCompatParcelizer
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2b
            goto L49
        L2b:
            java.lang.String r1 = r5.write
            java.lang.String r4 = r6.write
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L3f
            int r6 = o.TextGeometricTransformCompanion.RemoteActionCompatParcelizer
            int r6 = r6 + 125
            int r1 = r6 % 128
            o.TextGeometricTransformCompanion.read = r1
            int r6 = r6 % r0
            goto L49
        L3f:
            java.lang.String r0 = r5.serializer
            java.lang.String r6 = r6.serializer
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L4a
        L49:
            return r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TextGeometricTransformCompanion.equals(java.lang.Object):boolean");
    }
}
