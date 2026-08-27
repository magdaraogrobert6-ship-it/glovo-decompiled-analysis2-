package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextOverflow;

/* JADX INFO: loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m3559equalsimpl0(textLayoutResult.getLayoutInput().m3043getOverflowgIe3tQ8(), TextOverflow.Companion.m3572getVisiblegIe3tQ8());
        if (z) {
            Rect rectM517Recttz77jQw = RectKt.m517Recttz77jQw(Offset.Companion.m493getZeroF1C5BW0(), Size.m537constructorimpl((((long) Float.floatToRawIntBits((int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (textLayoutResult.m3047getSizeYbymL2g() >> 32))) << 32)));
            canvas.save();
            Canvas.m695clipRectmtrdDE$default(canvas, rectM517Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle$ui_text = textLayoutResult.getLayoutInput().getStyle().getSpanStyle$ui_text();
        TextDecoration textDecoration = spanStyle$ui_text.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle$ui_text.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle$ui_text.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle$ui_text.getBrush();
            if (brush != null) {
                textLayoutResult.getMultiParagraph().m2915painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : spanStyle$ui_text.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle$ui_text.getTextForegroundStyle$ui_text().getAlpha() : 1.0f, (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : 0);
            } else {
                textLayoutResult.getMultiParagraph().m2913paintLG529CI(canvas, (32 & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : spanStyle$ui_text.getTextForegroundStyle$ui_text() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle$ui_text.getTextForegroundStyle$ui_text().mo3391getColor0d7_KjU() : Color.Companion.m748getBlack0d7_KjU(), (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : 0);
            }
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
