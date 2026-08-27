package o;

import java.util.ArrayList;
import java.util.Iterator;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DataStoreUtilsc {
    public static final androidx.compose.ui.text.style.ResolvedTextDirection write(androidx.compose.ui.text.TextLayoutResult textLayoutResult, int i) {
        if (textLayoutResult.getLayoutInput().getText().length() != 0) {
            int lineForOffset = textLayoutResult.getLineForOffset(i);
            if ((i != 0 && lineForOffset == textLayoutResult.getLineForOffset(i - 1)) || (i != textLayoutResult.getLayoutInput().getText().length() && lineForOffset == textLayoutResult.getLineForOffset(i + 1))) {
                return textLayoutResult.getBidiRunDirection(i);
            }
        }
        return textLayoutResult.getParagraphDirection(i);
    }

    public static final DataStoreUtilsd read(DataStoreUtilsd dataStoreUtilsd) {
        ArrayList arrayList = dataStoreUtilsd.write;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LocalDate) it.next()).plusWeeks(1));
        }
        return new DataStoreUtilsd(arrayList2);
    }
}
