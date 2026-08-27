package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleInnerShadowElement extends ModifierNodeElement<SimpleInnerShadowNode> {
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

    public final SimpleInnerShadowElement copy(Shape shape, Shadow shadow) {
        return new SimpleInnerShadowElement(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleInnerShadowNode create() {
        return new SimpleInnerShadowNode(this.shape, this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("innerShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("innerShadow", this.shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SimpleInnerShadowNode simpleInnerShadowNode) {
        simpleInnerShadowNode.update(this.shape, this.shadow);
    }

    public SimpleInnerShadowElement(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    public static /* synthetic */ SimpleInnerShadowElement copy$default(SimpleInnerShadowElement simpleInnerShadowElement, Shape shape, Shadow shadow, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = simpleInnerShadowElement.shape;
        }
        if ((i & 2) != 0) {
            shadow = simpleInnerShadowElement.shadow;
        }
        return simpleInnerShadowElement.copy(shape, shadow);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleInnerShadowElement)) {
            return false;
        }
        SimpleInnerShadowElement simpleInnerShadowElement = (SimpleInnerShadowElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, simpleInnerShadowElement.shape}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadow, simpleInnerShadowElement.shadow}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "SimpleInnerShadowElement(shape=" + this.shape + ", shadow=" + this.shadow + ')';
    }
}
