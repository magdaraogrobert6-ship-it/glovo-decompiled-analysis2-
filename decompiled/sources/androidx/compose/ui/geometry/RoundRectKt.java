package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRectKt {
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m529RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m533translateUv8p0NA(RoundRect roundRect, long j) {
        float left = roundRect.getLeft();
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float top = roundRect.getTop();
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float right = roundRect.getRight();
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float bottom = roundRect.getBottom();
        return new RoundRect(left + fIntBitsToFloat, fIntBitsToFloat2 + top, right + fIntBitsToFloat3, Float.intBitsToFloat(i2) + bottom, roundRect.m527getTopLeftCornerRadiuskKHJgLs(), roundRect.m528getTopRightCornerRadiuskKHJgLs(), roundRect.m526getBottomRightCornerRadiuskKHJgLs(), roundRect.m525getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final long getCenter(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float width = roundRect.getWidth() / 2.0f;
        float top = roundRect.getTop();
        float height = roundRect.getHeight() / 2.0f;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width + left)) << 32) | (((long) Float.floatToRawIntBits(height + top)) & 4294967295L));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m527getTopLeftCornerRadiuskKHJgLs() == roundRect.m528getTopRightCornerRadiuskKHJgLs() && roundRect.m528getTopRightCornerRadiuskKHJgLs() == roundRect.m526getBottomRightCornerRadiuskKHJgLs() && roundRect.m526getBottomRightCornerRadiuskKHJgLs() == roundRect.m525getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f), CornerRadiusKt.m450lerp3Ry4LBc(roundRect.m527getTopLeftCornerRadiuskKHJgLs(), roundRect2.m527getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m450lerp3Ry4LBc(roundRect.m528getTopRightCornerRadiuskKHJgLs(), roundRect2.m528getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m450lerp3Ry4LBc(roundRect.m526getBottomRightCornerRadiuskKHJgLs(), roundRect2.m526getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m450lerp3Ry4LBc(roundRect.m525getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m525getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jM431constructorimpl = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        return new RoundRect(f, f2, f3, f4, jM431constructorimpl, jM431constructorimpl, jM431constructorimpl, jM431constructorimpl, null);
    }

    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m531RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m532RoundRectsniSvfs(Rect rect, long j) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        float fMax = Math.max(Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)));
        float fMax2 = Math.max(Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)));
        float fMax3 = Math.max(Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)));
        float fMax4 = Math.max(Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)));
        return new Rect((fMax * 0.29289323f) + roundRect.getLeft(), (fMax2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (fMax3 * 0.29289323f), roundRect.getBottom() - (fMax4 * 0.29289323f));
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long jM527getTopLeftCornerRadiuskKHJgLs = roundRect.m527getTopLeftCornerRadiuskKHJgLs();
        return (jM527getTopLeftCornerRadiuskKHJgLs >>> 32) == (jM527getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m527getTopLeftCornerRadiuskKHJgLs() == roundRect.m528getTopRightCornerRadiuskKHJgLs() && roundRect.m527getTopLeftCornerRadiuskKHJgLs() == roundRect.m526getBottomRightCornerRadiuskKHJgLs() && roundRect.m527getTopLeftCornerRadiuskKHJgLs() == roundRect.m525getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final boolean isRect(RoundRect roundRect) {
        long jM527getTopLeftCornerRadiuskKHJgLs = roundRect.m527getTopLeftCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((jM527getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM527getTopLeftCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM528getTopRightCornerRadiuskKHJgLs = roundRect.m528getTopRightCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((jM528getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM528getTopRightCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM525getBottomLeftCornerRadiuskKHJgLs = roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        if (((jM525getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM525getBottomLeftCornerRadiuskKHJgLs) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM526getBottomRightCornerRadiuskKHJgLs = roundRect.m526getBottomRightCornerRadiuskKHJgLs() & InlineClassHelperKt.DualUnsignedFloatMask;
        return (((jM526getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (~jM526getBottomRightCornerRadiuskKHJgLs)) & (-9223372034707292160L)) != 0;
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
