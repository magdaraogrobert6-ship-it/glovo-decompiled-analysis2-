package androidx.compose.ui.layout;

import bo.app.af$$ExternalSyntheticOutline0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ValueInsets {
    private final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2349constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2351equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getBottom-impl, reason: not valid java name */
    public static final int m2352getBottomimpl(long j) {
        return (int) (j & 65535);
    }

    /* JADX INFO: renamed from: getLeft-impl, reason: not valid java name */
    public static final int m2353getLeftimpl(long j) {
        return (int) ((j >>> 48) & 65535);
    }

    /* JADX INFO: renamed from: getRight-impl, reason: not valid java name */
    public static final int m2354getRightimpl(long j) {
        return (int) ((j >>> 16) & 65535);
    }

    /* JADX INFO: renamed from: getTop-impl, reason: not valid java name */
    public static final int m2355getTopimpl(long j) {
        return (int) ((j >>> 32) & 65535);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2356hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2358unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m2348boximpl(long j) {
        return new ValueInsets(j);
    }

    public boolean equals(Object obj) {
        return m2350equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2356hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2357toStringimpl(this.packedValue);
    }

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2357toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & 65535));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & 65535));
        sb.append(", ");
        return af$$ExternalSyntheticOutline0.m(sb, (int) (j & 65535), ')');
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2350equalsimpl(long j, Object obj) {
        return (obj instanceof ValueInsets) && j == ((ValueInsets) obj).m2358unboximpl();
    }
}
