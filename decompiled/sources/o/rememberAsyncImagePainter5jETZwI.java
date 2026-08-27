package o;

/* JADX INFO: loaded from: classes3.dex */
public final class rememberAsyncImagePainter5jETZwI {
    private static int read = 0;
    private static int write = 1;
    public final AsyncImagePainterlaunchJob1 IconCompatParcelizer;
    public final AsyncImagePainterlaunchJob1 serializer;

    public rememberAsyncImagePainter5jETZwI(AsyncImagePainterlaunchJob1 asyncImagePainterlaunchJob1, AsyncImagePainterlaunchJob1 asyncImagePainterlaunchJob2) {
        this.serializer = asyncImagePainterlaunchJob1;
        this.IconCompatParcelizer = asyncImagePainterlaunchJob2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode() % (this.serializer.hashCode() + 97);
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        }
        int i3 = write + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ViewEntity(startDestination=" + this.serializer + ", endDestination=" + this.IconCompatParcelizer + ")";
        int i2 = read + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.IconCompatParcelizer.equals(r5.IconCompatParcelizer) != false) goto L18;
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
            int r1 = o.rememberAsyncImagePainter5jETZwI.write
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.rememberAsyncImagePainter5jETZwI.read = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 46
            int r1 = r1 / r2
            if (r4 != r5) goto L18
            goto L35
        L15:
            if (r4 != r5) goto L18
            goto L35
        L18:
            boolean r1 = r5 instanceof o.rememberAsyncImagePainter5jETZwI
            if (r1 != 0) goto L1d
            goto L34
        L1d:
            o.rememberAsyncImagePainter5jETZwI r5 = (o.rememberAsyncImagePainter5jETZwI) r5
            o.AsyncImagePainterlaunchJob1 r1 = r4.serializer
            o.AsyncImagePainterlaunchJob1 r3 = r5.serializer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a
            goto L34
        L2a:
            o.AsyncImagePainterlaunchJob1 r1 = r4.IconCompatParcelizer
            o.AsyncImagePainterlaunchJob1 r5 = r5.IconCompatParcelizer
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L35
        L34:
            return r2
        L35:
            int r5 = o.rememberAsyncImagePainter5jETZwI.write
            int r5 = r5 + 105
            int r1 = r5 % 128
            o.rememberAsyncImagePainter5jETZwI.read = r1
            int r5 = r5 % r0
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rememberAsyncImagePainter5jETZwI.equals(java.lang.Object):boolean");
    }
}
