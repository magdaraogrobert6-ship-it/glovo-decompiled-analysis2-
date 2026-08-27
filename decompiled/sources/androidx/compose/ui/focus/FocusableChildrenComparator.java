package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Comparator;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final onCreateVirtualViewTranslationRequests pathFromRoot(LayoutNode layoutNode) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new LayoutNode[16]);
        while (layoutNode != null) {
            oncreatevirtualviewtranslationrequests.read(0, layoutNode);
            layoutNode = layoutNode.getParent$ui();
        }
        return oncreatevirtualviewtranslationrequests;
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) && FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNodeRequireLayoutNode, layoutNodeRequireLayoutNode2}, getCieXyz.write())).booleanValue()) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsPathFromRoot = pathFromRoot(layoutNodeRequireLayoutNode);
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsPathFromRoot2 = pathFromRoot(layoutNodeRequireLayoutNode2);
                int iMin = Math.min(oncreatevirtualviewtranslationrequestsPathFromRoot.read - 1, oncreatevirtualviewtranslationrequestsPathFromRoot2.read - 1);
                if (iMin >= 0) {
                    int i = 0;
                    while (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{oncreatevirtualviewtranslationrequestsPathFromRoot.write[i], oncreatevirtualviewtranslationrequestsPathFromRoot2.write[i]}, getCieXyz.write())).booleanValue()) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return removeNodeAtDepth.serializer(((LayoutNode) oncreatevirtualviewtranslationrequestsPathFromRoot.write[i]).getPlaceOrder$ui(), ((LayoutNode) oncreatevirtualviewtranslationrequestsPathFromRoot2.write[i]).getPlaceOrder$ui());
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                return 1;
            }
        }
        return 0;
    }
}
