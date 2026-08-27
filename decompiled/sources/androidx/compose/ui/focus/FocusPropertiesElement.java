package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesNode> {
    private final FocusPropertiesScope scope;

    public final FocusPropertiesScope component1() {
        return this.scope;
    }

    public final FocusPropertiesScope getScope() {
        return this.scope;
    }

    public final FocusPropertiesElement copy(FocusPropertiesScope focusPropertiesScope) {
        return new FocusPropertiesElement(focusPropertiesScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusPropertiesNode create() {
        return new FocusPropertiesNode(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }

    public FocusPropertiesElement(FocusPropertiesScope focusPropertiesScope) {
        this.scope = focusPropertiesScope;
    }

    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, FocusPropertiesScope focusPropertiesScope, int i, Object obj) {
        if ((i & 1) != 0) {
            focusPropertiesScope = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(focusPropertiesScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusPropertiesElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scope, ((FocusPropertiesElement) obj).scope}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusPropertiesNode focusPropertiesNode) {
        focusPropertiesNode.setFocusPropertiesScope(this.scope);
    }
}
