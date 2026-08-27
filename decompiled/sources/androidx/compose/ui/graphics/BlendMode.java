package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m629constructorimpl(0);
    private static final int Src = m629constructorimpl(1);
    private static final int Dst = m629constructorimpl(2);
    private static final int SrcOver = m629constructorimpl(3);
    private static final int DstOver = m629constructorimpl(4);
    private static final int SrcIn = m629constructorimpl(5);
    private static final int DstIn = m629constructorimpl(6);
    private static final int SrcOut = m629constructorimpl(7);
    private static final int DstOut = m629constructorimpl(8);
    private static final int SrcAtop = m629constructorimpl(9);
    private static final int DstAtop = m629constructorimpl(10);
    private static final int Xor = m629constructorimpl(11);
    private static final int Plus = m629constructorimpl(12);
    private static final int Modulate = m629constructorimpl(13);
    private static final int Screen = m629constructorimpl(14);
    private static final int Overlay = m629constructorimpl(15);
    private static final int Darken = m629constructorimpl(16);
    private static final int Lighten = m629constructorimpl(17);
    private static final int ColorDodge = m629constructorimpl(18);
    private static final int ColorBurn = m629constructorimpl(19);
    private static final int Hardlight = m629constructorimpl(20);
    private static final int Softlight = m629constructorimpl(21);
    private static final int Difference = m629constructorimpl(22);
    private static final int Exclusion = m629constructorimpl(23);
    private static final int Multiply = m629constructorimpl(24);
    private static final int Hue = m629constructorimpl(25);
    private static final int Saturation = m629constructorimpl(26);
    private static final int Color = m629constructorimpl(27);
    private static final int Luminosity = m629constructorimpl(28);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m629constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m631equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m632hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m634unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m628boximpl(int i) {
        return new BlendMode(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m633toStringimpl(int i) {
        if (m631equalsimpl0(i, Clear)) {
            return "Clear";
        }
        if (m631equalsimpl0(i, Src)) {
            return "Src";
        }
        if (m631equalsimpl0(i, Dst)) {
            return "Dst";
        }
        if (m631equalsimpl0(i, SrcOver)) {
            return "SrcOver";
        }
        if (m631equalsimpl0(i, DstOver)) {
            return "DstOver";
        }
        if (m631equalsimpl0(i, SrcIn)) {
            return "SrcIn";
        }
        if (m631equalsimpl0(i, DstIn)) {
            return "DstIn";
        }
        if (m631equalsimpl0(i, SrcOut)) {
            return "SrcOut";
        }
        if (m631equalsimpl0(i, DstOut)) {
            return "DstOut";
        }
        if (m631equalsimpl0(i, SrcAtop)) {
            return "SrcAtop";
        }
        if (m631equalsimpl0(i, DstAtop)) {
            return "DstAtop";
        }
        if (m631equalsimpl0(i, Xor)) {
            return "Xor";
        }
        if (m631equalsimpl0(i, Plus)) {
            return "Plus";
        }
        if (m631equalsimpl0(i, Modulate)) {
            return "Modulate";
        }
        if (m631equalsimpl0(i, Screen)) {
            return "Screen";
        }
        if (m631equalsimpl0(i, Overlay)) {
            return "Overlay";
        }
        if (m631equalsimpl0(i, Darken)) {
            return "Darken";
        }
        if (m631equalsimpl0(i, Lighten)) {
            return "Lighten";
        }
        if (m631equalsimpl0(i, ColorDodge)) {
            return "ColorDodge";
        }
        if (m631equalsimpl0(i, ColorBurn)) {
            return "ColorBurn";
        }
        if (m631equalsimpl0(i, Hardlight)) {
            return "HardLight";
        }
        if (m631equalsimpl0(i, Softlight)) {
            return "Softlight";
        }
        if (m631equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m631equalsimpl0(i, Exclusion)) {
            return "Exclusion";
        }
        if (m631equalsimpl0(i, Multiply)) {
            return "Multiply";
        }
        if (m631equalsimpl0(i, Hue)) {
            return "Hue";
        }
        if (m631equalsimpl0(i, Saturation)) {
            return "Saturation";
        }
        if (m631equalsimpl0(i, Color)) {
            return "Color";
        }
        return m631equalsimpl0(i, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m630equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m632hashCodeimpl(this.value);
    }

    public String toString() {
        return m633toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m635getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* JADX INFO: renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m636getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* JADX INFO: renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m637getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* JADX INFO: renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m638getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* JADX INFO: renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m639getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* JADX INFO: renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m640getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* JADX INFO: renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m641getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* JADX INFO: renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m642getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* JADX INFO: renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m643getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* JADX INFO: renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m644getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* JADX INFO: renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m645getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* JADX INFO: renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m646getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* JADX INFO: renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m647getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* JADX INFO: renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m648getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* JADX INFO: renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m649getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* JADX INFO: renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m650getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* JADX INFO: renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m651getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* JADX INFO: renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m652getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* JADX INFO: renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m653getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* JADX INFO: renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m654getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* JADX INFO: renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m655getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* JADX INFO: renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m656getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* JADX INFO: renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m657getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* JADX INFO: renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m658getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* JADX INFO: renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m659getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* JADX INFO: renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m660getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* JADX INFO: renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m661getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* JADX INFO: renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m662getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* JADX INFO: renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m663getXor0nO6VwU() {
            return BlendMode.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m630equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m634unboximpl();
    }
}
