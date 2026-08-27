package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LegacyTextFieldState implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState RemoteActionCompatParcelizer;

    public /* synthetic */ LegacyTextFieldState(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = anchoredDraggableState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = this.RemoteActionCompatParcelizer;
        return i != 0 ? new onViewAttachedToWindowlambda0(anchoredDraggableState.IconCompatParcelizer(), anchoredDraggableState.ParcelableVolumeInfo.getValue()) : anchoredDraggableState.IconCompatParcelizer();
    }
}
