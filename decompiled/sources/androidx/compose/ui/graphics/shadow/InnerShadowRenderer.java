package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.CompositeShaderBrush;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpOffset;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class InnerShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private float[] matrix;
    private final Paint paint;
    private final Shadow shadow;
    private ShaderBrush shadowMask;

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: buildShadow-_SMYjrA */
    public void mo1442buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(this.shadow.m1450getRadiusD9Ej5fM());
        float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(this.shadow.m1451getSpreadD9Ej5fM());
        float fMo48toPx0680j_6 = drawScope.mo48toPx0680j_4(DpOffset.m3734getXD9Ej5fM(this.shadow.m1449getOffsetRKDOV3M()));
        float fMo48toPx0680j_7 = drawScope.mo48toPx0680j_4(DpOffset.m3736getYD9Ej5fM(this.shadow.m1449getOffsetRKDOV3M()));
        this.shadowMask = path != null ? m1444createInnerPathShadowBrushLjSzlW0(j, path, fMo48toPx0680j_4, fMo48toPx0680j_5, fMo48toPx0680j_6, fMo48toPx0680j_7) : m1445createInnerShadowBrushu1Psq8(j, fMo48toPx0680j_4, fMo48toPx0680j_5, fMo48toPx0680j_6, fMo48toPx0680j_7, j2);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: onDrawShadow-MLmccfk */
    public void mo1443onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        ShaderBrush shaderBrushObtainCompositeBrush = this.shadowMask;
        if (shaderBrushObtainCompositeBrush != null) {
            if (this.shadow.getBrush() instanceof ShaderBrush) {
                shaderBrushObtainCompositeBrush = obtainCompositeBrush(shaderBrushObtainCompositeBrush, this.shadow.getBrush());
            }
            if (path != null) {
                DrawScope.m1293drawPathGBMwjPU$default(drawScope, path, shaderBrushObtainCompositeBrush, f, null, colorFilter, i, 8, null);
            } else if (CornerRadius.m436equalsimpl0(j2, CornerRadius.Companion.m449getZerokKHJgLs())) {
                DrawScope.m1297drawRectAsUm42w$default(drawScope, shaderBrushObtainCompositeBrush, 0L, 0L, f, null, colorFilter, i, 22, null);
            } else {
                DrawScope.m1299drawRoundRectZuiqVtQ$default(drawScope, shaderBrushObtainCompositeBrush, 0L, 0L, j2, f, null, colorFilter, this.shadow.m1447getBlendMode0nO6VwU(), 38, null);
            }
        }
    }

    public InnerShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    private final CompositeShaderBrush obtainCompositeBrush(ShaderBrush shaderBrush, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null) {
            Object[] objArr = {compositeShaderBrush.getSrcBrush(), brush};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return compositeShaderBrush;
            }
        }
        CompositeShaderBrush compositeShaderBrush2 = new CompositeShaderBrush(BrushKt.toShaderBrush(shaderBrush), BrushKt.toShaderBrush(brush), BlendMode.Companion.m660getSrcIn0nO6VwU(), null);
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    /* JADX INFO: renamed from: obtainMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m1446obtainMatrixsQKQjiQ() {
        float[] fArr = this.matrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrM969constructorimpl$default = Matrix.m969constructorimpl$default(null, 1, null);
        this.matrix = fArrM969constructorimpl$default;
        return fArrM969constructorimpl$default;
    }

    /* JADX INFO: renamed from: createInnerShadowBrush-u1Psq-8, reason: not valid java name */
    private final ShaderBrush m1445createInnerShadowBrushu1Psq8(long j, float f, float f2, float f3, float f4, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat(i)), (int) Math.ceil(Float.intBitsToFloat(i2)), ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
        float f5 = f3 + f2;
        float f6 = f4 + f2;
        Canvas.drawRoundRect(f5, f6, Math.max(f5, (Float.intBitsToFloat(i) + f3) - f2), Math.max(f6, (Float.intBitsToFloat(i2) + f4) - f2), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        Canvas.drawRect(0.0f, 0.0f, imageBitmapM961ImageBitmapx__hDU$default.getWidth(), imageBitmapM961ImageBitmapx__hDU$default.getHeight(), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m663getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m1058ImageShaderF49vj9s$default(imageBitmapM961ImageBitmapx__hDU$default, 0, 0, 6, null));
    }

    /* JADX INFO: renamed from: createInnerPathShadowBrush-LjSzlW0, reason: not valid java name */
    private final ShaderBrush m1444createInnerPathShadowBrushLjSzlW0(long j, Path path, float f, float f2, float f3, float f4) {
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default;
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)));
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)));
        if (f2 > 0.0f) {
            Rect bounds = path.getBounds();
            float right = bounds.getRight() - bounds.getLeft();
            float bottom = bounds.getBottom() - bounds.getTop();
            imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) Math.ceil(right), (int) Math.ceil(bottom), ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
            Canvas Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
            Canvas.drawPath(path, this.paint);
            Canvas.m694clipRectN_I0leg$default(Canvas, 0.0f, 0.0f, right, bottom, 0, 16, null);
            Paint paintM1439configureShadowFoewPVk$default = BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m635getClear0nO6VwU(), null, PaintingStyle.Companion.m1007getStrokeTiuSbCo(), 5, null);
            paintM1439configureShadowFoewPVk$default.setStrokeWidth(2.0f * f2);
            Canvas.drawPath(path, paintM1439configureShadowFoewPVk$default);
        } else {
            imageBitmapM961ImageBitmapx__hDU$default = null;
        }
        int iCeil3 = ((int) Math.ceil(f)) * 2;
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default2 = ImageBitmapKt.m961ImageBitmapx__hDU$default(iCeil + iCeil3, iCeil2 + iCeil3, ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas2 = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default2);
        if (imageBitmapM961ImageBitmapx__hDU$default != null) {
            Canvas2.drawRect(0.0f, 0.0f, imageBitmapM961ImageBitmapx__hDU$default2.getWidth(), imageBitmapM961ImageBitmapx__hDU$default2.getHeight(), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, null, 0, 15, null));
            Canvas2.mo575drawImaged4ec7I(imageBitmapM961ImageBitmapx__hDU$default, Offset.m469constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(f4))) | (((long) Float.floatToRawIntBits(f3)) << 32)), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m663getXor0nO6VwU(), f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 9, null));
            return BrushKt.ShaderBrush(ShaderKt.m1058ImageShaderF49vj9s$default(imageBitmapM961ImageBitmapx__hDU$default2, 0, 0, 6, null));
        }
        Canvas2.save();
        Canvas2.translate(f3, f4);
        Canvas2.drawPath(path, BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        Canvas2.restore();
        Canvas2.drawRect(0.0f, 0.0f, imageBitmapM961ImageBitmapx__hDU$default2.getWidth(), imageBitmapM961ImageBitmapx__hDU$default2.getHeight(), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, BlendMode.Companion.m663getXor0nO6VwU(), null, 0, 13, null));
        return BrushKt.ShaderBrush(ShaderKt.m1058ImageShaderF49vj9s$default(imageBitmapM961ImageBitmapx__hDU$default2, 0, 0, 6, null));
    }
}
