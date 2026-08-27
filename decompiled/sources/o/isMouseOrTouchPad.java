package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isMouseOrTouchPad implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.gestures.ScrollableNode write;

    public /* synthetic */ isMouseOrTouchPad(androidx.compose.foundation.gestures.ScrollableNode scrollableNode, int i) {
        this.IconCompatParcelizer = i;
        this.write = scrollableNode;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        androidx.compose.foundation.gestures.ScrollableNode scrollableNode = this.write;
        return i != 0 ? androidx.compose.ui.focus.FocusTargetModifierNodeKt.getFocusedRect(scrollableNode.read) : Boolean.valueOf(scrollableNode.isAttached());
    }
}
