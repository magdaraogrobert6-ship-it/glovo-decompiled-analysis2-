package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import o.FloatingActionButtonKt;
import o.IconButtonKtSurfaceIconButton2;
import o.IconCompatParcelizer;
import o.accessisRelatedToAutoCommit;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BoxMeasurePolicy implements MeasurePolicy {
    public final boolean RemoteActionCompatParcelizer;
    public final Alignment serializer;

    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.serializer.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(final MeasureScope measureScope, final List list, long j) {
        int iMax;
        int iMax2;
        Placeable placeableMo2209measureBRTryo0;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m3628getMinWidthimpl(j), Constraints.m3627getMinHeightimpl(j), null, new accessisRelatedToAutoCommit(20), 4, null);
        }
        long jM3614constructorimpl = this.RemoteActionCompatParcelizer ? j : Constraints.m3614constructorimpl(j & ConstraintsKt.MaxDimensionsAndFocusMask);
        if (list.size() == 1) {
            Measurable measurable = (Measurable) list.get(0);
            Object parentData = measurable.getParentData();
            FloatingActionButtonKt floatingActionButtonKt = parentData instanceof FloatingActionButtonKt ? (FloatingActionButtonKt) parentData : null;
            if (floatingActionButtonKt == null || !floatingActionButtonKt.IconCompatParcelizer) {
                Placeable placeableMo2209measureBRTryo1 = measurable.mo2209measureBRTryo0(jM3614constructorimpl);
                iMax = Math.max(Constraints.m3628getMinWidthimpl(j), placeableMo2209measureBRTryo1.getWidth());
                iMax2 = Math.max(Constraints.m3627getMinHeightimpl(j), placeableMo2209measureBRTryo1.getHeight());
                placeableMo2209measureBRTryo0 = placeableMo2209measureBRTryo1;
            } else {
                int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
                int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
                placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(Constraints.Companion.m3636fixedJhjzzOo(Constraints.m3628getMinWidthimpl(j), Constraints.m3627getMinHeightimpl(j)));
                iMax = iM3628getMinWidthimpl;
                iMax2 = iM3627getMinHeightimpl;
            }
            return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new IconButtonKtSurfaceIconButton2(placeableMo2209measureBRTryo0, measurable, measureScope, iMax, iMax2, this), 4, null);
        }
        final Placeable[] placeableArr = new Placeable[list.size()];
        final createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda01.read = Constraints.m3628getMinWidthimpl(j);
        final createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda02 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda02.read = Constraints.m3627getMinHeightimpl(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Measurable measurable2 = (Measurable) list.get(i);
            Object parentData2 = measurable2.getParentData();
            FloatingActionButtonKt floatingActionButtonKt2 = parentData2 instanceof FloatingActionButtonKt ? (FloatingActionButtonKt) parentData2 : null;
            if (floatingActionButtonKt2 == null || !floatingActionButtonKt2.IconCompatParcelizer) {
                Placeable placeableMo2209measureBRTryo2 = measurable2.mo2209measureBRTryo0(jM3614constructorimpl);
                placeableArr[i] = placeableMo2209measureBRTryo2;
                createbrazeuserchangeeventsubscriberlambda01.read = Math.max(createbrazeuserchangeeventsubscriberlambda01.read, placeableMo2209measureBRTryo2.getWidth());
                createbrazeuserchangeeventsubscriberlambda02.read = Math.max(createbrazeuserchangeeventsubscriberlambda02.read, placeableMo2209measureBRTryo2.getHeight());
            } else {
                z = true;
            }
        }
        if (z) {
            int i2 = createbrazeuserchangeeventsubscriberlambda01.read;
            int i3 = i2 != Integer.MAX_VALUE ? i2 : 0;
            int i4 = createbrazeuserchangeeventsubscriberlambda02.read;
            long jConstraints = ConstraintsKt.Constraints(i3, i2, i4 != Integer.MAX_VALUE ? i4 : 0, i4);
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Measurable measurable3 = (Measurable) list.get(i5);
                Object parentData3 = measurable3.getParentData();
                FloatingActionButtonKt floatingActionButtonKt3 = parentData3 instanceof FloatingActionButtonKt ? (FloatingActionButtonKt) parentData3 : null;
                if (floatingActionButtonKt3 != null && floatingActionButtonKt3.IconCompatParcelizer) {
                    placeableArr[i5] = measurable3.mo2209measureBRTryo0(jConstraints);
                }
            }
        }
        return MeasureScope.layout$default(measureScope, createbrazeuserchangeeventsubscriberlambda01.read, createbrazeuserchangeeventsubscriberlambda02.read, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.IconButtonImpl
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                androidx.compose.ui.layout.Placeable[] placeableArr2 = placeableArr;
                int length = placeableArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    androidx.compose.ui.layout.Placeable placeable = placeableArr2[i6];
                    placeable.getClass();
                    androidx.compose.foundation.layout.BoxKt.access$placeInBox(placementScope, placeable, (androidx.compose.ui.layout.Measurable) list.get(i7), measureScope.getLayoutDirection(), createbrazeuserchangeeventsubscriberlambda01.read, createbrazeuserchangeeventsubscriberlambda02.read, this.serializer);
                    i6++;
                    i7++;
                }
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    public BoxMeasurePolicy(Alignment alignment, boolean z) {
        this.serializer = alignment;
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, boxMeasurePolicy.serializer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == boxMeasurePolicy.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.serializer);
        sb.append(", propagateMinConstraints=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
