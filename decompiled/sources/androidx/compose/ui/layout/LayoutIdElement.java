package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {
    private final Object layoutId;

    private final Object component1() {
        return this.layoutId;
    }

    public final LayoutIdElement copy(Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    public LayoutIdElement(Object obj) {
        this.layoutId = obj;
    }

    public static /* synthetic */ LayoutIdElement copy$default(LayoutIdElement layoutIdElement, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = layoutIdElement.layoutId;
        }
        return layoutIdElement.copy(obj);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutIdElement)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layoutId, ((LayoutIdElement) obj).layoutId}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("LayoutIdElement(layoutId="), this.layoutId, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.setLayoutId$ui(this.layoutId);
    }
}
