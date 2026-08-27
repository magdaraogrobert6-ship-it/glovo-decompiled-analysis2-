package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.Bullet;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import o.DrawableTransformation;
import o.createFromParcel;
import o.forEachGesturableIntersection;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    /* JADX INFO: renamed from: resolveBulletTextUnitToPx-o2QH7mI, reason: not valid java name */
    private static final float m3357resolveBulletTextUnitToPxo2QH7mI(long j, float f, Density density) {
        if (TextUnit.m3864equalsimpl0(j, TextUnit.Companion.m3878getUnspecifiedXSAIIZE())) {
            return f;
        }
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            return density.mo47toPxR2X_6o(j);
        }
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            return TextUnit.m3867getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m3360setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i, int i2) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m3379unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i, int i2) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m3361setColorRPmYEkk(spannable, ((SolidColor) brush).m1081getValue0d7_KjU(), i, i2);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i, i2);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setFontAttributes$lambda$2(Spannable spannable, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, SpanStyle spanStyle, int i, int i2) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle fontStyleM3018getFontStyle4Lr2A7w = spanStyle.m3018getFontStyle4Lr2A7w();
        FontStyle fontStyleM3187boximpl = FontStyle.m3187boximpl(fontStyleM3018getFontStyle4Lr2A7w != null ? fontStyleM3018getFontStyle4Lr2A7w.m3193unboximpl() : FontStyle.Companion.m3197getNormal_LCdwA());
        FontSynthesis fontSynthesisM3019getFontSynthesisZQGJjVo = spanStyle.m3019getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan((Typeface) r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(fontFamily, fontWeight, fontStyleM3187boximpl, FontSynthesis.m3198boximpl(fontSynthesisM3019getFontSynthesisZQGJjVo != null ? fontSynthesisM3019getFontSynthesisZQGJjVo.m3206unboximpl() : FontSynthesis.Companion.m3207getAllGVVA2EU()))), i, i2, 33);
        return createFromParcel.INSTANCE;
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i, i2);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        float fM3867getValueimpl;
        if (textIndent != null) {
            if ((TextUnit.m3864equalsimpl0(textIndent.m3541getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m3864equalsimpl0(textIndent.m3542getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnit.m3865getRawTypeimpl(textIndent.m3541getFirstLineXSAIIZE()) == 0 || TextUnit.m3865getRawTypeimpl(textIndent.m3542getRestLineXSAIIZE()) == 0) {
                return;
            }
            long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(textIndent.m3541getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            float fM3867getValueimpl2 = 0.0f;
            if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
                fM3867getValueimpl = density.mo47toPxR2X_6o(textIndent.m3541getFirstLineXSAIIZE());
            } else {
                fM3867getValueimpl = TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA()) ? TextUnit.m3867getValueimpl(textIndent.m3541getFirstLineXSAIIZE()) * f : 0.0f;
            }
            long jM3866getTypeUIouoOA2 = TextUnit.m3866getTypeUIouoOA(textIndent.m3542getRestLineXSAIIZE());
            if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA2, companion.m3900getSpUIouoOA())) {
                fM3867getValueimpl2 = density.mo47toPxR2X_6o(textIndent.m3542getRestLineXSAIIZE());
            } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA2, companion.m3899getEmUIouoOA())) {
                fM3867getValueimpl2 = TextUnit.m3867getValueimpl(textIndent.m3542getRestLineXSAIIZE()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fM3867getValueimpl), (int) Math.ceil(fM3867getValueimpl2)), 0, spannable.length());
        }
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m3356createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo47toPxR2X_6o(j));
        }
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m3867getValueimpl(j));
        }
        return null;
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(spanStyle.m3020getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA()) || TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(spanStyle.m3020getLetterSpacingXSAIIZE()), companion.m3899getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m3109getFontSynthesisZQGJjVo() != null;
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m3358resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        float fM3867getValueimpl;
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo47toPxR2X_6o(j);
            }
            fM3867getValueimpl = TextUnit.m3867getValueimpl(j) / TextUnit.m3867getValueimpl(density.mo51toSpkPz2Gy4(f));
        } else {
            if (!TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
                return Float.NaN;
            }
            fM3867getValueimpl = TextUnit.m3867getValueimpl(j);
        }
        return fM3867getValueimpl * f;
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i, int i2) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i, i2);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        SpanStyle spanStyle;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if ((range.getItem() instanceof SpanStyle) && (TextPaintExtensions_androidKt.hasFontAttributes((SpanStyle) range.getItem()) || ((SpanStyle) range.getItem()).m3019getFontSynthesisZQGJjVo() != null)) {
                arrayList.add(range);
            }
        }
        if (hasFontAttributes(textStyle)) {
            long j = 0;
            long j2 = 0;
            spanStyle = new SpanStyle(j, j2, textStyle.getFontWeight(), textStyle.m3108getFontStyle4Lr2A7w(), textStyle.m3109getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (DefaultConstructorMarker) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new forEachGesturableIntersection(spannable, 1, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i, i2);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m3362setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i, int i2) {
        long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(MathKt.write(density.mo47toPxR2X_6o(j)), false), i, i2);
        } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m3867getValueimpl(j)), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i, int i2) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i, i2);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i, i2);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m3363setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        float fM3358resolveLineHeightInPxo2QH7mI = m3358resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM3358resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM3358resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || hideCurrentlyDisplayingInAppMessage.write(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m3496isTrimFirstLineTopimpl$ui_text(lineHeightStyle.m3469getTrimEVpEnUU()), LineHeightStyle.Trim.m3497isTrimLastLineBottomimpl$ui_text(lineHeightStyle.m3469getTrimEVpEnUU()), lineHeightStyle.m3467getAlignmentPIaL0Z0(), lineHeightStyle.m3468getModelzQqcRY(), null), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m3364setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        float fM3358resolveLineHeightInPxo2QH7mI = m3358resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM3358resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM3358resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i, int i2) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m776toArgb8_81llA(shadow.m1069getColor0d7_KjU()), Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (shadow.m1070getOffsetF1C5BW0() & 4294967295L)), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i, i2);
        }
    }

    private static final void setSpanStyle(Spannable spannable, SpanStyle spanStyle, int i, int i2, Density density) {
        m3360setBaselineShift0ocSgnM(spannable, spanStyle.m3015getBaselineShift5SSeXJ0(), i, i2);
        m3361setColorRPmYEkk(spannable, spanStyle.m3016getColor0d7_KjU(), i, i2);
        setBrush(spannable, spanStyle.getBrush(), spanStyle.getAlpha(), i, i2);
        setTextDecoration(spannable, spanStyle.getTextDecoration(), i, i2);
        m3362setFontSizeKmRG4DE(spannable, spanStyle.m3017getFontSizeXSAIIZE(), density, i, i2);
        setFontFeatureSettings(spannable, spanStyle.getFontFeatureSettings(), i, i2);
        setGeometricTransform(spannable, spanStyle.getTextGeometricTransform(), i, i2);
        setLocaleList(spannable, spanStyle.getLocaleList(), i, i2);
        m3359setBackgroundRPmYEkk(spannable, spanStyle.m3014getBackground0d7_KjU(), i, i2);
        setShadow(spannable, spanStyle.getShadow(), i, i2);
        setDrawStyle(spannable, spanStyle.getDrawStyle(), i, i2);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        MetricAffectingSpan metricAffectingSpanM3356createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds);
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list.get(i);
            if (range.getItem() instanceof SpanStyle) {
                int start = range.getStart();
                int end = range.getEnd();
                if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                    setSpanStyle(spannable, (SpanStyle) range.getItem(), start, end, density);
                    if (getNeedsLetterSpacingSpan((SpanStyle) range.getItem())) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = list.get(i2);
                AnnotatedString.Annotation item = range2.getItem();
                if (item instanceof SpanStyle) {
                    int start2 = range2.getStart();
                    int end2 = range2.getEnd();
                    if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM3356createLetterSpacingSpaneAf_CNQ = m3356createLetterSpacingSpaneAf_CNQ(((SpanStyle) item).m3020getLetterSpacingXSAIIZE(), density)) != null) {
                        setSpan(spannable, metricAffectingSpanM3356createLetterSpacingSpaneAf_CNQ, start2, end2);
                    }
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i, int i2) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i, i2);
        }
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m3359setBackgroundRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m776toArgb8_81llA(j)), i, i2);
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m3361setColorRPmYEkk(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m776toArgb8_81llA(j)), i, i2);
        }
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        int[] iArr = new int[i];
        List<AnnotatedString.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            iArr[i2] = range.getStart();
            iArr[i2 + size] = range.getEnd();
        }
        if (i > 1) {
            Arrays.sort(iArr);
        }
        if (i == 0) {
            DrawableTransformation.write("Array is empty.");
            return;
        }
        int i3 = iArr[0];
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            if (i5 != i3) {
                int size3 = list2.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i6 = 0; i6 < size3; i6++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(i3, i5, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(spanStyleMerge, Integer.valueOf(i3), Integer.valueOf(i5));
                }
                i3 = i5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    public static final void setBulletSpans(Spannable spannable, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, float f, Density density, TextIndent textIndent) {
        float fM3867getValueimpl;
        List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list2 = list;
        if (textIndent != null) {
            long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(textIndent.m3541getFirstLineXSAIIZE());
            TextUnitType.Companion companion = TextUnitType.Companion;
            if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
                fM3867getValueimpl = density.mo47toPxR2X_6o(textIndent.m3541getFirstLineXSAIIZE());
            } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
                fM3867getValueimpl = TextUnit.m3867getValueimpl(textIndent.m3541getFirstLineXSAIIZE()) * f;
            } else {
                fM3867getValueimpl = 0.0f;
            }
        } else {
            fM3867getValueimpl = 0.0f;
        }
        float f2 = fM3867getValueimpl;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range = list2.get(i);
            AnnotatedString.Annotation item = range.getItem();
            Bullet bullet = item instanceof Bullet ? (Bullet) item : null;
            if (bullet != null) {
                float fM3357resolveBulletTextUnitToPxo2QH7mI = m3357resolveBulletTextUnitToPxo2QH7mI(bullet.m2892getWidthXSAIIZE(), f, density);
                float fM3357resolveBulletTextUnitToPxo2QH7mI2 = m3357resolveBulletTextUnitToPxo2QH7mI(bullet.m2890getHeightXSAIIZE(), f, density);
                float fM3357resolveBulletTextUnitToPxo2QH7mI3 = m3357resolveBulletTextUnitToPxo2QH7mI(bullet.m2891getPaddingXSAIIZE(), f, density);
                if (!Float.isNaN(fM3357resolveBulletTextUnitToPxo2QH7mI) && !Float.isNaN(fM3357resolveBulletTextUnitToPxo2QH7mI2) && !Float.isNaN(fM3357resolveBulletTextUnitToPxo2QH7mI3)) {
                    setSpan(spannable, new CustomBulletSpan(bullet.getShape(), fM3357resolveBulletTextUnitToPxo2QH7mI, fM3357resolveBulletTextUnitToPxo2QH7mI2, fM3357resolveBulletTextUnitToPxo2QH7mI3, bullet.getBrush(), bullet.getAlpha(), bullet.getDrawStyle(), density, f2), range.getStart(), range.getEnd());
                }
            }
            i++;
            list2 = list;
        }
    }
}
