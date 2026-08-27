package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {
    private final FocusRequester focusRequester;

    public final FocusRequester component1() {
        return this.focusRequester;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final FocusRequesterElement copy(FocusRequester focusRequester) {
        return new FocusRequesterElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRequesterNode create() {
        return new FocusRequesterNode(this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.focusRequester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRequester");
        inspectorInfo.getProperties().set("focusRequester", this.focusRequester);
    }

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ FocusRequesterElement copy$default(FocusRequesterElement focusRequesterElement, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = focusRequesterElement.focusRequester;
        }
        return focusRequesterElement.copy(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusRequesterElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.focusRequester, ((FocusRequesterElement) obj).focusRequester}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRequesterNode focusRequesterNode) {
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui().RemoteActionCompatParcelizer(focusRequesterNode);
        focusRequesterNode.setFocusRequester(this.focusRequester);
        focusRequesterNode.getFocusRequester().getFocusRequesterNodes$ui().IconCompatParcelizer(focusRequesterNode);
    }
}
