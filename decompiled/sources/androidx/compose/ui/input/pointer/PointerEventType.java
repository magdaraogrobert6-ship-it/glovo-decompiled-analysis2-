package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m2009constructorimpl(0);
    private static final int Press = m2009constructorimpl(1);
    private static final int Release = m2009constructorimpl(2);
    private static final int Move = m2009constructorimpl(3);
    private static final int Enter = m2009constructorimpl(4);
    private static final int Exit = m2009constructorimpl(5);
    private static final int Scroll = m2009constructorimpl(6);
    private static final int ScaleStart = m2009constructorimpl(7);
    private static final int ScaleChange = m2009constructorimpl(8);
    private static final int ScaleEnd = m2009constructorimpl(9);
    private static final int PanStart = m2009constructorimpl(10);
    private static final int PanMove = m2009constructorimpl(11);
    private static final int PanEnd = m2009constructorimpl(12);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m2009constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2011equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2012hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2014unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerEventType m2008boximpl(int i) {
        return new PointerEventType(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2013toStringimpl(int i) {
        if (m2011equalsimpl0(i, Press)) {
            return "Press";
        }
        if (m2011equalsimpl0(i, Release)) {
            return "Release";
        }
        if (m2011equalsimpl0(i, Move)) {
            return "Move";
        }
        if (m2011equalsimpl0(i, Enter)) {
            return "Enter";
        }
        if (m2011equalsimpl0(i, Exit)) {
            return "Exit";
        }
        if (m2011equalsimpl0(i, Scroll)) {
            return "Scroll";
        }
        if (m2011equalsimpl0(i, ScaleStart)) {
            return "ScaleStart";
        }
        if (m2011equalsimpl0(i, ScaleChange)) {
            return "ScaleChange";
        }
        if (m2011equalsimpl0(i, ScaleEnd)) {
            return "ScaleFinish";
        }
        if (m2011equalsimpl0(i, PanStart)) {
            return "PanStart";
        }
        if (m2011equalsimpl0(i, PanMove)) {
            return "Pan";
        }
        return m2011equalsimpl0(i, PanEnd) ? "PanEnd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2010equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2012hashCodeimpl(this.value);
    }

    public String toString() {
        return m2013toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m2015getEnter7fucELk() {
            return PointerEventType.Enter;
        }

        /* JADX INFO: renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m2016getExit7fucELk() {
            return PointerEventType.Exit;
        }

        /* JADX INFO: renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m2017getMove7fucELk() {
            return PointerEventType.Move;
        }

        /* JADX INFO: renamed from: getPanEnd-7fucELk, reason: not valid java name */
        public final int m2018getPanEnd7fucELk() {
            return PointerEventType.PanEnd;
        }

        /* JADX INFO: renamed from: getPanMove-7fucELk, reason: not valid java name */
        public final int m2019getPanMove7fucELk() {
            return PointerEventType.PanMove;
        }

        /* JADX INFO: renamed from: getPanStart-7fucELk, reason: not valid java name */
        public final int m2020getPanStart7fucELk() {
            return PointerEventType.PanStart;
        }

        /* JADX INFO: renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m2021getPress7fucELk() {
            return PointerEventType.Press;
        }

        /* JADX INFO: renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m2022getRelease7fucELk() {
            return PointerEventType.Release;
        }

        /* JADX INFO: renamed from: getScaleChange-7fucELk, reason: not valid java name */
        public final int m2023getScaleChange7fucELk() {
            return PointerEventType.ScaleChange;
        }

        /* JADX INFO: renamed from: getScaleEnd-7fucELk, reason: not valid java name */
        public final int m2024getScaleEnd7fucELk() {
            return PointerEventType.ScaleEnd;
        }

        /* JADX INFO: renamed from: getScaleStart-7fucELk, reason: not valid java name */
        public final int m2025getScaleStart7fucELk() {
            return PointerEventType.ScaleStart;
        }

        /* JADX INFO: renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m2026getScroll7fucELk() {
            return PointerEventType.Scroll;
        }

        /* JADX INFO: renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m2027getUnknown7fucELk() {
            return PointerEventType.Unknown;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointerEventType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2010equalsimpl(int i, Object obj) {
        return (obj instanceof PointerEventType) && i == ((PointerEventType) obj).m2014unboximpl();
    }
}
