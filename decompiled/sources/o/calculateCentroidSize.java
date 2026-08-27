package o;

/* JADX INFO: loaded from: classes.dex */
public final class calculateCentroidSize extends TransformGestureDetectorKtdetectTransformGestures2 {
    public float read;

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void read() {
        this.read = 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(this.read);
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final float write(int i) {
        if (i == 0) {
            return this.read;
        }
        return 0.0f;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void write(float f, int i) {
        if (i == 0) {
            this.read = f;
        }
    }

    public calculateCentroidSize(float f) {
        this.read = f;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer() {
        return new calculateCentroidSize(0.0f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof calculateCentroidSize) && ((calculateCentroidSize) obj).read == this.read;
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.read;
    }
}
