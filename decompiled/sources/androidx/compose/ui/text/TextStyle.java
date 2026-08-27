package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777215, (DefaultConstructorMarker) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m3091getHyphensEaSxIns$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m3092getLineBreakLgCVezo$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m3093getTextAlignbuA522U$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m3094getTextDirectionmmuk1to$annotations() {
    }

    public final ParagraphStyle getParagraphStyle$ui_text() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final SpanStyle getSpanStyle$ui_text() {
        return this.spanStyle;
    }

    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m3104getBackground0d7_KjU() {
        return this.spanStyle.m3014getBackground0d7_KjU();
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m3105getBaselineShift5SSeXJ0() {
        return this.spanStyle.m3015getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3106getColor0d7_KjU() {
        return this.spanStyle.m3016getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m3107getFontSizeXSAIIZE() {
        return this.spanStyle.m3017getFontSizeXSAIIZE();
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m3108getFontStyle4Lr2A7w() {
        return this.spanStyle.m3018getFontStyle4Lr2A7w();
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m3109getFontSynthesisZQGJjVo() {
        return this.spanStyle.m3019getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m3111getHyphensvmbZdU8() {
        return this.paragraphStyle.m2950getHyphensvmbZdU8();
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m3112getLetterSpacingXSAIIZE() {
        return this.spanStyle.m3020getLetterSpacingXSAIIZE();
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m3114getLineBreakrAG3T2k() {
        return this.paragraphStyle.m2952getLineBreakrAG3T2k();
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3115getLineHeightXSAIIZE() {
        return this.paragraphStyle.m2953getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m3117getTextAligne0LSkKk() {
        return this.paragraphStyle.m2955getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m3119getTextDirections_7Xco() {
        return this.paragraphStyle.m2957getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        return this == textStyle || this.spanStyle.hasSameNonLayoutAttributes$ui_text(textStyle.spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this == textStyle) {
            return true;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paragraphStyle, textStyle.paragraphStyle}, getCieXyz.write())).booleanValue() && this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(textStyle.spanStyle);
    }

    public int hashCode() {
        int iHashCode = this.spanStyle.hashCode();
        int iHashCode2 = this.paragraphStyle.hashCode();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int iHashCodeLayoutAffectingAttributes$ui_text = this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text();
        int iHashCode = this.paragraphStyle.hashCode();
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return ((iHashCode + (iHashCodeLayoutAffectingAttributes$ui_text * 31)) * 31) + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || textStyle.equals(Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m3120mergeZ1GrekI(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM3021fastMergedSHsh3o = SpanStyleKt.m3021fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM2958fastMergej5T8yCg = ParagraphStyleKt.m2958fastMergej5T8yCg(this.paragraphStyle, textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), textMotion);
        return (this.spanStyle == spanStyleM3021fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM2958fastMergej5T8yCg) ? this : new TextStyle(spanStyleM3021fastMergedSHsh3o, paragraphStyleM2958fastMergej5T8yCg);
    }

    /* JADX INFO: renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m3121mergedA7vx0o(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i3, int i4, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        SpanStyle spanStyleM3021fastMergedSHsh3o = SpanStyleKt.m3021fastMergedSHsh3o(this.spanStyle, j, null, Float.NaN, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleM2958fastMergej5T8yCg = ParagraphStyleKt.m2958fastMergej5T8yCg(this.paragraphStyle, i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion);
        return (this.spanStyle == spanStyleM3021fastMergedSHsh3o && this.paragraphStyle == paragraphStyleM2958fastMergej5T8yCg) ? this : new TextStyle(spanStyleM3021fastMergedSHsh3o, paragraphStyleM2958fastMergej5T8yCg);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.spanStyle, textStyle.spanStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paragraphStyle, textStyle.paragraphStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformStyle, textStyle.platformStyle}, getCieXyz.write())).booleanValue();
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m3110getHyphensEaSxIns() {
        return Hyphens.m3396boximpl(m3111getHyphensvmbZdU8());
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m3113getLineBreakLgCVezo() {
        return LineBreak.m3409boximpl(m3114getLineBreakrAG3T2k());
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m3116getTextAlignbuA522U() {
        return TextAlign.m3504boximpl(m3117getTextAligne0LSkKk());
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m3118getTextDirectionmmuk1to() {
        return TextDirection.m3521boximpl(m3119getTextDirections_7Xco());
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m730toStringimpl(m3106getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m3874toStringimpl(m3107getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m3108getFontStyle4Lr2A7w() + ", fontSynthesis=" + m3109getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m3874toStringimpl(m3112getLetterSpacingXSAIIZE())) + ", baselineShift=" + m3105getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m730toStringimpl(m3104getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m3509toStringimpl(m3117getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m3526toStringimpl(m3119getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m3874toStringimpl(m3115getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m3420toStringimpl(m3114getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m3401toStringimpl(m3111getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i5 & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i5 & Fields.RotationX) != 0 ? null : baselineShift, (i5 & Fields.RotationY) != 0 ? null : textGeometricTransform, (i5 & Fields.RotationZ) != 0 ? null : localeList, (i5 & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i5 & Fields.TransformOrigin) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, (i5 & Fields.Clip) != 0 ? null : drawStyle, (i5 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m3517getUnspecifiede0LSkKk() : i, (i5 & 65536) != 0 ? TextDirection.Companion.m3533getUnspecifieds_7Xco() : i2, (i5 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j5, (i5 & Fields.ColorFilter) != 0 ? null : textIndent, (i5 & Fields.BlendMode) != 0 ? null : platformTextStyle, (i5 & 1048576) != 0 ? null : lineHeightStyle, (i5 & 2097152) != 0 ? LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : i3, (i5 & 4194304) != 0 ? Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : i4, (i5 & 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m3098copyHL5avdY(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        if (Color.m723equalsimpl0(j, this.spanStyle.m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text();
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null);
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM3517getUnspecifiede0LSkKk, iM3533getUnspecifieds_7Xco, j5, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m3114getLineBreakrAG3T2k(), m3111getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), this.platformStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m3097copyCXVQc50(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        int iM3429getUnspecifiedrAG3T2k;
        int iM3405getUnspecifiedvmbZdU8;
        if (Color.m723equalsimpl0(j, this.spanStyle.m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text();
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, getDrawStyle(), (DefaultConstructorMarker) null);
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            iM3429getUnspecifiedrAG3T2k = lineBreak.m3421unboximpl();
        } else {
            iM3429getUnspecifiedrAG3T2k = LineBreak.Companion.m3429getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            iM3405getUnspecifiedvmbZdU8 = hyphens.m3402unboximpl();
        } else {
            iM3405getUnspecifiedvmbZdU8 = Hyphens.Companion.m3405getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM3517getUnspecifiede0LSkKk, iM3533getUnspecifieds_7Xco, j5, textIndent, paragraphStyle, lineHeightStyle, iM3429getUnspecifiedrAG3T2k, iM3405getUnspecifiedvmbZdU8, getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m3099copyNOaFTUo(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        if (Color.m723equalsimpl0(j, this.spanStyle.m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text();
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (DefaultConstructorMarker) null);
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM3517getUnspecifiede0LSkKk, iM3533getUnspecifieds_7Xco, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m3114getLineBreakrAG3T2k(), m3111getHyphensvmbZdU8(), getTextMotion(), (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m3100copyNs73l9s(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m3101copyaIRg9q4(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        int iM3429getUnspecifiedrAG3T2k;
        int iM3405getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            iM3429getUnspecifiedrAG3T2k = lineBreak.m3421unboximpl();
        } else {
            iM3429getUnspecifiedrAG3T2k = LineBreak.Companion.m3429getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            iM3405getUnspecifiedvmbZdU8 = hyphens.m3402unboximpl();
        } else {
            iM3405getUnspecifiedvmbZdU8 = Hyphens.Companion.m3405getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM3517getUnspecifiede0LSkKk, iM3533getUnspecifieds_7Xco, j4, textIndent, paragraphStyle, lineHeightStyle, iM3429getUnspecifiedrAG3T2k, iM3405getUnspecifiedvmbZdU8, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    /* JADX INFO: renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m3102copyp1EtxEg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        if (Color.m723equalsimpl0(j, this.spanStyle.m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text();
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        return new TextStyle(new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m3103copyv2rsoow(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        int iM3429getUnspecifiedrAG3T2k;
        int iM3405getUnspecifiedvmbZdU8;
        if (Color.m723equalsimpl0(j, this.spanStyle.m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text();
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null);
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        PlatformParagraphStyle paragraphStyle = platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null;
        if (lineBreak != null) {
            iM3429getUnspecifiedrAG3T2k = lineBreak.m3421unboximpl();
        } else {
            iM3429getUnspecifiedrAG3T2k = LineBreak.Companion.m3429getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            iM3405getUnspecifiedvmbZdU8 = hyphens.m3402unboximpl();
        } else {
            iM3405getUnspecifiedvmbZdU8 = Hyphens.Companion.m3405getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(iM3517getUnspecifiede0LSkKk, iM3533getUnspecifieds_7Xco, j5, textIndent, paragraphStyle, lineHeightStyle, iM3429getUnspecifiedrAG3T2k, iM3405getUnspecifiedvmbZdU8, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    @onItemDismisslambda0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @onItemDismisslambda0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @onItemDismisslambda0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent, platformTextStyle, lineHeightStyle);
    }

    @onItemDismisslambda0
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, textAlign, textDirection, j5, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, i, i2, j4, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    @onItemDismisslambda0
    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, drawStyle, textAlign, textDirection, j4, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spanStyle, paragraphStyle, (i & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : textAlign, (i & Fields.CompositingStrategy) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j5, (i & Fields.RenderEffect) != 0 ? null : textIndent, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent) {
        SpanStyle spanStyle = new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, (DefaultConstructorMarker) null);
        this(spanStyle, new ParagraphStyle(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j5, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), null);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : textAlign, (i & Fields.CompositingStrategy) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j5, (i & Fields.RenderEffect) != 0 ? null : textIndent, (i & Fields.ColorFilter) != 0 ? null : platformTextStyle, (i & Fields.BlendMode) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : textAlign, (i & Fields.CompositingStrategy) != 0 ? null : textDirection, (i & 65536) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j5, (i & Fields.RenderEffect) != 0 ? null : textIndent, (i & Fields.ColorFilter) != 0 ? null : platformTextStyle, (i & Fields.BlendMode) != 0 ? null : lineHeightStyle, (i & 1048576) != 0 ? null : lineBreak, (i & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, Fields.RotationX, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : drawStyle, (i & Fields.CompositingStrategy) != 0 ? null : textAlign, (i & 65536) != 0 ? null : textDirection, (i & Fields.RenderEffect) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j5, (i & Fields.ColorFilter) != 0 ? null : textIndent, (i & Fields.BlendMode) != 0 ? null : platformTextStyle, (i & 1048576) != 0 ? null : lineHeightStyle, (i & 2097152) != 0 ? null : lineBreak, (i & 4194304) != 0 ? null : hyphens, (i & 8388608) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, drawStyle, i, i2, j5, textIndent, platformTextStyle, lineHeightStyle, i3, i4, textMotion);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i5 & 2) != 0 ? Float.NaN : f, (i5 & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : fontWeight, (i5 & 16) != 0 ? null : fontStyle, (i5 & 32) != 0 ? null : fontSynthesis, (i5 & 64) != 0 ? null : fontFamily, (i5 & Fields.SpotShadowColor) != 0 ? null : str, (i5 & Fields.RotationX) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i5 & Fields.RotationY) != 0 ? null : baselineShift, (i5 & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i5 & Fields.CameraDistance) != 0 ? null : localeList, (i5 & Fields.TransformOrigin) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j3, (i5 & 8192) != 0 ? null : textDecoration, (i5 & Fields.Clip) != 0 ? null : shadow, (32768 & i5) != 0 ? null : drawStyle, (65536 & i5) != 0 ? TextAlign.Companion.m3517getUnspecifiede0LSkKk() : i, (131072 & i5) != 0 ? TextDirection.Companion.m3533getUnspecifieds_7Xco() : i2, (262144 & i5) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j4, (524288 & i5) != 0 ? null : textIndent, (1048576 & i5) != 0 ? null : platformTextStyle, (2097152 & i5) != 0 ? null : lineHeightStyle, (4194304 & i5) != 0 ? LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : i3, (8388608 & i5) != 0 ? Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : i4, (i5 & 16777216) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i, int i2, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(i, i2, j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i3, i4, textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & Fields.SpotShadowColor) != 0 ? null : str, (i & Fields.RotationX) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationY) != 0 ? null : baselineShift, (i & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i & Fields.CameraDistance) != 0 ? null : localeList, (i & Fields.TransformOrigin) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & Fields.Clip) != 0 ? null : shadow, (32768 & i) != 0 ? null : drawStyle, (65536 & i) != 0 ? null : textAlign, (131072 & i) != 0 ? null : textDirection, (262144 & i) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j4, (524288 & i) != 0 ? null : textIndent, (1048576 & i) != 0 ? null : platformTextStyle, (2097152 & i) != 0 ? null : lineHeightStyle, (4194304 & i) != 0 ? null : lineBreak, (8388608 & i) != 0 ? null : hyphens, (i & 16777216) != 0 ? null : textMotion, (DefaultConstructorMarker) null);
    }

    private TextStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j4, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j4, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null), platformTextStyle);
    }
}
