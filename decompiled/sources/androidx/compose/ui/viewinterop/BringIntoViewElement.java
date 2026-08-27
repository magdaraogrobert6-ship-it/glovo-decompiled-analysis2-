package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewElement extends ModifierNodeElement<BringIntoViewNode> {
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequesterReady;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnRequesterReady() {
        return this.onRequesterReady;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewNode create() {
        return new BringIntoViewNode(this.onRequesterReady);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewElement) && this.onRequesterReady == ((BringIntoViewElement) obj).onRequesterReady;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onRequesterReady.hashCode();
    }

    public BringIntoViewElement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onRequesterReady = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requestRectangleBringIntoViewBridge");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewNode bringIntoViewNode) {
        bringIntoViewNode.update(this.onRequesterReady);
    }
}
