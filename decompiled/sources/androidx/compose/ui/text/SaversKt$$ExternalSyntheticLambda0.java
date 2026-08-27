package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setBlock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda0 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        setBlock setblock = (setBlock) obj;
        switch (this.$r8$classId) {
            case 0:
                return SaversKt.AnnotatedStringSaver$lambda$0(setblock, (AnnotatedString) obj2);
            case 1:
                return obj2;
            case 2:
                return SaversKt.TextDecorationSaver$lambda$0(setblock, (TextDecoration) obj2);
            case 3:
                return SaversKt.TextGeometricTransformSaver$lambda$0(setblock, (TextGeometricTransform) obj2);
            case 4:
                return SaversKt.TextIndentSaver$lambda$0(setblock, (TextIndent) obj2);
            case 5:
                return SaversKt.FontWeightSaver$lambda$0(setblock, (FontWeight) obj2);
            case 6:
                return SaversKt.LinkSaver$lambda$0(setblock, (LinkAnnotation.Url) obj2);
            case 7:
                return SaversKt.BaselineShiftSaver$lambda$0(setblock, (BaselineShift) obj2);
            case 8:
                return SaversKt.AnnotationRangeListSaver$lambda$0(setblock, (List) obj2);
            case 9:
                return SaversKt.TextRangeSaver$lambda$0(setblock, (TextRange) obj2);
            case 10:
                return SaversKt.ShadowSaver$lambda$0(setblock, (Shadow) obj2);
            case 11:
                return SaversKt.TextAlignSaver$lambda$0(setblock, (TextAlign) obj2);
            case 12:
                return SaversKt.TextDirectionSaver$lambda$0(setblock, (TextDirection) obj2);
            case 13:
                return SaversKt.HyphensSaver$lambda$0(setblock, (Hyphens) obj2);
            case 14:
                return SaversKt.FontStyleSaver$lambda$0(setblock, (FontStyle) obj2);
            case 15:
                return SaversKt.FontSynthesisSaver$lambda$0(setblock, (FontSynthesis) obj2);
            case 16:
                return SaversKt.TextUnitSaver$lambda$0(setblock, (TextUnit) obj2);
            case 17:
                return SaversKt.ClickableSaver$lambda$0(setblock, (LinkAnnotation.Clickable) obj2);
            case 18:
                return SaversKt.TextUnitTypeSaver$lambda$0(setblock, (TextUnitType) obj2);
            case 19:
                return SaversKt.OffsetSaver$lambda$0(setblock, (Offset) obj2);
            case 20:
                return SaversKt.AnnotationRangeSaver$lambda$0(setblock, (AnnotatedString.Range) obj2);
            case 21:
                return SaversKt.LocaleListSaver$lambda$0(setblock, (LocaleList) obj2);
            case 22:
                return SaversKt.LocaleSaver$lambda$0(setblock, (Locale) obj2);
            case 23:
                return SaversKt.LineHeightStyleSaver$lambda$0(setblock, (LineHeightStyle) obj2);
            case 24:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$0(setblock, (LineHeightStyle.Alignment) obj2);
            case 25:
                return SaversKt.LineHeightStyleTrimSaver$lambda$0(setblock, (LineHeightStyle.Trim) obj2);
            case 26:
                return SaversKt.LineHeightStyleModeSaver$lambda$0(setblock, (LineHeightStyle.Mode) obj2);
            case 27:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$0(setblock, (VerbatimTtsAnnotation) obj2);
            case 28:
                return SaversKt.ParagraphStyleSaver$lambda$0(setblock, (ParagraphStyle) obj2);
            default:
                return SaversKt.UrlAnnotationSaver$lambda$0(setblock, (UrlAnnotation) obj2);
        }
    }
}
