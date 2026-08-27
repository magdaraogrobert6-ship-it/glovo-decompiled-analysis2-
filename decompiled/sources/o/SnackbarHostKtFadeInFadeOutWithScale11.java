package o;

/* JADX INFO: loaded from: classes.dex */
public final class SnackbarHostKtFadeInFadeOutWithScale11 extends SheetState {
    public expand IconCompatParcelizer;
    public boolean write;

    @Override // o.SheetState
    public final boolean read() {
        return this.write;
    }

    @Override // o.SheetState, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.IconCompatParcelizer == expand.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // o.SheetState, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.IconCompatParcelizer == expand.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // o.SheetState
    public final long serializer(androidx.compose.ui.layout.Measurable measurable, long j) {
        int iMinIntrinsicWidth = this.IconCompatParcelizer == expand.Min ? measurable.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j)) : measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
        if (iMinIntrinsicWidth < 0) {
            iMinIntrinsicWidth = 0;
        }
        return androidx.compose.ui.unit.Constraints.Companion.m3638fixedWidthOenEA2s(iMinIntrinsicWidth);
    }
}
