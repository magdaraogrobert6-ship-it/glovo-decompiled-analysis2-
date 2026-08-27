package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetPropertiesElement extends ModifierNodeElement<FocusTargetPropertiesNode> {
    public static final FocusTargetPropertiesElement INSTANCE = new FocusTargetPropertiesElement();

    private FocusTargetPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return -659549572;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(FocusTargetPropertiesNode focusTargetPropertiesNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusTargetPropertiesNode create() {
        return new FocusTargetPropertiesNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FocusTargetProperties");
    }
}
