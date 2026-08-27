package o;

/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetKtModalBottomSheetContent721 implements TooltipDefaults {
    public final TooltipDefaults RemoteActionCompatParcelizer;
    public final TooltipDefaults read;

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(density) - this.read.RemoteActionCompatParcelizer(density);
        if (iRemoteActionCompatParcelizer < 0) {
            return 0;
        }
        return iRemoteActionCompatParcelizer;
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(density, layoutDirection) - this.read.RemoteActionCompatParcelizer(density, layoutDirection);
        if (iRemoteActionCompatParcelizer < 0) {
            return 0;
        }
        return iRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        int i = this.RemoteActionCompatParcelizer.read(density) - this.read.read(density);
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        int i = this.RemoteActionCompatParcelizer.read(density, layoutDirection) - this.read.read(density, layoutDirection);
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public ModalBottomSheetKtModalBottomSheetContent721(TooltipDefaults tooltipDefaults, TooltipDefaults tooltipDefaults2) {
        this.RemoteActionCompatParcelizer = tooltipDefaults;
        this.read = tooltipDefaults2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetKtModalBottomSheetContent721)) {
            return false;
        }
        ModalBottomSheetKtModalBottomSheetContent721 modalBottomSheetKtModalBottomSheetContent721 = (ModalBottomSheetKtModalBottomSheetContent721) obj;
        Object[] objArr = {modalBottomSheetKtModalBottomSheetContent721.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {modalBottomSheetKtModalBottomSheetContent721.read, this.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + this.RemoteActionCompatParcelizer + " - " + this.read + ')';
    }
}
