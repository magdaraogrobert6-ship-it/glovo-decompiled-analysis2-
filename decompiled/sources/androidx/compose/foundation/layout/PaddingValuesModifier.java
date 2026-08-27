package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import o.SurfaceKtSurface2;
import o.SwitchKt;
import o.TooltipKtTooltipBoxwrappedContent1;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {
    public SwitchKt serializer;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f = this.serializer.read(measureScope.getLayoutDirection());
        float fIconCompatParcelizer = this.serializer.IconCompatParcelizer();
        float fWrite = this.serializer.write(measureScope.getLayoutDirection());
        float fRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer();
        boolean z = Dp.m3672compareTo0680j_4(f, Dp.m3673constructorimpl(0.0f)) >= 0;
        boolean z2 = Dp.m3672compareTo0680j_4(fIconCompatParcelizer, Dp.m3673constructorimpl(0.0f)) >= 0;
        if (!(z & z2 & (Dp.m3672compareTo0680j_4(fWrite, Dp.m3673constructorimpl(0.0f)) >= 0) & (Dp.m3672compareTo0680j_4(fRemoteActionCompatParcelizer, Dp.m3673constructorimpl(0.0f)) >= 0))) {
            TooltipKtTooltipBoxwrappedContent1.read("Padding must be non-negative");
        }
        int iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(f);
        int iMo42roundToPx0680j_5 = measureScope.mo42roundToPx0680j_4(fWrite) + iMo42roundToPx0680j_4;
        int iMo42roundToPx0680j_6 = measureScope.mo42roundToPx0680j_4(fIconCompatParcelizer);
        int iMo42roundToPx0680j_7 = measureScope.mo42roundToPx0680j_4(fRemoteActionCompatParcelizer) + iMo42roundToPx0680j_6;
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(ConstraintsKt.m3645offsetNN6EwU(j, -iMo42roundToPx0680j_5, -iMo42roundToPx0680j_7));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3643constrainWidthK40F9xA(j, placeableMo2209measureBRTryo0.getWidth() + iMo42roundToPx0680j_5), ConstraintsKt.m3642constrainHeightK40F9xA(j, placeableMo2209measureBRTryo0.getHeight() + iMo42roundToPx0680j_7), null, new SurfaceKtSurface2(placeableMo2209measureBRTryo0, iMo42roundToPx0680j_4, iMo42roundToPx0680j_6, 0), 4, null);
    }
}
