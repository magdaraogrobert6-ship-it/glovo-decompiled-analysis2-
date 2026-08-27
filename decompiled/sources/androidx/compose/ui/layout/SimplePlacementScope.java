package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {
    private final float density;
    private final float fontScale;
    private final LayoutDirection parentLayoutDirection;
    private final int parentWidth;

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope, androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.parentWidth;
    }

    public SimplePlacementScope(int i, LayoutDirection layoutDirection, float f, float f2) {
        this.parentWidth = i;
        this.parentLayoutDirection = layoutDirection;
        this.density = f;
        this.fontScale = f2;
    }
}
