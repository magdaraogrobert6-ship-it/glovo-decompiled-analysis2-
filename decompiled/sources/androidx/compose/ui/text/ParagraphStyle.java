package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m2940getHyphensEaSxIns$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m2941getLineBreakLgCVezo$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m2942getTextAlignbuA522U$annotations() {
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m2943getTextDirectionmmuk1to$annotations() {
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m2950getHyphensvmbZdU8() {
        return this.hyphens;
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m2952getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m2953getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m2955getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m2957getTextDirections_7Xco() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m2949getHyphensEaSxIns() {
        return Hyphens.m3396boximpl(this.hyphens);
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m2951getLineBreakLgCVezo() {
        return LineBreak.m3409boximpl(this.lineBreak);
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m2954getTextAlignbuA522U() {
        return TextAlign.m3504boximpl(this.textAlign);
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m2956getTextDirectionmmuk1to() {
        return TextDirection.m3521boximpl(this.textDirection);
    }

    public int hashCode() {
        int iM3508hashCodeimpl = TextAlign.m3508hashCodeimpl(this.textAlign);
        int iM3525hashCodeimpl = TextDirection.m3525hashCodeimpl(this.textDirection);
        int iM3868hashCodeimpl = TextUnit.m3868hashCodeimpl(this.lineHeight);
        TextIndent textIndent = this.textIndent;
        int iHashCode = textIndent != null ? textIndent.hashCode() : 0;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = lineHeightStyle != null ? lineHeightStyle.hashCode() : 0;
        int iM3419hashCodeimpl = LineBreak.m3419hashCodeimpl(this.lineBreak);
        int iM3400hashCodeimpl = Hyphens.m3400hashCodeimpl(this.hyphens);
        TextMotion textMotion = this.textMotion;
        return ((iM3400hashCodeimpl + ((iM3419hashCodeimpl + ((((((((iM3868hashCodeimpl + ((iM3525hashCodeimpl + (iM3508hashCodeimpl * 31)) * 31)) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31)) * 31)) * 31) + (textMotion != null ? textMotion.hashCode() : 0);
    }

    public final ParagraphStyle merge(ParagraphStyle paragraphStyle) {
        return paragraphStyle == null ? this : ParagraphStyleKt.m2958fastMergej5T8yCg(this, paragraphStyle.textAlign, paragraphStyle.textDirection, paragraphStyle.lineHeight, paragraphStyle.textIndent, paragraphStyle.platformStyle, paragraphStyle.lineHeightStyle, paragraphStyle.lineBreak, paragraphStyle.hyphens, paragraphStyle.textMotion);
    }

    /* JADX INFO: renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m2935copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m3504boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m3521boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m2944copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    /* JADX INFO: renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m2938copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = TextAlign.m3504boximpl(paragraphStyle.textAlign);
        }
        if ((i & 2) != 0) {
            textDirection = TextDirection.m3521boximpl(paragraphStyle.textDirection);
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.lineHeight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        return paragraphStyle.m2947copyxPh5V4g(textAlign, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m2944copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        int i = iM3517getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i, iM3533getUnspecifieds_7Xco, j, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m2945copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        int iM3429getUnspecifiedrAG3T2k;
        int iM3405getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        int i = iM3517getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        int i2 = iM3533getUnspecifieds_7Xco;
        if (lineBreak != null) {
            iM3429getUnspecifiedrAG3T2k = lineBreak.m3421unboximpl();
        } else {
            iM3429getUnspecifiedrAG3T2k = LineBreak.Companion.m3429getUnspecifiedrAG3T2k();
        }
        int i3 = iM3429getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            iM3405getUnspecifiedvmbZdU8 = hyphens.m3402unboximpl();
        } else {
            iM3405getUnspecifiedvmbZdU8 = Hyphens.Companion.m3405getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, iM3405getUnspecifiedvmbZdU8, textMotion, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m2946copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        int iM3429getUnspecifiedrAG3T2k;
        int iM3405getUnspecifiedvmbZdU8;
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        int i = iM3517getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        int i2 = iM3533getUnspecifieds_7Xco;
        if (lineBreak != null) {
            iM3429getUnspecifiedrAG3T2k = lineBreak.m3421unboximpl();
        } else {
            iM3429getUnspecifiedrAG3T2k = LineBreak.Companion.m3429getUnspecifiedrAG3T2k();
        }
        int i3 = iM3429getUnspecifiedrAG3T2k;
        if (hyphens != null) {
            iM3405getUnspecifiedvmbZdU8 = hyphens.m3402unboximpl();
        } else {
            iM3405getUnspecifiedvmbZdU8 = Hyphens.Companion.m3405getUnspecifiedvmbZdU8();
        }
        return new ParagraphStyle(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, iM3405getUnspecifiedvmbZdU8, this.textMotion, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m2947copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        int iM3517getUnspecifiede0LSkKk;
        int iM3533getUnspecifieds_7Xco;
        if (textAlign != null) {
            iM3517getUnspecifiede0LSkKk = textAlign.m3510unboximpl();
        } else {
            iM3517getUnspecifiede0LSkKk = TextAlign.Companion.m3517getUnspecifiede0LSkKk();
        }
        int i = iM3517getUnspecifiede0LSkKk;
        if (textDirection != null) {
            iM3533getUnspecifieds_7Xco = textDirection.m3527unboximpl();
        } else {
            iM3533getUnspecifieds_7Xco = TextDirection.Companion.m3533getUnspecifieds_7Xco();
        }
        return new ParagraphStyle(i, iM3533getUnspecifieds_7Xco, j, textIndent, platformParagraphStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (!TextAlign.m3507equalsimpl0(this.textAlign, paragraphStyle.textAlign) || !TextDirection.m3524equalsimpl0(this.textDirection, paragraphStyle.textDirection) || !TextUnit.m3864equalsimpl0(this.lineHeight, paragraphStyle.lineHeight)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textIndent, paragraphStyle.textIndent}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformStyle, paragraphStyle.platformStyle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lineHeightStyle, paragraphStyle.lineHeightStyle}, getCieXyz.write())).booleanValue() || !LineBreak.m3415equalsimpl0(this.lineBreak, paragraphStyle.lineBreak) || !Hyphens.m3399equalsimpl0(this.hyphens, paragraphStyle.hyphens)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textMotion, paragraphStyle.textMotion}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) TextAlign.m3509toStringimpl(this.textAlign)) + ", textDirection=" + ((Object) TextDirection.m3526toStringimpl(this.textDirection)) + ", lineHeight=" + ((Object) TextUnit.m3874toStringimpl(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) LineBreak.m3420toStringimpl(this.lineBreak)) + ", hyphens=" + ((Object) Hyphens.m3401toStringimpl(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? TextAlign.Companion.m3517getUnspecifiede0LSkKk() : i, (i5 & 2) != 0 ? TextDirection.Companion.m3533getUnspecifieds_7Xco() : i2, (i5 & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : textIndent, (i5 & 16) != 0 ? null : platformParagraphStyle, (i5 & 32) != 0 ? null : lineHeightStyle, (i5 & 64) != 0 ? LineBreak.Companion.m3429getUnspecifiedrAG3T2k() : i3, (i5 & Fields.SpotShadowColor) != 0 ? Hyphens.Companion.m3405getUnspecifiedvmbZdU8() : i4, (i5 & Fields.RotationX) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m2948copyykzQM6k(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        return new ParagraphStyle(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion, (DefaultConstructorMarker) null);
    }

    @onItemDismisslambda0
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @onItemDismisslambda0
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @onItemDismisslambda0
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @onItemDismisslambda0
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    private ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion) {
        this.textAlign = i;
        this.textDirection = i2;
        this.lineHeight = j;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i3;
        this.hyphens = i4;
        this.textMotion = textMotion;
        if (TextUnit.m3864equalsimpl0(j, TextUnit.Companion.m3878getUnspecifiedXSAIIZE()) || TextUnit.m3867getValueimpl(j) >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m3867getValueimpl(j) + ')');
    }

    public /* synthetic */ ParagraphStyle(int i, int i2, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i3, int i4, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, textIndent, platformParagraphStyle, lineHeightStyle, i3, i4, textMotion);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & Fields.SpotShadowColor) != 0 ? null : hyphens, (i & Fields.RotationX) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), textMotion, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        this(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) == 0 ? lineHeightStyle : null, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m3878getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & Fields.SpotShadowColor) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign != null ? textAlign.m3510unboximpl() : TextAlign.Companion.m3517getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m3527unboximpl() : TextDirection.Companion.m3533getUnspecifieds_7Xco(), j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak != null ? lineBreak.m3421unboximpl() : LineBreak.Companion.m3429getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m3402unboximpl() : Hyphens.Companion.m3405getUnspecifiedvmbZdU8(), (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
