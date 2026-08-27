package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final int getCompositionEnd$ui_text() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text() {
        return this.compositionStart;
    }

    public final int getSelectionEnd$ui_text() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final char get$ui_text(int i) {
        return this.gapBuffer.get(i);
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m3243getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final void replace$ui_text(int i, int i2, String str) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i, "Do not set reversed range: ", i2, " > "));
                return;
            }
            this.gapBuffer.replace(i, i2, str);
            setSelectionStart(str.length() + i);
            setSelectionEnd(str.length() + i);
            this.compositionStart = -1;
            this.compositionEnd = -1;
        }
    }

    public final void setComposition$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i, "Do not set reversed or empty range: ", i2, " > "));
        } else {
            this.compositionStart = i;
            this.compositionEnd = i2;
        }
    }

    public final void setSelection$ui_text(int i, int i2) {
        if (i < 0 || i > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            DrawableTransformation.RemoteActionCompatParcelizer(this.gapBuffer.getLength(), ff$$ExternalSyntheticOutline0.m(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i, "Do not set reversed range: ", i2, " > "));
        } else {
            setSelectionStart(i);
            setSelectionEnd(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void delete$ui_text(int i, int i2) {
        long jTextRange = TextRangeKt.TextRange(i, i2);
        this.gapBuffer.replace(i, i2, "");
        long jM3244updateRangeAfterDeletepWDy79M = EditingBufferKt.m3244updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m3074getMinimpl(jM3244updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m3073getMaximpl(jM3244updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long jM3244updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m3244updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m3070getCollapsedimpl(jM3244updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m3074getMinimpl(jM3244updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m3073getMaximpl(jM3244updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m3074getMinimpl(j);
        this.selectionEnd = TextRange.m3073getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM3074getMinimpl = TextRange.m3074getMinimpl(j);
        int iM3073getMaximpl = TextRange.m3073getMaximpl(j);
        if (iM3074getMinimpl < 0 || iM3074getMinimpl > annotatedString.length()) {
            DrawableTransformation.RemoteActionCompatParcelizer(annotatedString.length(), ff$$ExternalSyntheticOutline0.m(iM3074getMinimpl, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iM3073getMaximpl < 0 || iM3073getMaximpl > annotatedString.length()) {
            DrawableTransformation.RemoteActionCompatParcelizer(annotatedString.length(), ff$$ExternalSyntheticOutline0.m(iM3073getMaximpl, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iM3074getMinimpl <= iM3073getMaximpl) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iM3074getMinimpl, "Do not set reversed range: ", iM3073getMaximpl, " > "));
        throw null;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m3242getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m3064boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.selectionEnd = i;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.selectionStart = i;
    }

    public final void replace$ui_text(int i, int i2, AnnotatedString annotatedString) {
        replace$ui_text(i, i2, annotatedString.getText());
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
