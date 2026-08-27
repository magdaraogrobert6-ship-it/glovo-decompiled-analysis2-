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
import java.util.Arrays;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
        return node == null;
    }

    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m416oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
        return false;
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object[] objArr = new FocusTargetNode[16];
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
        int i = 0;
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                break;
            }
            Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
            } else {
                while (nodePop != null) {
                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        FocusableChildrenComparator focusableChildrenComparator = FocusableChildrenComparator.INSTANCE;
        focusableChildrenComparator.getClass();
        Arrays.sort(objArr, 0, i, focusableChildrenComparator);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && backwardFocusSearch(focusTargetNode3, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Object[] objArr = new FocusTargetNode[16];
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
        int i = 0;
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                break;
            }
            Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
            } else {
                while (nodePop != null) {
                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = focusTargetNode2;
                                i = i3;
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i4++;
                                        if (i4 == 1) {
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
                                if (i4 == 1) {
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
        FocusableChildrenComparator focusableChildrenComparator = FocusableChildrenComparator.INSTANCE;
        focusableChildrenComparator.getClass();
        Arrays.sort(objArr, 0, i, focusableChildrenComparator);
        for (int i5 = 0; i5 < i; i5++) {
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i5];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final <T> void forEachItemAfter(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        boolean z = false;
        Object[] objArr = {0, Integer.valueOf(oncreatevirtualviewtranslationrequests.read)};
        int iWrite = BackspaceCommand.write();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
        int i = ensuresubscribedtoinappmessageeventslambda7.write;
        int i2 = ensuresubscribedtoinappmessageeventslambda7.read;
        if (i > i2) {
            return;
        }
        while (true) {
            if (z) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(oncreatevirtualviewtranslationrequests.write[i]);
            }
            Object[] objArr2 = {oncreatevirtualviewtranslationrequests.write[i], t};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                z = true;
            }
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    private static final <T> void forEachItemBefore(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        boolean z = false;
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(oncreatevirtualviewtranslationrequests.read)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
        int i = ensuresubscribedtoinappmessageeventslambda7.write;
        int i2 = ensuresubscribedtoinappmessageeventslambda7.read;
        if (i > i2) {
            return;
        }
        while (true) {
            if (z) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(oncreatevirtualviewtranslationrequests.write[i2]);
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{oncreatevirtualviewtranslationrequests.write[i2], t}, getCieXyz.write())).booleanValue()) {
                z = true;
            }
            if (i2 == i) {
                return;
            } else {
                i2--;
            }
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return pickChildForBackwardSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            if (i == 4) {
                return pickChildForBackwardSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm) || (focusTargetNode.fetchFocusProperties$ui().getCanFocus() && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode)).booleanValue());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
            return false;
        }
        int i2 = iArr[activeChild.getFocusState().ordinal()];
        if (i2 == 1) {
            return backwardFocusSearch(activeChild, r8lambdaunavo3sxub_pc9xroryotnrlvsm) || m415generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m358getPreviousdhqQ8s(), r8lambdaunavo3sxub_pc9xroryotnrlvsm) || (activeChild.fetchFocusProperties$ui().getCanFocus() && ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(activeChild)).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return m415generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m358getPreviousdhqQ8s(), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (i2 != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
        return false;
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, r8lambdaunavo3sxub_pc9xroryotnrlvsm) || m415generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m357getNextdhqQ8s(), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
            return false;
        }
        if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (i == 4) {
            return focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode)).booleanValue() : pickChildForForwardSearch(focusTargetNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m417searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            Object[] objArr = new FocusTargetNode[16];
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
            int i2 = 0;
            while (true) {
                int i3 = oncreatevirtualviewtranslationrequests.read;
                if (i3 == 0) {
                    break;
                }
                Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i3 - 1);
                if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
                } else {
                    while (nodePop != null) {
                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr2, 0, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i2] = focusTargetNode3;
                                    i2 = i4;
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i5 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i5++;
                                            if (i5 == 1) {
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
                                    if (i5 == 1) {
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
            FocusableChildrenComparator focusableChildrenComparator = FocusableChildrenComparator.INSTANCE;
            focusableChildrenComparator.getClass();
            Arrays.sort(objArr, 0, i2, focusableChildrenComparator);
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s())) {
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i2)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                int i6 = ensuresubscribedtoinappmessageeventslambda7.write;
                int i7 = ensuresubscribedtoinappmessageeventslambda7.read;
                if (i6 <= i7) {
                    boolean z = false;
                    while (true) {
                        if (z) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr[i6];
                            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && forwardFocusSearch(focusTargetNode4, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                                return true;
                            }
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr[i6], focusTargetNode2}, getCieXyz.write())).booleanValue()) {
                            z = true;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                }
                if (FocusDirection.m349equalsimpl0(i, FocusDirection.Companion.m357getNextdhqQ8s()) && focusTargetNode.fetchFocusProperties$ui().getCanFocus() && !isRoot(focusTargetNode)) {
                    return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode)).booleanValue();
                }
                return false;
            }
            if (FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s())) {
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(i2)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
                int i8 = ensuresubscribedtoinappmessageeventslambda8.write;
                int i9 = ensuresubscribedtoinappmessageeventslambda8.read;
                if (i8 <= i9) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            FocusTargetNode focusTargetNode5 = (FocusTargetNode) objArr[i9];
                            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode5) && backwardFocusSearch(focusTargetNode5, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                                return true;
                            }
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objArr[i9], focusTargetNode2}, getCieXyz.write())).booleanValue()) {
                            z2 = true;
                        }
                        if (i9 == i8) {
                            break;
                        }
                        i9--;
                    }
                }
                if (FocusDirection.m349equalsimpl0(i, FocusDirection.Companion.m357getNextdhqQ8s())) {
                }
                return false;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This function should only be used within a parent that has focus.");
        return false;
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m415generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (m417searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
            return true;
        }
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m344searchBeyondBoundsOMvw8(focusTargetNode, i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode()) {
                    return Boolean.TRUE;
                }
                boolean zM417searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m417searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                if (zM417searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return Boolean.valueOf(zM417searchChildren4C6V_qg);
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
