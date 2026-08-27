package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.ArrayList;
import java.util.List;
import o.ScrollExtensionsKt;
import o.createFromParcel;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    public boolean RemoteActionCompatParcelizer;
    public final ScrollExtensionsKt write;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            Placeable placeableMo2209measureBRTryo0 = ((Measurable) list.get(i)).mo2209measureBRTryo0(j);
            iMax = Math.max(iMax, placeableMo2209measureBRTryo0.getWidth());
            iMax2 = Math.max(iMax2, placeableMo2209measureBRTryo0.getHeight());
            arrayList.add(placeableMo2209measureBRTryo0);
        }
        boolean zIsLookingAhead = measureScope.isLookingAhead();
        ScrollExtensionsKt scrollExtensionsKt = this.write;
        if (zIsLookingAhead) {
            this.RemoteActionCompatParcelizer = true;
            ((onShowTranslationui) scrollExtensionsKt.IconCompatParcelizer).setValue(IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) iMax) << 32) | (4294967295L & ((long) iMax2)))));
        } else if (!this.RemoteActionCompatParcelizer) {
            ((onShowTranslationui) scrollExtensionsKt.IconCompatParcelizer).setValue(IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) iMax) << 32) | (4294967295L & ((long) iMax2)))));
        }
        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i2), 0, 0, 0.0f, 4, null);
                }
                return createFromParcel.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 4, null);
    }

    public AnimatedEnterExitMeasurePolicy(ScrollExtensionsKt scrollExtensionsKt) {
        this.write = scrollExtensionsKt;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicHeight = ((IntrinsicMeasurable) list.get(0)).maxIntrinsicHeight(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMaxIntrinsicHeight2 = ((IntrinsicMeasurable) list.get(i2)).maxIntrinsicHeight(i);
                if (iMaxIntrinsicHeight2 > iMaxIntrinsicHeight) {
                    iMaxIntrinsicHeight = iMaxIntrinsicHeight2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicWidth = ((IntrinsicMeasurable) list.get(0)).maxIntrinsicWidth(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMaxIntrinsicWidth2 = ((IntrinsicMeasurable) list.get(i2)).maxIntrinsicWidth(i);
                if (iMaxIntrinsicWidth2 > iMaxIntrinsicWidth) {
                    iMaxIntrinsicWidth = iMaxIntrinsicWidth2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicHeight = ((IntrinsicMeasurable) list.get(0)).minIntrinsicHeight(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMinIntrinsicHeight2 = ((IntrinsicMeasurable) list.get(i2)).minIntrinsicHeight(i);
                if (iMinIntrinsicHeight2 > iMinIntrinsicHeight) {
                    iMinIntrinsicHeight = iMinIntrinsicHeight2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMinIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicWidth = ((IntrinsicMeasurable) list.get(0)).minIntrinsicWidth(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMinIntrinsicWidth2 = ((IntrinsicMeasurable) list.get(i2)).minIntrinsicWidth(i);
                if (iMinIntrinsicWidth2 > iMinIntrinsicWidth) {
                    iMinIntrinsicWidth = iMinIntrinsicWidth2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMinIntrinsicWidth;
    }
}
