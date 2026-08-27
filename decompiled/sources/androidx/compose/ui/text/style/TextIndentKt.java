package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* JADX INFO: loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f) {
        return new TextIndent(SpanStyleKt.m3022lerpTextUnitInheritableC3pnCVY(textIndent.m3541getFirstLineXSAIIZE(), textIndent2.m3541getFirstLineXSAIIZE(), f), SpanStyleKt.m3022lerpTextUnitInheritableC3pnCVY(textIndent.m3542getRestLineXSAIIZE(), textIndent2.m3542getRestLineXSAIIZE(), f), null);
    }
}
