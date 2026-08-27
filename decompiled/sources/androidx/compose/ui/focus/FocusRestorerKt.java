package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import o.alpha;
import o.getBlock;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRestorerKt {
    private static final String PrevFocusedChild = "pfc";

    @ExperimentalComposeUiApi
    @onItemDismisslambda0
    public static final Modifier focusRestorer(Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        FocusRequester focusRequester;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null || (focusRequester = (FocusRequester) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()) == null) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static /* synthetic */ Modifier focusRestorer$default(Modifier modifier, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = FocusRequester.Companion.getDefault();
        }
        return focusRestorer(modifier, focusRequester);
    }

    public static final boolean saveFocusedChild(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState().getHasFocus()) {
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
                                    if (focusTargetNode2.getFocusState().getHasFocus()) {
                                        final int compositeKeyHash = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                        focusTargetNode.setPreviouslyFocusedChildHash(Integer.valueOf(compositeKeyHash));
                                        alpha alphaVar = (alpha) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, getBlock.read);
                                        if (alphaVar != null) {
                                            alphaVar.registerProvider(PrevFocusedChild + DelegatableNodeKt.requireLayoutNode(focusTargetNode).getCompositeKeyHash(), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                                public final Object invoke() {
                                                    return Integer.valueOf(compositeKeyHash);
                                                }
                                            });
                                        }
                                        return true;
                                    }
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
        return false;
    }

    public static final PinnableContainer.PinnedHandle pinFocusedChild(FocusTargetNode focusTargetNode) {
        PinnableContainer pinnableContainer;
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode == null || (pinnableContainer = (PinnableContainer) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNodeFindActiveFocusNode, PinnableContainerKt.getLocalPinnableContainer())) == null) {
            return null;
        }
        return pinnableContainer.pin();
    }

    public static final boolean restoreFocusedChild(FocusTargetNode focusTargetNode) {
        alpha alphaVar;
        if (focusTargetNode.getPreviouslyFocusedChildHash() == null && (alphaVar = (alpha) CompositionLocalConsumerModifierNodeKt.currentValueOf(focusTargetNode, getBlock.read)) != null) {
            Object objConsumeRestored = alphaVar.consumeRestored(PrevFocusedChild + DelegatableNodeKt.requireLayoutNode(focusTargetNode).getCompositeKeyHash());
            if (objConsumeRestored != null) {
                focusTargetNode.setPreviouslyFocusedChildHash((Integer) objConsumeRestored);
            }
        }
        if (focusTargetNode.getPreviouslyFocusedChildHash() != null) {
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
            loop0: while (true) {
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
                                    if (ComposeUiFlags.isFocusRestorationEnabled) {
                                        if (focusTargetNode2.isAttached()) {
                                            int compositeKeyHash = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                            Integer previouslyFocusedChildHash = focusTargetNode.getPreviouslyFocusedChildHash();
                                            if (previouslyFocusedChildHash != null && compositeKeyHash == previouslyFocusedChildHash.intValue()) {
                                                return FocusTargetModifierNode.m382requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null);
                                            }
                                        }
                                    } else if (focusTargetNode2.isAttached()) {
                                        int compositeKeyHash2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getCompositeKeyHash();
                                        Integer previouslyFocusedChildHash2 = focusTargetNode.getPreviouslyFocusedChildHash();
                                        if (previouslyFocusedChildHash2 != null && compositeKeyHash2 == previouslyFocusedChildHash2.intValue()) {
                                            if (restoreFocusedChild(focusTargetNode2) || (focusTargetNode2.fetchFocusProperties$ui().getCanFocus() && FocusTargetModifierNode.m382requestFocus3ESFkO8$default(focusTargetNode2, 0, 1, null))) {
                                                return true;
                                            }
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
        return false;
    }

    public static final Modifier focusRestorer(Modifier modifier, FocusRequester focusRequester) {
        return modifier.then(new FocusRestorerElement(focusRequester));
    }
}
