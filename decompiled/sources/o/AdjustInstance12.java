package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance12 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String serializer;
    public final long write;

    public AdjustInstance12(String str, long j) {
        this.serializer = str;
        this.write = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) - (this.serializer.hashCode() << 31);
        }
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write) + (this.serializer.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StateMessage(text=", this.serializer, ", color=", androidx.compose.ui.graphics.Color.m730toStringimpl(this.write), ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StateMessage(text=", this.serializer, ", color=", androidx.compose.ui.graphics.Color.m730toStringimpl(this.write), ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(r8.write, r9.write) == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AdjustInstance12.IconCompatParcelizer
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.AdjustInstance12.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 67
            int r1 = r1 / r3
            if (r8 != r9) goto L19
            goto L36
        L16:
            if (r8 != r9) goto L19
            goto L36
        L19:
            boolean r1 = r9 instanceof o.AdjustInstance12
            if (r1 != 0) goto L1e
            goto L35
        L1e:
            o.AdjustInstance12 r9 = (o.AdjustInstance12) r9
            java.lang.String r1 = r8.serializer
            java.lang.String r4 = r9.serializer
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2b
            goto L35
        L2b:
            long r4 = r8.write
            long r6 = r9.write
            boolean r9 = androidx.compose.ui.graphics.Color.m723equalsimpl0(r4, r6)
            if (r9 == r2) goto L36
        L35:
            return r3
        L36:
            int r9 = o.AdjustInstance12.RemoteActionCompatParcelizer
            int r9 = r9 + 21
            int r1 = r9 % 128
            o.AdjustInstance12.IconCompatParcelizer = r1
            int r9 = r9 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdjustInstance12.equals(java.lang.Object):boolean");
    }
}
