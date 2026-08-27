package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TraversableNodeKt {
    public static final <T extends TraversableNode> T findNearestAncestor(T t) {
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        boolean z = ComposeUiFlags.isTraversableDelegatesFixEnabled;
        if (!t.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = t.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof TraversableNode) {
                                T t2 = (T) nodePop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t.getTraverseKey(), t2.getTraverseKey()}, getCieXyz.write())).booleanValue() && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, t2)) {
                                    return t2;
                                }
                                if (z) {
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final <T extends TraversableNode> void traverseAncestors(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!t.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = t.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? Pop = parent$ui;
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t.getTraverseKey(), traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue() && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, traversableNode)) {
                                    if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode)).booleanValue()) {
                                        return;
                                    }
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final <T extends TraversableNode> void traverseChildren(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!t.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = t.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, t.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            ?? Pop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
            if ((Pop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, Pop, false);
            } else {
                while (Pop != 0) {
                    if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? oncreatevirtualviewtranslationrequests2 = 0;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t.getTraverseKey(), traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue() && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, traversableNode)) {
                                    if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode)).booleanValue()) {
                                        return;
                                    }
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i2 = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests2 == 0) {
                                                oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                        }
                        break;
                    }
                    Pop = Pop.getChild$ui();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r19v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final <T extends TraversableNode> void traverseDescendants(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!t.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = t.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, t.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
            if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                Modifier.Node child$ui2 = node;
                while (true) {
                    if (child$ui2 != null && child$ui2.isAttached()) {
                        if ((child$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = child$ui2;
                            ?? oncreatevirtualviewtranslationrequests2 = 0;
                            while (Pop != 0) {
                                if (Pop instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) Pop;
                                    TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t.getTraverseKey(), traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue() && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, traversableNode)) ? (TraversableNode.Companion.TraverseDescendantsAction) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                    if (traverseDescendantsAction != TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i2 = 0;
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == 0) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        child$ui2 = child$ui2.getChild$ui();
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, false);
        }
    }

    public static final TraversableNode findNearestAncestor(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        boolean z = ComposeUiFlags.isTraversableDelegatesFixEnabled;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        while (nodePop != null) {
                            if (nodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) nodePop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue()) {
                                    return traversableNode;
                                }
                                if (z) {
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
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
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeChain nodes$ui;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? Pop = parent$ui;
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue() && !((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode)).booleanValue()) {
                                    return;
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void traverseChildren(DelegatableNode delegatableNode, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            ?? Pop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
            if ((Pop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, Pop, false);
            } else {
                while (Pop != 0) {
                    if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? oncreatevirtualviewtranslationrequests2 = 0;
                        while (Pop != 0) {
                            if (Pop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) Pop;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue() && !((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode)).booleanValue()) {
                                    return;
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i2 = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests2 == 0) {
                                                oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                        }
                        break;
                    }
                    Pop = Pop.getChild$ui();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r20v0, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.ColorFilter);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, delegatableNode.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
            if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                Modifier.Node child$ui2 = node;
                while (true) {
                    if (child$ui2 != null && child$ui2.isAttached()) {
                        if ((child$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = child$ui2;
                            ?? oncreatevirtualviewtranslationrequests2 = 0;
                            while (Pop != 0) {
                                if (Pop instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) Pop;
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, traversableNode.getTraverseKey()}, getCieXyz.write())).booleanValue()) {
                                        traverseDescendantsAction = (TraversableNode.Companion.TraverseDescendantsAction) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(traversableNode);
                                    } else {
                                        traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                    }
                                    if (traverseDescendantsAction != TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                        if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i2 = 0;
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == 0) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        child$ui2 = child$ui2.getChild$ui();
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node, false);
        }
    }
}
