package androidx.compose.ui.text.android;

import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class VerticalPaddings {
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3125constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3127equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m3128getBottomPaddingimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m3129getTopPaddingimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3130hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3132unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m3124boximpl(long j) {
        return new VerticalPaddings(j);
    }

    public boolean equals(Object obj) {
        return m3126equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3130hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3131toStringimpl(this.packedValue);
    }

    private /* synthetic */ VerticalPaddings(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3131toStringimpl(long j) {
        return "VerticalPaddings(packedValue=" + j + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3126equalsimpl(long j, Object obj) {
        return (obj instanceof VerticalPaddings) && j == ((VerticalPaddings) obj).m3132unboximpl();
    }
}
