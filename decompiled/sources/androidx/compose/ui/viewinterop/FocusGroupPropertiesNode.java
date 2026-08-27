package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusEnterExitScope;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    private ViewTreeObserver attachedViewTreeObserver;
    private View focusedChild;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onEnter = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
            if (embeddedView.isFocused() || embeddedView.hasFocus()) {
                return;
            }
            if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo345getRequestedFocusDirectiondhqQ8s()), FocusGroupNode_androidKt.getCurrentlyFocusedRect(DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner(), DelegatableNode_androidKt.requireView(this.this$0), embeddedView))) {
                return;
            }
            focusEnterExitScope.cancelFocusChange();
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onExit = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            View viewFindNextFocusFromRect;
            View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
            if (ComposeUiFlags.isViewFocusFixEnabled) {
                if (embeddedView.hasFocus() || embeddedView.isFocused()) {
                    embeddedView.clearFocus();
                    return;
                }
                return;
            }
            if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled || !embeddedView.hasFocus()) {
                return;
            }
            FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner();
            View viewRequireView = DelegatableNode_androidKt.requireView(this.this$0);
            if (!(embeddedView instanceof ViewGroup)) {
                if (viewRequireView.requestFocus()) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("host view did not take focus");
                return;
            }
            Rect currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, viewRequireView, embeddedView);
            Integer numM361toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m361toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo345getRequestedFocusDirectiondhqQ8s());
            int iIntValue = numM361toAndroidFocusDirection3ESFkO8 != null ? numM361toAndroidFocusDirection3ESFkO8.intValue() : 130;
            FocusFinder focusFinder = FocusFinder.getInstance();
            FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
            if (focusGroupPropertiesNode.getFocusedChild() != null) {
                viewRequireView.getClass();
                viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewRequireView, focusGroupPropertiesNode.getFocusedChild(), iIntValue);
            } else {
                viewRequireView.getClass();
                viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewRequireView, currentlyFocusedRect, iIntValue);
            }
            if (viewFindNextFocusFromRect != null && FocusGroupNode_androidKt.containsDescendant(embeddedView, viewFindNextFocusFromRect)) {
                viewFindNextFocusFromRect.requestFocus(iIntValue, currentlyFocusedRect);
                focusEnterExitScope.cancelFocusChange();
            } else {
                if (viewRequireView.requestFocus()) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("host view did not take focus");
            }
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return createFromParcel.INSTANCE;
        }
    };

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnEnter() {
        return this.onEnter;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnExit() {
        return this.onExit;
    }

    public final void setAttachedViewTreeObserver(ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        boolean z;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
            boolean z2 = false;
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    Modifier.Node nodePop = child$ui;
                    onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (DelegatableNodeKt.requireLayoutNode(this).getOwner$ui() == null) {
            return;
        }
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner ownerRequireOwner = DelegatableNodeKt.requireOwner(this);
        boolean z = (view == null || view.equals(ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, view2)) ? false : true;
        if (z && z2) {
            this.focusedChild = view2;
            return;
        }
        if (z2) {
            this.focusedChild = view2;
            FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
            if (focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
                return;
            }
            FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
            return;
        }
        if (!z) {
            this.focusedChild = null;
            return;
        }
        this.focusedChild = null;
        if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
            focusOwner.mo366clearFocusI7lrPNg(false, true, false, FocusDirection.Companion.m355getExitdhqQ8s());
        }
    }
}
