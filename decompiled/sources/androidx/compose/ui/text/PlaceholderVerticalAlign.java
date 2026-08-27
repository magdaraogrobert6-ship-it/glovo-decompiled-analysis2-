package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = m2965constructorimpl(1);
    private static final int Top = m2965constructorimpl(2);
    private static final int Bottom = m2965constructorimpl(3);
    private static final int Center = m2965constructorimpl(4);
    private static final int TextTop = m2965constructorimpl(5);
    private static final int TextBottom = m2965constructorimpl(6);
    private static final int TextCenter = m2965constructorimpl(7);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m2965constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2967equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2968hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2970unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m2964boximpl(int i) {
        return new PlaceholderVerticalAlign(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2969toStringimpl(int i) {
        if (m2967equalsimpl0(i, AboveBaseline)) {
            return "AboveBaseline";
        }
        if (m2967equalsimpl0(i, Top)) {
            return "Top";
        }
        if (m2967equalsimpl0(i, Bottom)) {
            return "Bottom";
        }
        if (m2967equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m2967equalsimpl0(i, TextTop)) {
            return "TextTop";
        }
        if (m2967equalsimpl0(i, TextBottom)) {
            return "TextBottom";
        }
        return m2967equalsimpl0(i, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m2966equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2968hashCodeimpl(this.value);
    }

    public String toString() {
        return m2969toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m2971getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* JADX INFO: renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m2972getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* JADX INFO: renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m2973getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* JADX INFO: renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m2974getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* JADX INFO: renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m2975getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* JADX INFO: renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m2976getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* JADX INFO: renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m2977getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PlaceholderVerticalAlign(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2966equalsimpl(int i, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i == ((PlaceholderVerticalAlign) obj).m2970unboximpl();
    }
}
