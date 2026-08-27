package androidx.compose.ui.text.font;

import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onItemDismisslambda0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = m3188constructorimpl(0);
    private static final int Italic = m3188constructorimpl(1);

    @onItemDismisslambda0
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3188constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3190equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3191hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3193unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m3187boximpl(int i) {
        return new FontStyle(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3192toStringimpl(int i) {
        if (m3190equalsimpl0(i, Normal)) {
            return "Normal";
        }
        return m3190equalsimpl0(i, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3189equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3191hashCodeimpl(this.value);
    }

    public String toString() {
        return m3192toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3194getItalic_LCdwA$annotations() {
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m3195getNormal_LCdwA$annotations() {
        }

        /* JADX INFO: renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m3196getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* JADX INFO: renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m3197getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        private Companion() {
        }

        public final List<FontStyle> values() {
            return SQLite.read(FontStyle.m3187boximpl(m3197getNormal_LCdwA()), FontStyle.m3187boximpl(m3196getItalic_LCdwA()));
        }
    }

    @onItemDismisslambda0
    private /* synthetic */ FontStyle(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3189equalsimpl(int i, Object obj) {
        return (obj instanceof FontStyle) && i == ((FontStyle) obj).m3193unboximpl();
    }
}
