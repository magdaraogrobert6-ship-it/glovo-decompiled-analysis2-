package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import o.updateBuffersOnDisappeared;

/* JADX INFO: loaded from: classes4.dex */
final class GraphicsContextObserver implements updateBuffersOnDisappeared {
    private final GraphicsContext graphicsContext;
    private final GraphicsLayer graphicsLayer;

    public final GraphicsLayer getGraphicsLayer() {
        return this.graphicsLayer;
    }

    @Override // o.updateBuffersOnDisappeared
    public void onRemembered() {
    }

    @Override // o.updateBuffersOnDisappeared
    public void onAbandoned() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    @Override // o.updateBuffersOnDisappeared
    public void onForgotten() {
        this.graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
    }

    public GraphicsContextObserver(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
    }
}
