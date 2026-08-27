package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewRenderRouteLineUpdateDataValue extends RouteLineViewExpectedInput {
    private final List<RouteLineDynamicEventData> alternativeRouteLinesDynamicData;
    private final RouteLineDynamicEventData primaryRouteLineDynamicData;
    private final RouteLineDynamicEventData routeLineMaskingLayerDynamicData;

    public final RouteLineDynamicEventData component1() {
        return this.primaryRouteLineDynamicData;
    }

    public final List<RouteLineDynamicEventData> component2() {
        return this.alternativeRouteLinesDynamicData;
    }

    public final RouteLineDynamicEventData component3() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final List<RouteLineDynamicEventData> getAlternativeRouteLinesDynamicData() {
        return this.alternativeRouteLinesDynamicData;
    }

    public final RouteLineDynamicEventData getPrimaryRouteLineDynamicData() {
        return this.primaryRouteLineDynamicData;
    }

    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteLineUpdateDataValue copy$default(RouteLineViewRenderRouteLineUpdateDataValue routeLineViewRenderRouteLineUpdateDataValue, RouteLineDynamicEventData routeLineDynamicEventData, List list, RouteLineDynamicEventData routeLineDynamicEventData2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeLineDynamicEventData = routeLineViewRenderRouteLineUpdateDataValue.primaryRouteLineDynamicData;
        }
        if ((i & 2) != 0) {
            list = routeLineViewRenderRouteLineUpdateDataValue.alternativeRouteLinesDynamicData;
        }
        if ((i & 4) != 0) {
            routeLineDynamicEventData2 = routeLineViewRenderRouteLineUpdateDataValue.routeLineMaskingLayerDynamicData;
        }
        return routeLineViewRenderRouteLineUpdateDataValue.copy(routeLineDynamicEventData, list, routeLineDynamicEventData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineViewRenderRouteLineUpdateDataValue)) {
            return false;
        }
        RouteLineViewRenderRouteLineUpdateDataValue routeLineViewRenderRouteLineUpdateDataValue = (RouteLineViewRenderRouteLineUpdateDataValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRouteLineDynamicData, routeLineViewRenderRouteLineUpdateDataValue.primaryRouteLineDynamicData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRouteLinesDynamicData, routeLineViewRenderRouteLineUpdateDataValue.alternativeRouteLinesDynamicData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineMaskingLayerDynamicData, routeLineViewRenderRouteLineUpdateDataValue.routeLineMaskingLayerDynamicData}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineViewRenderRouteLineUpdateDataValue(primaryRouteLineDynamicData=" + this.primaryRouteLineDynamicData + ", alternativeRouteLinesDynamicData=" + this.alternativeRouteLinesDynamicData + ", routeLineMaskingLayerDynamicData=" + this.routeLineMaskingLayerDynamicData + ')';
    }

    public final RouteLineViewRenderRouteLineUpdateDataValue copy(RouteLineDynamicEventData routeLineDynamicEventData, List<RouteLineDynamicEventData> list, RouteLineDynamicEventData routeLineDynamicEventData2) {
        list.getClass();
        return new RouteLineViewRenderRouteLineUpdateDataValue(routeLineDynamicEventData, list, routeLineDynamicEventData2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteLineUpdateDataValue(RouteLineDynamicEventData routeLineDynamicEventData, List<RouteLineDynamicEventData> list, RouteLineDynamicEventData routeLineDynamicEventData2) {
        super("value_render_route_line_update");
        list.getClass();
        this.primaryRouteLineDynamicData = routeLineDynamicEventData;
        this.alternativeRouteLinesDynamicData = list;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicEventData2;
    }

    public int hashCode() {
        RouteLineDynamicEventData routeLineDynamicEventData = this.primaryRouteLineDynamicData;
        int iM = c8$$ExternalSyntheticOutline0.m(this.alternativeRouteLinesDynamicData, (routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode()) * 31, 31);
        RouteLineDynamicEventData routeLineDynamicEventData2 = this.routeLineMaskingLayerDynamicData;
        return iM + (routeLineDynamicEventData2 != null ? routeLineDynamicEventData2.hashCode() : 0);
    }
}
