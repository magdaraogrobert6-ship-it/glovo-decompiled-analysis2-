package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int selectionEnd$ui_text = editingBuffer.getSelectionEnd$ui_text();
        int i = this.lengthAfterCursor;
        int length$ui_text = selectionEnd$ui_text + i;
        if (((selectionEnd$ui_text ^ length$ui_text) & (i ^ length$ui_text)) < 0) {
            length$ui_text = editingBuffer.getLength$ui_text();
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), Math.min(length$ui_text, editingBuffer.getLength$ui_text()));
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        int i2 = this.lengthBeforeCursor;
        int i3 = selectionStart$ui_text - i2;
        if (((selectionStart$ui_text ^ i3) & (i2 ^ selectionStart$ui_text)) < 0) {
            i3 = 0;
        }
        editingBuffer.delete$ui_text(Math.max(0, i3), editingBuffer.getSelectionStart$ui_text());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.lengthAfterCursor, ')');
    }
}
