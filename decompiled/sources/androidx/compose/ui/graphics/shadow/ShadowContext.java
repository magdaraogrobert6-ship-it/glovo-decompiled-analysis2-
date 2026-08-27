package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;

/* JADX INFO: loaded from: classes.dex */
public interface ShadowContext {
    default void clearCache() {
    }

    default DropShadowPainter createDropShadowPainter(Shape shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow);
    }

    default InnerShadowPainter createInnerShadowPainter(Shape shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow);
    }
}
