package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = m3522constructorimpl(1);
    private static final int Rtl = m3522constructorimpl(2);
    private static final int Content = m3522constructorimpl(3);
    private static final int ContentOrLtr = m3522constructorimpl(4);
    private static final int ContentOrRtl = m3522constructorimpl(5);
    private static final int Unspecified = m3522constructorimpl(0);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3522constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3524equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3525hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3527unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m3521boximpl(int i) {
        return new TextDirection(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3526toStringimpl(int i) {
        if (m3524equalsimpl0(i, Ltr)) {
            return "Ltr";
        }
        if (m3524equalsimpl0(i, Rtl)) {
            return "Rtl";
        }
        if (m3524equalsimpl0(i, Content)) {
            return "Content";
        }
        if (m3524equalsimpl0(i, ContentOrLtr)) {
            return "ContentOrLtr";
        }
        if (m3524equalsimpl0(i, ContentOrRtl)) {
            return "ContentOrRtl";
        }
        return m3524equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3523equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3525hashCodeimpl(this.value);
    }

    public String toString() {
        return m3526toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m3528getContents_7Xco() {
            return TextDirection.Content;
        }

        /* JADX INFO: renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m3529getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* JADX INFO: renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m3530getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* JADX INFO: renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m3531getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* JADX INFO: renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m3532getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* JADX INFO: renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m3533getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m3534valueOfE8nx0Ws(int i) {
            if (i < 0 || i >= 6) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextDirection.");
            }
            return TextDirection.m3522constructorimpl(i);
        }
    }

    private /* synthetic */ TextDirection(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3523equalsimpl(int i, Object obj) {
        return (obj instanceof TextDirection) && i == ((TextDirection) obj).m3527unboximpl();
    }
}
