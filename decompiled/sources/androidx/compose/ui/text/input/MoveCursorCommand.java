package androidx.compose.ui.text.input;

import androidx.compose.ui.text.CharHelpers_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public MoveCursorCommand(int i) {
        this.amount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("MoveCursorCommand(amount="), this.amount, ')');
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.getCursor$ui_text() == -1) {
            editingBuffer.setCursor$ui_text(editingBuffer.getSelectionStart$ui_text());
        }
        int selectionStart$ui_text = editingBuffer.getSelectionStart$ui_text();
        String string = editingBuffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int iFindPrecedingBreak = CharHelpers_androidKt.findPrecedingBreak(string, selectionStart$ui_text);
                if (iFindPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text = iFindPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int iFindFollowingBreak = CharHelpers_androidKt.findFollowingBreak(string, selectionStart$ui_text);
                if (iFindFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text = iFindFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text(selectionStart$ui_text);
    }
}
