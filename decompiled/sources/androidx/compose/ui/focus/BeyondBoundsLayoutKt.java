package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m344searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        FocusDirection.Companion companion;
        int iM2198getBeforehoxUOeE;
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        nodePop = parent$ui;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == null) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (nodePop != null) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                                nodePop = null;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
        if (focusTargetNode2 == null) {
            beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent();
            if (beyondBoundsLayoutParent != null) {
                companion = FocusDirection.Companion;
                if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2196getAbovehoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2199getBelowhoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2200getLefthoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2201getRighthoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2197getAfterhoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2198getBeforehoxUOeE();
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported direction for beyond bounds layout");
                }
                return (T) beyondBoundsLayoutParent.mo2188layouto7g1Pn8(iM2198getBeforehoxUOeE, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent()}, getCieXyz.write())).booleanValue()) {
            beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent();
            if (beyondBoundsLayoutParent != null) {
                companion = FocusDirection.Companion;
                if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2196getAbovehoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2199getBelowhoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2200getLefthoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2201getRighthoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2197getAfterhoxUOeE();
                } else if (FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
                    iM2198getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m2198getBeforehoxUOeE();
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported direction for beyond bounds layout");
                }
                return (T) beyondBoundsLayoutParent.mo2188layouto7g1Pn8(iM2198getBeforehoxUOeE, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        }
        return null;
    }
}
