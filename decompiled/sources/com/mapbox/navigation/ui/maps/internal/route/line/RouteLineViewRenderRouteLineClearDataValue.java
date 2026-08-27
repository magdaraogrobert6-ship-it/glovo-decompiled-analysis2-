package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.geojson.FeatureCollection;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewRenderRouteLineClearDataValue extends RouteLineViewExpectedInput {
    private final List<FeatureCollection> alternativeRoutesSources;
    private final FeatureCollection primaryRouteSource;
    private final FeatureCollection waypointsSource;

    public final FeatureCollection component1() {
        return this.primaryRouteSource;
    }

    public final List<FeatureCollection> component2() {
        return this.alternativeRoutesSources;
    }

    public final FeatureCollection component3() {
        return this.waypointsSource;
    }

    public final List<FeatureCollection> getAlternativeRoutesSources() {
        return this.alternativeRoutesSources;
    }

    public final FeatureCollection getPrimaryRouteSource() {
        return this.primaryRouteSource;
    }

    public final FeatureCollection getWaypointsSource() {
        return this.waypointsSource;
    }

    public int hashCode() {
        return this.waypointsSource.hashCode() + c8$$ExternalSyntheticOutline0.m(this.alternativeRoutesSources, this.primaryRouteSource.hashCode() * 31, 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewRenderRouteLineClearDataValue(FeatureCollection featureCollection, List<FeatureCollection> list, FeatureCollection featureCollection2) {
        super("value_render_route_line_clear");
        featureCollection.getClass();
        list.getClass();
        featureCollection2.getClass();
        this.primaryRouteSource = featureCollection;
        this.alternativeRoutesSources = list;
        this.waypointsSource = featureCollection2;
    }

    public final RouteLineViewRenderRouteLineClearDataValue copy(FeatureCollection featureCollection, List<FeatureCollection> list, FeatureCollection featureCollection2) {
        featureCollection.getClass();
        list.getClass();
        featureCollection2.getClass();
        return new RouteLineViewRenderRouteLineClearDataValue(featureCollection, list, featureCollection2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteLineViewRenderRouteLineClearDataValue copy$default(RouteLineViewRenderRouteLineClearDataValue routeLineViewRenderRouteLineClearDataValue, FeatureCollection featureCollection, List list, FeatureCollection featureCollection2, int i, Object obj) {
        if ((i & 1) != 0) {
            featureCollection = routeLineViewRenderRouteLineClearDataValue.primaryRouteSource;
        }
        if ((i & 2) != 0) {
            list = routeLineViewRenderRouteLineClearDataValue.alternativeRoutesSources;
        }
        if ((i & 4) != 0) {
            featureCollection2 = routeLineViewRenderRouteLineClearDataValue.waypointsSource;
        }
        return routeLineViewRenderRouteLineClearDataValue.copy(featureCollection, list, featureCollection2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineViewRenderRouteLineClearDataValue)) {
            return false;
        }
        RouteLineViewRenderRouteLineClearDataValue routeLineViewRenderRouteLineClearDataValue = (RouteLineViewRenderRouteLineClearDataValue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.primaryRouteSource, routeLineViewRenderRouteLineClearDataValue.primaryRouteSource}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.alternativeRoutesSources, routeLineViewRenderRouteLineClearDataValue.alternativeRoutesSources}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.waypointsSource, routeLineViewRenderRouteLineClearDataValue.waypointsSource}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineViewRenderRouteLineClearDataValue(primaryRouteSource=" + this.primaryRouteSource + ", alternativeRoutesSources=" + this.alternativeRoutesSources + ", waypointsSource=" + this.waypointsSource + ')';
    }
}
