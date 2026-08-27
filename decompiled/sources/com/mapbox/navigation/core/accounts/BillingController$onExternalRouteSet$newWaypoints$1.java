package com.mapbox.navigation.core.accounts;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.mlkit_vision_face.zzki;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.navigation.base.internal.route.Waypoint;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.line.model.ExtractedRouteRestrictionData;
import com.mapbox.navigation.ui.maps.route.line.model.InactiveRouteColors;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData;
import com.mapbox.navigation.ui.maps.route.line.model.SegmentColorType;
import com.sentiance.core.model.events.E$b;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingController$onExternalRouteSet$newWaypoints$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $initialLegIndex;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingController$onExternalRouteSet$newWaypoints$1(int i, InactiveRouteColors inactiveRouteColors) {
        super(1);
        this.$r8$classId = 2;
        this.$initialLegIndex = i;
        this.this$0 = inactiveRouteColors;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        int i2 = this.$initialLegIndex;
        int i3 = 1;
        if (i == 0) {
            List list = (List) obj;
            list.getClass();
            ((E$b) obj2).getClass();
            if (i2 < list.size()) {
                int i4 = 0;
                i3 = 0;
                while (i4 <= i2) {
                    if (zzki.isLegWaypoint((Waypoint) list.get(i3))) {
                        i4++;
                    }
                    i3++;
                }
            }
            return Integer.valueOf(i3);
        }
        if (i == 1) {
            Expression.ExpressionBuilder expressionBuilder = (Expression.ExpressionBuilder) obj;
            expressionBuilder.getClass();
            expressionBuilder.literal(((ExtractedRouteRestrictionData) obj2).offset);
            expressionBuilder.color(i2);
            return createFromParcel.INSTANCE;
        }
        RouteLineExpressionData routeLineExpressionData = (RouteLineExpressionData) obj;
        routeLineExpressionData.getClass();
        String str = routeLineExpressionData.congestionValue;
        if (routeLineExpressionData.legIndex == i2) {
            return routeLineExpressionData;
        }
        MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
        InactiveRouteColors inactiveRouteColors = (InactiveRouteColors) obj2;
        inactiveRouteColors.getClass();
        SegmentColorType segmentColorType = inactiveRouteColors.inactiveRouteLegUnknownCongestionColorType;
        switch (str.hashCode()) {
            case -1357520532:
                if (str.equals("closed")) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegClosureColorType;
                }
                break;
            case -1297282981:
                if (str.equals("restricted")) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegRestrictedRoadColorType;
                }
                break;
            case -905723276:
                if (str.equals("severe")) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegSevereCongestionColorType;
                }
                break;
            case -618857213:
                if (str.equals("moderate")) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegModerateCongestionColorType;
                }
                break;
            case -284840886:
                str.equals(SystemUtils.UNKNOWN);
                break;
            case 107348:
                if (str.equals(Constants.LOW)) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegLowCongestionColorType;
                }
                break;
            case 99152071:
                if (str.equals("heavy")) {
                    segmentColorType = inactiveRouteColors.inactiveRouteLegHeavyCongestionColorType;
                }
                break;
        }
        SegmentColorType segmentColorType2 = segmentColorType;
        segmentColorType2.getClass();
        return new RouteLineExpressionData(routeLineExpressionData.offset, str, segmentColorType2, routeLineExpressionData.legIndex);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BillingController$onExternalRouteSet$newWaypoints$1(Object obj, int i, int i2) {
        super(1);
        this.$r8$classId = i2;
        this.this$0 = obj;
        this.$initialLegIndex = i;
    }
}
