package androidx.compose.ui.text;

import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m3878getUnspecifiedXSAIIZE();

    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f) {
        int iM3510unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m3504boximpl(paragraphStyle.m2955getTextAligne0LSkKk()), TextAlign.m3504boximpl(paragraphStyle2.m2955getTextAligne0LSkKk()), f)).m3510unboximpl();
        int iM3527unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m3521boximpl(paragraphStyle.m2957getTextDirections_7Xco()), TextDirection.m3521boximpl(paragraphStyle2.m2957getTextDirections_7Xco()), f)).m3527unboximpl();
        long jM3022lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m3022lerpTextUnitInheritableC3pnCVY(paragraphStyle.m2953getLineHeightXSAIIZE(), paragraphStyle2.m2953getLineHeightXSAIIZE(), f);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(iM3510unboximpl, iM3527unboximpl, jM3022lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m3409boximpl(paragraphStyle.m2952getLineBreakrAG3T2k()), LineBreak.m3409boximpl(paragraphStyle2.m2952getLineBreakrAG3T2k()), f)).m3421unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m3396boximpl(paragraphStyle.m2950getHyphensvmbZdU8()), Hyphens.m3396boximpl(paragraphStyle2.m2950getHyphensvmbZdU8()), f)).m3402unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    public static final ParagraphStyle resolveParagraphStyleDefaults(ParagraphStyle paragraphStyle, LayoutDirection layoutDirection) {
        int iM2955getTextAligne0LSkKk = paragraphStyle.m2955getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        int iM3516getStarte0LSkKk = TextAlign.m3507equalsimpl0(iM2955getTextAligne0LSkKk, companion.m3517getUnspecifiede0LSkKk()) ? companion.m3516getStarte0LSkKk() : paragraphStyle.m2955getTextAligne0LSkKk();
        int iM3122resolveTextDirectionIhaHGbI = TextStyleKt.m3122resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m2957getTextDirections_7Xco());
        long jM2953getLineHeightXSAIIZE = TextUnit.m3865getRawTypeimpl(paragraphStyle.m2953getLineHeightXSAIIZE()) == 0 ? DefaultLineHeight : paragraphStyle.m2953getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int iM2952getLineBreakrAG3T2k = paragraphStyle.m2952getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        int iM3428getSimplerAG3T2k = LineBreak.m3415equalsimpl0(iM2952getLineBreakrAG3T2k, companion2.m3429getUnspecifiedrAG3T2k()) ? companion2.m3428getSimplerAG3T2k() : paragraphStyle.m2952getLineBreakrAG3T2k();
        int iM2950getHyphensvmbZdU8 = paragraphStyle.m2950getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        int iM3404getNonevmbZdU8 = Hyphens.m3399equalsimpl0(iM2950getHyphensvmbZdU8, companion3.m3405getUnspecifiedvmbZdU8()) ? companion3.m3404getNonevmbZdU8() : paragraphStyle.m2950getHyphensvmbZdU8();
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(iM3516getStarte0LSkKk, iM3122resolveTextDirectionIhaHGbI, jM2953getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, iM3428getSimplerAG3T2k, iM3404getNonevmbZdU8, textMotion, (DefaultConstructorMarker) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        return platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    /* JADX INFO: renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final ParagraphStyle m2958fastMergej5T8yCg(ParagraphStyle paragraphStyle, int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        long j2;
        int iM2955getTextAligne0LSkKk = i;
        TextIndent textIndent2 = textIndent;
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m3507equalsimpl0(iM2955getTextAligne0LSkKk, companion.m3517getUnspecifiede0LSkKk()) || TextAlign.m3507equalsimpl0(iM2955getTextAligne0LSkKk, paragraphStyle.m2955getTextAligne0LSkKk())) {
            if (TextUnit.m3865getRawTypeimpl(j) == 0) {
                j2 = j;
            } else {
                j2 = j;
                if (TextUnit.m3864equalsimpl0(j2, paragraphStyle.m2953getLineHeightXSAIIZE())) {
                }
            }
            if ((textIndent2 == null || textIndent2.equals(paragraphStyle.getTextIndent())) && ((TextDirection.m3524equalsimpl0(i2, TextDirection.Companion.m3533getUnspecifieds_7Xco()) || TextDirection.m3524equalsimpl0(i2, paragraphStyle.m2957getTextDirections_7Xco())) && ((platformParagraphStyle == null || platformParagraphStyle.equals(paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || lineHeightStyle.equals(paragraphStyle.getLineHeightStyle())) && ((LineBreak.m3415equalsimpl0(i3, LineBreak.Companion.m3429getUnspecifiedrAG3T2k()) || LineBreak.m3415equalsimpl0(i3, paragraphStyle.m2952getLineBreakrAG3T2k())) && ((Hyphens.m3399equalsimpl0(i4, Hyphens.Companion.m3405getUnspecifiedvmbZdU8()) || Hyphens.m3399equalsimpl0(i4, paragraphStyle.m2950getHyphensvmbZdU8())) && (textMotion == null || textMotion.equals(paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j2 = j;
        }
        long jM2953getLineHeightXSAIIZE = TextUnit.m3865getRawTypeimpl(j) == 0 ? paragraphStyle.m2953getLineHeightXSAIIZE() : j2;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (TextAlign.m3507equalsimpl0(iM2955getTextAligne0LSkKk, companion.m3517getUnspecifiede0LSkKk())) {
            iM2955getTextAligne0LSkKk = paragraphStyle.m2955getTextAligne0LSkKk();
        }
        return new ParagraphStyle(iM2955getTextAligne0LSkKk, !TextDirection.m3524equalsimpl0(i2, TextDirection.Companion.m3533getUnspecifieds_7Xco()) ? i2 : paragraphStyle.m2957getTextDirections_7Xco(), jM2953getLineHeightXSAIIZE, textIndent3, mergePlatformStyle(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !LineBreak.m3415equalsimpl0(i3, LineBreak.Companion.m3429getUnspecifiedrAG3T2k()) ? i3 : paragraphStyle.m2952getLineBreakrAG3T2k(), !Hyphens.m3399equalsimpl0(i4, Hyphens.Companion.m3405getUnspecifiedvmbZdU8()) ? i4 : paragraphStyle.m2950getHyphensvmbZdU8(), textMotion == null ? paragraphStyle.getTextMotion() : textMotion, (DefaultConstructorMarker) null);
    }
}
