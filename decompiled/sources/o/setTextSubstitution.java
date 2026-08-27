package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setTextSubstitution {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final setTraversalIndex RemoteActionCompatParcelizer;
    public final setTraversalIndex read;
    public final setTraversalIndex serializer;

    public setTextSubstitution(setTraversalIndex settraversalindex, setTraversalIndex settraversalindex2, setTraversalIndex settraversalindex3) {
        this.serializer = settraversalindex;
        this.RemoteActionCompatParcelizer = settraversalindex2;
        this.read = settraversalindex3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.read.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = IconCompatParcelizer + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeviceBiometricsStatus(strongAuthStatus=" + this.serializer + ", weakAuthStatus=" + this.RemoteActionCompatParcelizer + ", deviceCredentialAuthStatus=" + this.read + ")";
        int i2 = write + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r5 instanceof o.setTextSubstitution) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r5 = (o.setTextSubstitution) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4.serializer.equals(r5.serializer) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r4.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r4.read.equals(r5.read) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r2 = r2 + 11;
        o.setTextSubstitution.write = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
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
            int r1 = o.setTextSubstitution.write
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.setTextSubstitution.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 4
            int r1 = r1 / r3
            if (r4 != r5) goto L1e
            goto L16
        L14:
            if (r4 != r5) goto L1e
        L16:
            int r2 = r2 + 11
            int r5 = r2 % 128
            o.setTextSubstitution.write = r5
            int r2 = r2 % r0
            goto L46
        L1e:
            boolean r0 = r5 instanceof o.setTextSubstitution
            if (r0 != 0) goto L23
            goto L45
        L23:
            o.setTextSubstitution r5 = (o.setTextSubstitution) r5
            o.setTraversalIndex r0 = r4.serializer
            o.setTraversalIndex r1 = r5.serializer
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L45
        L30:
            o.setTraversalIndex r0 = r4.RemoteActionCompatParcelizer
            o.setTraversalIndex r1 = r5.RemoteActionCompatParcelizer
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L45
        L3b:
            o.setTraversalIndex r0 = r4.read
            o.setTraversalIndex r5 = r5.read
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L46
        L45:
            return r3
        L46:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextSubstitution.equals(java.lang.Object):boolean");
    }
}
