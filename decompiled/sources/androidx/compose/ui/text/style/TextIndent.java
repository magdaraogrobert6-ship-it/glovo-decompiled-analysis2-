package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    /* JADX INFO: renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m3541getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m3542getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return TextUnit.m3868hashCodeimpl(this.restLine) + (TextUnit.m3868hashCodeimpl(this.firstLine) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m3539copyNB67dxo$default(TextIndent textIndent, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textIndent.firstLine;
        }
        if ((i & 2) != 0) {
            j2 = textIndent.restLine;
        }
        return textIndent.m3540copyNB67dxo(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m3864equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m3864equalsimpl0(this.restLine, textIndent.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m3874toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m3874toStringimpl(this.restLine)) + ')';
    }

    public /* synthetic */ TextIndent(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TextUnitKt.getSp(0) : j, (i & 2) != 0 ? TextUnitKt.getSp(0) : j2, null);
    }

    /* JADX INFO: renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m3540copyNB67dxo(long j, long j2) {
        return new TextIndent(j, j2, null);
    }

    private TextIndent(long j, long j2) {
        this.firstLine = j;
        this.restLine = j2;
    }

    public /* synthetic */ TextIndent(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
