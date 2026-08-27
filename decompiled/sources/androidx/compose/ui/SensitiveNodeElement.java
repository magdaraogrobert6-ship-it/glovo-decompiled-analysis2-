package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    private final boolean isContentSensitive;

    public final boolean component1() {
        return this.isContentSensitive;
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public final SensitiveNodeElement copy(boolean z) {
        return new SensitiveNodeElement(z);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SensitiveContentNode create() {
        return new SensitiveContentNode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.isContentSensitive);
    }

    public SensitiveNodeElement(boolean z) {
        this.isContentSensitive = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", Boolean.valueOf(this.isContentSensitive));
    }

    public static /* synthetic */ SensitiveNodeElement copy$default(SensitiveNodeElement sensitiveNodeElement, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sensitiveNodeElement.isContentSensitive;
        }
        return sensitiveNodeElement.copy(z);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.isContentSensitive == ((SensitiveNodeElement) obj).isContentSensitive;
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("SensitiveNodeElement(isContentSensitive="), this.isContentSensitive, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.setContentSensitive(this.isContentSensitive);
    }
}
