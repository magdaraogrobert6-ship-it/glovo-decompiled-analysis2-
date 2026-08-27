package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setMatrix implements saveLayerAlpha {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final double IconCompatParcelizer;
    public final double serializer;
    public final String write;

    public setMatrix(String str, double d, double d2) {
        this.IconCompatParcelizer = d;
        this.serializer = d2;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.serializer, Double.hashCode(this.IconCompatParcelizer) * 31, 31);
        int i4 = RemoteActionCompatParcelizer + 51;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "SelectedLocation(lat=", ", long=");
        sbM.append(this.serializer);
        sbM.append(", address=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r7 instanceof o.setMatrix) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r7 = (o.setMatrix) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (java.lang.Double.compare(r6.IconCompatParcelizer, r7.IconCompatParcelizer) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r7 = o.setMatrix.read + 27;
        o.setMatrix.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (java.lang.Double.compare(r6.serializer, r7.serializer) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r6.write.equals(r7.write) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r1 = r1 + 91;
        o.setMatrix.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
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
            int r1 = o.setMatrix.read
            int r2 = r1 + 103
            int r3 = r2 % 128
            o.setMatrix.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L14
            r2 = 4
            int r2 = r2 / r3
            if (r6 != r7) goto L1e
            goto L16
        L14:
            if (r6 != r7) goto L1e
        L16:
            int r1 = r1 + 91
            int r7 = r1 % 128
            o.setMatrix.RemoteActionCompatParcelizer = r7
            int r1 = r1 % r0
            goto L4f
        L1e:
            boolean r1 = r7 instanceof o.setMatrix
            if (r1 != 0) goto L23
            goto L4e
        L23:
            o.setMatrix r7 = (o.setMatrix) r7
            double r1 = r6.IconCompatParcelizer
            double r4 = r7.IconCompatParcelizer
            int r1 = java.lang.Double.compare(r1, r4)
            if (r1 == 0) goto L39
            int r7 = o.setMatrix.read
            int r7 = r7 + 27
            int r1 = r7 % 128
            o.setMatrix.RemoteActionCompatParcelizer = r1
            int r7 = r7 % r0
            goto L4e
        L39:
            double r0 = r6.serializer
            double r4 = r7.serializer
            int r0 = java.lang.Double.compare(r0, r4)
            if (r0 == 0) goto L44
            goto L4e
        L44:
            java.lang.String r0 = r6.write
            java.lang.String r7 = r7.write
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L4f
        L4e:
            return r3
        L4f:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMatrix.equals(java.lang.Object):boolean");
    }
}
