package androidx.compose.ui.text.input;

import o.displayInAppMessagelambda1;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteAllCommand implements EditCommand {
    public static final int $stable = 0;

    public boolean equals(Object obj) {
        return obj instanceof DeleteAllCommand;
    }

    public int hashCode() {
        return displayInAppMessagelambda1.serializer(DeleteAllCommand.class).hashCode();
    }

    public String toString() {
        return "DeleteAllCommand()";
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.replace$ui_text(0, editingBuffer.getLength$ui_text(), "");
    }
}
