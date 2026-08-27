package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning$ui_text() ? androidTextPaint.getFlags() | Fields.SpotShadowColor : androidTextPaint.getFlags() & (-129));
        int iM3545getLinearity4e0Vf04$ui_text = textMotion.m3545getLinearity4e0Vf04$ui_text();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m3549equalsimpl0(iM3545getLinearity4e0Vf04$ui_text, companion.m3554getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m3549equalsimpl0(iM3545getLinearity4e0Vf04$ui_text, companion.m3553getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m3549equalsimpl0(iM3545getLinearity4e0Vf04$ui_text, companion.m3555getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }

    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, Density density, boolean z) {
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(spanStyle.m3017getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo47toPxR2X_6o(spanStyle.m3017getFontSizeXSAIIZE()));
        } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m3867getValueimpl(spanStyle.m3017getFontSizeXSAIIZE()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM3018getFontStyle4Lr2A7w = spanStyle.m3018getFontStyle4Lr2A7w();
            FontStyle fontStyleM3187boximpl = FontStyle.m3187boximpl(fontStyleM3018getFontStyle4Lr2A7w != null ? fontStyleM3018getFontStyle4Lr2A7w.m3193unboximpl() : FontStyle.Companion.m3197getNormal_LCdwA());
            FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyle.m3019getFontSynthesisZQGJjVo();
            androidTextPaint.setTypeface((Typeface) r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(fontFamily, fontWeight, fontStyleM3187boximpl, FontSynthesis.m3198boximpl(fontSynthesisM3019getFontSynthesisZQGJjVo != null ? fontSynthesisM3019getFontSynthesisZQGJjVo.m3206unboximpl() : FontSynthesis.Companion.m3207getAllGVVA2EU())));
        }
        if (spanStyle.getLocaleList() != null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{spanStyle.getLocaleList(), LocaleList.Companion.getCurrent()}, getCieXyz.write())).booleanValue()) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
            }
        }
        if (spanStyle.getFontFeatureSettings() != null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{spanStyle.getFontFeatureSettings(), ""}, getCieXyz.write())).booleanValue()) {
                androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text()}, getCieXyz.write())).booleanValue()) {
                androidTextPaint.setTextScaleX(spanStyle.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
                androidTextPaint.setTextSkewX(spanStyle.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
            }
        }
        androidTextPaint.m3350setColor8_81llA(spanStyle.m3016getColor0d7_KjU());
        androidTextPaint.m3348setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m554getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(spanStyle.m3020getLetterSpacingXSAIIZE()), companion.m3900getSpUIouoOA()) && TextUnit.m3867getValueimpl(spanStyle.m3020getLetterSpacingXSAIIZE()) != 0.0f) {
            float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
            float fMo47toPxR2X_6o = density.mo47toPxR2X_6o(spanStyle.m3020getLetterSpacingXSAIIZE());
            if (textScaleX != 0.0f) {
                androidTextPaint.setLetterSpacing(fMo47toPxR2X_6o / textScaleX);
            }
        } else if (TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(spanStyle.m3020getLetterSpacingXSAIIZE()), companion.m3899getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m3867getValueimpl(spanStyle.m3020getLetterSpacingXSAIIZE()));
        }
        return m3365generateFallbackSpanStyle62GTOB8(spanStyle.m3020getLetterSpacingXSAIIZE(), z, spanStyle.m3014getBackground0d7_KjU(), spanStyle.m3015getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, density, z);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m3365generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, BaselineShift baselineShift) {
        boolean z2;
        long jM758getUnspecified0d7_KjU = j2;
        boolean z3 = z && TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(j), TextUnitType.Companion.m3900getSpUIouoOA()) && TextUnit.m3867getValueimpl(j) != 0.0f;
        Color.Companion companion = Color.Companion;
        boolean z4 = (Color.m723equalsimpl0(jM758getUnspecified0d7_KjU, companion.m758getUnspecified0d7_KjU()) || Color.m723equalsimpl0(jM758getUnspecified0d7_KjU, companion.m757getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            z2 = BaselineShift.m3376equalsimpl0(baselineShift.m3379unboximpl(), BaselineShift.Companion.m3384getNoney9eOQZs()) ? false : true;
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long jM3878getUnspecifiedXSAIIZE = z3 ? j : TextUnit.Companion.m3878getUnspecifiedXSAIIZE();
        if (!z4) {
            jM758getUnspecified0d7_KjU = companion.m758getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM3878getUnspecifiedXSAIIZE, z2 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM758getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m3018getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
