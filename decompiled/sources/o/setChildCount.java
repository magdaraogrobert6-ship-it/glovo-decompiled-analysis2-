package o;

/* JADX INFO: loaded from: classes.dex */
public final class setChildCount implements TooltipDefaults {
    public final PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        return ((TooltipDefaults) ((onShowTranslationui) this.IconCompatParcelizer).getValue()).RemoteActionCompatParcelizer(density);
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return ((TooltipDefaults) ((onShowTranslationui) this.IconCompatParcelizer).getValue()).RemoteActionCompatParcelizer(density, layoutDirection);
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        return ((TooltipDefaults) ((onShowTranslationui) this.IconCompatParcelizer).getValue()).read(density);
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return ((TooltipDefaults) ((onShowTranslationui) this.IconCompatParcelizer).getValue()).read(density, layoutDirection);
    }

    public setChildCount(TooltipDefaults tooltipDefaults) {
        this.IconCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(tooltipDefaults);
    }
}
