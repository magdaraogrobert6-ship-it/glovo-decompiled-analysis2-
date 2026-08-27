package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class OutlineKt {
    /* JADX INFO: renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m995drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo1216drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                drawScope.mo1212drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f, drawStyle, colorFilter, i);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo1212drawPathGBMwjPU(roundRectPath$ui_graphics, brush, f, drawStyle, colorFilter, i);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo1218drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), f, drawStyle, colorFilter, i);
    }

    /* JADX INFO: renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m997drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo1217drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                drawScope.mo1213drawPathLG529CI(((Outline.Generic) outline).getPath(), j, f, drawStyle, colorFilter, i);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo1213drawPathLG529CI(roundRectPath$ui_graphics, j, f, drawStyle, colorFilter, i);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo1219drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)), drawStyle, f, colorFilter, i);
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            canvas.drawPath(roundRectPath$ui_graphics, paint);
        } else {
            canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), Float.intBitsToFloat((int) (rounded.getRoundRect().m525getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)), paint);
        }
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) {
        if (outline instanceof Outline.Rectangle) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (outline instanceof Outline.Generic) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(drawScope, ((Outline.Generic) outline).getPath());
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(drawScope, roundRectPath$ui_graphics);
        } else {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(drawScope, rounded.getRoundRect());
        }
    }

    private static final long size(Rect rect) {
        float right = rect.getRight();
        float left = rect.getLeft();
        float bottom = rect.getBottom();
        float top = rect.getTop();
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(right - left)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
    }

    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Path.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else if (outline instanceof Outline.Generic) {
            Path.m1009addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) > Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)) == Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) ? 0 : -1)) == 0);
    }

    /* JADX INFO: renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m996drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU();
        }
        m995drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(height)) & 4294967295L));
    }
}
