package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getAutoCorrect {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final copywBHncE4 IconCompatParcelizer;
    public final int write;

    public getAutoCorrect(int i, copywBHncE4 copywbhnce4) {
        copywbhnce4.getClass();
        this.write = i;
        this.IconCompatParcelizer = copywbhnce4;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 27;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = Integer.hashCode(this.write);
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode2 << 121;
        } else {
            int iHashCode3 = Integer.hashCode(this.write);
            iHashCode = this.IconCompatParcelizer.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r4.IconCompatParcelizer != r5.IconCompatParcelizer) goto L15;
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
            r1 = 0
            if (r4 != r5) goto L7
            goto L37
        L7:
            boolean r2 = r5 instanceof o.getAutoCorrect
            if (r2 != 0) goto Lc
            goto L28
        Lc:
            o.getAutoCorrect r5 = (o.getAutoCorrect) r5
            int r2 = r4.write
            int r3 = r5.write
            if (r2 == r3) goto L22
            int r5 = o.getAutoCorrect.RemoteActionCompatParcelizer
            int r5 = r5 + 85
            int r2 = r5 % 128
            o.getAutoCorrect.read = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L28
            int r5 = r0 / r0
            goto L28
        L22:
            o.copywBHncE4 r2 = r4.IconCompatParcelizer
            o.copywBHncE4 r5 = r5.IconCompatParcelizer
            if (r2 == r5) goto L37
        L28:
            int r5 = o.getAutoCorrect.RemoteActionCompatParcelizer
            int r5 = r5 + 115
            int r2 = r5 % 128
            o.getAutoCorrect.read = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L36
            r5 = 82
            int r5 = r5 / r1
        L36:
            return r1
        L37:
            int r5 = o.getAutoCorrect.read
            int r5 = r5 + 21
            int r2 = r5 % 128
            o.getAutoCorrect.RemoteActionCompatParcelizer = r2
            int r5 = r5 % r0
            r0 = 1
            if (r5 == 0) goto L46
            r5 = 74
            int r5 = r5 / r1
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAutoCorrect.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Emoji(textRes=" + this.write + ", style=" + this.IconCompatParcelizer + ")";
        int i2 = read + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
        return str;
    }
}
