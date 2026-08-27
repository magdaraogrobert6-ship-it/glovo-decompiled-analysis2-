package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final class calculateCentroid extends TransformGestureDetectorKtdetectTransformGestures2 {
    public float IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;
    public float read;

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final int IconCompatParcelizer() {
        return 3;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void read() {
        this.read = 0.0f;
        this.RemoteActionCompatParcelizer = 0.0f;
        this.IconCompatParcelizer = 0.0f;
    }

    public final int hashCode() {
        return Float.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline1.m(this.RemoteActionCompatParcelizer, Float.hashCode(this.read) * 31, 31);
    }

    public calculateCentroid(float f, float f2, float f3) {
        this.read = f;
        this.RemoteActionCompatParcelizer = f2;
        this.IconCompatParcelizer = f3;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final TransformGestureDetectorKtdetectTransformGestures2 RemoteActionCompatParcelizer() {
        return new calculateCentroid(0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof calculateCentroid)) {
            return false;
        }
        calculateCentroid calculatecentroid = (calculateCentroid) obj;
        return calculatecentroid.read == this.read && calculatecentroid.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer && calculatecentroid.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.read + ", v2 = " + this.RemoteActionCompatParcelizer + ", v3 = " + this.IconCompatParcelizer;
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final void write(float f, int i) {
        if (i == 0) {
            this.read = f;
        } else if (i == 1) {
            this.RemoteActionCompatParcelizer = f;
        } else {
            if (i != 2) {
                return;
            }
            this.IconCompatParcelizer = f;
        }
    }

    @Override // o.TransformGestureDetectorKtdetectTransformGestures2
    public final float write(int i) {
        if (i == 0) {
            return this.read;
        }
        if (i == 1) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.IconCompatParcelizer;
    }
}
