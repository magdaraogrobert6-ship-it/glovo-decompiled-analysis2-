package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class calculateApproachOffset extends TransformGestureDetectorKtdetectTransformGestures2 {
    public float IconCompatParcelizer;
    public float read;
    public float serializer;
    public float write;

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final int IconCompatParcelizer() {
        return 4;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void read() {
        this.read = 0.0f;
        this.write = 0.0f;
        this.IconCompatParcelizer = 0.0f;
        this.serializer = 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(this.serializer) + af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline1.m(this.write, Float.hashCode(this.read) * 31, 31), 31);
    }

    public calculateApproachOffset(float f, float f2, float f3, float f4) {
        this.read = f;
        this.write = f2;
        this.IconCompatParcelizer = f3;
        this.serializer = f4;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer() {
        return new calculateApproachOffset(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof calculateApproachOffset)) {
            return false;
        }
        calculateApproachOffset calculateapproachoffset = (calculateApproachOffset) obj;
        return calculateapproachoffset.read == this.read && calculateapproachoffset.write == this.write && calculateapproachoffset.IconCompatParcelizer == this.IconCompatParcelizer && calculateapproachoffset.serializer == this.serializer;
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.read + ", v2 = " + this.write + ", v3 = " + this.IconCompatParcelizer + ", v4 = " + this.serializer;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void write(float f, int i) {
        if (i == 0) {
            this.read = f;
            return;
        }
        if (i == 1) {
            this.write = f;
        } else if (i == 2) {
            this.IconCompatParcelizer = f;
        } else {
            if (i != 3) {
                return;
            }
            this.serializer = f;
        }
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final float write(int i) {
        if (i == 0) {
            return this.read;
        }
        if (i == 1) {
            return this.write;
        }
        if (i == 2) {
            return this.IconCompatParcelizer;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.serializer;
    }
}
