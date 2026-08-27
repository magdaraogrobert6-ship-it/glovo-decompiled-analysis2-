package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerKt {
    public static final float DefaultCameraDistance = 8.0f;

    public static final void drawLayer(DrawScope drawScope, GraphicsLayer graphicsLayer) {
        graphicsLayer.draw$ui_graphics(drawScope.getDrawContext().getCanvas(), drawScope.getDrawContext().getGraphicsLayer());
    }

    public static final void setOutline(GraphicsLayer graphicsLayer, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            float left = rectangle.getRect().getLeft();
            float top = rectangle.getRect().getTop();
            long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
            Rect rect = rectangle.getRect();
            float right = rect.getRight();
            float left2 = rect.getLeft();
            Rect rect2 = rectangle.getRect();
            graphicsLayer.m1403setRectOutlinetz77jQw(jM469constructorimpl, Size.m537constructorimpl((((long) Float.floatToRawIntBits(rect2.getBottom() - rect2.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(right - left2)) << 32)));
            return;
        }
        if (outline instanceof Outline.Generic) {
            graphicsLayer.setPathOutline(((Outline.Generic) outline).getPath());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (rounded.getRoundRectPath$ui_graphics() != null) {
            graphicsLayer.setPathOutline(rounded.getRoundRectPath$ui_graphics());
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float left3 = roundRect.getLeft();
        float top2 = roundRect.getTop();
        long jM469constructorimpl2 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left3)) << 32) | (((long) Float.floatToRawIntBits(top2)) & 4294967295L));
        float width = roundRect.getWidth();
        graphicsLayer.m1404setRoundRectOutlineTNW_H78(jM469constructorimpl2, Size.m537constructorimpl((((long) Float.floatToRawIntBits(roundRect.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)));
    }
}
