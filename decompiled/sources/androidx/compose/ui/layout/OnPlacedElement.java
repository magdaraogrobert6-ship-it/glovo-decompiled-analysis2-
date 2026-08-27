package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onPlaced;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OnPlacedNode create() {
        return new OnPlacedNode(this.onPlaced);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    public OnPlacedElement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onPlaced = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && this.onPlaced == ((OnPlacedElement) obj).onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OnPlacedNode onPlacedNode) {
        onPlacedNode.setCallback(this.onPlaced);
    }
}
