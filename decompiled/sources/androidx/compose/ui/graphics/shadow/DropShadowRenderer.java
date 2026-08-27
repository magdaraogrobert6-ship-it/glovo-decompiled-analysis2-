package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class DropShadowRenderer extends ShadowRenderer {
    public static final int $stable = 8;
    private CompositeShaderBrush compositeShader;
    private final Paint paint;
    private final Shadow shadow;
    private ImageBitmap shadowBitmap;

    public final Shadow getShadow() {
        return this.shadow;
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: buildShadow-_SMYjrA, reason: not valid java name */
    public void mo1442buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path) {
        float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(this.shadow.m1450getRadiusD9Ej5fM());
        float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(this.shadow.m1451getSpreadD9Ej5fM());
        this.shadowBitmap = path != null ? m1440createOuterShadowBitmapCqks5Fs(j, path, fMo48toPx0680j_4, fMo48toPx0680j_5) : m1441createOuterShadowBitmapD_oqF2M(j, fMo48toPx0680j_4, fMo48toPx0680j_5, j2);
    }

    @Override // androidx.compose.ui.graphics.shadow.ShadowRenderer
    /* JADX INFO: renamed from: onDrawShadow-MLmccfk, reason: not valid java name */
    public void mo1443onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i) {
        ImageBitmap imageBitmap = this.shadowBitmap;
        if (imageBitmap != null) {
            float f2 = -(drawScope.mo48toPx0680j_4(this.shadow.m1451getSpreadD9Ej5fM()) + drawScope.mo48toPx0680j_4(this.shadow.m1450getRadiusD9Ej5fM()));
            if (brush == null || colorFilter != null) {
                DrawScope.m1288drawImagegbVJVH8$default(drawScope, imageBitmap, Offset.m469constructorimpl((4294967295L & ((long) Float.floatToRawIntBits(f2))) | (Float.floatToRawIntBits(f2) << 32)), f, null, colorFilter, i, 8, null);
                return;
            }
            Brush brushObtainCompositeBrush = obtainCompositeBrush(imageBitmap, brush);
            drawScope.getDrawContext().getTransform().translate(f2, f2);
            try {
                DrawScope.m1297drawRectAsUm42w$default(drawScope, brushObtainCompositeBrush, 0L, Size.m537constructorimpl((((long) Float.floatToRawIntBits(imageBitmap.getHeight())) & 4294967295L) | (((long) Float.floatToRawIntBits(imageBitmap.getWidth())) << 32)), f, null, null, i, 50, null);
            } finally {
                float f3 = -f2;
                drawScope.getDrawContext().getTransform().translate(f3, f3);
            }
        }
    }

    public DropShadowRenderer(Shadow shadow, Outline outline) {
        super(outline);
        this.shadow = shadow;
        this.paint = AndroidPaint_androidKt.Paint();
    }

    private final Brush obtainCompositeBrush(ImageBitmap imageBitmap, Brush brush) {
        CompositeShaderBrush compositeShaderBrush = this.compositeShader;
        if (compositeShaderBrush != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{compositeShaderBrush.getSrcBrush(), brush}, getCieXyz.write())).booleanValue()) {
                return compositeShaderBrush;
            }
        }
        Brush.Companion companion = Brush.Companion;
        ShaderBrush ShaderBrush = BrushKt.ShaderBrush(ShaderKt.m1058ImageShaderF49vj9s$default(imageBitmap, 0, 0, 6, null));
        if (brush instanceof ShaderBrush) {
            brush = BrushKt.ShaderBrush(((ShaderBrush) brush).mo691createShaderuvyYCjk(Size.m537constructorimpl((((long) Float.floatToRawIntBits(imageBitmap.getWidth())) << 32) | (((long) Float.floatToRawIntBits(imageBitmap.getHeight())) & 4294967295L))));
        }
        Brush brushM679composite7EN7VTw = companion.m679composite7EN7VTw(ShaderBrush, brush, BlendMode.Companion.m660getSrcIn0nO6VwU());
        brushM679composite7EN7VTw.getClass();
        CompositeShaderBrush compositeShaderBrush2 = (CompositeShaderBrush) brushM679composite7EN7VTw;
        this.compositeShader = compositeShaderBrush2;
        return compositeShaderBrush2;
    }

    /* JADX INFO: renamed from: createOuterShadowBitmap-D_oqF2M, reason: not valid java name */
    private final ImageBitmap m1441createOuterShadowBitmapD_oqF2M(long j, float f, float f2, long j2) {
        float f3 = (f2 * 2.0f) + (2.0f * f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f3;
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
        CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default).drawRoundRect(f, f, fIntBitsToFloat - f, fIntBitsToFloat2 - f, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
        return imageBitmapM961ImageBitmapx__hDU$default;
    }

    /* JADX INFO: renamed from: createOuterShadowBitmap-Cqks5Fs, reason: not valid java name */
    private final ImageBitmap m1440createOuterShadowBitmapCqks5Fs(long j, Path path, float f, float f2) {
        float f3 = f2 * 2.0f;
        float f4 = (2.0f * f) + f3;
        ImageBitmap imageBitmapM961ImageBitmapx__hDU$default = ImageBitmapKt.m961ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f4), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f4), ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ(), false, null, 24, null);
        Canvas Canvas = CanvasKt.Canvas(imageBitmapM961ImageBitmapx__hDU$default);
        if (f2 > 0.0f) {
            float f5 = f + f2;
            Canvas.translate(f5, f5);
            Canvas.drawPath(path, BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null));
            Paint paintM1439configureShadowFoewPVk$default = BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, PaintingStyle.Companion.m1007getStrokeTiuSbCo(), 3, null);
            paintM1439configureShadowFoewPVk$default.setStrokeWidth(f3);
            Canvas.drawPath(path, paintM1439configureShadowFoewPVk$default);
            return imageBitmapM961ImageBitmapx__hDU$default;
        }
        BlurKt.m1439configureShadowFoewPVk$default(this.paint, 0L, 0, f > 0.0f ? Blur_androidKt.BlurFilter(f) : null, 0, 11, null);
        Canvas.translate(f, f);
        Canvas.drawPath(path, this.paint);
        return imageBitmapM961ImageBitmapx__hDU$default;
    }
}
