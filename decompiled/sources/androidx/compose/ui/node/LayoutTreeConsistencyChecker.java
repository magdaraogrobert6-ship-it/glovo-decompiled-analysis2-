package androidx.compose.ui.node;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;

    private final String logTree() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Tree state:\n");
        logTree$printSubTree(this, sbM, this.root, 0);
        return sbM.toString();
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        sb.append("[" + layoutNode.getLayoutState$ui() + ']');
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void assertConsistent() {
        if (isTreeConsistent(this.root)) {
            return;
        }
        System.out.println((Object) logTree());
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Inconsistency found!");
    }

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String strNodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (strNodeToString.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strNodeToString);
            sb.append('\n');
            i++;
        }
        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
        int size = children$ui.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui.get(i3), i);
        }
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui = layoutNode.getParent$ui();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui = parent$ui != null ? parent$ui.getLayoutState$ui() : null;
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui() != Integer.MAX_VALUE && parent$ui != null && parent$ui.isPlaced())) {
            if (layoutNode.getMeasurePending$ui()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{postponedRequest3.getNode(), layoutNode}, getCieXyz.write())).booleanValue() && !postponedRequest3.isLookahead()) {
                        break;
                    }
                    i++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.isDeactivated()) {
                return true;
            }
            if (layoutNode.getMeasurePending$ui()) {
                return this.relayoutNodes.contains(layoutNode) || layoutNode.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui != null && parent$ui.getMeasurePending$ui()) || ((parent$ui != null && parent$ui.getLookaheadMeasurePending$ui()) || layoutState$ui == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.getLayoutPending$ui()) {
                if (!this.relayoutNodes.contains(layoutNode) && parent$ui != null && !parent$ui.getMeasurePending$ui() && !parent$ui.getLayoutPending$ui() && layoutState$ui != LayoutNode.LayoutState.Measuring && layoutState$ui != LayoutNode.LayoutState.LayingOut) {
                    List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list2.get(i2).getNode(), layoutNode}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    if (layoutNode.getLayoutState$ui() != LayoutNode.LayoutState.Measuring && layoutNode.getLayoutState$ui() != LayoutNode.LayoutState.LayingOut) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNode.isPlacedInLookahead(), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            if (layoutNode.getLookaheadMeasurePending$ui()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list3.get(i3);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{postponedRequest5.getNode(), layoutNode}, getCieXyz.write())).booleanValue() && postponedRequest5.isLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui()) {
                if (!this.relayoutNodes.contains(layoutNode, true) && ((parent$ui == null || !parent$ui.getLookaheadMeasurePending$ui()) && layoutState$ui != LayoutNode.LayoutState.LookaheadMeasuring)) {
                    if (parent$ui != null && parent$ui.getMeasurePending$ui()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNode.getLookaheadRoot$ui(), layoutNode}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    return false;
                }
                return true;
            }
            if (layoutNode.getLookaheadLayoutPending$ui() && !this.relayoutNodes.contains(layoutNode, true) && parent$ui != null && !parent$ui.getLookaheadMeasurePending$ui() && !parent$ui.getLookaheadLayoutPending$ui() && layoutState$ui != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui != LayoutNode.LayoutState.LookaheadLayingOut) {
                if (parent$ui.getLayoutPending$ui()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNode.getLookaheadRoot$ui(), layoutNode}, getCieXyz.write())).booleanValue()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (!consistentLayoutState(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui = layoutNode.getChildren$ui();
        int size = children$ui.size();
        for (int i = 0; i < size; i++) {
            if (!isTreeConsistent(children$ui.get(i))) {
                return false;
            }
        }
        return true;
    }
}
