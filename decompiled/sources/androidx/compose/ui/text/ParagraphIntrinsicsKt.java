package androidx.compose.ui.text;

import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphIntrinsicsKt {
    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, Font.ResourceLoader resourceLoader, int i, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) ((i & 4) != 0 ? instance_delegatelambda0Var : list), (List<AnnotatedString.Range<Placeholder>>) ((i & 8) != 0 ? instance_delegatelambda0Var : list2), density, resourceLoader);
    }

    @onItemDismisslambda0
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @onItemDismisslambda0
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list2) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver, int i, Object obj) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) ((i & 4) != 0 ? instance_delegatelambda0Var : list), (List<AnnotatedString.Range<Placeholder>>) ((i & 8) != 0 ? instance_delegatelambda0Var : list2), density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver, List list2, int i, Object obj) {
        if ((i & 32) != 0) {
            list2 = instance_delegatelambda0.write;
        }
        return ParagraphIntrinsics(str, textStyle, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list2);
    }
}
