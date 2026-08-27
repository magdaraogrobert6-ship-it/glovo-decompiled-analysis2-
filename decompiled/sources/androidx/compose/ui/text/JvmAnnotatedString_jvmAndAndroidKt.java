package androidx.compose.ui.text;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.AbstractList;
import kotlin.collections.MovingSubList;
import o.DefaultContentCardsViewBindingHandlerCompanionCREATOR1;
import o.ScrollNode;
import o.accessanimateTo;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.onContentCardClicked;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw;

/* JADX INFO: loaded from: classes4.dex */
public final class JvmAnnotatedString_jvmAndAndroidKt {
    private static final createFromParcel transform$lambda$0(createInAppMessageEventSubscriber createinappmessageeventsubscriber, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, AnnotatedString annotatedString, accessanimateTo accessanimateto, List list) {
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        String str = ((String) createinappmessageeventsubscriber.IconCompatParcelizer) + ((String) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
        createinappmessageeventsubscriber.IconCompatParcelizer = str;
        accessanimateto.IconCompatParcelizer(iIntValue2, str.length());
        return createFromParcel.INSTANCE;
    }

    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range<?> range = list.get(i);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString transform(AnnotatedString annotatedString, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        ArrayList arrayList;
        Integer[] numArr = {0, Integer.valueOf(annotatedString.getText().length())};
        TreeSet treeSet = new TreeSet();
        onContentCardClicked.read((Object[]) numArr, (AbstractSet) treeSet);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text(), treeSet);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = "";
        int i = ScrollNode.read;
        accessanimateTo accessanimateto = new accessanimateTo();
        accessanimateto.IconCompatParcelizer(0, 0);
        r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.write(2, 1);
        if ((treeSet instanceof RandomAccess) && (treeSet instanceof List)) {
            List list = (List) treeSet;
            int size = list.size();
            ArrayList arrayList2 = new ArrayList((size % 1 == 0 ? 0 : 1) + size);
            MovingSubList movingSubList = new MovingSubList(list);
            for (int i2 = 0; i2 >= 0 && i2 < size; i2++) {
                int i3 = size - i2;
                if (2 <= i3) {
                    i3 = 2;
                }
                if (i3 < 2) {
                    break;
                }
                int i4 = i3 + i2;
                DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
                int size2 = movingSubList.write.size();
                defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
                DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i2, i4, size2);
                movingSubList.IconCompatParcelizer = i2;
                movingSubList.serializer = i4 - i2;
                arrayList2.add(transform$lambda$0(createinappmessageeventsubscriber, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, annotatedString, accessanimateto, movingSubList));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator itWrite = r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.write(treeSet.iterator(), 2, 1, false, true);
            while (itWrite.hasNext()) {
                arrayList3.add(transform$lambda$0(createinappmessageeventsubscriber, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, annotatedString, accessanimateto, (List) itWrite.next()));
            }
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
        if (annotations$ui_text != null) {
            arrayList = new ArrayList(annotations$ui_text.size());
            int size3 = annotations$ui_text.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text.get(i5);
                arrayList.add(new AnnotatedString.Range(range.getItem(), accessanimateto.IconCompatParcelizer(range.getStart()), accessanimateto.IconCompatParcelizer(range.getEnd())));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) createinappmessageeventsubscriber.IconCompatParcelizer);
    }
}
