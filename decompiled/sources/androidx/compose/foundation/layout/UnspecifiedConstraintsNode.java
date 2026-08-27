package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.OutlinedTextFieldDefaults;

/* JADX INFO: loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    public float RemoteActionCompatParcelizer;
    public float read;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM3628getMinWidthimpl;
        int iM3627getMinHeightimpl;
        if (Float.isNaN(this.RemoteActionCompatParcelizer) || Constraints.m3628getMinWidthimpl(j) != 0) {
            iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
        } else {
            int iMo42roundToPx0680j_4 = measureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer);
            iM3628getMinWidthimpl = Constraints.m3626getMaxWidthimpl(j);
            if (iMo42roundToPx0680j_4 < 0) {
                iMo42roundToPx0680j_4 = 0;
            }
            if (iMo42roundToPx0680j_4 <= iM3628getMinWidthimpl) {
                iM3628getMinWidthimpl = iMo42roundToPx0680j_4;
            }
        }
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        if (Float.isNaN(this.read) || Constraints.m3627getMinHeightimpl(j) != 0) {
            iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        } else {
            int iMo42roundToPx0680j_5 = measureScope.mo42roundToPx0680j_4(this.read);
            iM3627getMinHeightimpl = Constraints.m3625getMaxHeightimpl(j);
            int i = iMo42roundToPx0680j_5 >= 0 ? iMo42roundToPx0680j_5 : 0;
            if (i <= iM3627getMinHeightimpl) {
                iM3627getMinHeightimpl = i;
            }
        }
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(ConstraintsKt.Constraints(iM3628getMinWidthimpl, iM3626getMaxWidthimpl, iM3627getMinHeightimpl, Constraints.m3625getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 2), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        int iMo42roundToPx0680j_4 = !Float.isNaN(this.read) ? intrinsicMeasureScope.mo42roundToPx0680j_4(this.read) : 0;
        return iMaxIntrinsicHeight < iMo42roundToPx0680j_4 ? iMo42roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        int iMo42roundToPx0680j_4 = !Float.isNaN(this.RemoteActionCompatParcelizer) ? intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer) : 0;
        return iMaxIntrinsicWidth < iMo42roundToPx0680j_4 ? iMo42roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        int iMo42roundToPx0680j_4 = !Float.isNaN(this.read) ? intrinsicMeasureScope.mo42roundToPx0680j_4(this.read) : 0;
        return iMinIntrinsicHeight < iMo42roundToPx0680j_4 ? iMo42roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        int iMo42roundToPx0680j_4 = !Float.isNaN(this.RemoteActionCompatParcelizer) ? intrinsicMeasureScope.mo42roundToPx0680j_4(this.RemoteActionCompatParcelizer) : 0;
        return iMinIntrinsicWidth < iMo42roundToPx0680j_4 ? iMo42roundToPx0680j_4 : iMinIntrinsicWidth;
    }
}
