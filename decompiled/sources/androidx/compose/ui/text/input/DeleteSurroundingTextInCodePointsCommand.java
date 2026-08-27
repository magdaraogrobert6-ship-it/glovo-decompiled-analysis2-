package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.lengthAfterCursor, ')');
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int i = this.lengthBeforeCursor;
        int length$ui_text = 0;
        int selectionStart$ui_text = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = selectionStart$ui_text + 1;
            if (editingBuffer.getSelectionStart$ui_text() <= i3) {
                selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
                break;
            }
            selectionStart$ui_text = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionStart$ui_text() - i3) + (-1)), editingBuffer.get$ui_text(editingBuffer.getSelectionStart$ui_text() - i3)) ? selectionStart$ui_text + 2 : i3;
        }
        int i4 = this.lengthAfterCursor;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = length$ui_text + 1;
            if (editingBuffer.getSelectionEnd$ui_text() + i6 >= editingBuffer.getLength$ui_text()) {
                length$ui_text = editingBuffer.getLength$ui_text() - editingBuffer.getSelectionEnd$ui_text();
                break;
            }
            length$ui_text = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text((editingBuffer.getSelectionEnd$ui_text() + i6) + (-1)), editingBuffer.get$ui_text(editingBuffer.getSelectionEnd$ui_text() + i6)) ? length$ui_text + 2 : i6;
        }
        editingBuffer.delete$ui_text(editingBuffer.getSelectionEnd$ui_text(), editingBuffer.getSelectionEnd$ui_text() + length$ui_text);
        editingBuffer.delete$ui_text(editingBuffer.getSelectionStart$ui_text() - selectionStart$ui_text, editingBuffer.getSelectionStart$ui_text());
    }
}
