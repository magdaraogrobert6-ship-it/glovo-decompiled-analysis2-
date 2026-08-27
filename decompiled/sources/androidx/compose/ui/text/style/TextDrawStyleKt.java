package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m3538from8_81llA(ColorKt.m773lerpjxsXWHM(textForegroundStyle.mo3391getColor0d7_KjU(), textForegroundStyle2.mo3391getColor0d7_KjU(), f));
        }
        if (!z || !(textForegroundStyle2 instanceof BrushStyle)) {
            return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        BrushStyle brushStyle2 = (BrushStyle) textForegroundStyle2;
        return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(brushStyle.getBrush(), brushStyle2.getBrush(), f), MathHelpersKt.lerp(brushStyle.getAlpha(), brushStyle2.getAlpha(), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float takeOrElse(float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return Float.isNaN(f) ? ((Number) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).floatValue() : f;
    }

    /* JADX INFO: renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m3537modulateDxMtmZc(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : Color.m721copywmQWz5c$default(j, Color.m724getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
