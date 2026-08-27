package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FocusDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Next = m347constructorimpl(1);
    private static final int Previous = m347constructorimpl(2);
    private static final int Left = m347constructorimpl(3);
    private static final int Right = m347constructorimpl(4);
    private static final int Up = m347constructorimpl(5);
    private static final int Down = m347constructorimpl(6);
    private static final int Enter = m347constructorimpl(7);
    private static final int Exit = m347constructorimpl(8);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m347constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m349equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m350hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m352unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FocusDirection m346boximpl(int i) {
        return new FocusDirection(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m351toStringimpl(int i) {
        if (m349equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m349equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m349equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m349equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m349equalsimpl0(i, Up)) {
            return "Up";
        }
        if (m349equalsimpl0(i, Down)) {
            return "Down";
        }
        if (m349equalsimpl0(i, Enter)) {
            return "Enter";
        }
        return m349equalsimpl0(i, Exit) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m348equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m350hashCodeimpl(this.value);
    }

    public String toString() {
        return m351toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m353getDowndhqQ8s() {
            return FocusDirection.Down;
        }

        /* JADX INFO: renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m354getEnterdhqQ8s() {
            return FocusDirection.Enter;
        }

        /* JADX INFO: renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m355getExitdhqQ8s() {
            return FocusDirection.Exit;
        }

        /* JADX INFO: renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m356getLeftdhqQ8s() {
            return FocusDirection.Left;
        }

        /* JADX INFO: renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m357getNextdhqQ8s() {
            return FocusDirection.Next;
        }

        /* JADX INFO: renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m358getPreviousdhqQ8s() {
            return FocusDirection.Previous;
        }

        /* JADX INFO: renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m359getRightdhqQ8s() {
            return FocusDirection.Right;
        }

        /* JADX INFO: renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m360getUpdhqQ8s() {
            return FocusDirection.Up;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FocusDirection(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m348equalsimpl(int i, Object obj) {
        return (obj instanceof FocusDirection) && i == ((FocusDirection) obj).m352unboximpl();
    }
}
