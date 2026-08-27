package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DelegatableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m2551constructorimpl(2) & node.getKindSet$ui()) == 0) {
            return null;
        }
        if (node instanceof LayoutModifierNode) {
            return (LayoutModifierNode) node;
        }
        if (!(node instanceof DelegatingNode)) {
            return null;
        }
        Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
        while (delegate$ui != 0) {
            if (delegate$ui instanceof LayoutModifierNode) {
                return (LayoutModifierNode) delegate$ui;
            }
            delegate$ui = (!(delegate$ui instanceof DelegatingNode) || (NodeKind.m2551constructorimpl(2) & delegate$ui.getKindSet$ui()) == 0) ? delegate$ui.getChild$ui() : ((DelegatingNode) delegate$ui).getDelegate$ui();
        }
        return null;
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final BeyondBoundsLayout findNearestBeyondBoundsLayoutAncestor(DelegatableNode delegatableNode) {
        NodeChain nodes$ui;
        ?? parent$ui;
        ?? r6;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(8388608) | NodeKind.m2551constructorimpl(32);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui2 = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != 0) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        if ((NodeKind.m2551constructorimpl(8388608) & parent$ui.getKindSet$ui()) != 0) {
                            if (!(parent$ui instanceof BeyondBoundsLayoutProviderModifierNode)) {
                                if (parent$ui instanceof DelegatingNode) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) parent$ui).getDelegate$ui();
                                    parent$ui = 0;
                                    while (delegate$ui != null) {
                                        if (delegate$ui instanceof BeyondBoundsLayoutProviderModifierNode) {
                                            parent$ui = delegate$ui;
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        parent$ui = parent$ui;
                                    }
                                } else {
                                    parent$ui = 0;
                                }
                            }
                            BeyondBoundsLayoutProviderModifierNode beyondBoundsLayoutProviderModifierNode = (BeyondBoundsLayoutProviderModifierNode) parent$ui;
                            if (beyondBoundsLayoutProviderModifierNode != null) {
                                return beyondBoundsLayoutProviderModifierNode.getBeyondBoundsLayout();
                            }
                            return null;
                        }
                        if ((NodeKind.m2551constructorimpl(32) & parent$ui.getKindSet$ui()) == 0) {
                            continue;
                        } else {
                            if (parent$ui instanceof ModifierLocalModifierNode) {
                                r6 = parent$ui;
                            } else if (parent$ui instanceof DelegatingNode) {
                                Modifier.Node delegate$ui2 = ((DelegatingNode) parent$ui).getDelegate$ui();
                                r6 = 0;
                                while (delegate$ui2 != null) {
                                    if (delegate$ui2 instanceof ModifierLocalModifierNode) {
                                        r6 = delegate$ui2;
                                    }
                                    delegate$ui2 = delegate$ui2.getChild$ui();
                                    r6 = r6;
                                }
                            } else {
                                r6 = 0;
                            }
                            ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) r6;
                            if (modifierLocalModifierNode != null && modifierLocalModifierNode.getProvidedValues().contains$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout())) {
                                return (BeyondBoundsLayout) modifierLocalModifierNode.getProvidedValues().get$ui(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
                            }
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            parent$ui = parent$ui2;
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    private static final onCreateVirtualViewTranslationRequests getChildren(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        int i;
        if (oncreatevirtualviewtranslationrequests == null || (i = oncreatevirtualviewtranslationrequests.read) == 0) {
            return null;
        }
        return (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
    }

    /* JADX INFO: renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final <T> void m2386dispatchForKind6rFNWt0(Modifier.Node node, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (node == null) {
            return;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    /* JADX INFO: renamed from: dispatchForKind-Y-YKmho, reason: not valid java name */
    public static final <T> void m2387dispatchForKindYYKmho(Modifier.Node node, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (node == null) {
            return;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, Modifier.Node node, boolean z) {
        onCreateVirtualViewTranslationRequests children = getChildren(requireLayoutNode(node), z);
        int i = children.read - 1;
        Object[] objArr = children.write;
        if (i < objArr.length) {
            while (i >= 0) {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(((LayoutNode) objArr[i]).getNodes$ui().getHead$ui());
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ancestors-6rFNWt0, reason: not valid java name */
    public static final <T> List<T> m2384ancestors6rFNWt0(DelegatableNode delegatableNode, int i, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: renamed from: dispatchOnScrollChanged-Uv8p0NA, reason: not valid java name */
    public static final void m2388dispatchOnScrollChangedUv8p0NA(DelegatableNode delegatableNode, long j) {
        requireOwner(delegatableNode).mo2617dispatchOnScrollChangedk4lQ0M(j);
    }

    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m2389has64DMado(DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui() & i) != 0;
    }

    public static final void invalidateDrawForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateDrawForSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final void invalidateMeasurementForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            requireLayoutNode(delegatableNode).invalidateMeasurementForSubtree();
        }
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        return parent$ui;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final <T> T m2390nearestAncestor64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui();
    }

    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m2391requireCoordinator64DMado(DelegatableNode delegatableNode, int i) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        coordinator$ui.getClass();
        if (coordinator$ui.getTail() != delegatableNode || !NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator$ui;
        }
        NodeCoordinator wrapped$ui = coordinator$ui.getWrapped$ui();
        wrapped$ui.getClass();
        return wrapped$ui;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m2391requireCoordinator64DMado(delegatableNode, NodeKind.m2551constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.getLayoutNode();
        }
        throw c8$$ExternalSyntheticOutline0.m("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui = requireLayoutNode(delegatableNode).getOwner$ui();
        if (owner$ui != null) {
            return owner$ui;
        }
        throw c8$$ExternalSyntheticOutline0.m("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: setOfAncestors-6rFNWt0, reason: not valid java name */
    public static final <T> awaitTouchSlopOrCancellationjO51t88 m2392setOfAncestors6rFNWt0(DelegatableNode delegatableNode, int i, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(node);
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-QFhIj7k, reason: not valid java name */
    public static final <T> void m2394visitAncestorsQFhIj7k(DelegatableNode delegatableNode, int i, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node child$ui2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((child$ui2.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, child$ui2, z);
            } else {
                while (child$ui2 != null) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(child$ui2);
                        break;
                    }
                    child$ui2 = child$ui2.getChild$ui();
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final <T> void m2396visitChildrenYYKmho(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node child$ui2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((child$ui2.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, child$ui2, z);
            } else {
                while (child$ui2 != null) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    child$ui2 = child$ui2.getChild$ui();
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(parent$ui);
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final <T> void m2398visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i) != 0) {
                removeNodeAtDepth.IconCompatParcelizer();
                throw null;
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    /* JADX INFO: renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final <T> void m2399visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final <T> void m2403visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui() & i) != 0) {
                    removeNodeAtDepth.IconCompatParcelizer();
                    throw null;
                }
                node = node.getChild$ui();
            }
        }
    }

    /* JADX INFO: renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final <T> void m2404visitSubtreeYYKmho(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, z);
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                Modifier.Node child$ui2 = node;
                while (true) {
                    if (child$ui2 != null && child$ui2.isAttached()) {
                        if ((child$ui2.getKindSet$ui() & i) != 0 && !((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(child$ui2)).booleanValue()) {
                            break;
                        } else {
                            child$ui2 = child$ui2.getChild$ui();
                        }
                    }
                }
            }
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, z);
        }
    }

    /* JADX INFO: renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final <T> void m2406visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, z);
        }
    }

    /* JADX INFO: renamed from: ancestors-6rFNWt0$default, reason: not valid java name */
    public static List m2385ancestors6rFNWt0$default(DelegatableNode delegatableNode, int i, boolean z, int i2, Object obj) {
        Modifier.Node parent$ui;
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        if (z) {
            parent$ui = delegatableNode.getNode();
        } else {
            parent$ui = delegatableNode.getNode().getParent$ui();
        }
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) == 0) {
                        parent$ui = parent$ui.getParent$ui();
                    } else {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: renamed from: setOfAncestors-6rFNWt0$default, reason: not valid java name */
    public static awaitTouchSlopOrCancellationjO51t88 m2393setOfAncestors6rFNWt0$default(DelegatableNode delegatableNode, int i, boolean z, int i2, Object obj) {
        Modifier.Node parent$ui;
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        if (z) {
            parent$ui = delegatableNode.getNode();
        } else {
            parent$ui = delegatableNode.getNode().getParent$ui();
        }
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) == 0) {
                        parent$ui = parent$ui.getParent$ui();
                    } else {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        Modifier.Node parent$ui;
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        if (z) {
            parent$ui = delegatableNode.getNode();
        } else {
            parent$ui = delegatableNode.getNode().getParent$ui();
        }
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) != 0) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(parent$ui);
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-QFhIj7k$default, reason: not valid java name */
    public static void m2395visitAncestorsQFhIj7k$default(DelegatableNode delegatableNode, int i, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        Modifier.Node parent$ui;
        NodeChain nodes$ui;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        if (z) {
            parent$ui = delegatableNode.getNode();
        } else {
            parent$ui = delegatableNode.getNode().getParent$ui();
        }
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i) == 0) {
                        parent$ui = parent$ui.getParent$ui();
                    } else {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX INFO: renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static void m2397visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i3 = oncreatevirtualviewtranslationrequests.read;
            if (i3 == 0) {
                return;
            }
            Modifier.Node child$ui2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i3 - 1);
            if ((child$ui2.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, child$ui2, z);
            } else {
                while (child$ui2 != null) {
                    if ((child$ui2.getKindSet$ui() & i) == 0) {
                        child$ui2 = child$ui2.getChild$ui();
                    } else {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static void m2402visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (delegatableNode.getNode() == null) {
            if (!delegatableNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
            if (child$ui == null) {
                addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i3 = oncreatevirtualviewtranslationrequests.read;
                if (i3 == 0) {
                    return;
                }
                Modifier.Node child$ui2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i3 - 1);
                if ((child$ui2.getAggregateChildKindSet$ui() & i) == 0) {
                    addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, child$ui2, z);
                } else {
                    while (child$ui2 != null) {
                        if ((child$ui2.getKindSet$ui() & i) == 0) {
                            child$ui2 = child$ui2.getChild$ui();
                        } else {
                            removeNodeAtDepth.IconCompatParcelizer();
                            throw null;
                        }
                    }
                }
            }
        } else {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
    }

    /* JADX INFO: renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static void m2405visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i3 = oncreatevirtualviewtranslationrequests.read;
            if (i3 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i3 - 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, z);
        }
    }

    /* JADX INFO: renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static void m2407visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i3 = oncreatevirtualviewtranslationrequests.read;
            if (i3 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i3 - 1);
            if ((node.getAggregateChildKindSet$ui() & i) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, z);
        }
    }

    /* JADX INFO: renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final <T> void m2400visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i, int i2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeChain nodes$ui;
        Modifier.Node node = delegatableNode.getNode();
        int i3 = i | i2;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & i3) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i3) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & i2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & i) != 0) {
                            removeNodeAtDepth.IconCompatParcelizer();
                            throw null;
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final <T> void m2401visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (delegatableNode.getNode() != null) {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), z);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i2 = oncreatevirtualviewtranslationrequests.read;
            if (i2 == 0) {
                return;
            }
            Modifier.Node child$ui2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i2 - 1);
            if ((child$ui2.getAggregateChildKindSet$ui() & i) == 0) {
                addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, child$ui2, z);
            } else {
                while (child$ui2 != null) {
                    if ((child$ui2.getKindSet$ui() & i) != 0) {
                        removeNodeAtDepth.IconCompatParcelizer();
                        throw null;
                    }
                    child$ui2 = child$ui2.getChild$ui();
                }
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(child$ui);
                }
            }
        }
    }
}
