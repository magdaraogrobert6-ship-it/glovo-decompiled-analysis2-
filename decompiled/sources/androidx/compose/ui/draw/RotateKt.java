package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* JADX INFO: loaded from: classes.dex */
public final class RotateKt {
    public static final Modifier rotate(Modifier modifier, float f) {
        return f == 0.0f ? modifier : GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
    }
}
