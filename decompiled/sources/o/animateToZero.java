package o;

/* JADX INFO: loaded from: classes.dex */
public final class animateToZero extends TransformGestureDetectorKtdetectTransformGestures2 {
    public float RemoteActionCompatParcelizer;
    public float serializer;

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final int IconCompatParcelizer() {
        return 2;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void read() {
        this.RemoteActionCompatParcelizer = 0.0f;
        this.serializer = 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(this.serializer) + (Float.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    public animateToZero(float f, float f2) {
        this.RemoteActionCompatParcelizer = f;
        this.serializer = f2;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer() {
        return new animateToZero(0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof animateToZero)) {
            return false;
        }
        animateToZero animatetozero = (animateToZero) obj;
        return animatetozero.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && animatetozero.serializer == this.serializer;
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.RemoteActionCompatParcelizer + ", v2 = " + this.serializer;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void write(float f, int i) {
        if (i == 0) {
            this.RemoteActionCompatParcelizer = f;
        } else {
            if (i != 1) {
                return;
            }
            this.serializer = f;
        }
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final float write(int i) {
        if (i == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.serializer;
    }
}
