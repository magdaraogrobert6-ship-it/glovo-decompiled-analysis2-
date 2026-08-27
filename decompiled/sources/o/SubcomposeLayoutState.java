package o;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutState extends accessgetSlotReusePolicyp {
    public float serializer;
    public float write;

    @Override // o.accessgetSlotReusePolicyp
    public final void serializer(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.MediaBrowserCompatMediaItem;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.serializer, this.write);
        path.transform(matrix);
    }
}
