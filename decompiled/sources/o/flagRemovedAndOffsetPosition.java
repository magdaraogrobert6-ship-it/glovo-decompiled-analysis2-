package o;

/* JADX INFO: loaded from: classes3.dex */
public final class flagRemovedAndOffsetPosition {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final String serializer;

    public flagRemovedAndOffsetPosition(boolean z, String str) {
        this.IconCompatParcelizer = z;
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (Boolean.hashCode(this.IconCompatParcelizer) * 31);
        int i4 = RemoteActionCompatParcelizer + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r4.serializer.equals(r5.serializer) == false) goto L19;
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
            int r1 = o.flagRemovedAndOffsetPosition.RemoteActionCompatParcelizer
            int r1 = r1 + 123
            int r2 = r1 % 128
            o.flagRemovedAndOffsetPosition.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L42
            r1 = 0
            if (r4 != r5) goto L12
            goto L31
        L12:
            boolean r3 = r5 instanceof o.flagRemovedAndOffsetPosition
            if (r3 != 0) goto L1e
            int r2 = r2 + 103
            int r5 = r2 % 128
            o.flagRemovedAndOffsetPosition.RemoteActionCompatParcelizer = r5
            int r2 = r2 % r0
            goto L41
        L1e:
            o.flagRemovedAndOffsetPosition r5 = (o.flagRemovedAndOffsetPosition) r5
            boolean r2 = r4.IconCompatParcelizer
            boolean r3 = r5.IconCompatParcelizer
            if (r2 == r3) goto L27
            goto L41
        L27:
            java.lang.String r2 = r4.serializer
            java.lang.String r5 = r5.serializer
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L41
        L31:
            int r5 = o.flagRemovedAndOffsetPosition.write
            int r5 = r5 + 57
            int r2 = r5 % 128
            o.flagRemovedAndOffsetPosition.RemoteActionCompatParcelizer = r2
            int r5 = r5 % r0
            r0 = 1
            if (r5 != 0) goto L40
            r5 = 65
            int r5 = r5 / r1
        L40:
            return r0
        L41:
            return r1
        L42:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.flagRemovedAndOffsetPosition.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ValidationResult(isValid=" + this.IconCompatParcelizer + ", errorMessage=" + this.serializer + ")";
        int i2 = write + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
