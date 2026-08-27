package androidx.compose.ui.focus;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTransactionsKt {
    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m400invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m400invoke() {
                focusTargetNode.fetchFocusProperties$ui();
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
        }
        return true;
    }

    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests;
        NodeChain nodes$ui;
        NodeChain nodes$ui2;
        FocusStateImpl focusStateImpl;
        String str;
        boolean z;
        NodeChain nodes$ui3;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui(focusState, focusState);
            return true;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if ((activeFocusTargetNode == null || activeFocusTargetNode.isInteropViewHost()) && !focusTargetNode.isInteropViewHost() && !m399requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
                return false;
            }
        } else if (activeFocusTargetNode == null && !m399requestOwnerFocusEtdf9zw$default(focusTargetNode, null, null, 3, null)) {
            return false;
        }
        String str2 = "visitAncestors called on an unattached node";
        if (activeFocusTargetNode != null) {
            oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new FocusTargetNode[16]);
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!activeFocusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = activeFocusTargetNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests3 = oncreatevirtualviewtranslationrequests2;
                            Modifier.Node nodePop = parent$ui;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer((FocusTargetNode) nodePop);
                                } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests3);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                        oncreatevirtualviewtranslationrequests2 = null;
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui3 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui3.getTail$ui();
                oncreatevirtualviewtranslationrequests2 = null;
            }
        } else {
            oncreatevirtualviewtranslationrequests = null;
        }
        Object[] objArr = new FocusTargetNode[16];
        Object[] objArr2 = new FocusTargetNode[16];
        int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui2 = focusTargetNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode2) & iM2551constructorimpl2) != 0) {
                while (parent$ui2 != null) {
                    if ((parent$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                        Modifier.Node nodePop2 = parent$ui2;
                        boolean z3 = z2;
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests4 = null;
                        while (nodePop2 != null) {
                            if (nodePop2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop2;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{oncreatevirtualviewtranslationrequests != null ? Boolean.valueOf(oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer(focusTargetNode2)) : null, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = focusTargetNode2;
                                    i2 = i4;
                                } else {
                                    focusState = focusState;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = focusTargetNode2;
                                    i3 = i5;
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    z3 = false;
                                }
                                z = false;
                            } else {
                                focusState = focusState;
                                str2 = str2;
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                z = true;
                            }
                            if (z && (nodePop2.getKindSet$ui() & iM2551constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                int i6 = 0;
                                for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                    if ((delegate$ui2.getKindSet$ui() & iM2551constructorimpl2) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            nodePop2 = delegate$ui2;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests4 == null) {
                                                oncreatevirtualviewtranslationrequests4 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (nodePop2 != null) {
                                                oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(nodePop2);
                                                nodePop2 = null;
                                            }
                                            oncreatevirtualviewtranslationrequests4.IconCompatParcelizer(delegate$ui2);
                                        }
                                    }
                                }
                                if (i6 != 1) {
                                    nodePop2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests4);
                                }
                            } else {
                                oncreatevirtualviewtranslationrequests4 = oncreatevirtualviewtranslationrequests4;
                                nodePop2 = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests4);
                            }
                        }
                        focusStateImpl = focusState;
                        str = str2;
                        z2 = z3;
                    } else {
                        focusStateImpl = focusState;
                        str = str2;
                    }
                    parent$ui2 = parent$ui2.getParent$ui();
                    str2 = str;
                    focusState = focusStateImpl;
                }
            }
            FocusStateImpl focusStateImpl2 = focusState;
            String str3 = str2;
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
            parent$ui2 = (layoutNodeRequireLayoutNode2 == null || (nodes$ui2 = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            str2 = str3;
            focusState = focusStateImpl2;
        }
        FocusStateImpl focusStateImpl3 = focusState;
        String str4 = str2;
        if (z2 && activeFocusTargetNode != null && !clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
            return false;
        }
        grantFocus(focusTargetNode);
        if (ComposeUiFlags.isOptimizedFocusEventDispatchEnabled && z2 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
        if (oncreatevirtualviewtranslationrequests != null) {
            int i7 = oncreatevirtualviewtranslationrequests.read - 1;
            Object[] objArr5 = oncreatevirtualviewtranslationrequests.write;
            if (i7 < objArr5.length) {
                while (i7 >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr5[i7];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    i7--;
                }
            }
        }
        int i8 = i3 - 1;
        if (i8 < objArr2.length) {
            while (i8 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[i8];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.dispatchFocusCallbacks$ui(focusTargetNode4 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                i8--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui(focusStateImpl3, FocusStateImpl.Active);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (ComposeUiFlags.isFocusRestorationEnabled) {
            FocusTargetNode focusTargetNode5 = (FocusTargetNode) (i2 == 0 ? null : objArr[i2 - 1]);
            int iM2551constructorimpl3 = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusTargetNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException(str4);
            }
            Modifier.Node parent$ui3 = focusTargetNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode3 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop10: while (layoutNodeRequireLayoutNode3 != null) {
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode3) & iM2551constructorimpl3) != 0) {
                    while (parent$ui3 != null) {
                        if ((parent$ui3.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                            Modifier.Node nodePop3 = parent$ui3;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests5 = null;
                            while (nodePop3 != null) {
                                if (nodePop3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode6 = (FocusTargetNode) nodePop3;
                                    FocusRestorerKt.saveFocusedChild(focusTargetNode6);
                                    if (focusTargetNode6 == focusTargetNode5) {
                                        break loop10;
                                    }
                                } else if ((nodePop3.getKindSet$ui() & iM2551constructorimpl3) != 0 && (nodePop3 instanceof DelegatingNode)) {
                                    Modifier.Node node = nodePop3;
                                    int i9 = 0;
                                    for (Modifier.Node delegate$ui3 = ((DelegatingNode) nodePop3).getDelegate$ui(); delegate$ui3 != null; delegate$ui3 = delegate$ui3.getChild$ui()) {
                                        if ((delegate$ui3.getKindSet$ui() & iM2551constructorimpl3) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                node = delegate$ui3;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests5 == null) {
                                                    oncreatevirtualviewtranslationrequests5 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (node != null) {
                                                    oncreatevirtualviewtranslationrequests5.IconCompatParcelizer(node);
                                                    node = null;
                                                }
                                                oncreatevirtualviewtranslationrequests5.IconCompatParcelizer(delegate$ui3);
                                            }
                                        }
                                    }
                                    nodePop3 = i9 == 1 ? node : DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests5);
                                }
                            }
                        }
                        parent$ui3 = parent$ui3.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode3 = layoutNodeRequireLayoutNode3.getParent$ui();
                parent$ui3 = (layoutNodeRequireLayoutNode3 == null || (nodes$ui = layoutNodeRequireLayoutNode3.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.requireLayoutNode(focusTargetNode).getInteropView() != null) {
            return true;
        }
        m398requestOwnerFocusEtdf9zw(focusTargetNode, FocusDirection.m346boximpl(FocusDirection.Companion.m357getNextdhqQ8s()), null);
        return true;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Captured);
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return false;
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            if (!ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            }
            return true;
        }
        if (i == 2) {
            if (z && !ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        if (!clearChildFocus(focusTargetNode, z, z2)) {
            return false;
        }
        if (z2) {
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        }
        return true;
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                }
                return false;
            }
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
            focusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Captured, FocusStateImpl.Active);
        }
        return true;
    }

    /* JADX INFO: renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m394performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                CustomDestinationResult customDestinationResultM394performCustomClearFocusMxy_nc0 = m394performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
                CustomDestinationResult customDestinationResult = customDestinationResultM394performCustomClearFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM394performCustomClearFocusMxy_nc0 : null;
                return customDestinationResult == null ? m396performCustomExitMxy_nc0(focusTargetNode, i) : customDestinationResult;
            }
            if (i2 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m397performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        Modifier.Node nodePop;
        NodeChain nodes$ui;
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return m394performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
        }
        if (i2 != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
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
                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                        nodePop = parent$ui;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
            return CustomDestinationResult.None;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.getFocusState().ordinal()];
        if (i4 == 1) {
            return m395performCustomEnterMxy_nc0(focusTargetNode2, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m397performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
        }
        if (i4 != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        CustomDestinationResult customDestinationResultM397performCustomRequestFocusMxy_nc0 = m397performCustomRequestFocusMxy_nc0(focusTargetNode2, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM397performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM397performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? m395performCustomEnterMxy_nc0(focusTargetNode2, i) : customDestinationResult;
    }

    /* JADX INFO: renamed from: requestOwnerFocus-Etdf9zw, reason: not valid java name */
    private static final boolean m398requestOwnerFocusEtdf9zw(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo371requestOwnerFocus7o62pno(focusDirection, rect);
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    /* JADX INFO: renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m395performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (cancel == companion.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m380requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui = companion2.getRedirect$ui();
                    if (redirect$ui == companion2.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == companion2.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m380requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m396performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.isCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (cancel == companion.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m380requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    FocusRequester.Companion companion2 = FocusRequester.Companion;
                    FocusRequester redirect$ui = companion2.getRedirect$ui();
                    if (redirect$ui == companion2.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == companion2.getRedirect$ui()) {
                        return CustomDestinationResult.Redirected;
                    }
                    return FocusRequester.m380requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActiveParent with no focused child");
        return null;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    /* JADX INFO: renamed from: requestOwnerFocus-Etdf9zw$default, reason: not valid java name */
    public static /* synthetic */ boolean m399requestOwnerFocusEtdf9zw$default(FocusTargetNode focusTargetNode, FocusDirection focusDirection, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            focusDirection = null;
        }
        if ((i & 2) != 0) {
            rect = null;
        }
        return m398requestOwnerFocusEtdf9zw(focusTargetNode, focusDirection, rect);
    }
}
