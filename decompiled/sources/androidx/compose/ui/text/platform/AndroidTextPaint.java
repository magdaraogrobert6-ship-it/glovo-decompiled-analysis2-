package androidx.compose.ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import bo.app.vc$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.onViewAttachedToWindow;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private onViewAttachedToWindow shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    public static /* synthetic */ void getBrush$ui_text$annotations() {
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text$annotations, reason: not valid java name */
    public static /* synthetic */ void m3343getBrushSizeVsRJwc0$ui_text$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text$annotations() {
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m3345getBlendMode0nO6VwU() {
        return this.backingBlendMode;
    }

    public final Brush getBrush$ui_text() {
        return this.brush;
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text, reason: not valid java name */
    public final Size m3346getBrushSizeVsRJwc0$ui_text() {
        return this.brushSize;
    }

    public final onViewAttachedToWindow getShaderState$ui_text() {
        return this.shaderState;
    }

    public final Shadow getShadow$ui_text() {
        return this.shadow;
    }

    public final void setBrush$ui_text(Brush brush) {
        this.brush = brush;
    }

    /* JADX INFO: renamed from: setBrushSize-iaC8Vc4$ui_text, reason: not valid java name */
    public final void m3349setBrushSizeiaC8Vc4$ui_text(Size size) {
        this.brushSize = size;
    }

    public final void setShaderState$ui_text(onViewAttachedToWindow onviewattachedtowindow) {
        this.shaderState = onviewattachedtowindow;
    }

    public final void setShadow$ui_text(Shadow shadow) {
        this.shadow = shadow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader setBrush_12SF9DM$lambda$0(Brush brush, long j) {
        return ((ShaderBrush) brush).mo691createShaderuvyYCjk(j);
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m3347setBlendModes9anfk8(int i) {
        if (BlendMode.m631equalsimpl0(i, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo597setBlendModes9anfk8(i);
        this.backingBlendMode = i;
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m3348setBrush12SF9DM(Brush brush, long j, float f) {
        Size size;
        if (brush == null) {
            clearShader();
            return;
        }
        if (brush instanceof SolidColor) {
            m3350setColor8_81llA(TextDrawStyleKt.m3537modulateDxMtmZc(((SolidColor) brush).m1081getValue0d7_KjU(), f));
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brush, brush}, getCieXyz.write())).booleanValue() || (size = this.brushSize) == null || !Size.m542equalsimpl0(size.m551unboximpl(), j)) && j != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.brush = brush;
            this.brushSize = Size.m534boximpl(j);
            this.shaderState = CompositionKt.serializer(new vc$$ExternalSyntheticLambda2(j, 1, brush));
        }
        Paint composePaint = getComposePaint();
        onViewAttachedToWindow onviewattachedtowindow = this.shaderState;
        composePaint.setShader(onviewattachedtowindow != null ? (Shader) onviewattachedtowindow.getValue() : null);
        this.lastColor = null;
        AndroidTextPaint_androidKt.setAlpha(this, f);
    }

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.backingBlendMode = DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.Companion.getNone();
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null) {
            return;
        }
        Object[] objArr = {this.drawStyle, drawStyle};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.drawStyle = drawStyle;
        if (drawStyle.equals(Fill.INSTANCE)) {
            setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            getComposePaint().mo602setStylek9PVt8s(PaintingStyle.Companion.m1007getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            getComposePaint().setStrokeWidth(stroke.getWidth());
            getComposePaint().setStrokeMiterLimit(stroke.getMiter());
            getComposePaint().mo601setStrokeJoinWw9F2mQ(stroke.m1374getJoinLxFBmk8());
            getComposePaint().mo600setStrokeCapBeK7IIE(stroke.m1373getCapKaPHkGw());
            getComposePaint().setPathEffect(stroke.getPathEffect());
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null) {
            return;
        }
        Object[] objArr = {this.shadow, shadow};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.shadow = shadow;
        Object[] objArr2 = {shadow, Shadow.Companion.getNone()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.m1070getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (this.shadow.m1070getOffsetF1C5BW0() & 4294967295L)), ColorKt.m776toArgb8_81llA(this.shadow.m1069getColor0d7_KjU()));
        }
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null) {
            return;
        }
        Object[] objArr = {this.textDecoration, textDecoration};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m3344setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m3348setBrush12SF9DM(brush, j, f);
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m3350setColor8_81llA(long j) {
        Color color = this.lastColor;
        if ((color != null && Color.m723equalsimpl0(color.m732unboximpl(), j)) || j == 16) {
            return;
        }
        this.lastColor = Color.m712boximpl(j);
        setColor(ColorKt.m776toArgb8_81llA(j));
        clearShader();
    }
}
