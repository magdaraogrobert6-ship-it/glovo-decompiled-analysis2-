package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[RETURN] */
    private static final float beamBeats_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                    return 0.0f;
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f < 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                    return 0.0f;
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f = bottom - bottom2;
            if (f < 1.0f) {
                return 1.0f;
            }
            return f;
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f = top - top2;
        if (f < 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, delegatableNode.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests2.read;
            if (i == 0) {
                return;
            }
            Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests2.write(i - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, nodePop, false);
            } else {
                while (nodePop != null) {
                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                                if (focusTargetNode.isAttached() && !DelegatableNodeKt.requireLayoutNode(focusTargetNode).isDeactivated()) {
                                    if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, oncreatevirtualviewtranslationrequests);
                                    }
                                }
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests3 == null) {
                                                oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (nodePop != null) {
                                                oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                nodePop = null;
                                            }
                                            oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
                        }
                        break;
                    }
                    nodePop = nodePop.getChild$ui();
                }
            }
        }
    }

    /* JADX INFO: renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m422findBestCandidate4WY_MpI(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, Rect rect, int i) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        FocusTargetNode focusTargetNode = null;
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            rectTranslate = rect.translate((rect.getRight() - rect.getLeft()) + 1.0f, 0.0f);
        } else if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            rectTranslate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1.0f), 0.0f);
        } else if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1.0f);
        } else {
            if (!FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                return null;
            }
            rectTranslate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1.0f));
        }
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i2 = oncreatevirtualviewtranslationrequests.read;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                if (m425isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i)) {
                    focusTargetNode = focusTargetNode2;
                    rectTranslate = rectFocusRect;
                }
            }
        }
        return focusTargetNode;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[RETURN] */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s())) {
            if (FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                    return 0.0f;
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f = top - bottom;
            if (f < 0.0f) {
                return 0.0f;
            }
            return f;
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f = top2 - bottom2;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        float bottom;
        float top;
        float bottom2;
        float top2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s())) {
            bottom = ((rect2.getBottom() - rect2.getTop()) / 2.0f) + rect2.getTop();
            top = rect.getTop();
            bottom2 = rect.getBottom();
            top2 = rect.getTop();
        } else {
            if (!FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s()) && !FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                return 0.0f;
            }
            bottom = ((rect2.getRight() - rect2.getLeft()) / 2.0f) + rect2.getLeft();
            top = rect.getLeft();
            bottom2 = rect.getRight();
            top2 = rect.getLeft();
        }
        return bottom - (((bottom2 - top2) / 2.0f) + top);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
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

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Searching for active node in inactive hierarchy");
            return null;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return focusTargetNodeFindActiveFocusNode;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
        return null;
    }

    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m423findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Rect rectBottomRight;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new FocusTargetNode[16]);
        collectAccessibleChildren(focusTargetNode, oncreatevirtualviewtranslationrequests);
        int i2 = oncreatevirtualviewtranslationrequests.read;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : oncreatevirtualviewtranslationrequests.write[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m349equalsimpl0(i, companion.m354getEnterdhqQ8s())) {
                i = companion.m359getRightdhqQ8s();
            }
            if (!FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s()) && !FocusDirection.m349equalsimpl0(i, companion.m353getDowndhqQ8s())) {
                if (!FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s()) && !FocusDirection.m349equalsimpl0(i, companion.m360getUpdhqQ8s())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(InvalidFocusDirection);
                    return false;
                }
                rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
            } else {
                rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
            }
            FocusTargetNode focusTargetNodeM422findBestCandidate4WY_MpI = m422findBestCandidate4WY_MpI(oncreatevirtualviewtranslationrequests, rectBottomRight, i);
            if (focusTargetNodeM422findBestCandidate4WY_MpI != null) {
                return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNodeM422findBestCandidate4WY_MpI)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m426searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        FocusTargetNode focusTargetNodeM422findBestCandidate4WY_MpI;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new FocusTargetNode[16]);
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusTargetNode.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests2.read;
            if (i2 == 0) {
                break;
            }
            Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests2.write(i2 - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, nodePop, false);
            } else {
                while (nodePop != null) {
                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isAttached()) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(focusTargetNode2);
                                }
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests3 == null) {
                                                oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (nodePop != null) {
                                                oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                nodePop = null;
                                            }
                                            oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
                        }
                        break;
                    }
                    nodePop = nodePop.getChild$ui();
                }
            }
        }
        while (oncreatevirtualviewtranslationrequests.read != 0 && (focusTargetNodeM422findBestCandidate4WY_MpI = m422findBestCandidate4WY_MpI(oncreatevirtualviewtranslationrequests, rect, i)) != null) {
            if (focusTargetNodeM422findBestCandidate4WY_MpI.fetchFocusProperties$ui().getCanFocus()) {
                return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNodeM422findBestCandidate4WY_MpI)).booleanValue();
            }
            if (m424generateAndSearchChildren4C6V_qg(focusTargetNodeM422findBestCandidate4WY_MpI, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                return true;
            }
            oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer(focusTargetNodeM422findBestCandidate4WY_MpI);
        }
        return false;
    }

    /* JADX INFO: renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m427twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i, Rect rect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(m423findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
            }
            if (i2 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
                return (Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(focusTargetNode);
            }
            return rect == null ? Boolean.valueOf(m423findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) : Boolean.valueOf(m426searchChildren4C6V_qg(focusTargetNode, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
            return null;
        }
        int i3 = iArr[activeChild.getFocusState().ordinal()];
        if (i3 == 1) {
            Boolean boolM427twoDimensionalFocusSearchsMXa3k8 = m427twoDimensionalFocusSearchsMXa3k8(activeChild, i, rect, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{boolM427twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE}, getCieXyz.write())).booleanValue()) {
                return boolM427twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m424generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }
        if (i3 == 2 || i3 == 3) {
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeChild);
            }
            return Boolean.valueOf(m424generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        }
        if (i3 != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(NoActiveChild);
        return null;
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long jIsBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect);
        long jIsBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect);
        return (jIsBetterCandidate_I7lrPNg$minorAxisDistance * jIsBetterCandidate_I7lrPNg$minorAxisDistance) + (13 * jIsBetterCandidate_I7lrPNg$majorAxisDistance * jIsBetterCandidate_I7lrPNg$majorAxisDistance);
    }

    /* JADX INFO: renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m421beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m349equalsimpl0(i, companion.m356getLeftdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m359getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance(rect2, i, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect);
    }

    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m424generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final Rect rect, final int i, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (m426searchChildren4C6V_qg(focusTargetNode, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
            return true;
        }
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m344searchBeyondBoundsOMvw8(focusTargetNode, i, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode()) {
                    return Boolean.TRUE;
                }
                boolean zM426searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m426searchChildren4C6V_qg(focusTargetNode, rect, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                if (zM426searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return Boolean.valueOf(zM426searchChildren4C6V_qg);
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m425isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) && !m421beamBeatsI7lrPNg(rect3, rect, rect2, i)) {
            return !m421beamBeatsI7lrPNg(rect3, rect2, rect, i) && isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2);
        }
        return true;
    }
}
