package androidx.compose.ui.node;

import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class DistanceAndFlags {
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2410constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2412equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2414hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m2415isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m2416isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2418unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m2408boximpl(long j) {
        return new DistanceAndFlags(j);
    }

    public boolean equals(Object obj) {
        return m2411equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2414hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2417toStringimpl(this.packedValue);
    }

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m2409compareTo9YPOF3E(long j, long j2) {
        boolean zM2416isInLayerimpl = m2416isInLayerimpl(j);
        if (zM2416isInLayerimpl != m2416isInLayerimpl(j2)) {
            return zM2416isInLayerimpl ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m2413getDistanceimpl(j) - m2413getDistanceimpl(j2));
        if (Math.min(m2413getDistanceimpl(j), m2413getDistanceimpl(j2)) >= 0.0f && m2415isInExpandedBoundsimpl(j) != m2415isInExpandedBoundsimpl(j2)) {
            return m2415isInExpandedBoundsimpl(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX INFO: renamed from: getDistance-impl, reason: not valid java name */
    public static final float m2413getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2417toStringimpl(long j) {
        return "DistanceAndFlags(packedValue=" + j + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2411equalsimpl(long j, Object obj) {
        return (obj instanceof DistanceAndFlags) && j == ((DistanceAndFlags) obj).m2418unboximpl();
    }
}
