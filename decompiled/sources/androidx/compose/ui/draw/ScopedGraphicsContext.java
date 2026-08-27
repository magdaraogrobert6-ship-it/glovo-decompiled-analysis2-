package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.ShadowContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import o.ContentInViewNode;
import o.DefaultFlingBehaviorperformFling2;

/* JADX INFO: loaded from: classes.dex */
final class ScopedGraphicsContext implements GraphicsContext {
    private ContentInViewNode allocatedGraphicsLayers;
    private GraphicsContext graphicsContext;

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void setGraphicsContext(GraphicsContext graphicsContext) {
        releaseGraphicsLayers();
        this.graphicsContext = graphicsContext;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
    }

    public final void releaseGraphicsLayers() {
        ContentInViewNode contentInViewNode = this.allocatedGraphicsLayers;
        if (contentInViewNode != null) {
            Object[] objArr = contentInViewNode.read;
            int i = contentInViewNode.IconCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                releaseGraphicsLayer((GraphicsLayer) objArr[i2]);
            }
            contentInViewNode.IconCompatParcelizer();
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext == null) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerCreateGraphicsLayer = graphicsContext.createGraphicsLayer();
        ContentInViewNode contentInViewNode = this.allocatedGraphicsLayers;
        if (contentInViewNode != null) {
            contentInViewNode.read(graphicsLayerCreateGraphicsLayer);
            return graphicsLayerCreateGraphicsLayer;
        }
        Object[] objArr = DefaultFlingBehaviorperformFling2.read;
        ContentInViewNode contentInViewNode2 = new ContentInViewNode(1);
        contentInViewNode2.read(graphicsLayerCreateGraphicsLayer);
        this.allocatedGraphicsLayers = contentInViewNode2;
        return graphicsLayerCreateGraphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public ShadowContext getShadowContext() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext == null) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        return graphicsContext.getShadowContext();
    }
}
