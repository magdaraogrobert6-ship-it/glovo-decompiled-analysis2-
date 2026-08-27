package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA write;

    public r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao(r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r8lambdacwu8ozate7jouiaqjprnuskxva, String str) {
        this.write = r8lambdacwu8ozate7jouiaqjprnuskxva;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = read + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FeedbackCard(cardTexts=" + this.write + ", url=" + this.IconCompatParcelizer + ")";
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4.IconCompatParcelizer.equals(r5.IconCompatParcelizer) != true) goto L17;
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
            int r1 = o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.read
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L45
            r1 = 1
            if (r4 != r5) goto L12
            goto L44
        L12:
            boolean r3 = r5 instanceof o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao
            if (r3 != 0) goto L22
            int r2 = r2 + 3
            int r5 = r2 % 128
            o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.read = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L39
            int r5 = r0 / 3
            goto L39
        L22:
            o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao r5 = (o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao) r5
            o.r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r2 = r4.write
            o.r8lambdaCwU8OzatE7jOuIaQjprNUSKXVA r3 = r5.write
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L39
        L2f:
            java.lang.String r2 = r4.IconCompatParcelizer
            java.lang.String r5 = r5.IconCompatParcelizer
            boolean r5 = r2.equals(r5)
            if (r5 == r1) goto L44
        L39:
            int r5 = o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.RemoteActionCompatParcelizer
            int r5 = r5 + 65
            int r1 = r5 % 128
            o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.read = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        L44:
            return r1
        L45:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda5HzxMAF3xnzH0FAwlqisItZ7Ao.equals(java.lang.Object):boolean");
    }
}
