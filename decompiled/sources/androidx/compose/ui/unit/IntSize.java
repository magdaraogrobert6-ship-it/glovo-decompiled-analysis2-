package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class IntSize {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m3839constructorimpl(0);
    private final long packedValue;

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m3837component1impl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m3838component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3839constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3842equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHeight-impl, reason: not valid java name */
    public static final int m3843getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-impl, reason: not valid java name */
    public static final int m3844getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3845hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3848unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m3836boximpl(long j) {
        return new IntSize(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3847toStringimpl(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m3841equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3845hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3847toStringimpl(this.packedValue);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m3849getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m3840divYEO4UFw(long j, int i) {
        return m3839constructorimpl((((long) (((int) (j >> 32)) / i)) << 32) | (((long) (((int) (j & 4294967295L)) / i)) & 4294967295L));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3841equalsimpl(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).m3848unboximpl();
    }

    /* JADX INFO: renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m3846timesYEO4UFw(long j, int i) {
        int i2 = (int) (j >> 32);
        return m3839constructorimpl((((long) (((int) (j & 4294967295L)) * i)) & 4294967295L) | (((long) (i2 * i)) << 32));
    }
}
