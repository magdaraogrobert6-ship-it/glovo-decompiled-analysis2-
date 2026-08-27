package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8 extends r8lambdaEP37yo0jr2xWssYltag9ApjkQk {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.write;
        int i4 = i2 + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 123;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 97;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8(String str, String str2) {
        this.write = str;
        this.read = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CustomPassword(userId=", this.write, ", token=", this.read, ")");
        int i4 = IconCompatParcelizer + 25;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode() >> (this.write.hashCode() >>> 126);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.read.hashCode();
        }
        int i3 = serializer + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.read.equals(r6.read) == true) goto L22;
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
            int r1 = o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.serializer
            int r1 = r1 + 93
            int r2 = r1 % 128
            o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 33
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L43
        L16:
            if (r5 != r6) goto L19
            goto L43
        L19:
            boolean r1 = r6 instanceof o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8
            if (r1 != 0) goto L1e
            goto L35
        L1e:
            o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8 r6 = (o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8) r6
            java.lang.String r1 = r5.write
            java.lang.String r4 = r6.write
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r1 = r5.read
            java.lang.String r6 = r6.read
            boolean r6 = r1.equals(r6)
            if (r6 == r2) goto L43
        L35:
            int r6 = o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.serializer
            int r6 = r6 + 113
            int r1 = r6 % 128
            o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.IconCompatParcelizer = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L41
            return r3
        L41:
            r6 = 0
            throw r6
        L43:
            int r6 = o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.IconCompatParcelizer
            int r6 = r6 + 9
            int r1 = r6 % 128
            o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.serializer = r1
            int r6 = r6 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaApMsPah1CbYBPn9Pd0tEcSrHrn8.equals(java.lang.Object):boolean");
    }
}
