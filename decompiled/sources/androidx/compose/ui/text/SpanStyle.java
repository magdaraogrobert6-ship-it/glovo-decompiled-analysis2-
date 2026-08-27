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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SpanStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m3014getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m3015getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m3017getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m3018getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m3019getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m3020getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text() {
        return this.textForegroundStyle;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final SpanStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    /* JADX INFO: renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m3013copyNcG25M8(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, f), j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3016getColor0d7_KjU() {
        return this.textForegroundStyle.mo3391getColor0d7_KjU();
    }

    public final boolean hasSameNonLayoutAttributes$ui_text(SpanStyle spanStyle) {
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textForegroundStyle, spanStyle.textForegroundStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textDecoration, spanStyle.textDecoration}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shadow, spanStyle.shadow}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.drawStyle, spanStyle.drawStyle}, getCieXyz.write())).booleanValue();
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text() {
        int iM3868hashCodeimpl = TextUnit.m3868hashCodeimpl(this.fontSize);
        FontWeight fontWeight = this.fontWeight;
        int iHashCode = fontWeight != null ? fontWeight.hashCode() : 0;
        FontStyle fontStyle = this.fontStyle;
        int iM3191hashCodeimpl = fontStyle != null ? FontStyle.m3191hashCodeimpl(fontStyle.m3193unboximpl()) : 0;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM3202hashCodeimpl = fontSynthesis != null ? FontSynthesis.m3202hashCodeimpl(fontSynthesis.m3206unboximpl()) : 0;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode2 = fontFamily != null ? fontFamily.hashCode() : 0;
        String str = this.fontFeatureSettings;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        int iM3868hashCodeimpl2 = TextUnit.m3868hashCodeimpl(this.letterSpacing);
        BaselineShift baselineShift = this.baselineShift;
        int iM3377hashCodeimpl = baselineShift != null ? BaselineShift.m3377hashCodeimpl(baselineShift.m3379unboximpl()) : 0;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = textGeometricTransform != null ? textGeometricTransform.hashCode() : 0;
        LocaleList localeList = this.localeList;
        int iIconCompatParcelizer = MediaSessionCompatQueueItem.IconCompatParcelizer((((((((iM3868hashCodeimpl2 + (((((((((((iM3868hashCodeimpl * 31) + iHashCode) * 31) + iM3191hashCodeimpl) * 31) + iM3202hashCodeimpl) * 31) + iHashCode2) * 31) + iHashCode3) * 31)) * 31) + iM3377hashCodeimpl) * 31) + iHashCode4) * 31) + (localeList != null ? localeList.hashCode() : 0)) * 31, 31, this.background);
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        return iIconCompatParcelizer + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m3010copy2BkPm_w(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        if (Color.m723equalsimpl0(j, m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        return new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m3011copyGSF8kmg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        if (Color.m723equalsimpl0(j, m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        return new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return hasSameLayoutAffectingAttributes$ui_text(spanStyle) && hasSameNonLayoutAttributes$ui_text(spanStyle);
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        if (!TextUnit.m3864equalsimpl0(this.fontSize, spanStyle.fontSize)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontWeight, spanStyle.fontWeight}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontStyle, spanStyle.fontStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontSynthesis, spanStyle.fontSynthesis}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontFamily, spanStyle.fontFamily}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontFeatureSettings, spanStyle.fontFeatureSettings}, getCieXyz.write())).booleanValue() || !TextUnit.m3864equalsimpl0(this.letterSpacing, spanStyle.letterSpacing)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.baselineShift, spanStyle.baselineShift}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textGeometricTransform, spanStyle.textGeometricTransform}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.localeList, spanStyle.localeList}, getCieXyz.write())).booleanValue() || !Color.m723equalsimpl0(this.background, spanStyle.background)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformStyle, spanStyle.platformStyle}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        int iM729hashCodeimpl = Color.m729hashCodeimpl(m3016getColor0d7_KjU());
        Brush brush = getBrush();
        int iHashCode = brush != null ? brush.hashCode() : 0;
        int iHashCode2 = Float.hashCode(getAlpha());
        int iM3868hashCodeimpl = TextUnit.m3868hashCodeimpl(this.fontSize);
        FontWeight fontWeight = this.fontWeight;
        int iHashCode3 = fontWeight != null ? fontWeight.hashCode() : 0;
        FontStyle fontStyle = this.fontStyle;
        int iM3191hashCodeimpl = fontStyle != null ? FontStyle.m3191hashCodeimpl(fontStyle.m3193unboximpl()) : 0;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iM3202hashCodeimpl = fontSynthesis != null ? FontSynthesis.m3202hashCodeimpl(fontSynthesis.m3206unboximpl()) : 0;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode4 = fontFamily != null ? fontFamily.hashCode() : 0;
        String str = this.fontFeatureSettings;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        int iM3868hashCodeimpl2 = TextUnit.m3868hashCodeimpl(this.letterSpacing);
        BaselineShift baselineShift = this.baselineShift;
        int iM3377hashCodeimpl = baselineShift != null ? BaselineShift.m3377hashCodeimpl(baselineShift.m3379unboximpl()) : 0;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode6 = textGeometricTransform != null ? textGeometricTransform.hashCode() : 0;
        LocaleList localeList = this.localeList;
        int iIconCompatParcelizer = MediaSessionCompatQueueItem.IconCompatParcelizer((((((((iM3868hashCodeimpl2 + ((((((((((((iM3868hashCodeimpl + ((iHashCode2 + (((iM729hashCodeimpl * 31) + iHashCode) * 31)) * 31)) * 31) + iHashCode3) * 31) + iM3191hashCodeimpl) * 31) + iM3202hashCodeimpl) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31) + iM3377hashCodeimpl) * 31) + iHashCode6) * 31) + (localeList != null ? localeList.hashCode() : 0)) * 31, 31, this.background);
        TextDecoration textDecoration = this.textDecoration;
        int iHashCode7 = textDecoration != null ? textDecoration.hashCode() : 0;
        Shadow shadow = this.shadow;
        int iHashCode8 = shadow != null ? shadow.hashCode() : 0;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = platformSpanStyle != null ? platformSpanStyle.hashCode() : 0;
        DrawStyle drawStyle = this.drawStyle;
        return ((((((iIconCompatParcelizer + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) Color.m730toStringimpl(m3016getColor0d7_KjU()));
        sb.append(", brush=");
        sb.append(getBrush());
        sb.append(", alpha=");
        sb.append(getAlpha());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m3874toStringimpl(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m3874toStringimpl(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.background, ", textDecoration=", sb);
        sb.append(this.textDecoration);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle spanStyle, SpanStyle spanStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            spanStyle2 = null;
        }
        return spanStyle.merge(spanStyle2);
    }

    public final SpanStyle merge(SpanStyle spanStyle) {
        return spanStyle == null ? this : SpanStyleKt.m3021fastMergedSHsh3o(this, spanStyle.textForegroundStyle.mo3391getColor0d7_KjU(), spanStyle.textForegroundStyle.getBrush(), spanStyle.textForegroundStyle.getAlpha(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.background, spanStyle.textDecoration, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : platformSpanStyle, (i & Fields.CompositingStrategy) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m3012copyIuqyXdg(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        TextForegroundStyle textForegroundStyleM3538from8_81llA;
        if (Color.m723equalsimpl0(j, m3016getColor0d7_KjU())) {
            textForegroundStyleM3538from8_81llA = this.textForegroundStyle;
        } else {
            textForegroundStyleM3538from8_81llA = TextForegroundStyle.Companion.m3538from8_81llA(j);
        }
        return new SpanStyle(textForegroundStyleM3538from8_81llA, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, this.platformStyle, this.drawStyle, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle);
    }

    @onItemDismisslambda0
    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, f, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j3;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textForegroundStyle, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j3, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : platformSpanStyle, (i & Fields.CompositingStrategy) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        this(TextForegroundStyle.Companion.m3538from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j3, (i & Fields.RotationX) != 0 ? null : baselineShift, (i & Fields.RotationY) != 0 ? null : textGeometricTransform, (i & Fields.RotationZ) != 0 ? null : localeList, (i & Fields.CameraDistance) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4, (i & Fields.TransformOrigin) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, (i & Fields.Clip) != 0 ? null : platformSpanStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m3538from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, (DrawStyle) null, Fields.CompositingStrategy, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle);
    }

    private SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m3538from8_81llA(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(brush, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : fontWeight, (i & 16) != 0 ? null : fontStyle, (i & 32) != 0 ? null : fontSynthesis, (i & 64) != 0 ? null : fontFamily, (i & Fields.SpotShadowColor) != 0 ? null : str, (i & Fields.RotationX) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j2, (i & Fields.RotationY) != 0 ? null : baselineShift, (i & Fields.RotationZ) != 0 ? null : textGeometricTransform, (i & Fields.CameraDistance) != 0 ? null : localeList, (i & Fields.TransformOrigin) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : textDecoration, (i & Fields.Clip) != 0 ? null : shadow, (32768 & i) != 0 ? null : platformSpanStyle, (i & 65536) != 0 ? null : drawStyle, (DefaultConstructorMarker) null);
    }

    private SpanStyle(Brush brush, float f, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, f), j, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j2, baselineShift, textGeometricTransform, localeList, j3, textDecoration, shadow, platformSpanStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
