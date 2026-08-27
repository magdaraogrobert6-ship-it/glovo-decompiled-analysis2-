package androidx.compose.animation.core;

import o.MutableInteractionSourceImpl;
import o.fling;

/* JADX INFO: loaded from: classes.dex */
public final class FloatTweenSpec implements MutableInteractionSourceImpl {
    public final int RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final fling write;

    @Override // o.MutableInteractionSourceImpl
    public final long read(float f, float f2, float f3) {
        return this.read + this.serializer;
    }

    public FloatTweenSpec(int i, int i2, fling flingVar) {
        this.RemoteActionCompatParcelizer = i;
        this.write = flingVar;
        this.serializer = ((long) i) * 1000000;
        this.read = ((long) i2) * 1000000;
    }

    @Override // o.MutableInteractionSourceImpl
    public final float getValueFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.read;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.serializer;
        if (j2 > j3) {
            j2 = j3;
        }
        float fTransform = this.write.transform(this.RemoteActionCompatParcelizer == 0 ? 1.0f : j2 / j3);
        return (f2 * fTransform) + ((1.0f - fTransform) * f);
    }

    @Override // o.MutableInteractionSourceImpl
    public final float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.read;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.serializer;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (getValueFromNanos(j4, f, f2, f3) - getValueFromNanos(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }
}
