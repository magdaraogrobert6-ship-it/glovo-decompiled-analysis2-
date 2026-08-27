package o;

/* JADX INFO: loaded from: classes.dex */
public final class getComponentCountimpl extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public int read;
    public int serializer;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        long jConstraints;
        measureScope.getClass();
        measurable.getClass();
        long jM3640constrain4WqzIAM = androidx.compose.ui.unit.ConstraintsKt.m3640constrain4WqzIAM(j, androidx.compose.ui.unit.IntSizeKt.IntSize(this.read, this.serializer));
        if (androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j) == Integer.MAX_VALUE && androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            jConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM), (androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM) * this.serializer) / this.read, (androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM) * this.serializer) / this.read);
        } else if (androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) != Integer.MAX_VALUE || androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j) == Integer.MAX_VALUE) {
            jConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m3844getWidthimpl(jM3640constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM));
        } else {
            jConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints((androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM) * this.read) / this.serializer, (androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM) * this.read) / this.serializer, androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM), androidx.compose.ui.unit.IntSize.m3843getHeightimpl(jM3640constrain4WqzIAM));
        }
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(jConstraints);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new ColorModelCompanion(placeableMo2209measureBRTryo0), 4, null);
    }
}
