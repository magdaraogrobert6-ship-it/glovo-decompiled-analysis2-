package com.mapbox.navigation.base.internal.utils;

import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsRouteEx$stepsNamesAsString$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final DirectionsRouteEx$stepsNamesAsString$1 INSTANCE;
    public static final DirectionsRouteEx$stepsNamesAsString$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DirectionsRouteEx$stepsNamesAsString$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 1;
        INSTANCE$1 = new DirectionsRouteEx$stepsNamesAsString$1(i, i);
        INSTANCE = new DirectionsRouteEx$stepsNamesAsString$1(i, 0);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        if (this.$r8$classId != 0) {
            String strName = ((LegStep) obj).name();
            return strName == null ? "" : strName;
        }
        List<LegStep> listSteps = ((RouteLeg) obj).steps();
        return listSteps != null ? onContentCardDismissed.IconCompatParcelizer(listSteps, null, null, null, INSTANCE$1, 31) : "";
    }
}
