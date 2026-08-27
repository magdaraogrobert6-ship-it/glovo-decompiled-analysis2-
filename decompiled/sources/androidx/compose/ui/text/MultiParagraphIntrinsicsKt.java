package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<Placeholder> range = list.get(i3);
            if (AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                if (i > range.getStart() || range.getEnd() > i2) {
                    InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new AnnotatedString.Range(range.getItem(), range.getStart() - i, range.getEnd() - i));
            }
        }
        return arrayList;
    }
}
