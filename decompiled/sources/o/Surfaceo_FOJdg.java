package o;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public final class Surfaceo_FOJdg extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public float IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public float read;
    public float serializer;
    public float write;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        int iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(this.serializer) + measureScope.mo42roundToPx0680j_4(this.IconCompatParcelizer);
        int iMo42roundToPx0680j_5 = measureScope.mo42roundToPx0680j_4(this.read) + measureScope.mo42roundToPx0680j_4(this.write);
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m3645offsetNN6EwU(j, -iMo42roundToPx0680j_4, -iMo42roundToPx0680j_5));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.ConstraintsKt.m3643constrainWidthK40F9xA(j, placeableMo2209measureBRTryo0.getWidth() + iMo42roundToPx0680j_4), androidx.compose.ui.unit.ConstraintsKt.m3642constrainHeightK40F9xA(j, placeableMo2209measureBRTryo0.getHeight() + iMo42roundToPx0680j_5), null, new Recomposer$$ExternalSyntheticLambda4(this, 6, placeableMo2209measureBRTryo0), 4, null);
    }
}
