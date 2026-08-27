package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;

/* JADX INFO: loaded from: classes.dex */
public final class ClipKt {
    public static final Modifier clipToBounds(Modifier modifier) {
        return GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 0, null, 520191, null);
    }

    public static final Modifier clip(Modifier modifier, Shape shape) {
        return GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, true, null, 0L, 0L, 0, 0, null, 518143, null);
    }
}
