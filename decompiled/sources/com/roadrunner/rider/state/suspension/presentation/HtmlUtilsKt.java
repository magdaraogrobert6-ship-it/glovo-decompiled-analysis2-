package com.roadrunner.rider.state.suspension.presentation;

import android.text.Html;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HtmlUtilsKt {
    private static int read = 1;
    private static int serializer;

    public static final AnnotatedString toHtmlAnnotatedString(String str) {
        int i = 2 % 2;
        str.getClass();
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        Object obj = null;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(spannedFromHtml.toString());
        Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), CharacterStyle.class);
        spans.getClass();
        int length = spans.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = serializer + 115;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                CharacterStyle characterStyle = (CharacterStyle) spans[i2];
                spannedFromHtml.getSpanStart(characterStyle);
                spannedFromHtml.getSpanEnd(characterStyle);
                boolean z = characterStyle instanceof StyleSpan;
                obj.hashCode();
                throw null;
            }
            CharacterStyle characterStyle2 = (CharacterStyle) spans[i2];
            int spanStart = spannedFromHtml.getSpanStart(characterStyle2);
            int spanEnd = spannedFromHtml.getSpanEnd(characterStyle2);
            if (characterStyle2 instanceof StyleSpan) {
                int style = ((StyleSpan) characterStyle2).getStyle();
                if (style == 1) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m3187boximpl(FontStyle.Companion.m3196getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), FontStyle.m3187boximpl(FontStyle.Companion.m3196getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                    int i4 = read + 103;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
            }
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        int i6 = read + 59;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return annotatedString;
        }
        throw null;
    }
}
