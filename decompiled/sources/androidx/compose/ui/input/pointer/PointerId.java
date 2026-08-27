package androidx.compose.ui.input.pointer;

import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointerId {
    private final long value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2048constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2050equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2051hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2053unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerId m2047boximpl(long j) {
        return new PointerId(j);
    }

    public boolean equals(Object obj) {
        return m2049equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2051hashCodeimpl(this.value);
    }

    public String toString() {
        return m2052toStringimpl(this.value);
    }

    private /* synthetic */ PointerId(long j) {
        this.value = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2052toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2049equalsimpl(long j, Object obj) {
        return (obj instanceof PointerId) && j == ((PointerId) obj).m2053unboximpl();
    }
}
