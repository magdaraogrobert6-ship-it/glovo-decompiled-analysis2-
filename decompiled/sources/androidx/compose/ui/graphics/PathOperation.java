package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m1025constructorimpl(0);
    private static final int Intersect = m1025constructorimpl(1);
    private static final int Union = m1025constructorimpl(2);
    private static final int Xor = m1025constructorimpl(3);
    private static final int ReverseDifference = m1025constructorimpl(4);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1025constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1027equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1028hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1030unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m1024boximpl(int i) {
        return new PathOperation(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1029toStringimpl(int i) {
        if (m1027equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m1027equalsimpl0(i, Intersect)) {
            return "Intersect";
        }
        if (m1027equalsimpl0(i, Union)) {
            return "Union";
        }
        if (m1027equalsimpl0(i, Xor)) {
            return "Xor";
        }
        return m1027equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m1026equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1028hashCodeimpl(this.value);
    }

    public String toString() {
        return m1029toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m1031getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* JADX INFO: renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m1032getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* JADX INFO: renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m1033getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* JADX INFO: renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m1034getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* JADX INFO: renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m1035getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1026equalsimpl(int i, Object obj) {
        return (obj instanceof PathOperation) && i == ((PathOperation) obj).m1030unboximpl();
    }
}
