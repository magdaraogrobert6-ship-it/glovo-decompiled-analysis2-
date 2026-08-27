package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AnchoredDraggableStatedraggableState1drag2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.lazy.LazyListState read;

    public /* synthetic */ AnchoredDraggableStatedraggableState1drag2(androidx.compose.foundation.lazy.LazyListState lazyListState, int i) {
        this.IconCompatParcelizer = i;
        this.read = lazyListState;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        androidx.compose.foundation.lazy.LazyListState lazyListState = this.read;
        if (i4 != 0) {
            return Boolean.valueOf(lazyListState.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer());
        }
        Integer numValueOf = Integer.valueOf(((androidx.compose.foundation.lazy.LazyListMeasureResult) lazyListState.serializer()).PlaybackStateCompatCustomAction);
        int i5 = write + 75;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return numValueOf;
    }
}
