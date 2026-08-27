package o;

/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public float RemoteActionCompatParcelizer;
    public float read;
    public boolean write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new waitForFirstLayout(this, 15, placeableMo2209measureBRTryo0), 4, null);
    }
}
