package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public static final int $stable = 8;

    public LayoutNodeAlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.get(alignmentLine);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.getMeasureResult$ui().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* JADX INFO: renamed from: calculatePositionInParent-R5De75A */
    public long mo2370calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j) {
        return NodeCoordinator.m2523toParentPosition8S9VItk$default(nodeCoordinator, j, false, 2, null);
    }
}
