package androidx.compose.ui.text;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TextPainterKt {
    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m3057drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m2915painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m3061drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j, long j2, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j != 16) {
                textLayoutResult.getMultiParagraph().m2913paintLG529CI(drawScope.getDrawContext().getCanvas(), TextDrawStyleKt.m3537modulateDxMtmZc(j != 16 ? j : textLayoutResult.getLayoutInput().getStyle().m3106getColor0d7_KjU(), f), shadow2, textDecoration2, drawStyle2, i);
            } else {
                textLayoutResult.getMultiParagraph().m2915painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
            }
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m3559equalsimpl0(textLayoutResult.getLayoutInput().m3043getOverflowgIe3tQ8(), TextOverflow.Companion.m3572getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m1361clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, (int) (textLayoutResult.m3047getSizeYbymL2g() >> 32), (int) (textLayoutResult.m3047getSizeYbymL2g() & 4294967295L), 0, 16, null);
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m3055drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j2, int i3) {
        TextLayoutResult textLayoutResultM3050measurexDpz5zY$default = TextMeasurer.m3050measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i, z, i2, list, m3063textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            clip(transform, textLayoutResultM3050measurexDpz5zY$default);
            textLayoutResultM3050measurexDpz5zY$default.getMultiParagraph().m2913paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m3059drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i, boolean z, int i2, long j2, int i3) {
        TextLayoutResult textLayoutResultM3050measurexDpz5zY$default = TextMeasurer.m3050measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, i, z, i2, null, m3063textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            clip(transform, textLayoutResultM3050measurexDpz5zY$default);
            textLayoutResultM3050measurexDpz5zY$default.getMultiParagraph().m2913paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m3063textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int iRound;
        int i;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j != InlineClassHelperKt.UnspecifiedPackedFloats) {
            int i2 = (int) (j >> 32);
            if (Float.isNaN(Float.intBitsToFloat(i2))) {
                iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))));
                if (iRound < 0) {
                    iRound = 0;
                }
                i = iRound;
                iRound2 = 0;
            } else {
                iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat(i2)));
                i = iRound2;
            }
        } else {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - Float.intBitsToFloat((int) (j2 >> 32))));
            if (iRound < 0) {
                iRound = 0;
            }
            i = iRound;
            iRound2 = 0;
        }
        if (j != InlineClassHelperKt.UnspecifiedPackedFloats) {
            int i3 = (int) (j & 4294967295L);
            if (Float.isNaN(Float.intBitsToFloat(i3))) {
                iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))));
                if (iRound3 < 0) {
                }
            } else {
                iRound4 = Math.round((float) Math.ceil(Float.intBitsToFloat(i3)));
            }
            iRound3 = iRound4;
        } else {
            iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L))));
            if (iRound3 < 0) {
                iRound3 = iRound4;
            }
        }
        return ConstraintsKt.Constraints(iRound2, i, iRound4, iRound3);
    }
}
