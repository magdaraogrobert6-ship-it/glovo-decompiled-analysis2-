package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class SkewXSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final float skewX;

    public final float getSkewX() {
        return this.skewX;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }

    public SkewXSpan(float f) {
        this.skewX = f;
    }
}
