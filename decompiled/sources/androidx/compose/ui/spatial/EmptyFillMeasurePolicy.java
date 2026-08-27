package androidx.compose.ui.spatial;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class EmptyFillMeasurePolicy implements MeasurePolicy {
    public static final EmptyFillMeasurePolicy INSTANCE = new EmptyFillMeasurePolicy();

    private EmptyFillMeasurePolicy() {
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return MeasureScope.layout$default(measureScope, Constraints.m3626getMaxWidthimpl(j), Constraints.m3625getMaxHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.spatial.EmptyFillMeasurePolicy$measure$1
            public final void invoke(Placeable.PlacementScope placementScope) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }
}
