package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = m3547constructorimpl(1);
        private static final int FontHinting = m3547constructorimpl(2);
        private static final int None = m3547constructorimpl(3);

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3547constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3549equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3550hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3552unboximpl() {
            return this.value;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m3546boximpl(int i) {
            return new Linearity(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3551toStringimpl(int i) {
            if (m3549equalsimpl0(i, Linear)) {
                return "Linearity.Linear";
            }
            if (m3549equalsimpl0(i, FontHinting)) {
                return "Linearity.FontHinting";
            }
            return m3549equalsimpl0(i, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m3548equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3550hashCodeimpl(this.value);
        }

        public String toString() {
            return m3551toStringimpl(this.value);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m3553getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* JADX INFO: renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m3554getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* JADX INFO: renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m3555getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3548equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).m3552unboximpl();
        }
    }

    /* JADX INFO: renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name */
    public final int m3545getLinearity4e0Vf04$ui_text() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return Boolean.hashCode(this.subpixelTextPositioning) + (Linearity.m3550hashCodeimpl(this.linearity) * 31);
    }

    public String toString() {
        if (equals(Static)) {
            return "TextMotion.Static";
        }
        return equals(Animated) ? "TextMotion.Animated" : "Invalid";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        Linearity.Companion companion = Linearity.Companion;
        Static = new TextMotion(companion.m3553getFontHinting4e0Vf04(), false, defaultConstructorMarker);
        Animated = new TextMotion(companion.m3554getLinear4e0Vf04(), true, defaultConstructorMarker);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final TextMotion m3544copyJdDtMQo$ui_text(int i, boolean z) {
        return new TextMotion(i, z, null);
    }

    /* JADX INFO: renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m3543copyJdDtMQo$ui_text$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m3544copyJdDtMQo$ui_text(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m3549equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    public /* synthetic */ TextMotion(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }
}
