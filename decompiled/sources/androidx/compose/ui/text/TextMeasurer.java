package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(textLayoutInput.m3042getConstraintsmsEJaDk());
            int iM3626getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextMeasurerKt.m3054isEllipsisMW5ApA(textLayoutInput.m3043getOverflowgIe3tQ8())) && Constraints.m3622getHasBoundedWidthimpl(textLayoutInput.m3042getConstraintsmsEJaDk())) ? Constraints.m3626getMaxWidthimpl(textLayoutInput.m3042getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextMeasurerKt.m3054isEllipsisMW5ApA(textLayoutInput.m3043getOverflowgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM3628getMinWidthimpl != iM3626getMaxWidthimpl) {
                iM3626getMaxWidthimpl = RangesKt.RemoteActionCompatParcelizer(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM3628getMinWidthimpl, iM3626getMaxWidthimpl);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m3635fitPrioritizingWidthZbe2FdA(0, iM3626getMaxWidthimpl, 0, Constraints.m3625getMaxHeightimpl(textLayoutInput.m3042getConstraintsmsEJaDk())), maxLines, textLayoutInput.m3043getOverflowgIe3tQ8(), (DefaultConstructorMarker) null);
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.m3640constrain4WqzIAM(textLayoutInput.m3042getConstraintsmsEJaDk(), IntSize.m3839constructorimpl((((long) ((int) Math.ceil(multiParagraph.getHeight()))) & 4294967295L) | (((long) ((int) Math.ceil(multiParagraph.getWidth()))) << 32))), null);
        }
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i;
        this.textLayoutCache = i > 0 ? new TextLayoutCache(i) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3050measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        return textMeasurer.m3052measurexDpz5zY(annotatedString, (i3 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (i3 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? instance_delegatelambda0.write : list, (i3 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j, (i3 & Fields.SpotShadowColor) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i3 & Fields.RotationX) != 0 ? textMeasurer.defaultDensity : density, (i3 & Fields.RotationY) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i3 & Fields.RotationZ) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m3051measurewNUYSr0(String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        return m3050measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, null), textStyle, i, z, i2, null, j, layoutDirection, density, resolver, z2, 32, null);
    }

    /* JADX INFO: renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m3052measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List<AnnotatedString.Range<Placeholder>> list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i2, z, i, density, layoutDirection, resolver, j, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (z2 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m3045copyO0kMr_c(textLayoutInput, ConstraintsKt.m3640constrain4WqzIAM(j, IntSize.m3839constructorimpl((((long) ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight())) & 4294967295L) | (((long) ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth())) << 32))));
        }
        TextLayoutResult textLayoutResultLayout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        }
        return textLayoutResultLayout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? 8 : i);
    }
}
