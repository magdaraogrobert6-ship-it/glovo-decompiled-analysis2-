package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletSpan_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDrawStyle(Paint paint, DrawStyle drawStyle) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{drawStyle, Fill.INSTANCE}, getCieXyz.write())).booleanValue()) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        Stroke stroke = (Stroke) drawStyle;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(DrawStyleSpan_androidKt.m3369toAndroidCapBeK7IIE(stroke.m1373getCapKaPHkGw()));
        paint.setStrokeJoin(DrawStyleSpan_androidKt.m3370toAndroidJoinWw9F2mQ(stroke.m1374getJoinLxFBmk8()));
        PathEffect pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setBrushAndDraw-yzxVdVo, reason: not valid java name */
    public static final void m3367setBrushAndDrawyzxVdVo(Paint paint, Brush brush, float f, long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Integer numValueOf = null;
        if (brush == null) {
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setColor(ColorKt.m776toArgb8_81llA(((SolidColor) brush).m1081getValue0d7_KjU()));
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (brush instanceof ShaderBrush) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setShader(((ShaderBrush) brush).mo691createShaderuvyYCjk(j));
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void draw(Outline outline, Canvas canvas, Paint paint, float f, float f2, int i) {
        if (outline instanceof Outline.Generic) {
            canvas.save();
            Outline.Generic generic = (Outline.Generic) outline;
            Rect bounds = generic.getBounds();
            canvas.translate(f, f2 - ((bounds.getBottom() - bounds.getTop()) / 2.0f));
            Path path = generic.getPath();
            if (!(path instanceof AndroidPath)) {
                IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                return;
            } else {
                canvas.drawPath(((AndroidPath) path).getInternalPath(), paint);
                canvas.restore();
                return;
            }
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            Outline.Rectangle rectangle = (Outline.Rectangle) outline;
            Rect rect = rectangle.getRect();
            float bottom = (rect.getBottom() - rect.getTop()) / 2.0f;
            Rect rect2 = rectangle.getRect();
            float right = rect2.getRight();
            float left = rect2.getLeft();
            Rect rect3 = rectangle.getRect();
            canvas.drawRect(f, f2 - bottom, ((right - left) * i) + f, ((rect3.getBottom() - rect3.getTop()) / 2.0f) + f2, paint);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (rounded.getRoundRect().m527getTopLeftCornerRadiuskKHJgLs() >> 32));
            canvas.drawRoundRect(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f), (rounded.getRoundRect().getWidth() * i) + f, (rounded.getRoundRect().getHeight() / 2.0f) + f2, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.addRoundRect$default(Path, rounded.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f, f2 - (rounded.getRoundRect().getHeight() / 2.0f));
        if (!(Path instanceof AndroidPath)) {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        } else {
            canvas.drawPath(((AndroidPath) Path).getInternalPath(), paint);
            canvas.restore();
        }
    }
}
