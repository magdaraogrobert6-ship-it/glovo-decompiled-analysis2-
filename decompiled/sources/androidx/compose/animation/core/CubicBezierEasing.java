package androidx.compose.animation.core;

import androidx.compose.ui.graphics.BezierKt;
import bo.app.af$$ExternalSyntheticOutline1;
import o.Box;
import o.MediaSessionCompatQueueItem;
import o.fling;

/* JADX INFO: loaded from: classes.dex */
public final class CubicBezierEasing implements fling {
    public final float IconCompatParcelizer;
    public final float MediaBrowserCompatMediaItem;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    public final int hashCode() {
        return Float.hashCode(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline1.m(this.write, Float.hashCode(this.read) * 31, 31), 31);
    }

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.read = f;
        this.write = f2;
        this.IconCompatParcelizer = f3;
        this.RemoteActionCompatParcelizer = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            Box.read("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.MediaBrowserCompatMediaItem = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.serializer = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.read == cubicBezierEasing.read && this.write == cubicBezierEasing.write && this.IconCompatParcelizer == cubicBezierEasing.IconCompatParcelizer && this.RemoteActionCompatParcelizer == cubicBezierEasing.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.read);
        sb.append(", b=");
        sb.append(this.write);
        sb.append(", c=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", d=");
        return MediaSessionCompatQueueItem.serializer(sb, this.RemoteActionCompatParcelizer, ')');
    }

    @Override // o.fling
    public final float transform(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f2 = this.read;
        float f3 = this.IconCompatParcelizer;
        float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - fMax, f2 - fMax, f3 - fMax, 1.0f - fMax);
        boolean zIsNaN = Float.isNaN(fFindFirstCubicRoot);
        float f4 = this.RemoteActionCompatParcelizer;
        float f5 = this.write;
        if (!zIsNaN) {
            float fEvaluateCubic = BezierKt.evaluateCubic(f5, f4, fFindFirstCubicRoot);
            float f6 = this.MediaBrowserCompatMediaItem;
            if (fEvaluateCubic < f6) {
                fEvaluateCubic = f6;
            }
            float f7 = this.serializer;
            return fEvaluateCubic > f7 ? f7 : fEvaluateCubic;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", " + f5 + ", " + f3 + ", " + f4 + ") has no solution at " + f);
    }
}
