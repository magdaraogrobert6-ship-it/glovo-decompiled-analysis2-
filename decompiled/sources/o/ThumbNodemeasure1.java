package o;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbNodemeasure1 implements TooltipDefaults {
    public final TooltipDefaults IconCompatParcelizer;
    public final TooltipDefaults serializer;

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        return Math.max(this.IconCompatParcelizer.RemoteActionCompatParcelizer(density), this.serializer.RemoteActionCompatParcelizer(density));
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return Math.max(this.IconCompatParcelizer.RemoteActionCompatParcelizer(density, layoutDirection), this.serializer.RemoteActionCompatParcelizer(density, layoutDirection));
    }

    public final int hashCode() {
        return (this.serializer.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        return Math.max(this.IconCompatParcelizer.read(density), this.serializer.read(density));
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return Math.max(this.IconCompatParcelizer.read(density, layoutDirection), this.serializer.read(density, layoutDirection));
    }

    public ThumbNodemeasure1(TooltipDefaults tooltipDefaults, TooltipDefaults tooltipDefaults2) {
        this.IconCompatParcelizer = tooltipDefaults;
        this.serializer = tooltipDefaults2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbNodemeasure1)) {
            return false;
        }
        ThumbNodemeasure1 thumbNodemeasure1 = (ThumbNodemeasure1) obj;
        Object[] objArr = {thumbNodemeasure1.IconCompatParcelizer, this.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {thumbNodemeasure1.serializer, this.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + this.IconCompatParcelizer + " ∪ " + this.serializer + ')';
    }
}
