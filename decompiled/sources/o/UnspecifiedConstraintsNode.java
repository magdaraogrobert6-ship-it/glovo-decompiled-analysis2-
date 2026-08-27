package o;

import coil3.ImageLoader$Builder;

/* JADX INFO: loaded from: classes.dex */
public final class UnspecifiedConstraintsNode implements SizeNode {
    public final int IconCompatParcelizer;
    public final ImageLoader$Builder read;
    public final int write;

    @Override // o.SizeNode
    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.SizeNode
    public final int serializer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return this.read.read(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
    }

    @Override // o.size3ABfNKs
    public final TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        return this.read.serializer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
    }

    public UnspecifiedConstraintsNode(int i, int i2, fling flingVar) {
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = new ImageLoader$Builder(new androidx.compose.animation.core.FloatTweenSpec(i, i2, flingVar));
    }
}
