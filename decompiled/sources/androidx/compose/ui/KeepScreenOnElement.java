package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* JADX INFO: loaded from: classes.dex */
final class KeepScreenOnElement extends ModifierNodeElement<KeepScreenOnNode> {
    public static final KeepScreenOnElement INSTANCE = new KeepScreenOnElement();

    private KeepScreenOnElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return -84078893;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(KeepScreenOnNode keepScreenOnNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public KeepScreenOnNode create() {
        return new KeepScreenOnNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("keepScreenOn");
    }

    public String toString() {
        return "KeepScreenOnElement";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof KeepScreenOnElement);
    }
}
