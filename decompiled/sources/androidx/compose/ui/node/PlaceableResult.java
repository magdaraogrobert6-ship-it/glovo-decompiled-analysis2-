package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;

/* JADX INFO: loaded from: classes.dex */
final class PlaceableResult implements OwnerScope {
    private final LookaheadCapablePlaceable placeable;
    private MeasureResult result;

    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    public final MeasureResult getResult() {
        return this.result;
    }

    public final void setResult(MeasureResult measureResult) {
        this.result = measureResult;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
    }
}
