package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.shadow.PlatformShadowContext;
import androidx.compose.ui.graphics.shadow.ShadowContext;

/* JADX INFO: loaded from: classes.dex */
public interface GraphicsContext {
    GraphicsLayer createGraphicsLayer();

    void releaseGraphicsLayer(GraphicsLayer graphicsLayer);

    default ShadowContext getShadowContext() {
        return new PlatformShadowContext() { // from class: androidx.compose.ui.graphics.GraphicsContext$shadowContext$1
        };
    }
}
