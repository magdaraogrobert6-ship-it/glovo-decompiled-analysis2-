package androidx.compose.ui.window;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
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
            return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                {
                    super(1);
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, 4, null);
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
            iMax = Math.max(iMax, placeableMo2209measureBRTryo1.getWidth());
            iMax2 = Math.max(iMax2, placeableMo2209measureBRTryo1.getHeight());
            arrayList.add(placeableMo2209measureBRTryo1);
        }
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
            public final void invoke(Placeable.PlacementScope placementScope) {
                int iWrite = SQLite.write((List) arrayList);
                if (iWrite < 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, arrayList.get(i2), 0, 0, 0.0f, 4, null);
                    if (i2 == iWrite) {
                        return;
                    } else {
                        i2++;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }
}
