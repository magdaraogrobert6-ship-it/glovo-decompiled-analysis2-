package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextOverflow {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clip = m3557constructorimpl(1);
    private static final int Ellipsis = m3557constructorimpl(2);
    private static final int Visible = m3557constructorimpl(3);
    private static final int StartEllipsis = m3557constructorimpl(4);
    private static final int MiddleEllipsis = m3557constructorimpl(5);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3557constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3559equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3560hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3562unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextOverflow m3556boximpl(int i) {
        return new TextOverflow(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3561toStringimpl(int i) {
        if (m3559equalsimpl0(i, Clip)) {
            return "Clip";
        }
        if (m3559equalsimpl0(i, Ellipsis)) {
            return "Ellipsis";
        }
        if (m3559equalsimpl0(i, MiddleEllipsis)) {
            return "MiddleEllipsis";
        }
        if (m3559equalsimpl0(i, Visible)) {
            return "Visible";
        }
        return m3559equalsimpl0(i, StartEllipsis) ? "StartEllipsis" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3558equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3560hashCodeimpl(this.value);
    }

    public String toString() {
        return m3561toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getClip-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m3563getClipgIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m3564getEllipsisgIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getMiddleEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m3565getMiddleEllipsisgIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getStartEllipsis-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m3566getStartEllipsisgIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getVisible-gIe3tQ8$annotations, reason: not valid java name */
        public static /* synthetic */ void m3567getVisiblegIe3tQ8$annotations() {
        }

        /* JADX INFO: renamed from: getClip-gIe3tQ8, reason: not valid java name */
        public final int m3568getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* JADX INFO: renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m3569getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* JADX INFO: renamed from: getMiddleEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m3570getMiddleEllipsisgIe3tQ8() {
            return TextOverflow.MiddleEllipsis;
        }

        /* JADX INFO: renamed from: getStartEllipsis-gIe3tQ8, reason: not valid java name */
        public final int m3571getStartEllipsisgIe3tQ8() {
            return TextOverflow.StartEllipsis;
        }

        /* JADX INFO: renamed from: getVisible-gIe3tQ8, reason: not valid java name */
        public final int m3572getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextOverflow(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3558equalsimpl(int i, Object obj) {
        return (obj instanceof TextOverflow) && i == ((TextOverflow) obj).m3562unboximpl();
    }
}
