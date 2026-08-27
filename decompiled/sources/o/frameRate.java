package o;

import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;

/* JADX INFO: loaded from: classes.dex */
public final class frameRate extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode {
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;
    public final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode serializer = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new LazyLayoutPagerKt$dragDirectionDetector$1(4, this)));
    public boolean write;

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final long mo1974getTouchBoundsExpansionRZrCHBk() {
        return androidx.compose.foundation.text.handwriting.StylusHandwritingKt.RemoteActionCompatParcelizer.m2429roundToTouchBoundsExpansionTW6G1oQ(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.serializer.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, long j) {
        this.serializer.mo11onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    public frameRate(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        this.write = focusState.isFocused();
    }
}
