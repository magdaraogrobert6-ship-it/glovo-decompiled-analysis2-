package androidx.compose.ui.layout;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
final class OuterPlacementScope extends Placeable.PlacementScope {
    private final Owner owner;

    public final Owner getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        return this.owner.getRoot().getOuterCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.owner.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.owner.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }

    public OuterPlacementScope(Owner owner) {
        this.owner = owner;
    }
}
