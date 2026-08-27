package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.ranges.RangesKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class DpKt {
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3700getCenterEaSLcWc$annotations(long j) {
    }

    public static final float getDp(int i) {
        return Dp.m3673constructorimpl(i);
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m3701isFinite0680j_4(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3702isFinite0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m3703isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3704isSpecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3705isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3706isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3707isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3708isSpecifiedjoFl9I$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m3709isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m3710isUnspecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m3711isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m3712isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m3713isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m3714isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m3727times6HolHcs(int i, long j) {
        return DpSize.m3777timesGh9hcWk(j, i);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3723times3ABfNKs(double d, float f) {
        return Dp.m3673constructorimpl(((float) d) * f);
    }

    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m3698coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m3673constructorimpl(RangesKt.write(f, f2, f3));
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m3673constructorimpl(dpRect.m3755getBottomD9Ej5fM() - dpRect.m3758getTopD9Ej5fM());
    }

    public static final long getSize(DpRect dpRect) {
        return m3695DpSizeYgX7TsA(Dp.m3673constructorimpl(dpRect.m3757getRightD9Ej5fM() - dpRect.m3756getLeftD9Ej5fM()), Dp.m3673constructorimpl(dpRect.m3755getBottomD9Ej5fM() - dpRect.m3758getTopD9Ej5fM()));
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m3673constructorimpl(dpRect.m3757getRightD9Ej5fM() - dpRect.m3756getLeftD9Ej5fM());
    }

    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m3715lerpIDex15A(long j, long j2, float f) {
        float fM3716lerpMdfbLM = m3716lerpMdfbLM(DpSize.m3771getWidthD9Ej5fM(j), DpSize.m3771getWidthD9Ej5fM(j2), f);
        float fM3716lerpMdfbLM2 = m3716lerpMdfbLM(DpSize.m3769getHeightD9Ej5fM(j), DpSize.m3769getHeightD9Ej5fM(j2), f);
        return DpSize.m3762constructorimpl((((long) Float.floatToRawIntBits(fM3716lerpMdfbLM)) << 32) | (((long) Float.floatToRawIntBits(fM3716lerpMdfbLM2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m3716lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m3673constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m3717lerpxhh869w(long j, long j2, float f) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m3734getXD9Ej5fM(j), DpOffset.m3734getXD9Ej5fM(j2), f);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m3736getYD9Ej5fM(j), DpOffset.m3736getYD9Ej5fM(j2), f);
        return DpOffset.m3729constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m3718maxYgX7TsA(float f, float f2) {
        return Dp.m3673constructorimpl(Math.max(f, f2));
    }

    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m3719minYgX7TsA(float f, float f2) {
        return Dp.m3673constructorimpl(Math.min(f, f2));
    }

    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m3694DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m3729constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m3695DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m3762constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m3696coerceAtLeastYgX7TsA(float f, float f2) {
        if (f < f2) {
            f = f2;
        }
        return Dp.m3673constructorimpl(f);
    }

    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m3697coerceAtMostYgX7TsA(float f, float f2) {
        if (f > f2) {
            f = f2;
        }
        return Dp.m3673constructorimpl(f);
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m3726times6HolHcs(float f, long j) {
        return DpSize.m3776timesGh9hcWk(j, f);
    }

    public static final float getDp(double d) {
        return Dp.m3673constructorimpl((float) d);
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m3699getCenterEaSLcWc(long j) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(DpSize.m3771getWidthD9Ej5fM(j) / 2.0f);
        return DpOffset.m3729constructorimpl((((long) Float.floatToRawIntBits(Dp.m3673constructorimpl(DpSize.m3769getHeightD9Ej5fM(j) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32));
    }

    public static final float getDp(float f) {
        return Dp.m3673constructorimpl(f);
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m3720takeOrElseD5KLDUw(float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return !Float.isNaN(f) ? f : ((Dp) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3687unboximpl();
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3724times3ABfNKs(float f, float f2) {
        return Dp.m3673constructorimpl(f * f2);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m3725times3ABfNKs(int i, float f) {
        return Dp.m3673constructorimpl(i * f);
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m3721takeOrElsegVKV90s(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpOffset) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3742unboximpl();
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m3722takeOrElseitqla9I(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpSize) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m3779unboximpl();
    }
}
