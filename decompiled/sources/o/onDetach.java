package o;

/* JADX INFO: loaded from: classes4.dex */
public final class onDetach implements androidx.compose.ui.text.input.EditCommand {
    public final /* synthetic */ androidx.compose.ui.text.input.EditCommand[] IconCompatParcelizer;

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer editingBuffer) {
        for (androidx.compose.ui.text.input.EditCommand editCommand : this.IconCompatParcelizer) {
            editCommand.applyTo(editingBuffer);
        }
    }

    public onDetach(androidx.compose.ui.text.input.EditCommand[] editCommandArr) {
        this.IconCompatParcelizer = editCommandArr;
    }
}
