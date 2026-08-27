package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m3199constructorimpl(0);
    private static final int Weight = m3199constructorimpl(1);
    private static final int Style = m3199constructorimpl(2);
    private static final int All = m3199constructorimpl(65535);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3199constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3201equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3202hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isStyleOn-impl$ui_text, reason: not valid java name */
    public static final boolean m3203isStyleOnimpl$ui_text(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: isWeightOn-impl$ui_text, reason: not valid java name */
    public static final boolean m3204isWeightOnimpl$ui_text(int i) {
        return (i & 1) != 0;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3206unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m3198boximpl(int i) {
        return new FontSynthesis(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3205toStringimpl(int i) {
        if (m3201equalsimpl0(i, None)) {
            return "None";
        }
        if (m3201equalsimpl0(i, Weight)) {
            return "Weight";
        }
        if (m3201equalsimpl0(i, Style)) {
            return "Style";
        }
        return m3201equalsimpl0(i, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3200equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3202hashCodeimpl(this.value);
    }

    public String toString() {
        return m3205toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m3207getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* JADX INFO: renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m3208getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* JADX INFO: renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m3209getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* JADX INFO: renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m3210getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: valueOf-9CiegCU, reason: not valid java name */
        public final int m3211valueOf9CiegCU(int i) {
            if (i != 0 && i != 1 && i != 2 && i != 65535) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by FontSynthesis.");
            }
            return FontSynthesis.m3199constructorimpl(i);
        }
    }

    private /* synthetic */ FontSynthesis(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3200equalsimpl(int i, Object obj) {
        return (obj instanceof FontSynthesis) && i == ((FontSynthesis) obj).m3206unboximpl();
    }
}
