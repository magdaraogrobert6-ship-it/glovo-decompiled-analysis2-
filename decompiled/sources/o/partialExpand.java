package o;

/* JADX INFO: loaded from: classes.dex */
public final class partialExpand extends SheetState {
    public boolean RemoteActionCompatParcelizer;
    public expand write;

    @Override // o.SheetState
    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.SheetState, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.write == expand.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // o.SheetState, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.write == expand.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // o.SheetState
    public final long serializer(androidx.compose.ui.layout.Measurable measurable, long j) {
        int iMinIntrinsicHeight = this.write == expand.Min ? measurable.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j)) : measurable.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
        if (iMinIntrinsicHeight < 0) {
            iMinIntrinsicHeight = 0;
        }
        return androidx.compose.ui.unit.Constraints.Companion.m3637fixedHeightOenEA2s(iMinIntrinsicHeight);
    }
}
