package androidx.compose.ui.util;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class MathHelpersKt {
    public static final double fastCoerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final float fastCoerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final int fastCoerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long fastCoerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final double fastCoerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float fastCoerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final int fastCoerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long fastCoerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final double fastCoerceIn(double d, double d2, double d3) {
        if (d < d2) {
            d = d2;
        }
        return d > d3 ? d3 : d;
    }

    public static final float fastCoerceIn(float f, float f2, float f3) {
        if (f < f2) {
            f = f2;
        }
        return f > f3 ? f3 : f;
    }

    public static final int fastCoerceIn(int i, int i2, int i3) {
        if (i < i2) {
            i = i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final long fastCoerceIn(long j, long j2, long j3) {
        if (j < j2) {
            j = j2;
        }
        return j > j3 ? j3 : j;
    }

    public static final boolean fastIsFinite(double d) {
        return (Double.doubleToRawLongBits(d) & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f2 * f3) + ((1.0f - f3) * f);
    }

    public static final float fastMaxOf(float f, float f2, float f3, float f4) {
        return Math.max(f, Math.max(f2, Math.max(f3, f4)));
    }

    public static final float fastMinOf(float f, float f2, float f3, float f4) {
        return Math.min(f, Math.min(f2, Math.min(f3, f4)));
    }

    public static final int lerp(int i, int i2, float f) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    public static final float normalizedAngleSin(float f) {
        float fFloor = f - ((float) Math.floor(0.5f + f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f2 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f2) / (1.25f - (fAbs * f2));
    }

    public static final float normalizedAngleCos(float f) {
        float f2 = f + 0.25f;
        float fFloor = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f3 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f3) / (1.25f - (fAbs * f3));
    }

    public static final long lerp(long j, long j2, float f) {
        return MathKt.read((j2 - j) * ((double) f)) + j;
    }

    public static final float fastCbrt(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final boolean fastIsFinite(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }
}
