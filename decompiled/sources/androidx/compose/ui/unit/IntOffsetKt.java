package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;

/* JADX INFO: loaded from: classes.dex */
public final class IntOffsetKt {
    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m3813lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset.m3795constructorimpl((((long) MathHelpersKt.lerp(IntOffset.m3801getXimpl(j), IntOffset.m3801getXimpl(j2), f)) << 32) | (((long) MathHelpersKt.lerp(IntOffset.m3802getYimpl(j), IntOffset.m3802getYimpl(j2), f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m3814minusNvtHpc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fM3801getXimpl = IntOffset.m3801getXimpl(j2);
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - IntOffset.m3802getYimpl(j2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fM3801getXimpl) << 32));
    }

    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m3816plusNvtHpc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fM3801getXimpl = IntOffset.m3801getXimpl(j2);
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + IntOffset.m3802getYimpl(j2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat + fM3801getXimpl) << 32));
    }

    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m3818roundk4lQ0M(long j) {
        return IntOffset.m3795constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m3819toOffsetgyyYBs(long j) {
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(j))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(j))) << 32));
    }

    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m3815minusoCl6YwE(long j, long j2) {
        float fM3801getXimpl = IntOffset.m3801getXimpl(j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(j) - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fM3801getXimpl - fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m3817plusoCl6YwE(long j, long j2) {
        float fM3801getXimpl = IntOffset.m3801getXimpl(j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + IntOffset.m3802getYimpl(j))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat + fM3801getXimpl)) << 32));
    }

    public static final long IntOffset(int i, int i2) {
        return IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }
}
