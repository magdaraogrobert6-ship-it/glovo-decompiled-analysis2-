package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.AndroidPathEffect_androidKt;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final DrawStyle drawStyle;

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            DrawStyle drawStyle = this.drawStyle;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{drawStyle, Fill.INSTANCE}, getCieXyz.write())).booleanValue()) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(drawStyle instanceof Stroke)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
            textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
            textPaint.setStrokeJoin(DrawStyleSpan_androidKt.m3370toAndroidJoinWw9F2mQ(((Stroke) this.drawStyle).m1374getJoinLxFBmk8()));
            textPaint.setStrokeCap(DrawStyleSpan_androidKt.m3369toAndroidCapBeK7IIE(((Stroke) this.drawStyle).m1373getCapKaPHkGw()));
            PathEffect pathEffect = ((Stroke) this.drawStyle).getPathEffect();
            textPaint.setPathEffect(pathEffect != null ? AndroidPathEffect_androidKt.asAndroidPathEffect(pathEffect) : null);
        }
    }

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.drawStyle = drawStyle;
    }
}
