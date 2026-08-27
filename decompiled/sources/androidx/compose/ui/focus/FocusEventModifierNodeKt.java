package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class FocusEventModifierNodeKt {
    public static final FocusState getFocusState(FocusEventModifierNode focusEventModifierNode) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        Modifier.Node node = focusEventModifierNode.getNode();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
        while (true) {
            int i = 0;
            if (node != null) {
                if (node instanceof FocusTargetNode) {
                    FocusStateImpl focusState = ((FocusTargetNode) node).getFocusState();
                    int i2 = WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        return focusState;
                    }
                    if (i2 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
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
                if (!focusEventModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                Modifier.Node child$ui = focusEventModifierNode.getNode().getChild$ui();
                if (child$ui == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, focusEventModifierNode.getNode(), false);
                } else {
                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(child$ui);
                }
                while (true) {
                    int i3 = oncreatevirtualviewtranslationrequests2.read;
                    if (i3 == 0) {
                        return FocusStateImpl.Inactive;
                    }
                    Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests2.write(i3 - 1);
                    if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests2, nodePop, false);
                    } else {
                        while (nodePop != null) {
                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        FocusStateImpl focusState2 = ((FocusTargetNode) nodePop).getFocusState();
                                        int i4 = WhenMappings.$EnumSwitchMapping$0[focusState2.ordinal()];
                                        if (i4 == 1 || i4 == 2 || i4 == 3) {
                                            return focusState2;
                                        }
                                        if (i4 != 4) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return null;
                                        }
                                    } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i5++;
                                                if (i5 == 1) {
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
                                        if (i5 == 1) {
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

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
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

    public static final void invalidateFocusEvent(FocusEventModifierNode focusEventModifierNode) {
        DelegatableNodeKt.requireOwner(focusEventModifierNode).getFocusOwner().scheduleInvalidation(focusEventModifierNode);
    }
}
