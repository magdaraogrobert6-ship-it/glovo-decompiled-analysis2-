package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getText(), commitTextCommand.getText()}, getCieXyz.write())).booleanValue() && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(getText());
        sb.append("', newCursorPosition=");
        return af$$ExternalSyntheticOutline0.m(sb, this.newCursorPosition, ')');
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int length;
        if (editingBuffer.hasComposition$ui_text()) {
            editingBuffer.replace$ui_text(editingBuffer.getCompositionStart$ui_text(), editingBuffer.getCompositionEnd$ui_text(), getText());
        } else {
            editingBuffer.replace$ui_text(editingBuffer.getSelectionStart$ui_text(), editingBuffer.getSelectionEnd$ui_text(), getText());
        }
        int cursor$ui_text = editingBuffer.getCursor$ui_text();
        int i = this.newCursorPosition;
        if (i > 0) {
            length = (cursor$ui_text + i) - 1;
        } else {
            length = (cursor$ui_text + i) - getText().length();
        }
        editingBuffer.setCursor$ui_text(RangesKt.RemoteActionCompatParcelizer(length, 0, editingBuffer.getLength$ui_text()));
    }

    public CommitTextCommand(AnnotatedString annotatedString, int i) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }
}
