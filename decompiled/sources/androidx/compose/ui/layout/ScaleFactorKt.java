package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.util.MathHelpersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ScaleFactorKt {
    /* JADX INFO: renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m2340isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m2342isUnspecifiedFK8aYYs$annotations(long j) {
    }

    /* JADX INFO: renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m2346timesmw2e94(long j, long j2) {
        return m2345timesUQTWf7w(j2, j);
    }

    /* JADX INFO: renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m2339isSpecifiedFK8aYYs(long j) {
        return j != ScaleFactor.Companion.m2337getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m2341isUnspecifiedFK8aYYs(long j) {
        return j == ScaleFactor.Companion.m2337getUnspecified_hLwfpc();
    }

    /* JADX INFO: renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m2344takeOrElseoyDd2qo(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return j != ScaleFactor.Companion.m2337getUnspecified_hLwfpc() ? j : ((ScaleFactor) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).m2335unboximpl();
    }

    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m2338divUQTWf7w(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m2343lerpbDIf60(long j, long j2, float f) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m2345timesUQTWf7w(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 * fIntBitsToFloat)) << 32));
    }
}
