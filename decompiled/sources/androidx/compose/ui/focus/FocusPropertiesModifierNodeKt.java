package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesModifierNodeKt {
    public static final void invalidateFocusProperties(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusPropertiesModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = focusPropertiesModifierNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusPropertiesModifierNode.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
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
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
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
}
