package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 implements TooltipDefaults {
    public final int RemoteActionCompatParcelizer;
    public final int read;

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        return this.read;
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return 0;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        return 0;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return this.RemoteActionCompatParcelizer;
    }

    public ModalBottomSheet_androidKtModalBottomSheetDialogdialog111(int i, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheet_androidKtModalBottomSheetDialogdialog111)) {
            return false;
        }
        ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 modalBottomSheet_androidKtModalBottomSheetDialogdialog111 = (ModalBottomSheet_androidKtModalBottomSheetDialogdialog111) obj;
        return this.RemoteActionCompatParcelizer == modalBottomSheet_androidKtModalBottomSheetDialogdialog111.RemoteActionCompatParcelizer && this.read == modalBottomSheet_androidKtModalBottomSheetDialogdialog111.read;
    }

    public final int hashCode() {
        return ((this.RemoteActionCompatParcelizer * 31) + this.read) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", top=");
        return af$$ExternalSyntheticOutline0.m(this.read, ", right=0, bottom=0)", sb);
    }
}
