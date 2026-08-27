package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m704constructorimpl(0);
    private static final int Intersect = m704constructorimpl(1);
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m704constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m706equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m707hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m709unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m703boximpl(int i) {
        return new ClipOp(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m708toStringimpl(int i) {
        if (m706equalsimpl0(i, Difference)) {
            return "Difference";
        }
        return m706equalsimpl0(i, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m705equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m707hashCodeimpl(this.value);
    }

    public String toString() {
        return m708toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m710getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* JADX INFO: renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m711getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ClipOp(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m705equalsimpl(int i, Object obj) {
        return (obj instanceof ClipOp) && i == ((ClipOp) obj).m709unboximpl();
    }
}
