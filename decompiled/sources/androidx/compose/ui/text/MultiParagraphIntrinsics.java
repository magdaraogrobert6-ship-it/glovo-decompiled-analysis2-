package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final onViewDetachedFromWindowlambda1 maxIntrinsicWidth$delegate;
    private final onViewDetachedFromWindowlambda1 minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text() {
        return this.infoList;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float maxIntrinsicWidth_delegate$lambda$0(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
            int size = list.size() - 1;
            int i = 1;
            if (1 <= size) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                    if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        maxIntrinsicWidth = maxIntrinsicWidth2;
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMaxIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float minIntrinsicWidth_delegate$lambda$0(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        ParagraphIntrinsics intrinsics;
        List<ParagraphIntrinsicInfo> list = multiParagraphIntrinsics.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
            int size = list.size() - 1;
            int i = 1;
            if (1 <= size) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i);
                    float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                    if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        minIntrinsicWidth = minIntrinsicWidth2;
                    }
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.MediaSessionCompatResultReceiverWrapper()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.MediaSessionCompatResultReceiverWrapper()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        this.annotatedString = annotatedString;
        this.placeholders = list;
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        final int i = 0;
        this.minIntrinsicWidth$delegate = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda0
            public final /* synthetic */ MultiParagraphIntrinsics f$0;

            {
                this.f$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = i;
                MultiParagraphIntrinsics multiParagraphIntrinsics = this.f$0;
                return Float.valueOf(i2 != 0 ? MultiParagraphIntrinsics.maxIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics) : MultiParagraphIntrinsics.minIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics));
            }
        });
        final int i2 = 1;
        this.maxIntrinsicWidth$delegate = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$$ExternalSyntheticLambda0
            public final /* synthetic */ MultiParagraphIntrinsics f$0;

            {
                this.f$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                MultiParagraphIntrinsics multiParagraphIntrinsics = this.f$0;
                return Float.valueOf(i3 != 0 ? MultiParagraphIntrinsics.maxIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics) : MultiParagraphIntrinsics.minIntrinsicWidth_delegate$lambda$0(multiParagraphIntrinsics));
            }
        });
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        while (i < size) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i);
            AnnotatedString annotatedStringSubstringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle paragraphStyleResolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = annotatedStringSubstringWithoutParagraphStyles.getText();
            TextStyle textStyleMerge = textStyle.merge(paragraphStyleResolveTextDirection);
            List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text = annotatedStringSubstringWithoutParagraphStyles.getAnnotations$ui_text();
            if (annotations$ui_text == null) {
                annotations$ui_text = instance_delegatelambda0.write;
            }
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, textStyleMerge, annotations$ui_text, density, resolver, (List<AnnotatedString.Range<Placeholder>>) MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd())), range.getStart(), range.getEnd()));
            i++;
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        return !TextDirection.m3524equalsimpl0(paragraphStyle.m2957getTextDirections_7Xco(), TextDirection.Companion.m3533getUnspecifieds_7Xco()) ? paragraphStyle : paragraphStyle.m2948copyykzQM6k((509 & 1) != 0 ? paragraphStyle.textAlign : 0, (509 & 2) != 0 ? paragraphStyle.textDirection : paragraphStyle2.m2957getTextDirections_7Xco(), (509 & 4) != 0 ? paragraphStyle.lineHeight : 0L, (509 & 8) != 0 ? paragraphStyle.textIndent : null, (509 & 16) != 0 ? paragraphStyle.platformStyle : null, (509 & 32) != 0 ? paragraphStyle.lineHeightStyle : null, (509 & 64) != 0 ? paragraphStyle.lineBreak : 0, (509 & Fields.SpotShadowColor) != 0 ? paragraphStyle.hyphens : 0, (509 & Fields.RotationX) != 0 ? paragraphStyle.textMotion : null);
    }

    @onItemDismisslambda0
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }
}
