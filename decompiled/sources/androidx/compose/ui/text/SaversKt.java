package androidx.compose.ui.text;

import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetIntersectcp;
import o.getAlignmentLinesMap;
import o.getCieXyz;
import o.invalidateShadow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setBlock;

/* JADX INFO: loaded from: classes.dex */
public final class SaversKt {
    private static final invalidateShadow AnnotatedStringSaver;
    private static final invalidateShadow AnnotationRangeListSaver;
    private static final invalidateShadow AnnotationRangeSaver;
    private static final invalidateShadow BaselineShiftSaver;
    private static final invalidateShadow ClickableSaver;
    private static final NonNullValueClassSaver<Color, Object> ColorSaver;
    private static final invalidateShadow FontStyleSaver;
    private static final invalidateShadow FontSynthesisSaver;
    private static final invalidateShadow FontWeightSaver;
    private static final NonNullValueClassSaver<Hyphens, Object> HyphensSaver;
    private static final NonNullValueClassSaver<LineHeightStyle.Alignment, Object> LineHeightStyleAlignmentSaver;
    private static final NonNullValueClassSaver<LineHeightStyle.Mode, Object> LineHeightStyleModeSaver;
    private static final invalidateShadow LineHeightStyleSaver;
    private static final NonNullValueClassSaver<LineHeightStyle.Trim, Object> LineHeightStyleTrimSaver;
    private static final invalidateShadow LinkSaver;
    private static final invalidateShadow LocaleListSaver;
    private static final invalidateShadow LocaleSaver;
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver;
    private static final invalidateShadow ParagraphStyleSaver;
    private static final invalidateShadow ShadowSaver;
    private static final invalidateShadow SpanStyleSaver;
    private static final NonNullValueClassSaver<TextAlign, Object> TextAlignSaver;
    private static final invalidateShadow TextDecorationSaver;
    private static final NonNullValueClassSaver<TextDirection, Object> TextDirectionSaver;
    private static final invalidateShadow TextGeometricTransformSaver;
    private static final invalidateShadow TextIndentSaver;
    private static final invalidateShadow TextLinkStylesSaver;
    private static final invalidateShadow TextRangeSaver;
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver;
    private static final NonNullValueClassSaver<TextUnitType, Object> TextUnitTypeSaver;
    private static final invalidateShadow UrlAnnotationSaver;
    private static final invalidateShadow VerbatimTtsAnnotationSaver;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleSaver$lambda$0(setBlock setblock, Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object TextRangeSaver$lambda$0(setBlock setblock, TextRange textRange) {
        return SQLite.write(save(Integer.valueOf(TextRange.m3076getStartimpl(textRange.m3080unboximpl()))), save(Integer.valueOf(TextRange.m3071getEndimpl(textRange.m3080unboximpl()))));
    }

    public static final invalidateShadow getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    public static final invalidateShadow getFontStyleSaver() {
        return FontStyleSaver;
    }

    public static final invalidateShadow getFontSynthesisSaver() {
        return FontSynthesisSaver;
    }

    public static final invalidateShadow getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final invalidateShadow getSaver(TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    public static final invalidateShadow getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final invalidateShadow getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    public static final NonNullValueClassSaver<TextUnitType, Object> getTextUnitTypeSaver() {
        return TextUnitTypeSaver;
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final <T> T save(T t) {
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeListSaver$lambda$0(setBlock setblock, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save((AnnotatedString.Range) list.get(i), AnnotationRangeSaver, setblock));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight FontWeightSaver$lambda$1(Object obj) {
        obj.getClass();
        return new FontWeight(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale LocaleSaver$lambda$1(Object obj) {
        obj.getClass();
        return new Locale((String) obj);
    }

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt.NonNullValueClassSaver.1
            @Override // androidx.compose.ui.text.NonNullValueClassSaver, o.invalidateShadow
            public Original restore(Saveable saveable) {
                return (Original) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(saveable);
            }

            @Override // androidx.compose.ui.text.NonNullValueClassSaver, o.invalidateShadow
            public Saveable save(setBlock setblock, Original original) {
                return (Saveable) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(setblock, original);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OffsetSaver$lambda$0(setBlock setblock, Offset offset) {
        return (offset != null && Offset.m474equalsimpl0(offset.m487unboximpl(), Offset.Companion.m492getUnspecifiedF1C5BW0())) ? Boolean.FALSE : SQLite.write(save(Float.valueOf(Float.intBitsToFloat((int) (offset.m487unboximpl() >> 32)))), save(Float.valueOf(Float.intBitsToFloat((int) (offset.m487unboximpl() & 4294967295L)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset OffsetSaver$lambda$1(Object obj) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, Boolean.FALSE}, getCieXyz.write())).booleanValue()) {
            return Offset.m466boximpl(Offset.Companion.m492getUnspecifiedF1C5BW0());
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        Float f2 = obj3 != null ? (Float) obj3 : null;
        f2.getClass();
        return Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SpanStyleSaver$lambda$0(setBlock setblock, SpanStyle spanStyle) {
        Color colorM712boximpl = Color.m712boximpl(spanStyle.m3016getColor0d7_KjU());
        Color.Companion companion = Color.Companion;
        Object objSave = save(colorM712boximpl, getSaver(companion), setblock);
        TextUnit textUnitM3857boximpl = TextUnit.m3857boximpl(spanStyle.m3017getFontSizeXSAIIZE());
        TextUnit.Companion companion2 = TextUnit.Companion;
        return SQLite.write(objSave, save(textUnitM3857boximpl, getSaver(companion2), setblock), save(spanStyle.getFontWeight(), getSaver(FontWeight.Companion), setblock), save(spanStyle.m3018getFontStyle4Lr2A7w(), getSaver(FontStyle.Companion), setblock), save(spanStyle.m3019getFontSynthesisZQGJjVo(), getSaver(FontSynthesis.Companion), setblock), save(-1), save(spanStyle.getFontFeatureSettings()), save(TextUnit.m3857boximpl(spanStyle.m3020getLetterSpacingXSAIIZE()), getSaver(companion2), setblock), save(spanStyle.m3015getBaselineShift5SSeXJ0(), getSaver(BaselineShift.Companion), setblock), save(spanStyle.getTextGeometricTransform(), getSaver(TextGeometricTransform.Companion), setblock), save(spanStyle.getLocaleList(), getSaver(LocaleList.Companion), setblock), save(Color.m712boximpl(spanStyle.m3014getBackground0d7_KjU()), getSaver(companion), setblock), save(spanStyle.getTextDecoration(), getSaver(TextDecoration.Companion), setblock), save(spanStyle.getShadow(), getSaver(Shadow.Companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDecoration TextDecorationSaver$lambda$1(Object obj) {
        obj.getClass();
        return new TextDecoration(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitSaver$lambda$0(setBlock setblock, TextUnit textUnit) {
        return (textUnit != null && TextUnit.m3864equalsimpl0(textUnit.m3876unboximpl(), TextUnit.Companion.m3878getUnspecifiedXSAIIZE())) ? Boolean.FALSE : SQLite.write(save(Float.valueOf(TextUnit.m3867getValueimpl(textUnit.m3876unboximpl()))), save(TextUnitType.m3892boximpl(TextUnit.m3866getTypeUIouoOA(textUnit.m3876unboximpl())), getSaver(TextUnitType.Companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnit TextUnitSaver$lambda$1(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, bool}, getCieXyz.write())).booleanValue()) {
            return TextUnit.m3857boximpl(TextUnit.Companion.m3878getUnspecifiedXSAIIZE());
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnitType textUnitType = null;
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        invalidateShadow saver = getSaver(TextUnitType.Companion);
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnitType = (TextUnitType) saver.restore(obj3);
        }
        textUnitType.getClass();
        return TextUnit.m3857boximpl(TextUnitKt.m3879TextUnitanM5pPY(fFloatValue, textUnitType.m3898unboximpl()));
    }

    public static final <T extends invalidateShadow, Original, Saveable, Result> Result restore(Saveable saveable, T t) {
        Object[] objArr = {saveable, Boolean.FALSE};
        if ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && !(t instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        t.restore(saveable);
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    public static final <T extends invalidateShadow, Original, Saveable> Object save(Original original, T t, setBlock setblock) {
        Object objSave;
        return (original == null || (objSave = t.save(setblock, original)) == null) ? Boolean.FALSE : objSave;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationType.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = 0;
        int i2 = 5;
        AnnotatedStringSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i), i2, new SaversKt$$ExternalSyntheticLambda2(i2));
        int i3 = 8;
        int i4 = 16;
        AnnotationRangeListSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i3), i2, new SaversKt$$ExternalSyntheticLambda2(i4));
        int i5 = 20;
        int i6 = 28;
        AnnotationRangeSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i5), i2, new SaversKt$$ExternalSyntheticLambda2(i6));
        int i7 = 27;
        int i8 = 1;
        VerbatimTtsAnnotationSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i7), i2, new accessgetIntersectcp(i8));
        int i9 = 29;
        int i10 = 2;
        UrlAnnotationSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i9), i2, new accessgetIntersectcp(i10));
        int i11 = 6;
        LinkSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i11), i2, new SaversKt$$ExternalSyntheticLambda2(i));
        int i12 = 17;
        int i13 = 24;
        ClickableSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i12), i2, new SaversKt$$ExternalSyntheticLambda2(i13));
        int i14 = 3;
        ParagraphStyleSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i6), i2, new accessgetIntersectcp(i14));
        int i15 = 4;
        SpanStyleSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda7(i), i2, new accessgetIntersectcp(i15));
        TextLinkStylesSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda7(i8), i2, new SaversKt$$ExternalSyntheticLambda2(i15));
        TextDecorationSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i10), i2, new SaversKt$$ExternalSyntheticLambda2(i11));
        int i16 = 7;
        TextGeometricTransformSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i14), i2, new SaversKt$$ExternalSyntheticLambda2(i16));
        TextIndentSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i15), i2, new SaversKt$$ExternalSyntheticLambda2(i3));
        int i17 = 9;
        FontWeightSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i2), i2, new SaversKt$$ExternalSyntheticLambda2(i17));
        int i18 = 10;
        BaselineShiftSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i16), i2, new SaversKt$$ExternalSyntheticLambda2(i18));
        SaversKt$$ExternalSyntheticLambda0 saversKt$$ExternalSyntheticLambda0 = new SaversKt$$ExternalSyntheticLambda0(i17);
        int i19 = 11;
        TextRangeSaver = new CardView$1(saversKt$$ExternalSyntheticLambda0, i2, new SaversKt$$ExternalSyntheticLambda2(i19));
        SaversKt$$ExternalSyntheticLambda0 saversKt$$ExternalSyntheticLambda1 = new SaversKt$$ExternalSyntheticLambda0(i18);
        int i20 = 12;
        ShadowSaver = new CardView$1(saversKt$$ExternalSyntheticLambda1, i2, new SaversKt$$ExternalSyntheticLambda2(i20));
        ColorSaver = NonNullValueClassSaver(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m3002invoke4WTKRHQ((setBlock) obj, ((Color) obj2).m732unboximpl());
            }

            /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
            public final Object m3002invoke4WTKRHQ(setBlock setblock, long j) {
                if (j == 16) {
                    return Boolean.FALSE;
                }
                return Integer.valueOf(ColorKt.m776toArgb8_81llA(j));
            }
        }, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Color invoke(Object obj) {
                Object[] objArr = {obj, Boolean.FALSE};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return Color.m712boximpl(Color.Companion.m758getUnspecified0d7_KjU());
                }
                obj.getClass();
                return Color.m712boximpl(ColorKt.Color(((Integer) obj).intValue()));
            }
        });
        SaversKt$$ExternalSyntheticLambda0 saversKt$$ExternalSyntheticLambda2 = new SaversKt$$ExternalSyntheticLambda0(i19);
        int i21 = 13;
        TextAlignSaver = NonNullValueClassSaver(saversKt$$ExternalSyntheticLambda2, new SaversKt$$ExternalSyntheticLambda2(i21));
        SaversKt$$ExternalSyntheticLambda0 saversKt$$ExternalSyntheticLambda3 = new SaversKt$$ExternalSyntheticLambda0(i20);
        int i22 = 14;
        TextDirectionSaver = NonNullValueClassSaver(saversKt$$ExternalSyntheticLambda3, new SaversKt$$ExternalSyntheticLambda2(i22));
        HyphensSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(i21), new SaversKt$$ExternalSyntheticLambda2(15));
        FontStyleSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(i22), i2, new SaversKt$$ExternalSyntheticLambda2(i12));
        FontSynthesisSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(15), i2, new SaversKt$$ExternalSyntheticLambda2(18));
        TextUnitSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(i4), new SaversKt$$ExternalSyntheticLambda2(19));
        TextUnitTypeSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(18), new SaversKt$$ExternalSyntheticLambda2(i5));
        OffsetSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(19), new SaversKt$$ExternalSyntheticLambda2(21));
        LocaleListSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(21), i2, new SaversKt$$ExternalSyntheticLambda2(22));
        LocaleSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(22), i2, new SaversKt$$ExternalSyntheticLambda2(23));
        LineHeightStyleSaver = new CardView$1(new SaversKt$$ExternalSyntheticLambda0(23), i2, new SaversKt$$ExternalSyntheticLambda2(25));
        LineHeightStyleAlignmentSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(i13), new SaversKt$$ExternalSyntheticLambda2(26));
        LineHeightStyleTrimSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(25), new SaversKt$$ExternalSyntheticLambda2(i7));
        LineHeightStyleModeSaver = NonNullValueClassSaver(new SaversKt$$ExternalSyntheticLambda0(26), new SaversKt$$ExternalSyntheticLambda2(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString AnnotatedStringSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(1);
        invalidateShadow invalidateshadow = AnnotationRangeListSaver;
        List list2 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) invalidateshadow.restore(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        str.getClass();
        return new AnnotatedString((List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AnnotationRangeListSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            invalidateShadow invalidateshadow = AnnotationRangeSaver;
            AnnotatedString.Range range = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj2 != null) ? (AnnotatedString.Range) invalidateshadow.restore(obj2) : null;
            range.getClass();
            arrayList.add(range);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range AnnotationRangeSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle paragraphStyle = null;
        clickable = null;
        LinkAnnotation.Clickable clickable = null;
        url = null;
        LinkAnnotation.Url url = null;
        urlAnnotation = null;
        UrlAnnotation urlAnnotation = null;
        verbatimTtsAnnotation = null;
        VerbatimTtsAnnotation verbatimTtsAnnotation = null;
        spanStyle = null;
        SpanStyle spanStyle = null;
        paragraphStyle = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        annotationType.getClass();
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        num.getClass();
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        str.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                invalidateShadow invalidateshadow = ParagraphStyleSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj6, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj6 != null) {
                    paragraphStyle = (ParagraphStyle) invalidateshadow.restore(obj6);
                }
                paragraphStyle.getClass();
                return new AnnotatedString.Range(paragraphStyle, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                invalidateShadow invalidateshadow2 = SpanStyleSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow2 instanceof NonNullValueClassSaver)) && obj7 != null) {
                    spanStyle = (SpanStyle) invalidateshadow2.restore(obj7);
                }
                spanStyle.getClass();
                return new AnnotatedString.Range(spanStyle, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                invalidateShadow invalidateshadow3 = VerbatimTtsAnnotationSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj8, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow3 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    verbatimTtsAnnotation = (VerbatimTtsAnnotation) invalidateshadow3.restore(obj8);
                }
                verbatimTtsAnnotation.getClass();
                return new AnnotatedString.Range(verbatimTtsAnnotation, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                invalidateShadow invalidateshadow4 = UrlAnnotationSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj9, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow4 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    urlAnnotation = (UrlAnnotation) invalidateshadow4.restore(obj9);
                }
                urlAnnotation.getClass();
                return new AnnotatedString.Range(urlAnnotation, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                invalidateShadow invalidateshadow5 = LinkSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj10, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow5 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    url = (LinkAnnotation.Url) invalidateshadow5.restore(obj10);
                }
                url.getClass();
                return new AnnotatedString.Range(url, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                invalidateShadow invalidateshadow6 = ClickableSaver;
                if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj11, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow6 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    clickable = (LinkAnnotation.Clickable) invalidateshadow6.restore(obj11);
                }
                clickable.getClass();
                return new AnnotatedString.Range(clickable, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                str2.getClass();
                return new AnnotatedString.Range(StringAnnotation.m3023boximpl(StringAnnotation.m3024constructorimpl(str2)), iIntValue, iIntValue2, str);
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaselineShift BaselineShiftSaver$lambda$1(Object obj) {
        obj.getClass();
        return BaselineShift.m3373boximpl(BaselineShift.m3374constructorimpl(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Clickable ClickableSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        invalidateShadow invalidateshadow = TextLinkStylesSaver;
        return new LinkAnnotation.Clickable(str, ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextLinkStyles) invalidateshadow.restore(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontStyle FontStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        return FontStyle.m3187boximpl(FontStyle.m3188constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontSynthesis FontSynthesisSaver$lambda$1(Object obj) {
        obj.getClass();
        return FontSynthesis.m3198boximpl(FontSynthesis.m3199constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hyphens HyphensSaver$lambda$1(Object obj) {
        obj.getClass();
        return Hyphens.m3396boximpl(Hyphens.m3397constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Alignment LineHeightStyleAlignmentSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Alignment.m3470boximpl(LineHeightStyle.Alignment.m3471constructorimpl(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Mode LineHeightStyleModeSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Mode.m3481boximpl(LineHeightStyle.Mode.m3482constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle LineHeightStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow saver = getSaver(LineHeightStyle.Alignment.Companion);
        Boolean bool = Boolean.FALSE;
        LineHeightStyle.Alignment alignment = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (LineHeightStyle.Alignment) saver.restore(obj2) : null;
        alignment.getClass();
        float fM3476unboximpl = alignment.m3476unboximpl();
        Object obj3 = list.get(1);
        invalidateShadow saver2 = getSaver(LineHeightStyle.Trim.Companion);
        LineHeightStyle.Trim trim = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (LineHeightStyle.Trim) saver2.restore(obj3) : null;
        trim.getClass();
        int iM3499unboximpl = trim.m3499unboximpl();
        Object obj4 = list.get(2);
        invalidateShadow saver3 = getSaver(LineHeightStyle.Mode.Companion);
        LineHeightStyle.Mode mode = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj4, bool}, getCieXyz.write())).booleanValue() || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? (LineHeightStyle.Mode) saver3.restore(obj4) : null;
        mode.getClass();
        return new LineHeightStyle(fM3476unboximpl, iM3499unboximpl, mode.m3487unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Trim LineHeightStyleTrimSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineHeightStyle.Trim.m3491boximpl(LineHeightStyle.Trim.m3492constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Url LinkSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextLinkStyles textLinkStyles = null;
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        invalidateShadow invalidateshadow = TextLinkStylesSaver;
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj3 != null) {
            textLinkStyles = (TextLinkStyles) invalidateshadow.restore(obj3);
        }
        return new LinkAnnotation.Url(str, textLinkStyles, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList LocaleListSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            invalidateShadow saver = getSaver(Locale.Companion);
            Locale locale = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (Locale) saver.restore(obj2) : null;
            locale.getClass();
            arrayList.add(locale);
        }
        return new LocaleList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:66:0x0229  */
    public static final ParagraphStyle ParagraphStyleSaver$lambda$1(Object obj) {
        invalidateShadow invalidateshadow;
        Hyphens hyphens;
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow saver = getSaver(TextAlign.Companion);
        Boolean bool = Boolean.FALSE;
        TextAlign textAlign = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (TextAlign) saver.restore(obj2) : null;
        textAlign.getClass();
        int iM3510unboximpl = textAlign.m3510unboximpl();
        Object obj3 = list.get(1);
        invalidateShadow saver2 = getSaver(TextDirection.Companion);
        TextDirection textDirection = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextDirection) saver2.restore(obj3) : null;
        textDirection.getClass();
        int iM3527unboximpl = textDirection.m3527unboximpl();
        Object obj4 = list.get(2);
        invalidateShadow saver3 = getSaver(TextUnit.Companion);
        TextUnit textUnit = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj4, bool}, getCieXyz.write())).booleanValue() || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? (TextUnit) saver3.restore(obj4) : null;
        textUnit.getClass();
        long jM3876unboximpl = textUnit.m3876unboximpl();
        Object obj5 = list.get(3);
        invalidateShadow saver4 = getSaver(TextIndent.Companion);
        TextIndent textIndent = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj5, bool}, getCieXyz.write())).booleanValue() || (saver4 instanceof NonNullValueClassSaver)) && obj5 != null) ? (TextIndent) saver4.restore(obj5) : null;
        Object obj6 = list.get(4);
        invalidateShadow saver5 = Savers_androidKt.getSaver(PlatformParagraphStyle.Companion);
        PlatformParagraphStyle platformParagraphStyle = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj6, bool}, getCieXyz.write())).booleanValue() || (saver5 instanceof NonNullValueClassSaver)) && obj6 != null) ? (PlatformParagraphStyle) saver5.restore(obj6) : null;
        Object obj7 = list.get(5);
        invalidateShadow saver6 = getSaver(LineHeightStyle.Companion);
        LineHeightStyle lineHeightStyle = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj7, bool}, getCieXyz.write())).booleanValue() || (saver6 instanceof NonNullValueClassSaver)) && obj7 != null) ? (LineHeightStyle) saver6.restore(obj7) : null;
        Object obj8 = list.get(6);
        invalidateShadow saver7 = Savers_androidKt.getSaver(LineBreak.Companion);
        LineBreak lineBreak = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj8, bool}, getCieXyz.write())).booleanValue() || (saver7 instanceof NonNullValueClassSaver)) && obj8 != null) ? (LineBreak) saver7.restore(obj8) : null;
        lineBreak.getClass();
        int iM3421unboximpl = lineBreak.m3421unboximpl();
        Object obj9 = list.get(7);
        invalidateShadow saver8 = getSaver(Hyphens.Companion);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj9, bool}, getCieXyz.write())).booleanValue()) {
            invalidateshadow = saver8;
            if (!(invalidateshadow instanceof NonNullValueClassSaver)) {
                hyphens = null;
            }
            hyphens.getClass();
            int iM3402unboximpl = hyphens.m3402unboximpl();
            Object obj10 = list.get(8);
            invalidateShadow saver9 = Savers_androidKt.getSaver(TextMotion.Companion);
            return new ParagraphStyle(iM3510unboximpl, iM3527unboximpl, jM3876unboximpl, textIndent, platformParagraphStyle, lineHeightStyle, iM3421unboximpl, iM3402unboximpl, ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj10, bool}, getCieXyz.write())).booleanValue() || (saver9 instanceof NonNullValueClassSaver)) && obj10 != null) ? (TextMotion) saver9.restore(obj10) : null, (DefaultConstructorMarker) null);
        }
        invalidateshadow = saver8;
        if (obj9 != null) {
            hyphens = (Hyphens) invalidateshadow.restore(obj9);
        } else {
            hyphens = null;
        }
        hyphens.getClass();
        int iM3402unboximpl2 = hyphens.m3402unboximpl();
        Object obj11 = list.get(8);
        invalidateShadow saver10 = Savers_androidKt.getSaver(TextMotion.Companion);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj11, bool}, getCieXyz.write())).booleanValue()) {
        }
        return new ParagraphStyle(iM3510unboximpl, iM3527unboximpl, jM3876unboximpl, textIndent, platformParagraphStyle, lineHeightStyle, iM3421unboximpl, iM3402unboximpl2, ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj11, bool}, getCieXyz.write())).booleanValue() || (saver10 instanceof NonNullValueClassSaver)) && obj11 != null) ? (TextMotion) saver10.restore(obj11) : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow ShadowSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow saver = getSaver(Color.Companion);
        Boolean bool = Boolean.FALSE;
        Color color = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) saver.restore(obj2) : null;
        color.getClass();
        long jM732unboximpl = color.m732unboximpl();
        Object obj3 = list.get(1);
        invalidateShadow saver2 = getSaver(Offset.Companion);
        Offset offset = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (Offset) saver2.restore(obj3) : null;
        offset.getClass();
        long jM487unboximpl = offset.m487unboximpl();
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        f.getClass();
        return new Shadow(jM732unboximpl, jM487unboximpl, f.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAlign TextAlignSaver$lambda$1(Object obj) {
        obj.getClass();
        return TextAlign.m3504boximpl(TextAlign.m3505constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDirection TextDirectionSaver$lambda$1(Object obj) {
        obj.getClass();
        return TextDirection.m3521boximpl(TextDirection.m3522constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform TextGeometricTransformSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent TextIndentSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextUnit.Companion companion = TextUnit.Companion;
        invalidateShadow saver = getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnit = null;
        TextUnit textUnit2 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (TextUnit) saver.restore(obj2) : null;
        textUnit2.getClass();
        long jM3876unboximpl = textUnit2.m3876unboximpl();
        Object obj3 = list.get(1);
        invalidateShadow saver2 = getSaver(companion);
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textUnit = (TextUnit) saver2.restore(obj3);
        }
        textUnit.getClass();
        return new TextIndent(jM3876unboximpl, textUnit.m3876unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLinkStyles TextLinkStylesSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow invalidateshadow = SpanStyleSaver;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyle = null;
        SpanStyle spanStyle2 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj2 != null) ? (SpanStyle) invalidateshadow.restore(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle spanStyle3 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj3 != null) ? (SpanStyle) invalidateshadow.restore(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle spanStyle4 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj4, bool}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj4 != null) ? (SpanStyle) invalidateshadow.restore(obj4) : null;
        Object obj5 = list.get(3);
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj5, bool}, getCieXyz.write())).booleanValue() || (invalidateshadow instanceof NonNullValueClassSaver)) && obj5 != null) {
            spanStyle = (SpanStyle) invalidateshadow.restore(obj5);
        }
        return new TextLinkStyles(spanStyle2, spanStyle3, spanStyle4, spanStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRange TextRangeSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        num.getClass();
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        num2.getClass();
        return TextRange.m3064boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
    }

    public static final invalidateShadow getSaver(TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotatedStringSaver$lambda$0(setBlock setblock, AnnotatedString annotatedString) {
        return SQLite.write(save(annotatedString.getText()), save(annotatedString.getAnnotations$ui_text(), AnnotationRangeListSaver, setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeSaver$lambda$0(setBlock setblock, AnnotatedString.Range range) {
        AnnotationType annotationType;
        Object objSave;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (item instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (item instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.Link;
        } else if (item instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(item instanceof StringAnnotation)) {
                getAlignmentLinesMap.write();
                return null;
            }
            annotationType = AnnotationType.String;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object item2 = range.getItem();
                item2.getClass();
                objSave = save((ParagraphStyle) item2, ParagraphStyleSaver, setblock);
                break;
            case 2:
                Object item3 = range.getItem();
                item3.getClass();
                objSave = save((SpanStyle) item3, SpanStyleSaver, setblock);
                break;
            case 3:
                Object item4 = range.getItem();
                item4.getClass();
                objSave = save((VerbatimTtsAnnotation) item4, VerbatimTtsAnnotationSaver, setblock);
                break;
            case 4:
                Object item5 = range.getItem();
                item5.getClass();
                objSave = save((UrlAnnotation) item5, UrlAnnotationSaver, setblock);
                break;
            case 5:
                Object item6 = range.getItem();
                item6.getClass();
                objSave = save((LinkAnnotation.Url) item6, LinkSaver, setblock);
                break;
            case 6:
                Object item7 = range.getItem();
                item7.getClass();
                objSave = save((LinkAnnotation.Clickable) item7, ClickableSaver, setblock);
                break;
            case 7:
                Object item8 = range.getItem();
                item8.getClass();
                objSave = save(((StringAnnotation) item8).m3029unboximpl());
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
        return SQLite.write(save(annotationType), objSave, save(Integer.valueOf(range.getStart())), save(Integer.valueOf(range.getEnd())), save(range.getTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ClickableSaver$lambda$0(setBlock setblock, LinkAnnotation.Clickable clickable) {
        return SQLite.write(save(clickable.getTag()), save(clickable.getStyles(), TextLinkStylesSaver, setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleSaver$lambda$0(setBlock setblock, LineHeightStyle lineHeightStyle) {
        return SQLite.write(save(LineHeightStyle.Alignment.m3470boximpl(lineHeightStyle.m3467getAlignmentPIaL0Z0()), getSaver(LineHeightStyle.Alignment.Companion), setblock), save(LineHeightStyle.Trim.m3491boximpl(lineHeightStyle.m3469getTrimEVpEnUU()), getSaver(LineHeightStyle.Trim.Companion), setblock), save(LineHeightStyle.Mode.m3481boximpl(lineHeightStyle.m3468getModelzQqcRY()), getSaver(LineHeightStyle.Mode.Companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LinkSaver$lambda$0(setBlock setblock, LinkAnnotation.Url url) {
        return SQLite.write(save(url.getUrl()), save(url.getStyles(), TextLinkStylesSaver, setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ParagraphStyleSaver$lambda$0(setBlock setblock, ParagraphStyle paragraphStyle) {
        return SQLite.write(save(TextAlign.m3504boximpl(paragraphStyle.m2955getTextAligne0LSkKk()), getSaver(TextAlign.Companion), setblock), save(TextDirection.m3521boximpl(paragraphStyle.m2957getTextDirections_7Xco()), getSaver(TextDirection.Companion), setblock), save(TextUnit.m3857boximpl(paragraphStyle.m2953getLineHeightXSAIIZE()), getSaver(TextUnit.Companion), setblock), save(paragraphStyle.getTextIndent(), getSaver(TextIndent.Companion), setblock), save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.Companion), setblock), save(paragraphStyle.getLineHeightStyle(), getSaver(LineHeightStyle.Companion), setblock), save(LineBreak.m3409boximpl(paragraphStyle.m2952getLineBreakrAG3T2k()), Savers_androidKt.getSaver(LineBreak.Companion), setblock), save(Hyphens.m3396boximpl(paragraphStyle.m2950getHyphensvmbZdU8()), getSaver(Hyphens.Companion), setblock), save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.Companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ShadowSaver$lambda$0(setBlock setblock, Shadow shadow) {
        return SQLite.write(save(Color.m712boximpl(shadow.m1069getColor0d7_KjU()), getSaver(Color.Companion), setblock), save(Offset.m466boximpl(shadow.m1070getOffsetF1C5BW0()), getSaver(Offset.Companion), setblock), save(Float.valueOf(shadow.getBlurRadius())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextIndentSaver$lambda$0(setBlock setblock, TextIndent textIndent) {
        TextUnit textUnitM3857boximpl = TextUnit.m3857boximpl(textIndent.m3541getFirstLineXSAIIZE());
        TextUnit.Companion companion = TextUnit.Companion;
        return SQLite.write(save(textUnitM3857boximpl, getSaver(companion), setblock), save(TextUnit.m3857boximpl(textIndent.m3542getRestLineXSAIIZE()), getSaver(companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextLinkStylesSaver$lambda$0(setBlock setblock, TextLinkStyles textLinkStyles) {
        SpanStyle style = textLinkStyles.getStyle();
        invalidateShadow invalidateshadow = SpanStyleSaver;
        return SQLite.write(save(style, invalidateshadow, setblock), save(textLinkStyles.getFocusedStyle(), invalidateshadow, setblock), save(textLinkStyles.getHoveredStyle(), invalidateshadow, setblock), save(textLinkStyles.getPressedStyle(), invalidateshadow, setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitTypeSaver$lambda$0(setBlock setblock, TextUnitType textUnitType) {
        long jM3898unboximpl = textUnitType.m3898unboximpl();
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3895equalsimpl0(jM3898unboximpl, companion.m3899getEmUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m3895equalsimpl0(jM3898unboximpl, companion.m3900getSpUIouoOA())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object UrlAnnotationSaver$lambda$0(setBlock setblock, UrlAnnotation urlAnnotation) {
        return save(urlAnnotation.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation UrlAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        str.getClass();
        return new UrlAnnotation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object VerbatimTtsAnnotationSaver$lambda$0(setBlock setblock, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return save(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation VerbatimTtsAnnotationSaver$lambda$1(Object obj) {
        String str = obj != null ? (String) obj : null;
        str.getClass();
        return new VerbatimTtsAnnotation(str);
    }

    public static final invalidateShadow getSaver(TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpanStyle SpanStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Color.Companion companion = Color.Companion;
        invalidateShadow saver = getSaver(companion);
        Boolean bool = Boolean.FALSE;
        Shadow shadow = null;
        Color color = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, bool}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (Color) saver.restore(obj2) : null;
        color.getClass();
        long jM732unboximpl = color.m732unboximpl();
        Object obj3 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        invalidateShadow saver2 = getSaver(companion2);
        TextUnit textUnit = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, bool}, getCieXyz.write())).booleanValue() || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextUnit) saver2.restore(obj3) : null;
        textUnit.getClass();
        long jM3876unboximpl = textUnit.m3876unboximpl();
        Object obj4 = list.get(2);
        invalidateShadow saver3 = getSaver(FontWeight.Companion);
        FontWeight fontWeight = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj4, bool}, getCieXyz.write())).booleanValue() || (saver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? (FontWeight) saver3.restore(obj4) : null;
        Object obj5 = list.get(3);
        invalidateShadow saver4 = getSaver(FontStyle.Companion);
        FontStyle fontStyle = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj5, bool}, getCieXyz.write())).booleanValue() || (saver4 instanceof NonNullValueClassSaver)) && obj5 != null) ? (FontStyle) saver4.restore(obj5) : null;
        Object obj6 = list.get(4);
        invalidateShadow saver5 = getSaver(FontSynthesis.Companion);
        FontSynthesis fontSynthesis = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj6, bool}, getCieXyz.write())).booleanValue() || (saver5 instanceof NonNullValueClassSaver)) && obj6 != null) ? (FontSynthesis) saver5.restore(obj6) : null;
        Object obj7 = list.get(6);
        String str = obj7 != null ? (String) obj7 : null;
        Object obj8 = list.get(7);
        invalidateShadow saver6 = getSaver(companion2);
        TextUnit textUnit2 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj8, bool}, getCieXyz.write())).booleanValue() || (saver6 instanceof NonNullValueClassSaver)) && obj8 != null) ? (TextUnit) saver6.restore(obj8) : null;
        textUnit2.getClass();
        long jM3876unboximpl2 = textUnit2.m3876unboximpl();
        Object obj9 = list.get(8);
        invalidateShadow saver7 = getSaver(BaselineShift.Companion);
        BaselineShift baselineShift = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj9, bool}, getCieXyz.write())).booleanValue() || (saver7 instanceof NonNullValueClassSaver)) && obj9 != null) ? (BaselineShift) saver7.restore(obj9) : null;
        Object obj10 = list.get(9);
        invalidateShadow saver8 = getSaver(TextGeometricTransform.Companion);
        TextGeometricTransform textGeometricTransform = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj10, bool}, getCieXyz.write())).booleanValue() || (saver8 instanceof NonNullValueClassSaver)) && obj10 != null) ? (TextGeometricTransform) saver8.restore(obj10) : null;
        Object obj11 = list.get(10);
        invalidateShadow saver9 = getSaver(LocaleList.Companion);
        LocaleList localeList = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj11, bool}, getCieXyz.write())).booleanValue() || (saver9 instanceof NonNullValueClassSaver)) && obj11 != null) ? (LocaleList) saver9.restore(obj11) : null;
        Object obj12 = list.get(11);
        invalidateShadow saver10 = getSaver(companion);
        Color color2 = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj12, bool}, getCieXyz.write())).booleanValue() || (saver10 instanceof NonNullValueClassSaver)) && obj12 != null) ? (Color) saver10.restore(obj12) : null;
        color2.getClass();
        long jM732unboximpl2 = color2.m732unboximpl();
        Object obj13 = list.get(12);
        invalidateShadow saver11 = getSaver(TextDecoration.Companion);
        TextDecoration textDecoration = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj13, bool}, getCieXyz.write())).booleanValue() || (saver11 instanceof NonNullValueClassSaver)) && obj13 != null) ? (TextDecoration) saver11.restore(obj13) : null;
        Object obj14 = list.get(13);
        invalidateShadow saver12 = getSaver(Shadow.Companion);
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj14, bool}, getCieXyz.write())).booleanValue() || (saver12 instanceof NonNullValueClassSaver)) && obj14 != null) {
            shadow = (Shadow) saver12.restore(obj14);
        }
        return new SpanStyle(jM732unboximpl, jM3876unboximpl, fontWeight, fontStyle, fontSynthesis, (FontFamily) null, str, jM3876unboximpl2, baselineShift, textGeometricTransform, localeList, jM732unboximpl2, textDecoration, shadow, (PlatformSpanStyle) null, (DrawStyle) null, 49184, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnitType TextUnitTypeSaver$lambda$1(Object obj) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, 0}, iWrite3)).booleanValue()) {
            return TextUnitType.m3892boximpl(TextUnitType.Companion.m3899getEmUIouoOA());
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{obj, 1}, iWrite6)).booleanValue()) {
            return TextUnitType.m3892boximpl(TextUnitType.Companion.m3900getSpUIouoOA());
        }
        return TextUnitType.m3892boximpl(TextUnitType.Companion.m3901getUnspecifiedUIouoOA());
    }

    public static final invalidateShadow getSaver(FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleListSaver$lambda$0(setBlock setblock, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save(localeList2.get(i), getSaver(Locale.Companion), setblock));
        }
        return arrayList;
    }

    public static final invalidateShadow getSaver(BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    public static final invalidateShadow getSaver(TextRange.Companion companion) {
        return TextRangeSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object BaselineShiftSaver$lambda$0(setBlock setblock, BaselineShift baselineShift) {
        return Float.valueOf(baselineShift.m3379unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontStyleSaver$lambda$0(setBlock setblock, FontStyle fontStyle) {
        return save(Integer.valueOf(fontStyle.m3193unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontSynthesisSaver$lambda$0(setBlock setblock, FontSynthesis fontSynthesis) {
        return Integer.valueOf(fontSynthesis.m3206unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontWeightSaver$lambda$0(setBlock setblock, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HyphensSaver$lambda$0(setBlock setblock, Hyphens hyphens) {
        return Integer.valueOf(hyphens.m3402unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleAlignmentSaver$lambda$0(setBlock setblock, LineHeightStyle.Alignment alignment) {
        return Float.valueOf(alignment.m3476unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleModeSaver$lambda$0(setBlock setblock, LineHeightStyle.Mode mode) {
        return Integer.valueOf(mode.m3487unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleTrimSaver$lambda$0(setBlock setblock, LineHeightStyle.Trim trim) {
        return Integer.valueOf(trim.m3499unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextAlignSaver$lambda$0(setBlock setblock, TextAlign textAlign) {
        return Integer.valueOf(textAlign.m3510unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDecorationSaver$lambda$0(setBlock setblock, TextDecoration textDecoration) {
        return Integer.valueOf(textDecoration.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDirectionSaver$lambda$0(setBlock setblock, TextDirection textDirection) {
        return Integer.valueOf(textDirection.m3527unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextGeometricTransformSaver$lambda$0(setBlock setblock, TextGeometricTransform textGeometricTransform) {
        return SQLite.write(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }

    public static final invalidateShadow getSaver(Shadow.Companion companion) {
        return ShadowSaver;
    }

    public static final invalidateShadow getSaver(Color.Companion companion) {
        return ColorSaver;
    }

    public static final invalidateShadow getSaver(TextAlign.Companion companion) {
        return TextAlignSaver;
    }

    public static final invalidateShadow getSaver(TextDirection.Companion companion) {
        return TextDirectionSaver;
    }

    public static final invalidateShadow getSaver(Hyphens.Companion companion) {
        return HyphensSaver;
    }

    public static final invalidateShadow getSaver(FontStyle.Companion companion) {
        return FontStyleSaver;
    }

    public static final invalidateShadow getSaver(FontSynthesis.Companion companion) {
        return FontSynthesisSaver;
    }

    public static final invalidateShadow getSaver(TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    public static final invalidateShadow getSaver(TextUnitType.Companion companion) {
        return TextUnitTypeSaver;
    }

    public static final invalidateShadow getSaver(Offset.Companion companion) {
        return OffsetSaver;
    }

    public static final invalidateShadow getSaver(LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    public static final invalidateShadow getSaver(Locale.Companion companion) {
        return LocaleSaver;
    }

    public static final invalidateShadow getSaver(LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }

    private static final invalidateShadow getSaver(LineHeightStyle.Alignment.Companion companion) {
        return LineHeightStyleAlignmentSaver;
    }

    private static final invalidateShadow getSaver(LineHeightStyle.Trim.Companion companion) {
        return LineHeightStyleTrimSaver;
    }

    private static final invalidateShadow getSaver(LineHeightStyle.Mode.Companion companion) {
        return LineHeightStyleModeSaver;
    }

    public static final <Result> Result restore(Object obj) {
        if (obj == null) {
            return null;
        }
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }
}
