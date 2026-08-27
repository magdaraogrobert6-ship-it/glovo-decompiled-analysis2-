package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.geojson.FeatureCollection;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewRenderRouteDrawDataInputValue extends RouteLineViewExpectedInput {
    private final List<RouteLineEventData> alternativeRouteLinesData;
    private final RouteLineEventData primaryRouteLineData;
    private final RouteLineDynamicEventData routeLineMaskingLayerDynamicData;
    private final FeatureCollection waypointsSource;

    public final RouteLineEventData component1() {
        return this.primaryRouteLineData;
    }

    public final List<RouteLineEventData> component2() {
        return this.alternativeRouteLinesData;
    }

    public final FeatureCollection component3() {
        return this.waypointsSource;
    }

    public final RouteLineDynamicEventData component4() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final List<RouteLineEventData> getAlternativeRouteLinesData() {
        return this.alternativeRouteLinesData;
    }

    public final RouteLineEventData getPrimaryRouteLineData() {
        return this.primaryRouteLineData;
    }

    public final RouteLineDynamicEventData getRouteLineMaskingLayerDynamicData() {
        return this.routeLineMaskingLayerDynamicData;
    }

    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.alternativeRouteLinesData, this.primaryRouteLineData.hashCode() * 31, 31);
        int iHashCode = this.waypointsSource.hashCode();
        RouteLineDynamicEventData routeLineDynamicEventData = this.routeLineMaskingLayerDynamicData;
        return ((iHashCode + iM) * 31) + (routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteDrawDataInputValue(RouteLineEventData routeLineEventData, List<RouteLineEventData> list, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData) {
        super("value_render_route_draw_data");
        routeLineEventData.getClass();
        list.getClass();
        featureCollection.getClass();
        this.primaryRouteLineData = routeLineEventData;
        this.alternativeRouteLinesData = list;
        this.waypointsSource = featureCollection;
        this.routeLineMaskingLayerDynamicData = routeLineDynamicEventData;
    }

    public final RouteLineViewRenderRouteDrawDataInputValue copy(RouteLineEventData routeLineEventData, List<RouteLineEventData> list, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData) {
        routeLineEventData.getClass();
        list.getClass();
        featureCollection.getClass();
        return new RouteLineViewRenderRouteDrawDataInputValue(routeLineEventData, list, featureCollection, routeLineDynamicEventData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteDrawDataInputValue copy$default(RouteLineViewRenderRouteDrawDataInputValue routeLineViewRenderRouteDrawDataInputValue, RouteLineEventData routeLineEventData, List list, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData, int i, Object obj) {
        if ((i & 1) != 0) {
            routeLineEventData = routeLineViewRenderRouteDrawDataInputValue.primaryRouteLineData;
        }
        if ((i & 2) != 0) {
            list = routeLineViewRenderRouteDrawDataInputValue.alternativeRouteLinesData;
        }
        if ((i & 4) != 0) {
            featureCollection = routeLineViewRenderRouteDrawDataInputValue.waypointsSource;
        }
        if ((i & 8) != 0) {
            routeLineDynamicEventData = routeLineViewRenderRouteDrawDataInputValue.routeLineMaskingLayerDynamicData;
        }
        return routeLineViewRenderRouteDrawDataInputValue.copy(routeLineEventData, list, featureCollection, routeLineDynamicEventData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineViewRenderRouteDrawDataInputValue)) {
            return false;
        }
        RouteLineViewRenderRouteDrawDataInputValue routeLineViewRenderRouteDrawDataInputValue = (RouteLineViewRenderRouteDrawDataInputValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRouteLineData, routeLineViewRenderRouteDrawDataInputValue.primaryRouteLineData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRouteLinesData, routeLineViewRenderRouteDrawDataInputValue.alternativeRouteLinesData}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointsSource, routeLineViewRenderRouteDrawDataInputValue.waypointsSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLineMaskingLayerDynamicData, routeLineViewRenderRouteDrawDataInputValue.routeLineMaskingLayerDynamicData}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineViewRenderRouteDrawDataInputValue(primaryRouteLineData=" + this.primaryRouteLineData + ", alternativeRouteLinesData=" + this.alternativeRouteLinesData + ", waypointsSource=" + this.waypointsSource + ", routeLineMaskingLayerDynamicData=" + this.routeLineMaskingLayerDynamicData + ')';
    }
}
