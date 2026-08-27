package androidx.compose.ui.input.nestedscroll;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onItemDismisslambda0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class NestedScrollSource {
    public static final Companion Companion = new Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int value;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m1924constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1926equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1927hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1929unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m1923boximpl(int i) {
        return new NestedScrollSource(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1928toStringimpl(int i) {
        if (m1926equalsimpl0(i, UserInput)) {
            return "UserInput";
        }
        if (m1926equalsimpl0(i, SideEffect)) {
            return "SideEffect";
        }
        return m1926equalsimpl0(i, Relocate) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m1925equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1927hashCodeimpl(this.value);
    }

    public String toString() {
        return m1928toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @onItemDismisslambda0
        /* JADX INFO: renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m1930getDragWNlRxjI$annotations() {
        }

        @onItemDismisslambda0
        /* JADX INFO: renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m1931getFlingWNlRxjI$annotations() {
        }

        @onItemDismisslambda0
        /* JADX INFO: renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m1932getRelocateWNlRxjI$annotations() {
        }

        @onItemDismisslambda0
        /* JADX INFO: renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m1933getWheelWNlRxjI$annotations() {
        }

        /* JADX INFO: renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m1934getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* JADX INFO: renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m1935getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* JADX INFO: renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m1936getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        /* JADX INFO: renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m1937getSideEffectWNlRxjI() {
            return NestedScrollSource.SideEffect;
        }

        /* JADX INFO: renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m1938getUserInputWNlRxjI() {
            return NestedScrollSource.UserInput;
        }

        /* JADX INFO: renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m1939getWheelWNlRxjI() {
            return NestedScrollSource.Wheel;
        }

        private Companion() {
        }
    }

    static {
        int iM1924constructorimpl = m1924constructorimpl(1);
        UserInput = iM1924constructorimpl;
        int iM1924constructorimpl2 = m1924constructorimpl(2);
        SideEffect = iM1924constructorimpl2;
        Drag = iM1924constructorimpl;
        Fling = iM1924constructorimpl2;
        Relocate = m1924constructorimpl(3);
        Wheel = iM1924constructorimpl;
    }

    private /* synthetic */ NestedScrollSource(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1925equalsimpl(int i, Object obj) {
        return (obj instanceof NestedScrollSource) && i == ((NestedScrollSource) obj).m1929unboximpl();
    }
}
