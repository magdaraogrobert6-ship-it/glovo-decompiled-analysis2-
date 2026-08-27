package o;

/* JADX INFO: loaded from: classes.dex */
public final class SheetDefaultsKt implements SwitchKt {
    public final androidx.compose.ui.unit.Density serializer;
    public final TooltipDefaults write;

    @Override // o.SwitchKt
    public final float IconCompatParcelizer() {
        TooltipDefaults tooltipDefaults = this.write;
        androidx.compose.ui.unit.Density density = this.serializer;
        return density.mo45toDpu2uoSUM(tooltipDefaults.RemoteActionCompatParcelizer(density));
    }

    @Override // o.SwitchKt
    public final float RemoteActionCompatParcelizer() {
        TooltipDefaults tooltipDefaults = this.write;
        androidx.compose.ui.unit.Density density = this.serializer;
        return density.mo45toDpu2uoSUM(tooltipDefaults.read(density));
    }

    public final int hashCode() {
        return this.serializer.hashCode() + (this.write.hashCode() * 31);
    }

    @Override // o.SwitchKt
    public final float read(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        TooltipDefaults tooltipDefaults = this.write;
        androidx.compose.ui.unit.Density density = this.serializer;
        return density.mo45toDpu2uoSUM(tooltipDefaults.read(density, layoutDirection));
    }

    @Override // o.SwitchKt
    public final float write(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        TooltipDefaults tooltipDefaults = this.write;
        androidx.compose.ui.unit.Density density = this.serializer;
        return density.mo45toDpu2uoSUM(tooltipDefaults.RemoteActionCompatParcelizer(density, layoutDirection));
    }

    public SheetDefaultsKt(TooltipDefaults tooltipDefaults, androidx.compose.ui.unit.Density density) {
        this.write = tooltipDefaults;
        this.serializer = density;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetDefaultsKt)) {
            return false;
        }
        SheetDefaultsKt sheetDefaultsKt = (SheetDefaultsKt) obj;
        Object[] objArr = {this.write, sheetDefaultsKt.write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.serializer, sheetDefaultsKt.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.write + ", density=" + this.serializer + ')';
    }
}
