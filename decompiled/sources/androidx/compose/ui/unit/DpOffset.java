package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class DpOffset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3729constructorimpl(0);
    private static final long Unspecified = m3729constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3729constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3733equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3735getXD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3737getYD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3738hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3742unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m3728boximpl(long j) {
        return new DpOffset(j);
    }

    public boolean equals(Object obj) {
        return m3732equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3738hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3741toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m3743getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m3744getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m3731copytPigGR8$default(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m3734getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m3736getYD9Ej5fM(j);
        }
        return m3730copytPigGR8(j, f, f2);
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m3734getXD9Ej5fM(long j) {
        return Dp.m3673constructorimpl(Float.intBitsToFloat((int) (j >> 32)));
    }

    /* JADX INFO: renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m3739minusCBMgk4(long j, long j2) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3734getXD9Ej5fM(j) - m3734getXD9Ej5fM(j2));
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3736getYD9Ej5fM(j) - m3736getYD9Ej5fM(j2));
        return m3729constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM3673constructorimpl2))));
    }

    /* JADX INFO: renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m3740plusCBMgk4(long j, long j2) {
        float fM3673constructorimpl = Dp.m3673constructorimpl(m3734getXD9Ej5fM(j2) + m3734getXD9Ej5fM(j));
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(m3736getYD9Ej5fM(j2) + m3736getYD9Ej5fM(j));
        return m3729constructorimpl((((long) Float.floatToRawIntBits(fM3673constructorimpl)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM3673constructorimpl2))));
    }

    /* JADX INFO: renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m3730copytPigGR8(long j, float f, float f2) {
        return m3729constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3732equalsimpl(long j, Object obj) {
        return (obj instanceof DpOffset) && j == ((DpOffset) obj).m3742unboximpl();
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m3736getYD9Ej5fM(long j) {
        return Dp.m3673constructorimpl(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3741toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "(" + ((Object) Dp.m3684toStringimpl(m3734getXD9Ej5fM(j))) + ", " + ((Object) Dp.m3684toStringimpl(m3736getYD9Ej5fM(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
