package androidx.compose.ui.viewinterop;

import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetInteropNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode {
    private final FocusTargetNode focusTargetNode = (FocusTargetNode) delegate(new FocusTargetNode(0, true, new FocusTargetInteropNode$focusTargetNode$1(this), null, 9, null));
    private PinnableContainer.PinnedHandle pinnedHandle;

    private final PinnableContainer retrievePinnableContainer() {
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        ObserverModifierNodeKt.observeReads(this, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.viewinterop.FocusTargetInteropNode.retrievePinnableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3932invoke() {
                createinappmessageeventsubscriber.IconCompatParcelizer = CompositionLocalConsumerModifierNodeKt.currentValueOf(this, PinnableContainerKt.getLocalPinnableContainer());
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3932invoke();
                return createFromParcel.INSTANCE;
            }
        });
        return (PinnableContainer) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
        if (this.focusTargetNode.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState, FocusState focusState2) {
        boolean zIsFocused;
        if (isAttached() && (zIsFocused = focusState2.isFocused()) != focusState.isFocused()) {
            if (zIsFocused) {
                PinnableContainer pinnableContainerRetrievePinnableContainer = retrievePinnableContainer();
                this.pinnedHandle = pinnableContainerRetrievePinnableContainer != null ? pinnableContainerRetrievePinnableContainer.pin() : null;
            } else {
                PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                this.pinnedHandle = null;
            }
        }
    }
}
