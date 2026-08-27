package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import bo.app.b8$$ExternalSyntheticLambda4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final TextForegroundStyle DefaultColorForegroundStyle;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m757getTransparent0d7_KjU();
        long jM748getBlack0d7_KjU = companion.m748getBlack0d7_KjU();
        DefaultColor = jM748getBlack0d7_KjU;
        DefaultColorForegroundStyle = TextForegroundStyle.Companion.m3538from8_81llA(jM748getBlack0d7_KjU);
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f) {
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text(), spanStyle2.getTextForegroundStyle$ui_text(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f);
        long jM3022lerpTextUnitInheritableC3pnCVY = m3022lerpTextUnitInheritableC3pnCVY(spanStyle.m3017getFontSizeXSAIIZE(), spanStyle2.m3017getFontSizeXSAIIZE(), f);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m3018getFontStyle4Lr2A7w(), spanStyle2.m3018getFontStyle4Lr2A7w(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m3019getFontSynthesisZQGJjVo(), spanStyle2.m3019getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f);
        long jM3022lerpTextUnitInheritableC3pnCVY2 = m3022lerpTextUnitInheritableC3pnCVY(spanStyle.m3020getLetterSpacingXSAIIZE(), spanStyle2.m3020getLetterSpacingXSAIIZE(), f);
        BaselineShift baselineShiftM3015getBaselineShift5SSeXJ0 = spanStyle.m3015getBaselineShift5SSeXJ0();
        float fM3379unboximpl = baselineShiftM3015getBaselineShift5SSeXJ0 != null ? baselineShiftM3015getBaselineShift5SSeXJ0.m3379unboximpl() : BaselineShift.m3374constructorimpl(0.0f);
        BaselineShift baselineShiftM3015getBaselineShift5SSeXJ1 = spanStyle2.m3015getBaselineShift5SSeXJ0();
        float fM3389lerpjWV1Mfo = BaselineShiftKt.m3389lerpjWV1Mfo(fM3379unboximpl, baselineShiftM3015getBaselineShift5SSeXJ1 != null ? baselineShiftM3015getBaselineShift5SSeXJ1.m3379unboximpl() : BaselineShift.m3374constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text();
        }
        return new SpanStyle(textForegroundStyleLerp, jM3022lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM3022lerpTextUnitInheritableC3pnCVY2, BaselineShift.m3373boximpl(fM3389lerpjWV1Mfo), TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f), (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f), ColorKt.m773lerpjxsXWHM(spanStyle.m3014getBackground0d7_KjU(), spanStyle2.m3014getBackground0d7_KjU(), f), (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f), nullSafeLerp(spanStyle.getShadow(), spanStyle2.getShadow(), f), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        TextForegroundStyle textForegroundStyleTakeOrElse = spanStyle.getTextForegroundStyle$ui_text().takeOrElse(new b8$$ExternalSyntheticLambda4(18));
        long jM3017getFontSizeXSAIIZE = TextUnit.m3865getRawTypeimpl(spanStyle.m3017getFontSizeXSAIIZE()) == 0 ? DefaultFontSize : spanStyle.m3017getFontSizeXSAIIZE();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyleM3018getFontStyle4Lr2A7w = spanStyle.m3018getFontStyle4Lr2A7w();
        FontStyle fontStyleM3187boximpl = FontStyle.m3187boximpl(fontStyleM3018getFontStyle4Lr2A7w != null ? fontStyleM3018getFontStyle4Lr2A7w.m3193unboximpl() : FontStyle.Companion.m3197getNormal_LCdwA());
        FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyle.m3019getFontSynthesisZQGJjVo();
        FontSynthesis fontSynthesisM3198boximpl = FontSynthesis.m3198boximpl(fontSynthesisM3019getFontSynthesisZQGJjVo != null ? fontSynthesisM3019getFontSynthesisZQGJjVo.m3206unboximpl() : FontSynthesis.Companion.m3207getAllGVVA2EU());
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long jM3020getLetterSpacingXSAIIZE = TextUnit.m3865getRawTypeimpl(spanStyle.m3020getLetterSpacingXSAIIZE()) == 0 ? DefaultLetterSpacing : spanStyle.m3020getLetterSpacingXSAIIZE();
        BaselineShift baselineShiftM3015getBaselineShift5SSeXJ0 = spanStyle.m3015getBaselineShift5SSeXJ0();
        float fM3379unboximpl = baselineShiftM3015getBaselineShift5SSeXJ0 != null ? baselineShiftM3015getBaselineShift5SSeXJ0.m3379unboximpl() : BaselineShift.Companion.m3384getNoney9eOQZs();
        if (Float.isNaN(fM3379unboximpl)) {
            fM3379unboximpl = BaselineShift.Companion.m3384getNoney9eOQZs();
        }
        BaselineShift baselineShiftM3373boximpl = BaselineShift.m3373boximpl(fM3379unboximpl);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long jM3014getBackground0d7_KjU = spanStyle.m3014getBackground0d7_KjU();
        if (jM3014getBackground0d7_KjU == 16) {
            jM3014getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j = jM3014getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, jM3017getFontSizeXSAIIZE, fontWeight2, fontStyleM3187boximpl, fontSynthesisM3198boximpl, fontFamily2, str, jM3020getLetterSpacingXSAIIZE, baselineShiftM3373boximpl, textGeometricTransform2, localeList2, j, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        return platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    private static final Shadow dropAlpha(Shadow shadow) {
        return Shadow.m1065copyqcb84PM$default(shadow, Color.m721copywmQWz5c$default(shadow.m1069getColor0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3022lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        return (TextUnit.m3865getRawTypeimpl(j) == 0 || TextUnit.m3865getRawTypeimpl(j2) == 0) ? ((TextUnit) lerpDiscrete(TextUnit.m3857boximpl(j), TextUnit.m3857boximpl(j2), f)).m3876unboximpl() : TextUnitKt.m3887lerpC3pnCVY(j, j2, f);
    }

    public static final Shadow nullSafeLerp(Shadow shadow, Shadow shadow2, float f) {
        if (!ComposeUiTextFlags.isCorrectShadowLerpWithNullsEnabled) {
            if (shadow == null) {
                shadow = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            if (shadow2 == null) {
                shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            return ShadowKt.lerp(shadow, shadow2, f);
        }
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? ShadowKt.lerp(shadow, dropAlpha(shadow), f) : ShadowKt.lerp(shadow, shadow2, f);
        }
        shadow2.getClass();
        return ShadowKt.lerp(dropAlpha(shadow2), shadow2, f);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    public static final SpanStyle m3021fastMergedSHsh3o(SpanStyle spanStyle, long j, Brush brush, float f, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        DrawStyle drawStyle2;
        PlatformSpanStyle platformSpanStyle2;
        TextGeometricTransform textGeometricTransform2;
        long jM3014getBackground0d7_KjU;
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyleM3018getFontStyle4Lr2A7w = fontStyle;
        FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = fontSynthesis;
        String fontFeatureSettings = str;
        BaselineShift baselineShiftM3015getBaselineShift5SSeXJ0 = baselineShift;
        if (TextUnit.m3865getRawTypeimpl(j2) != 0 && !TextUnit.m3864equalsimpl0(j2, spanStyle.m3017getFontSizeXSAIIZE())) {
            textGeometricTransform2 = textGeometricTransform;
            jM3014getBackground0d7_KjU = j4;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
        } else if ((brush == null && j != 16 && !Color.m723equalsimpl0(j, spanStyle.getTextForegroundStyle$ui_text().mo3391getColor0d7_KjU())) || ((fontStyleM3018getFontStyle4Lr2A7w != null && !fontStyleM3018getFontStyle4Lr2A7w.equals(spanStyle.m3018getFontStyle4Lr2A7w())) || ((fontWeight2 != null && !fontWeight2.equals(spanStyle.getFontWeight())) || ((fontFamily != null && fontFamily != spanStyle.getFontFamily()) || (TextUnit.m3865getRawTypeimpl(j3) != 0 && !TextUnit.m3864equalsimpl0(j3, spanStyle.m3020getLetterSpacingXSAIIZE())))))) {
            textGeometricTransform2 = textGeometricTransform;
            jM3014getBackground0d7_KjU = j4;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
        } else if (textDecoration == null || textDecoration.equals(spanStyle.getTextDecoration())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{brush, spanStyle.getTextForegroundStyle$ui_text().getBrush()}, getCieXyz.write())).booleanValue() && ((brush == null || f == spanStyle.getTextForegroundStyle$ui_text().getAlpha()) && ((fontSynthesisM3019getFontSynthesisZQGJjVo == null || fontSynthesisM3019getFontSynthesisZQGJjVo.equals(spanStyle.m3019getFontSynthesisZQGJjVo())) && ((fontFeatureSettings == null || fontFeatureSettings.equals(spanStyle.getFontFeatureSettings())) && (baselineShiftM3015getBaselineShift5SSeXJ0 == null || baselineShiftM3015getBaselineShift5SSeXJ0.equals(spanStyle.m3015getBaselineShift5SSeXJ0())))))) {
                textGeometricTransform2 = textGeometricTransform;
                if ((textGeometricTransform2 == null || textGeometricTransform2.equals(spanStyle.getTextGeometricTransform())) && (localeList == null || localeList.equals(spanStyle.getLocaleList()))) {
                    jM3014getBackground0d7_KjU = j4;
                    if ((jM3014getBackground0d7_KjU == 16 || Color.m723equalsimpl0(jM3014getBackground0d7_KjU, spanStyle.m3014getBackground0d7_KjU())) && (shadow == null || shadow.equals(spanStyle.getShadow()))) {
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 == null || platformSpanStyle2.equals(spanStyle.getPlatformStyle())) {
                            drawStyle2 = drawStyle;
                            if (drawStyle2 == null || drawStyle2.equals(spanStyle.getDrawStyle())) {
                                return spanStyle;
                            }
                            spanStyle = spanStyle;
                        } else {
                            spanStyle = spanStyle;
                            drawStyle2 = drawStyle;
                        }
                    } else {
                        spanStyle = spanStyle;
                        platformSpanStyle2 = platformSpanStyle;
                        drawStyle2 = drawStyle;
                    }
                }
            } else {
                textGeometricTransform2 = textGeometricTransform;
            }
            jM3014getBackground0d7_KjU = j4;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
        } else {
            textGeometricTransform2 = textGeometricTransform;
            jM3014getBackground0d7_KjU = j4;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
        }
        if (brush != null) {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.from(brush, f);
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        TextForegroundStyle textForegroundStyleMerge = spanStyle.getTextForegroundStyle$ui_text().merge(textForegroundStyleM3538from8_81llA);
        FontFamily fontFamily2 = fontFamily == null ? spanStyle.getFontFamily() : fontFamily;
        long jM3017getFontSizeXSAIIZE = TextUnit.m3865getRawTypeimpl(j2) == 0 ? spanStyle.m3017getFontSizeXSAIIZE() : j2;
        if (fontWeight2 == null) {
            fontWeight2 = spanStyle.getFontWeight();
        }
        if (fontStyleM3018getFontStyle4Lr2A7w == null) {
            fontStyleM3018getFontStyle4Lr2A7w = spanStyle.m3018getFontStyle4Lr2A7w();
        }
        if (fontSynthesisM3019getFontSynthesisZQGJjVo == null) {
            fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyle.m3019getFontSynthesisZQGJjVo();
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = spanStyle.getFontFeatureSettings();
        }
        long jM3020getLetterSpacingXSAIIZE = TextUnit.m3865getRawTypeimpl(j3) == 0 ? spanStyle.m3020getLetterSpacingXSAIIZE() : j3;
        if (baselineShiftM3015getBaselineShift5SSeXJ0 == null) {
            baselineShiftM3015getBaselineShift5SSeXJ0 = spanStyle.m3015getBaselineShift5SSeXJ0();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
        }
        LocaleList localeList2 = localeList == null ? spanStyle.getLocaleList() : localeList;
        if (jM3014getBackground0d7_KjU == 16) {
            jM3014getBackground0d7_KjU = spanStyle.m3014getBackground0d7_KjU();
        }
        TextDecoration textDecoration2 = textDecoration == null ? spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow2 = shadow == null ? spanStyle.getShadow() : shadow;
        PlatformSpanStyle platformSpanStyleMergePlatformStyle = mergePlatformStyle(spanStyle, platformSpanStyle2);
        if (drawStyle2 == null) {
            drawStyle2 = spanStyle.getDrawStyle();
        }
        return new SpanStyle(textForegroundStyleMerge, jM3017getFontSizeXSAIIZE, fontWeight2, fontStyleM3018getFontStyle4Lr2A7w, fontSynthesisM3019getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, jM3020getLetterSpacingXSAIIZE, baselineShiftM3015getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, jM3014getBackground0d7_KjU, textDecoration2, shadow2, platformSpanStyleMergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
    }
}
