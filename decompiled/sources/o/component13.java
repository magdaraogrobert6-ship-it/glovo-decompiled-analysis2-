package o;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class component13 {
    public final long RemoteActionCompatParcelizer;
    public final Interpolator read;
    public final int serializer;
    public float write;

    public long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public float serializer() {
        return 1.0f;
    }

    public void serializer(float f) {
        this.write = f;
    }

    public int write() {
        return this.serializer;
    }

    public float RemoteActionCompatParcelizer() {
        float f = this.write;
        Interpolator interpolator = this.read;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public component13(int i, Interpolator interpolator, long j) {
        this.serializer = i;
        this.read = interpolator;
        this.RemoteActionCompatParcelizer = j;
    }
}
