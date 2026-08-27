package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import o.ModalBottomSheetKtModalBottomSheet51;
import o.OutlinedTextFieldDefaults;

/* JADX INFO: loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {
    public ModalBottomSheetKtModalBottomSheet51 read;
    public float write;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM3626getMaxWidthimpl;
        int i;
        int iM3625getMaxHeightimpl;
        int iM3625getMaxHeightimpl2;
        if (!Constraints.m3622getHasBoundedWidthimpl(j) || this.read == ModalBottomSheetKtModalBottomSheet51.Vertical) {
            int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
            iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
            i = iM3628getMinWidthimpl;
        } else {
            int iRound = Math.round(Constraints.m3626getMaxWidthimpl(j) * this.write);
            int iM3628getMinWidthimpl2 = Constraints.m3628getMinWidthimpl(j);
            iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
            if (iRound < iM3628getMinWidthimpl2) {
                iRound = iM3628getMinWidthimpl2;
            }
            if (iRound <= iM3626getMaxWidthimpl) {
                iM3626getMaxWidthimpl = iRound;
            }
            i = iM3626getMaxWidthimpl;
        }
        if (!Constraints.m3621getHasBoundedHeightimpl(j) || this.read == ModalBottomSheetKtModalBottomSheet51.Horizontal) {
            int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
            iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
            iM3625getMaxHeightimpl2 = iM3627getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m3625getMaxHeightimpl(j) * this.write);
            int iM3627getMinHeightimpl2 = Constraints.m3627getMinHeightimpl(j);
            iM3625getMaxHeightimpl2 = Constraints.m3625getMaxHeightimpl(j);
            if (iRound2 < iM3627getMinHeightimpl2) {
                iRound2 = iM3627getMinHeightimpl2;
            }
            if (iRound2 <= iM3625getMaxHeightimpl2) {
                iM3625getMaxHeightimpl2 = iRound2;
            }
            iM3625getMaxHeightimpl = iM3625getMaxHeightimpl2;
        }
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(ConstraintsKt.Constraints(i, iM3626getMaxWidthimpl, iM3625getMaxHeightimpl2, iM3625getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 0), 4, null);
    }
}
