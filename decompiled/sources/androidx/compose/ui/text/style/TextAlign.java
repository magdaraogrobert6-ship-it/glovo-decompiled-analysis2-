package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.sqlite.SQLite;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m3505constructorimpl(1);
    private static final int Right = m3505constructorimpl(2);
    private static final int Center = m3505constructorimpl(3);
    private static final int Justify = m3505constructorimpl(4);
    private static final int Start = m3505constructorimpl(5);
    private static final int End = m3505constructorimpl(6);
    private static final int Unspecified = m3505constructorimpl(0);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3505constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3507equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3508hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3510unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m3504boximpl(int i) {
        return new TextAlign(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3509toStringimpl(int i) {
        if (m3507equalsimpl0(i, Left)) {
            return "Left";
        }
        if (m3507equalsimpl0(i, Right)) {
            return "Right";
        }
        if (m3507equalsimpl0(i, Center)) {
            return "Center";
        }
        if (m3507equalsimpl0(i, Justify)) {
            return "Justify";
        }
        if (m3507equalsimpl0(i, Start)) {
            return "Start";
        }
        if (m3507equalsimpl0(i, End)) {
            return EmbeddedFeedbackUtils.END_QUESTIONS_TAG;
        }
        return m3507equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3506equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3508hashCodeimpl(this.value);
    }

    public String toString() {
        return m3509toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m3511getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* JADX INFO: renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m3512getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* JADX INFO: renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m3513getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* JADX INFO: renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m3514getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* JADX INFO: renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m3515getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* JADX INFO: renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m3516getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* JADX INFO: renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m3517getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        private Companion() {
        }

        public final List<TextAlign> values() {
            return SQLite.read(TextAlign.m3504boximpl(m3514getLefte0LSkKk()), TextAlign.m3504boximpl(m3515getRighte0LSkKk()), TextAlign.m3504boximpl(m3511getCentere0LSkKk()), TextAlign.m3504boximpl(m3513getJustifye0LSkKk()), TextAlign.m3504boximpl(m3516getStarte0LSkKk()), TextAlign.m3504boximpl(m3512getEnde0LSkKk()));
        }

        /* JADX INFO: renamed from: valueOf-IgVj0fw, reason: not valid java name */
        public final int m3518valueOfIgVj0fw(int i) {
            if (i < 0 || i >= 7) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextAlign.");
            }
            return TextAlign.m3505constructorimpl(i);
        }
    }

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3506equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m3510unboximpl();
    }
}
