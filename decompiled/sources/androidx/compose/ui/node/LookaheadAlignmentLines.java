package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 8;

    public LookaheadAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* JADX INFO: renamed from: calculatePositionInParent-R5De75A */
    public long mo2370calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        long jMo2467getPositionnOccac = lookaheadDelegate.mo2467getPositionnOccac();
        float fM3801getXimpl = IntOffset.m3801getXimpl(jMo2467getPositionnOccac);
        float fM3802getYimpl = IntOffset.m3802getYimpl(jMo2467getPositionnOccac);
        return Offset.m482plusMKHz9U(Offset.m469constructorimpl((Float.floatToRawIntBits(fM3801getXimpl) << 32) | (((long) Float.floatToRawIntBits(fM3802getYimpl)) & 4294967295L)), j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.getMeasureResult$ui().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        lookaheadDelegate.getClass();
        return lookaheadDelegate.get(alignmentLine);
    }
}
