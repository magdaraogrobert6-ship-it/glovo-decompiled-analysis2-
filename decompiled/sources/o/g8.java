package o;

/* JADX INFO: loaded from: classes3.dex */
public final class g8 implements getDescriptor {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final f8 IconCompatParcelizer;

    public final f8 serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 33;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        f8 f8Var = this.IconCompatParcelizer;
        int i5 = i2 + 33;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return f8Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public g8(f8 f8Var) {
        this.IconCompatParcelizer = f8Var;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            int i3 = 59 / 0;
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
        }
        int i4 = RemoteActionCompatParcelizer + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Route(primaryRouteDestination=" + this.IconCompatParcelizer + ")";
        int i2 = write + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r3.IconCompatParcelizer.equals(((o.g8) r4).IconCompatParcelizer) != true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r3 != r4) goto L7
            goto L2c
        L7:
            boolean r2 = r4 instanceof o.g8
            if (r2 != 0) goto L15
            int r4 = o.g8.write
            int r4 = r4 + 83
            int r1 = r4 % 128
            o.g8.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            goto L21
        L15:
            o.g8 r4 = (o.g8) r4
            o.f8 r2 = r3.IconCompatParcelizer
            o.f8 r4 = r4.IconCompatParcelizer
            boolean r4 = r2.equals(r4)
            if (r4 == r1) goto L2c
        L21:
            int r4 = o.g8.write
            int r4 = r4 + 71
            int r1 = r4 % 128
            o.g8.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            r4 = 0
            return r4
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g8.equals(java.lang.Object):boolean");
    }
}
