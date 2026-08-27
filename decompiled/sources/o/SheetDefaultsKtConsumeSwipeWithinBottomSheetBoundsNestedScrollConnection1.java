package o;

/* JADX INFO: loaded from: classes.dex */
public class SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1 extends ScaffoldKt implements androidx.compose.ui.node.LayoutModifierNode {
    public TooltipDefaults IconCompatParcelizer;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int i = this.serializer.read(measureScope, measureScope.getLayoutDirection()) - this.write.read(measureScope, measureScope.getLayoutDirection());
        int iRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(measureScope) - this.write.RemoteActionCompatParcelizer(measureScope);
        int iRemoteActionCompatParcelizer2 = (this.serializer.RemoteActionCompatParcelizer(measureScope, measureScope.getLayoutDirection()) - this.write.RemoteActionCompatParcelizer(measureScope, measureScope.getLayoutDirection())) + i;
        int i2 = (this.serializer.read(measureScope) - this.write.read(measureScope)) + iRemoteActionCompatParcelizer;
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m3645offsetNN6EwU(j, -iRemoteActionCompatParcelizer2, -i2));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m3643constrainWidthK40F9xA(j, placeableMo2209measureBRTryo0.getWidth() + iRemoteActionCompatParcelizer2), androidx.compose.ui.unit.ConstraintsKt.m3642constrainHeightK40F9xA(j, placeableMo2209measureBRTryo0.getHeight() + i2), null, new SurfaceKtSurface2(placeableMo2209measureBRTryo0, i, iRemoteActionCompatParcelizer, 1), 4, null);
    }

    public SheetDefaultsKtConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection1(TooltipDefaults tooltipDefaults) {
        this.IconCompatParcelizer = tooltipDefaults;
    }

    @Override // o.ScaffoldKt
    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(this);
    }

    @Override // o.ScaffoldKt
    public final TooltipDefaults IconCompatParcelizer(TooltipDefaults tooltipDefaults) {
        return new ThumbNodemeasure1(tooltipDefaults, this.IconCompatParcelizer);
    }
}
