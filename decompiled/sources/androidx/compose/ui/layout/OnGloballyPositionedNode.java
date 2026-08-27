package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final void setCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public OnGloballyPositionedNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
