package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleDropShadowElement extends ModifierNodeElement<SimpleDropShadowNode> {
    public static final int $stable = 0;
    private final Shadow shadow;
    private final Shape shape;

    public final Shape component1() {
        return this.shape;
    }

    public final Shadow component2() {
        return this.shadow;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final SimpleDropShadowElement copy(Shape shape, Shadow shadow) {
        return new SimpleDropShadowElement(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleDropShadowNode create() {
        return new SimpleDropShadowNode(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("dropShadow", this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleDropShadowNode simpleDropShadowNode) {
        simpleDropShadowNode.update(this.shape, this.shadow);
    }

    public SimpleDropShadowElement(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    public static /* synthetic */ SimpleDropShadowElement copy$default(SimpleDropShadowElement simpleDropShadowElement, Shape shape, Shadow shadow, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = simpleDropShadowElement.shape;
        }
        if ((i & 2) != 0) {
            shadow = simpleDropShadowElement.shadow;
        }
        return simpleDropShadowElement.copy(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDropShadowElement)) {
            return false;
        }
        SimpleDropShadowElement simpleDropShadowElement = (SimpleDropShadowElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, simpleDropShadowElement.shape}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadow, simpleDropShadowElement.shadow}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "SimpleDropShadowElement(shape=" + this.shape + ", shadow=" + this.shadow + ')';
    }
}
