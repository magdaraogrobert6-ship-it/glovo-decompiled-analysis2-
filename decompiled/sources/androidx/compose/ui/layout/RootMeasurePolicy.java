package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m3628getMinWidthimpl(j), Constraints.m3627getMinHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 4, null);
        }
        if (size == 1) {
            final Placeable placeableMo2209measureBRTryo0 = list.get(0).mo2209measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m3643constrainWidthK40F9xA(j, placeableMo2209measureBRTryo0.getWidth()), ConstraintsKt.m3642constrainHeightK40F9xA(j, placeableMo2209measureBRTryo0.getHeight()), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 12, (Object) null);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            Placeable placeableMo2209measureBRTryo1 = list.get(i).mo2209measureBRTryo0(j);
            iMax = Math.max(placeableMo2209measureBRTryo1.getWidth(), iMax);
            iMax2 = Math.max(placeableMo2209measureBRTryo1.getHeight(), iMax2);
            arrayList.add(placeableMo2209measureBRTryo1);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m3643constrainWidthK40F9xA(j, iMax), ConstraintsKt.m3642constrainHeightK40F9xA(j, iMax2), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                List<Placeable> list2 = arrayList;
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i2), 0, 0, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 12, (Object) null);
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }
}
