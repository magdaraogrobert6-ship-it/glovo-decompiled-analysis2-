package androidx.compose.ui.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface BeyondBoundsLayout {

    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m2190constructorimpl(1);
        private static final int After = m2190constructorimpl(2);
        private static final int Left = m2190constructorimpl(3);
        private static final int Right = m2190constructorimpl(4);
        private static final int Above = m2190constructorimpl(5);
        private static final int Below = m2190constructorimpl(6);

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m2190constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2192equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m2193hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2195unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m2189boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m2194toStringimpl(int i) {
            if (m2192equalsimpl0(i, Before)) {
                return "Before";
            }
            if (m2192equalsimpl0(i, After)) {
                return "After";
            }
            if (m2192equalsimpl0(i, Left)) {
                return "Left";
            }
            if (m2192equalsimpl0(i, Right)) {
                return "Right";
            }
            if (m2192equalsimpl0(i, Above)) {
                return "Above";
            }
            return m2192equalsimpl0(i, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m2191equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m2193hashCodeimpl(this.value);
        }

        public String toString() {
            return m2194toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m2196getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* JADX INFO: renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m2197getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* JADX INFO: renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m2198getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* JADX INFO: renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m2199getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* JADX INFO: renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m2200getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* JADX INFO: renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m2201getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            private Companion() {
            }
        }

        private /* synthetic */ LayoutDirection(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m2191equalsimpl(int i, Object obj) {
            return (obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m2195unboximpl();
        }
    }

    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    <T> T mo2188layouto7g1Pn8(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
}
