package o;

/* JADX INFO: loaded from: classes.dex */
public final class consumeWindowInsets implements widthInVpY3zN4default {
    public final long IconCompatParcelizer;
    public final BoxMeasurePolicy RemoteActionCompatParcelizer;
    public final long read;
    public final SizeNode write;

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return this.write.read(write(j), transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, RemoteActionCompatParcelizer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures4, transformGestureDetectorKtdetectTransformGestures3));
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return this.write.serializer(write(j), transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, RemoteActionCompatParcelizer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures4, transformGestureDetectorKtdetectTransformGestures3));
    }

    @Override // o.size3ABfNKs
    public final long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return (this.IconCompatParcelizer * 2) - this.read;
    }

    public consumeWindowInsets(SizeNode sizeNode, BoxMeasurePolicy boxMeasurePolicy, long j) {
        this.write = sizeNode;
        this.RemoteActionCompatParcelizer = boxMeasurePolicy;
        this.IconCompatParcelizer = ((long) (sizeNode.serializer() + sizeNode.IconCompatParcelizer())) * 1000000;
        this.read = j * 1000000;
    }

    public final TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        long j2 = this.read;
        long j3 = this.IconCompatParcelizer;
        return j + j2 > j3 ? read(j3 - j2, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4) : transformGestureDetectorKtdetectTransformGestures3;
    }

    public final long write(long j) {
        long j2 = j + this.read;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.IconCompatParcelizer;
        long jMin = Math.min(j2 / j3, 1L);
        return (this.RemoteActionCompatParcelizer == BoxMeasurePolicy.Restart || jMin % 2 == 0) ? j2 - (jMin * j3) : ((jMin + 1) * j3) - j2;
    }
}
