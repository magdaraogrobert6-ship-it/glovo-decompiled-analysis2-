package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;

/* JADX INFO: loaded from: classes.dex */
public interface LayoutAwareModifierNode extends MeasuredSizeAwareModifierNode, DelegatableNode {
    default void onPlaced(LayoutCoordinates layoutCoordinates) {
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    default void mo28onRemeasuredozmzZPI(long j) {
    }
}
