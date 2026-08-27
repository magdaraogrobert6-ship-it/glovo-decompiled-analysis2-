package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTraversalKt {
    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.fetchFocusProperties$ui().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
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
        return null;
    }

    /* JADX INFO: renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m402focusSearch0X8WOeE(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection, Rect rect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iM359getRightdhqQ8s;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m416oneDimensionalFocusSearchOMvw8(focusTargetNode, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m427twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i, rect, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (!FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s())) {
            if (!FocusDirection.m349equalsimpl0(i, companion.m355getExitdhqQ8s())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(FocusDirection.m351toStringimpl(i), "Focus search invoked with invalid FocusDirection ");
                return null;
            }
            FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusTargetNode);
            FocusTargetNode focusTargetNodeFindNonDeactivatedParent = focusTargetNodeFindActiveFocusNode != null ? findNonDeactivatedParent(focusTargetNodeFindActiveFocusNode) : null;
            return Boolean.valueOf((focusTargetNodeFindNonDeactivatedParent == null || focusTargetNodeFindNonDeactivatedParent == focusTargetNode) ? false : ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNodeFindNonDeactivatedParent)).booleanValue());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 == 1) {
            iM359getRightdhqQ8s = companion.m359getRightdhqQ8s();
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            iM359getRightdhqQ8s = companion.m356getLeftdhqQ8s();
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m427twoDimensionalFocusSearchsMXa3k8(focusTargetNodeFindActiveFocusNode2, iM359getRightdhqQ8s, rect, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        return null;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m401customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties focusPropertiesFetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getNext();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getPrevious();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getUp();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getDown();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = focusPropertiesFetchFocusProperties$ui.getStart();
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                start = focusPropertiesFetchFocusProperties$ui.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui.getLeft() : focusRequester;
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = focusPropertiesFetchFocusProperties$ui.getEnd();
            } else {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                end = focusPropertiesFetchFocusProperties$ui.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui.getRight() : focusRequester;
        }
        if (!FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s()) && !FocusDirection.m349equalsimpl0(i, companion.m355getExitdhqQ8s())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("invalid FocusDirection");
            return null;
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s())) {
            focusPropertiesFetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            focusPropertiesFetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
            return FocusRequester.Companion.getCancel();
        }
        return activeFocusTargetNode != focusOwner.getActiveFocusTargetNode() ? FocusRequester.Companion.getRedirect$ui() : FocusRequester.Companion.getDefault();
    }

    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null || !activeFocusTargetNode.isAttached()) {
            return null;
        }
        return activeFocusTargetNode;
    }

    public static final FocusTargetNode getActiveChild(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getNode().isAttached()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
            if (child$ui == null) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusTargetNode.getNode(), false);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i = oncreatevirtualviewtranslationrequests.read;
                if (i == 0) {
                    break;
                }
                Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
                if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
                } else {
                    while (nodePop != null) {
                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                    if (focusTargetNode2.getNode().isAttached()) {
                                        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode2.getFocusState().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            return focusTargetNode2;
                                        }
                                        if (i2 != 4) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                    }
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == null) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (nodePop != null) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                    nodePop = null;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                            break;
                        }
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
        return null;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates;
        if (!focusTargetNode.isAttached()) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator coordinator$ui = focusTargetNode.getCoordinator$ui();
        if (coordinator$ui != null && (layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui)) != null) {
            if (!layoutCoordinatesFindRootCoordinates.isAttached()) {
                layoutCoordinatesFindRootCoordinates = null;
            }
            if (layoutCoordinatesFindRootCoordinates != null) {
                return focusTargetNode.fetchFocusRect$ui(layoutCoordinatesFindRootCoordinates);
            }
        }
        return Rect.Companion.getZero();
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui2 = focusTargetNode.getCoordinator$ui();
        return (coordinator$ui2 == null || (layoutNode = coordinator$ui2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui = focusTargetNode.getCoordinator$ui()) == null || (layoutNode2 = coordinator$ui.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
