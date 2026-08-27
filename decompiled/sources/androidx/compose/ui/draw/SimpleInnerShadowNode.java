package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SimpleInnerShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private InnerShadowPainter innerShadowPainter;
    private Shadow shadow;
    private Shape shape;

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.innerShadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public int hashCode() {
        return this.shadow.hashCode() + (this.shape.hashCode() * 31);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0052  */
    public final void update(Shape shape, Shadow shadow) {
        Object[] objArr = {this.shape, shape};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.shadow, shadow};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                this.innerShadowPainter = null;
            }
        } else {
            this.innerShadowPainter = null;
        }
        this.shape = shape;
        this.shadow = shadow;
    }

    public SimpleInnerShadowNode(Shape shape, Shadow shadow) {
        this.shape = shape;
        this.shadow = shadow;
    }

    private final InnerShadowPainter obtainPainter() {
        InnerShadowPainter innerShadowPainter = this.innerShadowPainter;
        if (innerShadowPainter != null) {
            return innerShadowPainter;
        }
        InnerShadowPainter innerShadowPainterCreateInnerShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.shape, this.shadow);
        this.innerShadowPainter = innerShadowPainterCreateInnerShadowPainter;
        return innerShadowPainterCreateInnerShadowPainter;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Painter.m1429drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo1304getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleInnerShadowNode.class != obj.getClass()) {
            return false;
        }
        SimpleInnerShadowNode simpleInnerShadowNode = (SimpleInnerShadowNode) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, simpleInnerShadowNode.shape}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadow, simpleInnerShadowNode.shadow}, getCieXyz.write())).booleanValue();
    }
}
