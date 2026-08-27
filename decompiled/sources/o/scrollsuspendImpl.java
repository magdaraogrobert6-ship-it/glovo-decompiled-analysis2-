package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class scrollsuspendImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ PagerState RemoteActionCompatParcelizer;

    public /* synthetic */ scrollsuspendImpl(PagerState pagerState, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = pagerState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        PagerState pagerState = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            pagerState.read();
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            return androidx.compose.ui.geometry.Offset.m466boximpl(pagerState.ParcelableVolumeInfo);
        }
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) ((onShowTranslationui) pagerState.RatingCompat).getValue();
        return androidx.compose.ui.geometry.Offset.m466boximpl(layoutCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutCoordinates) : androidx.compose.ui.geometry.Offset.Companion.m492getUnspecifiedF1C5BW0());
    }
}
