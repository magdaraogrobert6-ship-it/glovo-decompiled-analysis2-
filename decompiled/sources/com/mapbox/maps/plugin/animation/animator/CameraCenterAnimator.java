package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import androidx.sqlite.SQLite;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ReversedListReadOnly;
import o.BaseContentCardView;
import o.accessgetInstancedelegatecp;
import o.bindViewHolderlambda0;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraCenterAnimator extends CameraAnimator {
    public final CameraAnimatorType type;
    public final boolean useShortestPath;

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final CameraAnimatorType getType() {
        return this.type;
    }

    public CameraCenterAnimator(TypeEvaluator typeEvaluator, CameraAnimatorOptions cameraAnimatorOptions, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(typeEvaluator, cameraAnimatorOptions);
        this.useShortestPath = z;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
        }
        this.type = CameraAnimatorType.CENTER;
    }

    @Override // com.mapbox.maps.plugin.animation.animator.CameraAnimator
    public final Object[] resolveAnimationObjectValues(Object obj) {
        obj.getClass();
        if (!this.useShortestPath) {
            return super.resolveAnimationObjectValues(obj);
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{(Point) obj}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        Object[] objArr = this.targets;
        objArr.getClass();
        ArrayList arrayList = new ArrayList(list.size() + objArr.length);
        arrayList.addAll(list);
        onContentCardDismissed.serializer(arrayList, objArr);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(ModuleDSLKt.wrapCoordinate((Point) it.next()));
        }
        Iterator it2 = new ReversedListReadOnly(arrayList3).iterator();
        while (true) {
            ListIterator listIterator = ((BaseContentCardView) it2).write;
            if (!listIterator.hasPrevious()) {
                Object[] array = new bindViewHolderlambda0(arrayList2).toArray(new Point[0]);
                array.getClass();
                return array;
            }
            Point point = (Point) listIterator.previous();
            if (arrayList2.isEmpty()) {
                arrayList2.add(point);
            } else {
                arrayList2.add(ModuleDSLKt.unwrapForShortestPath(point, (Point) onContentCardDismissed.MediaDescriptionCompat((List) arrayList2)));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraCenterAnimator(CameraAnimatorOptions cameraAnimatorOptions, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this(Evaluators$POINT$1.INSTANCE, cameraAnimatorOptions, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        EdgeInsets edgeInsets = Evaluators.zeroEdgeInsets;
    }
}
