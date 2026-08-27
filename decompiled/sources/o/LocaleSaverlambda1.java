package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LocaleSaverlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final float RemoteActionCompatParcelizer;
    public final long write;

    public LocaleSaverlambda1(float f, long j) {
        this.RemoteActionCompatParcelizer = f;
        this.write = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.write) + (Float.hashCode(this.RemoteActionCompatParcelizer) * 31);
        int i4 = IconCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Tick(progress=" + this.RemoteActionCompatParcelizer + ", secondsLeft=" + this.write + ")";
        int i2 = read + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if ((!(r7 instanceof o.LocaleSaverlambda1)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r1 = r1 + 43;
        o.LocaleSaverlambda1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r7 = (o.LocaleSaverlambda1) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (java.lang.Float.compare(r6.RemoteActionCompatParcelizer, r7.RemoteActionCompatParcelizer) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r7 = o.LocaleSaverlambda1.IconCompatParcelizer + 113;
        o.LocaleSaverlambda1.read = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r6.write == r7.write) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r3 + 5;
        r7 = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.LocaleSaverlambda1.read = r7;
        r3 = r3 % 2;
        r7 = r7 + 19;
        o.LocaleSaverlambda1.IconCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if ((r7 % 2) != 0) goto L11;
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
            int r1 = o.LocaleSaverlambda1.read
            int r2 = r1 + 53
            int r3 = r2 % 128
            o.LocaleSaverlambda1.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 79
            int r2 = r2 / r5
            if (r6 != r7) goto L2e
            goto L18
        L16:
            if (r6 != r7) goto L2e
        L18:
            int r3 = r3 + 5
            int r7 = r3 % 128
            o.LocaleSaverlambda1.read = r7
            int r3 = r3 % r0
            int r7 = r7 + 19
            int r1 = r7 % 128
            o.LocaleSaverlambda1.IconCompatParcelizer = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L29
            return r4
        L29:
            r7 = 0
            r7.hashCode()
            throw r7
        L2e:
            boolean r2 = r7 instanceof o.LocaleSaverlambda1
            r2 = r2 ^ r4
            if (r2 == 0) goto L3b
            int r1 = r1 + 43
            int r7 = r1 % 128
            o.LocaleSaverlambda1.IconCompatParcelizer = r7
            int r1 = r1 % r0
            return r5
        L3b:
            o.LocaleSaverlambda1 r7 = (o.LocaleSaverlambda1) r7
            float r1 = r6.RemoteActionCompatParcelizer
            float r2 = r7.RemoteActionCompatParcelizer
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L51
            int r7 = o.LocaleSaverlambda1.IconCompatParcelizer
            int r7 = r7 + 113
            int r1 = r7 % 128
            o.LocaleSaverlambda1.read = r1
            int r7 = r7 % r0
            return r5
        L51:
            long r0 = r6.write
            long r2 = r7.write
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L5a
            return r5
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LocaleSaverlambda1.equals(java.lang.Object):boolean");
    }
}
