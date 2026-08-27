package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {
    private final FocusRequester fallback;

    public final FocusRequester component1() {
        return this.fallback;
    }

    public final FocusRequester getFallback() {
        return this.fallback;
    }

    public final FocusRestorerElement copy(FocusRequester focusRequester) {
        return new FocusRestorerElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.fallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.fallback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("fallback", this.fallback);
    }

    public FocusRestorerElement(FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            focusRequester = focusRestorerElement.fallback;
        }
        return focusRestorerElement.copy(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusRestorerElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fallback, ((FocusRestorerElement) obj).fallback}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "FocusRestorerElement(fallback=" + this.fallback + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setFallback(this.fallback);
    }
}
