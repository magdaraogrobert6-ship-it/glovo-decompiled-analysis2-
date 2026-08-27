package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class IntOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3795constructorimpl(0);
    private static final long Max = m3795constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask);

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m3793component1impl(long j) {
        return m3801getXimpl(j);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m3794component2impl(long j) {
        return m3802getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3795constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3800equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m3801getXimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m3802getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3803hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3810unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m3792boximpl(long j) {
        return new IntOffset(j);
    }

    public boolean equals(Object obj) {
        return m3799equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3803hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3808toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m3811getMaxnOccac() {
            return IntOffset.Max;
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m3812getZeronOccac() {
            return IntOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3808toStringimpl(long j) {
        return "(" + m3801getXimpl(j) + ", " + m3802getYimpl(j) + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3799equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).m3810unboximpl();
    }

    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m3798divBjo55l4(long j, float f) {
        return m3795constructorimpl((((long) Math.round(((int) (j >> 32)) / f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) / f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m3807timesBjo55l4(long j, float f) {
        return m3795constructorimpl((((long) Math.round(((int) (j >> 32)) * f)) << 32) | (((long) Math.round(((int) (j & 4294967295L)) * f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m3796copyiSbpLlY(long j, int i, int i2) {
        return m3795constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L));
    }

    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m3806remBjo55l4(long j, int i) {
        int i2 = (int) (j >> 32);
        return m3795constructorimpl((((long) (((int) (j & 4294967295L)) % i)) & 4294967295L) | (((long) (i2 % i)) << 32));
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m3797copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return m3796copyiSbpLlY(j, i, i2);
    }

    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m3809unaryMinusnOccac(long j) {
        return m3795constructorimpl((((long) (-((int) (j & 4294967295L)))) & 4294967295L) | (((long) (-((int) (j >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m3804minusqkQi6aY(long j, long j2) {
        return m3795constructorimpl((((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32));
    }

    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m3805plusqkQi6aY(long j, long j2) {
        return m3795constructorimpl((((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32));
    }
}
