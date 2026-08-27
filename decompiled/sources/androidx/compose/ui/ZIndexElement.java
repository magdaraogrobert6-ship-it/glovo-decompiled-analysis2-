package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public final float component1() {
        return this.zIndex;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    public final ZIndexElement copy(float f) {
        return new ZIndexElement(f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    public ZIndexElement(float f) {
        this.zIndex = f;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder("ZIndexElement(zIndex="), this.zIndex, ')');
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}
