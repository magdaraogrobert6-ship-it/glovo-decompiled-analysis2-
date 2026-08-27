package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {
    private final LookaheadCapablePlaceable within;

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        LayoutCoordinates coordinates = this.within.isPlacingForAlignment$ui() ? null : this.within.getCoordinates();
        if (coordinates == null) {
            this.within.getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
        }
        return coordinates;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.within.getDensity();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.within.getFontScale();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.within.getMeasuredWidth();
    }

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public float current(Ruler ruler, float f) {
        return ruler.getCalculate$ui() != null ? ((Number) ruler.getCalculate$ui().invoke(this, Float.valueOf(f))).floatValue() : this.within.findRulerValue(ruler, f);
    }
}
