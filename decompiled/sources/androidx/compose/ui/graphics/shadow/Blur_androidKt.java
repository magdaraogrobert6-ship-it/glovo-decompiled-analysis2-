package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class Blur_androidKt {
    public static final BlurMaskFilter BlurFilter(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void setBlurFilter(Paint paint, BlurMaskFilter blurMaskFilter) {
        AndroidPaint_androidKt.getNativePaint(paint).setMaskFilter(blurMaskFilter);
    }
}
