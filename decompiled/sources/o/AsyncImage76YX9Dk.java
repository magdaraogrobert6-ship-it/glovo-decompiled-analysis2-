package o;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImage76YX9Dk implements resizeToBitmapDimensionslambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final rememberAsyncImagePainter5jETZwI RemoteActionCompatParcelizer;
    public final invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 read;
    public final b3 serializer;
    public final String write;

    public AsyncImage76YX9Dk(String str, b3 b3Var, rememberAsyncImagePainter5jETZwI rememberasyncimagepainter5jetzwi, invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 invokesuspendcomroadrunnermapcontainerenabledpresentationmapboxfragmentonviewcreated1) {
        this.write = str;
        this.serializer = b3Var;
        this.RemoteActionCompatParcelizer = rememberasyncimagepainter5jetzwi;
        this.read = invokesuspendcomroadrunnermapcontainerenabledpresentationmapboxfragmentonviewcreated1;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.read.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = MediaDescriptionCompat + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderDetailsViewState(pageTitle=" + this.write + ", copyAction=" + this.serializer + ", journey=" + this.RemoteActionCompatParcelizer + ", orderItems=" + this.read + ")";
        int i2 = MediaDescriptionCompat + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r4.read.equals(r5.read) == false) goto L20;
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
            if (r4 != r5) goto L6
            goto L3f
        L6:
            boolean r1 = r5 instanceof o.AsyncImage76YX9Dk
            r2 = 0
            if (r1 != 0) goto Lc
            goto L3e
        Lc:
            o.AsyncImage76YX9Dk r5 = (o.AsyncImage76YX9Dk) r5
            java.lang.String r1 = r4.write
            java.lang.String r3 = r5.write
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L19
            goto L3e
        L19:
            o.b3 r1 = r4.serializer
            o.b3 r3 = r5.serializer
            if (r1 == r3) goto L29
            int r5 = o.AsyncImage76YX9Dk.MediaDescriptionCompat
            int r5 = r5 + 107
            int r1 = r5 % 128
            o.AsyncImage76YX9Dk.IconCompatParcelizer = r1
            int r5 = r5 % r0
            return r2
        L29:
            o.rememberAsyncImagePainter5jETZwI r1 = r4.RemoteActionCompatParcelizer
            o.rememberAsyncImagePainter5jETZwI r3 = r5.RemoteActionCompatParcelizer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L34
            goto L3e
        L34:
            o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 r1 = r4.read
            o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 r5 = r5.read
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L3f
        L3e:
            return r2
        L3f:
            int r5 = o.AsyncImage76YX9Dk.IconCompatParcelizer
            int r5 = r5 + 111
            int r1 = r5 % 128
            o.AsyncImage76YX9Dk.MediaDescriptionCompat = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L4c
            r5 = 1
            return r5
        L4c:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AsyncImage76YX9Dk.equals(java.lang.Object):boolean");
    }
}
