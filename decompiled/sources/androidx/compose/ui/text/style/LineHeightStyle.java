package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Alignment {
        private final float topRatio;
        public static final Companion Companion = new Companion(null);
        private static final float Top = m3471constructorimpl(0.0f);
        private static final float Center = m3471constructorimpl(0.5f);
        private static final float Proportional = m3471constructorimpl(-1.0f);
        private static final float Bottom = m3471constructorimpl(1.0f);

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3473equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3474hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m3476unboximpl() {
            return this.topRatio;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m3470boximpl(float f) {
            return new Alignment(f);
        }

        public boolean equals(Object obj) {
            return m3472equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m3474hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m3475toStringimpl(this.topRatio);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m3477getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* JADX INFO: renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m3478getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* JADX INFO: renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m3479getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* JADX INFO: renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m3480getTopPIaL0Z0() {
                return Alignment.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Alignment(float f) {
            this.topRatio = f;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3472equalsimpl(float f, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f, ((Alignment) obj).m3476unboximpl()) == 0;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3475toStringimpl(float f) {
            if (f == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static float m3471constructorimpl(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f;
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = m3482constructorimpl(0);
        private static final int Minimum = m3482constructorimpl(1);
        private static final int Tight = m3482constructorimpl(2);
        private final int value;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3482constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3484equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3485hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3487unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m3481boximpl(int i) {
            return new Mode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3486toStringimpl(int i) {
            if (m3484equalsimpl0(i, Fixed)) {
                return "LineHeightStyle.Mode.Fixed";
            }
            if (m3484equalsimpl0(i, Minimum)) {
                return "LineHeightStyle.Mode.Minimum";
            }
            return m3484equalsimpl0(i, Tight) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3483equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3485hashCodeimpl(this.value);
        }

        public String toString() {
            return m3486toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m3488getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* JADX INFO: renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m3489getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            /* JADX INFO: renamed from: getTight-lzQqcRY, reason: not valid java name */
            public final int m3490getTightlzQqcRY() {
                return Mode.Tight;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Mode(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3483equalsimpl(int i, Object obj) {
            return (obj instanceof Mode) && i == ((Mode) obj).m3487unboximpl();
        }
    }

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = m3492constructorimpl(1);
        private static final int LastLineBottom = m3492constructorimpl(16);
        private static final int Both = m3492constructorimpl(17);
        private static final int None = m3492constructorimpl(0);

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3492constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3494equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3495hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: isTrimFirstLineTop-impl$ui_text, reason: not valid java name */
        public static final boolean m3496isTrimFirstLineTopimpl$ui_text(int i) {
            return (i & 1) > 0;
        }

        /* JADX INFO: renamed from: isTrimLastLineBottom-impl$ui_text, reason: not valid java name */
        public static final boolean m3497isTrimLastLineBottomimpl$ui_text(int i) {
            return (i & 16) > 0;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3499unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m3491boximpl(int i) {
            return new Trim(i);
        }

        public boolean equals(Object obj) {
            return m3493equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3495hashCodeimpl(this.value);
        }

        public String toString() {
            return m3498toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m3500getBothEVpEnUU() {
                return Trim.Both;
            }

            /* JADX INFO: renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m3501getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* JADX INFO: renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m3502getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* JADX INFO: renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m3503getNoneEVpEnUU() {
                return Trim.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Trim(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3493equalsimpl(int i, Object obj) {
            return (obj instanceof Trim) && i == ((Trim) obj).m3499unboximpl();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3498toStringimpl(int i) {
            if (i == FirstLineTop) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i == LastLineBottom) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i == Both) {
                return "LineHeightStyle.Trim.Both";
            }
            return i == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    /* JADX INFO: renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m3467getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m3468getModelzQqcRY() {
        return this.mode;
    }

    /* JADX INFO: renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m3469getTrimEVpEnUU() {
        return this.trim;
    }

    private LineHeightStyle(float f, int i) {
        this(f, i, Mode.Companion.m3488getFixedlzQqcRY(), null);
    }

    public int hashCode() {
        int iM3474hashCodeimpl = Alignment.m3474hashCodeimpl(this.alignment);
        return Mode.m3485hashCodeimpl(this.mode) + ((Trim.m3495hashCodeimpl(this.trim) + (iM3474hashCodeimpl * 31)) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        Default = new LineHeightStyle(Alignment.Companion.m3479getProportionalPIaL0Z0(), Trim.Companion.m3500getBothEVpEnUU(), Mode.Companion.m3488getFixedlzQqcRY(), defaultConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m3466copy38bxuX8(float f, int i, int i2) {
        return new LineHeightStyle(f, i, i2, null);
    }

    /* JADX INFO: renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m3465copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = lineHeightStyle.alignment;
        }
        if ((i3 & 2) != 0) {
            i = lineHeightStyle.trim;
        }
        if ((i3 & 4) != 0) {
            i2 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m3466copy38bxuX8(f, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m3473equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m3494equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m3484equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m3475toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m3498toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m3486toStringimpl(this.mode)) + ')';
    }

    public /* synthetic */ LineHeightStyle(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i);
    }

    private LineHeightStyle(float f, int i, int i2) {
        this.alignment = f;
        this.trim = i;
        this.mode = i2;
    }

    public /* synthetic */ LineHeightStyle(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2);
    }
}
