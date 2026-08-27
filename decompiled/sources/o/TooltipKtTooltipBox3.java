package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class TooltipKtTooltipBox3 extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public boolean RemoteActionCompatParcelizer;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;
    public ModalBottomSheetKtModalBottomSheet51 serializer;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet51 = this.serializer;
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet52 = ModalBottomSheetKtModalBottomSheet51.Vertical;
        int iM3628getMinWidthimpl = modalBottomSheetKtModalBottomSheet51 != modalBottomSheetKtModalBottomSheet52 ? 0 : androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j);
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet53 = this.serializer;
        ModalBottomSheetKtModalBottomSheet51 modalBottomSheetKtModalBottomSheet54 = ModalBottomSheetKtModalBottomSheet51.Horizontal;
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.Constraints(iM3628getMinWidthimpl, (this.serializer == modalBottomSheetKtModalBottomSheet52 || !this.RemoteActionCompatParcelizer) ? androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) : Integer.MAX_VALUE, modalBottomSheetKtModalBottomSheet53 == modalBottomSheetKtModalBottomSheet54 ? androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j) : 0, (this.serializer == modalBottomSheetKtModalBottomSheet54 || !this.RemoteActionCompatParcelizer) ? androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j) : Integer.MAX_VALUE));
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(placeableMo2209measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m3628getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
        int iRemoteActionCompatParcelizer2 = RangesKt.RemoteActionCompatParcelizer(placeableMo2209measureBRTryo0.getHeight(), androidx.compose.ui.unit.Constraints.m3627getMinHeightimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, null, new calculatePositionllwVHH4(this, iRemoteActionCompatParcelizer, placeableMo2209measureBRTryo0, iRemoteActionCompatParcelizer2, measureScope), 4, null);
    }
}
