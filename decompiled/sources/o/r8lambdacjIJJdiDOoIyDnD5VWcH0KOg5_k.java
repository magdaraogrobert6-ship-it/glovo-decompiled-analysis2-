package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final boolean IconCompatParcelizer;
    public final r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU read;
    public final String write;

    public r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k(String str, boolean z, r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU r8lambdahkqwkk2sqjkz9lmlxp4yuqhwtu) {
        this.write = str;
        this.IconCompatParcelizer = z;
        this.read = r8lambdahkqwkk2sqjkz9lmlxp4yuqhwtu;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SoftPosCallbackResult(sessionToken=REDACTED, success=" + this.IconCompatParcelizer + ", status=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r4.read.equals(r5.read) == false) goto L21;
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
            int r1 = o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.serializer
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 53
            int r1 = r1 / r2
            if (r4 != r5) goto L18
            goto L4d
        L15:
            if (r4 != r5) goto L18
            goto L4d
        L18:
            boolean r1 = r5 instanceof o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k
            if (r1 != 0) goto L1d
            goto L4c
        L1d:
            o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k r5 = (o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k) r5
            java.lang.String r1 = r4.write
            java.lang.String r3 = r5.write
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L33
            int r5 = o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.serializer
            int r5 = r5 + 25
            int r1 = r5 % 128
            o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.RemoteActionCompatParcelizer = r1
        L31:
            int r5 = r5 % r0
            goto L4c
        L33:
            boolean r1 = r4.IconCompatParcelizer
            boolean r3 = r5.IconCompatParcelizer
            if (r1 == r3) goto L42
            int r5 = o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.RemoteActionCompatParcelizer
            int r5 = r5 + 61
            int r1 = r5 % 128
            o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.serializer = r1
            goto L31
        L42:
            o.r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU r1 = r4.read
            o.r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU r5 = r5.read
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L4d
        L4c:
            return r2
        L4d:
            int r5 = o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.RemoteActionCompatParcelizer
            int r5 = r5 + 85
            int r1 = r5 % 128
            o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.serializer = r1
            int r5 = r5 % r0
            r0 = 1
            if (r5 != 0) goto L5c
            r5 = 21
            int r5 = r5 / r2
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdacjIJJdiDOoIyDnD5VWcH0KOg5_k.equals(java.lang.Object):boolean");
    }
}
