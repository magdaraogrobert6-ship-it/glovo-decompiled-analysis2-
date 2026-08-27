package o;

/* JADX INFO: loaded from: classes.dex */
public final class onConsumedWindowInsetsChanged implements SizeNode {
    public final int read;

    @Override // o.SizeNode
    public final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return transformGestureDetectorKtdetectTransformGestures4;
    }

    @Override // o.SizeNode
    public final int serializer() {
        return 0;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return j < ((long) this.read) * 1000000 ? transformGestureDetectorKtdetectTransformGestures2 : transformGestureDetectorKtdetectTransformGestures3;
    }

    public onConsumedWindowInsetsChanged(int i) {
        this.read = i;
    }
}
