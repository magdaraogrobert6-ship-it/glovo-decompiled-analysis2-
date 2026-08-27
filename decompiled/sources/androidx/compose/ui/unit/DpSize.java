package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class DpSize {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3762constructorimpl(0);
    private static final long Unspecified = m3762constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m3760component1D9Ej5fM(long j) {
        return m3771getWidthD9Ej5fM(j);
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m3761component2D9Ej5fM(long j) {
        return m3769getHeightD9Ej5fM(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3762constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3768equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3770getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3772getWidthD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3773hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3779unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m3759boximpl(long j) {
        return new DpSize(j);
    }

    public boolean equals(Object obj) {
        return m3767equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3773hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3778toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m3780getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m3781getZeroMYxV2XQ() {
            return DpSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpSize(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m3764copyDwJknco$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m3771getWidthD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m3769getHeightD9Ej5fM(j);
        }
        return m3763copyDwJknco(j, f, f2);
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m3771getWidthD9Ej5fM(long j) {
        return Dp.m3673constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m3774minuse_xh8Ic(long j, long j2) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j) - m3771getWidthD9Ej5fM(j2));
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j) - m3769getHeightD9Ej5fM(j2));
        return m3762constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM3673constructorimpl2))));
    }

    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m3775pluse_xh8Ic(long j, long j2) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j2) + m3771getWidthD9Ej5fM(j));
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j2) + m3769getHeightD9Ej5fM(j));
        return m3762constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM3673constructorimpl2))));
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m3763copyDwJknco(long j, float f, float f2) {
        return m3762constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m3766divGh9hcWk(long j, int i) {
        float f = i;
        return m3762constructorimpl((((long) Float.floatToRawIntBits(Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j) / f))) << 32) | (((long) Float.floatToRawIntBits(Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j) / f))) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3767equalsimpl(long j, Object obj) {
        return (obj instanceof DpSize) && j == ((DpSize) obj).m3779unboximpl();
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m3777timesGh9hcWk(long j, int i) {
        float f = i;
        return m3762constructorimpl((((long) Float.floatToRawIntBits(Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j) * f))) << 32) | (((long) Float.floatToRawIntBits(Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j) * f))) & 4294967295L));
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m3769getHeightD9Ej5fM(long j) {
        return Dp.m3673constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3778toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return ((Object) Dp.m3684toStringimpl(m3771getWidthD9Ej5fM(j))) + " x " + ((Object) Dp.m3684toStringimpl(m3769getHeightD9Ej5fM(j)));
        }
        return "DpSize.Unspecified";
    }

    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m3765divGh9hcWk(long j, float f) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j) / f);
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j) / f);
        return m3762constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM3673constructorimpl2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m3776timesGh9hcWk(long j, float f) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3771getWidthD9Ej5fM(j) * f);
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3769getHeightD9Ej5fM(j) * f);
        return m3762constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (((long) Float.floatToRawIntBits(fM3673constructorimpl2)) & 4294967295L));
    }
}
