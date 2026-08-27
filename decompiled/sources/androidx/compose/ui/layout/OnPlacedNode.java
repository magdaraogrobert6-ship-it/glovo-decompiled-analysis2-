package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    public static final int $stable = 8;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final void setCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public OnPlacedNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
