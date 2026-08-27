package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequesterModifierNodeKt {
    public static final boolean captureFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    if (FocusTransactionsKt.captureFocus((FocusTargetNode) node)) {
                        break;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            } else {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return false;
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
                                        if (FocusTransactionsKt.captureFocus((FocusTargetNode) nodePop)) {
                                            break;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui2;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui2);
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
            }
        }
        return true;
    }

    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    if (FocusTransactionsKt.freeFocus((FocusTargetNode) node)) {
                        break;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            } else {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return false;
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
                                        if (FocusTransactionsKt.freeFocus((FocusTargetNode) nodePop)) {
                                            break;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui2;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui2);
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
            }
        }
        return true;
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    PinnableContainer.PinnedHandle pinnedHandlePinFocusedChild = FocusRestorerKt.pinFocusedChild((FocusTargetNode) node);
                    if (pinnedHandlePinFocusedChild != null) {
                        return pinnedHandlePinFocusedChild;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            } else {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return null;
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
                                        PinnableContainer.PinnedHandle pinnedHandlePinFocusedChild2 = FocusRestorerKt.pinFocusedChild((FocusTargetNode) nodePop);
                                        if (pinnedHandlePinFocusedChild2 != null) {
                                            return pinnedHandlePinFocusedChild2;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui2;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui2);
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
            }
        }
    }

    public static final boolean requestFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node == null) {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return false;
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
                                        return FocusTargetModifierNode.m382requestFocus3ESFkO8$default((FocusTargetNode) nodePop, 0, 1, null);
                                    }
                                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
            } else {
                if (node instanceof FocusTargetNode) {
                    return FocusTargetModifierNode.m382requestFocus3ESFkO8$default((FocusTargetNode) node, 0, 1, null);
                }
                if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui2 = ((DelegatingNode) node).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                        if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui2;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui2);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            }
        }
    }

    public static final boolean restoreFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    if (FocusRestorerKt.restoreFocusedChild((FocusTargetNode) node)) {
                        break;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            } else {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return false;
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
                                        if (FocusRestorerKt.restoreFocusedChild((FocusTargetNode) nodePop)) {
                                            break;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui2;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui2);
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
            }
        }
        return true;
    }

    public static final boolean saveFocusedChild(FocusRequesterModifierNode focusRequesterModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusRequesterModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    if (FocusRestorerKt.saveFocusedChild((FocusTargetNode) node)) {
                        break;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == null) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != null) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = null;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            } else {
                if (!focusRequesterModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusRequesterModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i2 = oncreatevirtualviewtranslationrequests2.read;
                    if (i2 == 0) {
                        return false;
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
                                        if (FocusRestorerKt.saveFocusedChild((FocusTargetNode) nodePop)) {
                                            break;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i3 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nodePop = delegate$ui2;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests3 == null) {
                                                        oncreatevirtualviewtranslationrequests3 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests3.IconCompatParcelizer(delegate$ui2);
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
            }
        }
        return true;
    }
}
