package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: Paragraph-czeN-Hc, reason: not valid java name */
    public static final Paragraph m2933ParagraphczeNHc(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3341ActualParagraph4FmOz70(paragraphIntrinsics, i, i2, j);
    }

    public static final int ceilToInt(float f) {
        return (int) Math.ceil(f);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i2, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) ((i2 & 4) != 0 ? instance_delegatelambda0Var : list), (List<AnnotatedString.Range<Placeholder>>) ((i2 & 8) != 0 ? instance_delegatelambda0Var : list2), (i2 & 16) != 0 ? Integer.MAX_VALUE : i, (i2 & 32) != 0 ? false : z, f, density, resourceLoader);
    }

    /* JADX INFO: renamed from: Paragraph-UdtVg6A$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m2928ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return m2927ParagraphUdtVg6A(str, textStyle, j, density, resolver, (i2 & 32) != 0 ? instance_delegatelambda0Var : list, (i2 & 64) != 0 ? instance_delegatelambda0Var : list2, (i2 & Fields.SpotShadowColor) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.RotationX) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: Paragraph-Ul8oQg4$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m2930ParagraphUl8oQg4$default(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, int i2, int i3, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return m2929ParagraphUl8oQg4(str, textStyle, j, density, resolver, (i3 & 32) != 0 ? instance_delegatelambda0Var : list, (i3 & 64) != 0 ? instance_delegatelambda0Var : list2, (i3 & Fields.SpotShadowColor) != 0 ? Integer.MAX_VALUE : i, (i3 & Fields.RotationX) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : i2);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final /* synthetic */ Paragraph m2931Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3341ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.Companion.m3569getEllipsisgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), j);
    }

    @onItemDismisslambda0
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3342ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null), density, resolver);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final /* synthetic */ Paragraph m2927ParagraphUdtVg6A(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3342ActualParagraphXGqx6AY(str, textStyle, list, list2, i, z ? companion.m3569getEllipsisgIe3tQ8() : companion.m3568getClipgIe3tQ8(), j, density, resolver);
    }

    /* JADX INFO: renamed from: Paragraph-Ul8oQg4, reason: not valid java name */
    public static final Paragraph m2929ParagraphUl8oQg4(String str, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, int i2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3342ActualParagraphXGqx6AY(str, textStyle, list, list2, i, i2, j, density, resolver);
    }

    /* JADX INFO: renamed from: Paragraph-czeN-Hc$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m2934ParagraphczeNHc$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = TextOverflow.Companion.m3568getClipgIe3tQ8();
        }
        return m2933ParagraphczeNHc(paragraphIntrinsics, j, i, i2);
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m2932Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return m2931Paragraph_EkL_Y(paragraphIntrinsics, j, i, z);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, List list2, int i, boolean z, int i2, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return Paragraph(str, textStyle, f, density, resolver, (List<AnnotatedString.Range<SpanStyle>>) ((i2 & 32) != 0 ? instance_delegatelambda0Var : list), (List<AnnotatedString.Range<Placeholder>>) ((i2 & 64) != 0 ? instance_delegatelambda0Var : list2), (i2 & Fields.SpotShadowColor) != 0 ? Integer.MAX_VALUE : i, (i2 & Fields.RotationX) != 0 ? false : z);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Paragraph(paragraphIntrinsics, i, z, f);
    }

    @onItemDismisslambda0
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i, z, f, density, resourceLoader);
    }

    @onItemDismisslambda0
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i, boolean z, float f) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m3341ActualParagraph4FmOz70(paragraphIntrinsics, i, z ? TextOverflow.Companion.m3569getEllipsisgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ceilToInt(f), 0, 0, 13, null));
    }
}
