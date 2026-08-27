package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.BrazeContentCardsManager;
import o.DrawableTransformation;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final boolean contains(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 == i4) {
                if ((i3 == i4) == (i == i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        boolean z = i == i2;
        boolean z2 = i3 == i4;
        return ((i < i4) & (i3 < i2)) | ((z | z2) & (i == i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean substringWithoutParagraphStyles$lambda$0(AnnotatedString.Annotation annotation) {
        return !(annotation instanceof ParagraphStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String capitalize$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return i == 0 ? StringKt.capitalize(str.substring(i, i2), localeList) : str.substring(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String decapitalize$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return i == 0 ? StringKt.decapitalize(str.substring(i, i2), localeList) : str.substring(i, i2);
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text();
        List listSerializer = paragraphStylesOrNull$ui_text != null ? onContentCardDismissed.serializer(paragraphStylesOrNull$ui_text, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : instance_delegatelambda0.write;
        ArrayList arrayList = new ArrayList();
        BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
        int size = listSerializer.size();
        int end = 0;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listSerializer.get(i);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart() && !brazeContentCardsManager.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) brazeContentCardsManager.serializer();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!brazeContentCardsManager.isEmpty() && end == ((AnnotatedString.Range) brazeContentCardsManager.serializer()).getEnd()) {
                        brazeContentCardsManager.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) brazeContentCardsManager.RemoteActionCompatParcelizer();
            if (range3 == null) {
                brazeContentCardsManager.addLast(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                brazeContentCardsManager.removeLast();
                brazeContentCardsManager.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                brazeContentCardsManager.removeLast();
                brazeContentCardsManager.addLast(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else {
                if (range3.getEnd() < rangeCopy$default.getEnd()) {
                    DrawableTransformation.write();
                    return null;
                }
                brazeContentCardsManager.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !brazeContentCardsManager.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) brazeContentCardsManager.serializer();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!brazeContentCardsManager.isEmpty() && end == ((AnnotatedString.Range) brazeContentCardsManager.serializer()).getEnd()) {
                brazeContentCardsManager.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new AnnotatedStringKt$$ExternalSyntheticLambda0(1, localeList));
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new AnnotatedStringKt$$ExternalSyntheticLambda0(0, localeList));
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new AnnotatedStringKt$$ExternalSyntheticLambda0(3, localeList));
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, LocaleList localeList) {
        return JvmAnnotatedString_jvmAndAndroidKt.transform(annotatedString, new AnnotatedStringKt$$ExternalSyntheticLambda0(2, localeList));
    }

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        List list;
        Object[] objArr = {new AnnotatedString.Range(spanStyle, 0, str.length())};
        int iSerializer = getQueryParameterslambda2.serializer();
        List list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        if (paragraphStyle == null) {
            list = instance_delegatelambda0.write;
        } else {
            Object[] objArr2 = {new AnnotatedString.Range(paragraphStyle, 0, str.length())};
            int iSerializer2 = getQueryParameterslambda2.serializer();
            list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer2);
        }
        return new AnnotatedString(str, list2, list);
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text;
        if (i == i2 || (annotations$ui_text = annotatedString.getAnnotations$ui_text()) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                return annotations$ui_text;
            }
            ArrayList arrayList = new ArrayList(annotations$ui_text.size());
            int size = annotations$ui_text.size();
            while (i3 < size) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i3);
                if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(range.getItem())).booleanValue()) {
                    arrayList.add(range);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text.size());
        int size2 = annotations$ui_text.size();
        while (i3 < size2) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text.get(i3);
            if ((r8lambdaunavo3sxub_pc9xroryotnrlvsm == null || ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(range2.getItem())).booleanValue()) && intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList2.add(new AnnotatedString.Range(range2.getItem(), RangesKt.RemoteActionCompatParcelizer(range2.getStart(), i, i2) - i, RangesKt.RemoteActionCompatParcelizer(range2.getEnd(), i, i2) - i, range2.getTag()));
            }
            i3++;
        }
        return arrayList2;
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text;
        if (i == i2 || (paragraphStylesOrNull$ui_text = annotatedString.getParagraphStylesOrNull$ui_text()) == null) {
            return null;
        }
        if (i == 0 && i2 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text.size());
        int size = paragraphStylesOrNull$ui_text.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i) {
                    start = i;
                }
                if (start > i2) {
                    start = i2;
                }
                int end = range.getEnd();
                if (end < i) {
                    end = i;
                }
                if (end > i2) {
                    end = i2;
                }
                arrayList.add(new AnnotatedString.Range(item, start - i, end - i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String strSubstring;
        if (i != i2) {
            strSubstring = annotatedString.getText().substring(i, i2);
        } else {
            strSubstring = "";
        }
        List localAnnotations = getLocalAnnotations(annotatedString, i, i2, new SaversKt$$ExternalSyntheticLambda2(3));
        if (localAnnotations == null) {
            localAnnotations = instance_delegatelambda0.write;
        }
        return new AnnotatedString(strSubstring, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) localAnnotations);
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toLowerCase$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return StringKt.toLowerCase(str.substring(i, i2), localeList);
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toUpperCase$lambda$0(LocaleList localeList, String str, int i, int i2) {
        return StringKt.toUpperCase(str.substring(i, i2), localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushLink);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i, int i2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        return getLocalAnnotations(annotatedString, i, i2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(list2.get(i2));
        }
        return arrayList;
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i);
            arrayList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<? extends T> range = list.get(i3);
            if (intersect(i, i2, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i, range.getStart()) - i, Math.min(i2, range.getEnd()) - i, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @ExperimentalTextApi
    @onItemDismisslambda0
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        Object[] objArr = {new AnnotatedString.Range(paragraphStyle, 0, str.length())};
        int iSerializer = getQueryParameterslambda2.serializer();
        return new AnnotatedString(str, instance_delegatelambda0.write, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }
}
