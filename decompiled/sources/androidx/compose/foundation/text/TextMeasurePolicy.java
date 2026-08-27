package androidx.compose.foundation.text;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import o.getBias;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class TextMeasurePolicy implements MeasurePolicy {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public TextMeasurePolicy(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((Measurable) obj).getParentData() instanceof getBias)) {
                arrayList.add(obj);
            }
        }
        List list3 = (List) this.write.invoke();
        ArrayList arrayList2 = null;
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Rect rect = (Rect) list3.get(i2);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = rect != null ? new onViewAttachedToWindowlambda0(((Measurable) arrayList.get(i2)).mo2209measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getRight() - rect.getLeft()), 0, (int) Math.floor(rect.getBottom() - rect.getTop()), 5, null)), IntOffset.m3792boximpl(IntOffset.m3795constructorimpl((((long) Math.round(rect.getLeft())) << 32) | (((long) Math.round(rect.getTop())) & 4294967295L)))) : null;
                if (onviewattachedtowindowlambda0 != null) {
                    arrayList3.add(onviewattachedtowindowlambda0);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((Measurable) obj2).getParentData() instanceof getBias) {
                arrayList4.add(obj2);
            }
        }
        return MeasureScope.layout$default(measureScope, Constraints.m3626getMaxWidthimpl(j), Constraints.m3625getMaxHeightimpl(j), null, new Recomposer$$ExternalSyntheticLambda4(arrayList2, 9, BasicTextKt.access$measureWithTextRangeMeasureConstraints(arrayList4, this.IconCompatParcelizer)), 4, null);
    }
}
