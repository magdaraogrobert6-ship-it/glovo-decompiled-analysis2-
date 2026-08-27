package o;

/* JADX INFO: loaded from: classes3.dex */
public final class doInBackground extends AdjustInstance10 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final AdjustInstance13 RemoteActionCompatParcelizer;
    public final AdjustInstance2 read;

    public doInBackground(AdjustInstance2 adjustInstance2, AdjustInstance13 adjustInstance13) {
        this.read = adjustInstance2;
        this.RemoteActionCompatParcelizer = adjustInstance13;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() / (this.read.hashCode() % 118);
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
        }
        int i3 = IconCompatParcelizer + 85;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(title=" + this.read + ", futureShift=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((!r4.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer)) != false) goto L13;
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
            int r1 = o.doInBackground.IconCompatParcelizer
            int r1 = r1 + 25
            int r2 = r1 % 128
            o.doInBackground.write = r2
            int r1 = r1 % r0
            r1 = 1
            if (r4 != r5) goto L10
            goto L3d
        L10:
            boolean r2 = r5 instanceof o.doInBackground
            if (r2 != 0) goto L15
            goto L2d
        L15:
            o.doInBackground r5 = (o.doInBackground) r5
            o.AdjustInstance2 r2 = r4.read
            o.AdjustInstance2 r3 = r5.read
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L2d
        L22:
            o.AdjustInstance13 r2 = r4.RemoteActionCompatParcelizer
            o.AdjustInstance13 r5 = r5.RemoteActionCompatParcelizer
            boolean r5 = r2.equals(r5)
            r5 = r5 ^ r1
            if (r5 == 0) goto L3d
        L2d:
            int r5 = o.doInBackground.write
            int r5 = r5 + 105
            int r1 = r5 % 128
            o.doInBackground.IconCompatParcelizer = r1
            int r5 = r5 % r0
            r0 = 0
            if (r5 != 0) goto L3c
            r5 = 34
            int r5 = r5 / r0
        L3c:
            return r0
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.doInBackground.equals(java.lang.Object):boolean");
    }
}
