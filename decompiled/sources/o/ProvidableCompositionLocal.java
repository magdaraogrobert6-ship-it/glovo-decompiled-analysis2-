package o;

/* JADX INFO: loaded from: classes.dex */
public final class ProvidableCompositionLocal implements androidx.compose.ui.layout.RemeasurementModifier {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getAdjustedCoordinatesk4lQ0M serializer;

    public /* synthetic */ ProvidableCompositionLocal(getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getadjustedcoordinatesk4lq0m;
    }

    @Override // androidx.compose.ui.layout.RemeasurementModifier
    public final void onRemeasurementAvailable(androidx.compose.ui.layout.Remeasurement remeasurement) {
        int i = this.IconCompatParcelizer;
        getAdjustedCoordinatesk4lQ0M getadjustedcoordinatesk4lq0m = this.serializer;
        if (i != 0) {
            ((androidx.compose.foundation.lazy.LazyListState) getadjustedcoordinatesk4lq0m).ComponentActivity = remeasurement;
        } else {
            ((onShowTranslationui) ((androidx.compose.foundation.pager.PagerState) getadjustedcoordinatesk4lq0m).r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).setValue(remeasurement);
        }
    }
}
