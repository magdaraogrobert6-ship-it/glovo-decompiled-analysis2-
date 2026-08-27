package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;

/* JADX INFO: loaded from: classes.dex */
public final class ThrottledCallbacksKt {
    /* JADX INFO: renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m2859rectInfoForDg36KO4(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(delegatableNode, NodeKind.m2551constructorimpl(2));
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!layoutNodeRequireLayoutNode.isPlaced()) {
            return null;
        }
        if (layoutNodeRequireLayoutNode.getOuterCoordinator$ui() == nodeCoordinatorM2391requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
        }
        long jM3795constructorimpl = IntOffset.m3795constructorimpl(j);
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jM3795constructorimpl))) << 32) | (((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jM3795constructorimpl))) & 4294967295L));
        long jMo2217getSizeYbymL2g = nodeCoordinatorM2391requireCoordinator64DMado.getCoordinates().mo2217getSizeYbymL2g();
        long jM3818roundk4lQ0M = IntOffsetKt.m3818roundk4lQ0M(layoutNodeRequireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo2218localPositionOfR5De75A(nodeCoordinatorM2391requireCoordinator64DMado, jM469constructorimpl));
        return new RelativeLayoutBounds(jM3818roundk4lQ0M, IntOffset.m3795constructorimpl((((long) (IntOffset.m3801getXimpl(jM3818roundk4lQ0M) + ((int) (jMo2217getSizeYbymL2g >> 32)))) << 32) | (((long) (IntOffset.m3802getYimpl(jM3818roundk4lQ0M) + ((int) (jMo2217getSizeYbymL2g & 4294967295L)))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
    }
}
