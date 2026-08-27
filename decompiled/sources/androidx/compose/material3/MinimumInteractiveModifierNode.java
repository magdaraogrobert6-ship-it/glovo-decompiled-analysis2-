package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.SurfaceKtSurface2;
import o.getFartKroMQ;

/* JADX INFO: loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutModifierNode {
    public LinkedHashMap IconCompatParcelizer;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float fM3687unboximpl = ((Dp) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, getFartKroMQ.write)).m3687unboximpl();
        float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
        if (fM3687unboximpl < fM3673constructorimpl) {
            fM3687unboximpl = fM3673constructorimpl;
        }
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(fM3687unboximpl);
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        boolean z = isAttached() && !Float.isNaN(fM3673constructorimpl2) && Dp.m3672compareTo0680j_4(fM3673constructorimpl2, Dp.m3673constructorimpl(0.0f)) > 0;
        int iMo42roundToPx0680j_4 = !Float.isNaN(fM3673constructorimpl2) ? measureScope.mo42roundToPx0680j_4(fM3673constructorimpl2) : 0;
        int iMax = z ? Math.max(placeableMo2209measureBRTryo0.getWidth(), iMo42roundToPx0680j_4) : placeableMo2209measureBRTryo0.getWidth();
        int iMax2 = z ? Math.max(placeableMo2209measureBRTryo0.getHeight(), iMo42roundToPx0680j_4) : placeableMo2209measureBRTryo0.getHeight();
        if (z) {
            LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.IconCompatParcelizer = linkedHashMap;
            }
            VerticalAlignmentLine verticalAlignmentLine = getFartKroMQ.serializer;
            int iRound = Math.round((iMo42roundToPx0680j_4 - placeableMo2209measureBRTryo0.getWidth()) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(verticalAlignmentLine, Integer.valueOf(iRound));
            HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
            int iRound2 = Math.round((iMo42roundToPx0680j_4 - placeableMo2209measureBRTryo0.getHeight()) / 2.0f);
            linkedHashMap.put(horizontalAlignmentLine, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map<AlignmentLine, Integer> map = this.IconCompatParcelizer;
        if (map == null) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        return measureScope.layout(iMax, iMax2, map, new SurfaceKtSurface2(iMax, iMax2, placeableMo2209measureBRTryo0));
    }
}
