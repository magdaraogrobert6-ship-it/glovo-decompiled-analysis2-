package androidx.compose.ui.text;

import java.util.List;
import o.createFromParcel;
import o.getOffsetF1C5BW0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SaversKt$$ExternalSyntheticLambda2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SaversKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return SaversKt.LinkSaver$lambda$1(obj);
            case 1:
                synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                    List list = getOffsetF1C5BW0.read;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(i)).invoke(obj);
                    }
                }
                return createFromParcel.INSTANCE;
            case 2:
                SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = getOffsetF1C5BW0.RemoteActionCompatParcelizer;
                return createFromParcel.INSTANCE;
            case 3:
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj));
            case 4:
                return SaversKt.TextLinkStylesSaver$lambda$1(obj);
            case 5:
                return SaversKt.AnnotatedStringSaver$lambda$1(obj);
            case 6:
                return SaversKt.TextDecorationSaver$lambda$1(obj);
            case 7:
                return SaversKt.TextGeometricTransformSaver$lambda$1(obj);
            case 8:
                return SaversKt.TextIndentSaver$lambda$1(obj);
            case 9:
                return SaversKt.FontWeightSaver$lambda$1(obj);
            case 10:
                return SaversKt.BaselineShiftSaver$lambda$1(obj);
            case 11:
                return SaversKt.TextRangeSaver$lambda$1(obj);
            case 12:
                return SaversKt.ShadowSaver$lambda$1(obj);
            case 13:
                return SaversKt.TextAlignSaver$lambda$1(obj);
            case 14:
                return SaversKt.TextDirectionSaver$lambda$1(obj);
            case 15:
                return SaversKt.HyphensSaver$lambda$1(obj);
            case 16:
                return SaversKt.AnnotationRangeListSaver$lambda$1(obj);
            case 17:
                return SaversKt.FontStyleSaver$lambda$1(obj);
            case 18:
                return SaversKt.FontSynthesisSaver$lambda$1(obj);
            case 19:
                return SaversKt.TextUnitSaver$lambda$1(obj);
            case 20:
                return SaversKt.TextUnitTypeSaver$lambda$1(obj);
            case 21:
                return SaversKt.OffsetSaver$lambda$1(obj);
            case 22:
                return SaversKt.LocaleListSaver$lambda$1(obj);
            case 23:
                return SaversKt.LocaleSaver$lambda$1(obj);
            case 24:
                return SaversKt.ClickableSaver$lambda$1(obj);
            case 25:
                return SaversKt.LineHeightStyleSaver$lambda$1(obj);
            case 26:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$1(obj);
            case 27:
                return SaversKt.LineHeightStyleTrimSaver$lambda$1(obj);
            case 28:
                return SaversKt.AnnotationRangeSaver$lambda$1(obj);
            default:
                return SaversKt.LineHeightStyleModeSaver$lambda$1(obj);
        }
    }
}
