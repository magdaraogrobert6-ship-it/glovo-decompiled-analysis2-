package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParcelableSnapshotMutableIntState {
    public static final androidx.compose.foundation.pager.MeasuredPage write(BaselineButtonTokens baselineButtonTokens, int i, long j, GapComposerKtExternalSyntheticLambda0 gapComposerKtExternalSyntheticLambda0, long j2, SelectionHandleIcon selectionHandleIcon, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, int i2, animateToWithDecay animatetowithdecay) {
        List list;
        Object objWrite = gapComposerKtExternalSyntheticLambda0.write(i);
        List list2 = (List) animatetowithdecay.serializer(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listWrite = baselineButtonTokens.write(i);
            int size = listWrite.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((androidx.compose.ui.layout.Measurable) listWrite.get(i3)).mo2209measureBRTryo0(j));
            }
            animatetowithdecay.IconCompatParcelizer(i, arrayList);
            list = arrayList;
        }
        return new androidx.compose.foundation.pager.MeasuredPage(i, i2, list, j2, objWrite, selectionHandleIcon, horizontal, vertical, layoutDirection, z);
    }
}
