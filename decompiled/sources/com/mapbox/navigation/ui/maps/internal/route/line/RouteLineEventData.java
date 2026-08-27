package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import com.mapbox.geojson.FeatureCollection;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineEventData {
    private final RouteLineDynamicEventData dynamicData;
    private final FeatureCollection featureCollection;

    public final FeatureCollection component1() {
        return this.featureCollection;
    }

    public final RouteLineDynamicEventData component2() {
        return this.dynamicData;
    }

    public final RouteLineDynamicEventData getDynamicData() {
        return this.dynamicData;
    }

    public final FeatureCollection getFeatureCollection() {
        return this.featureCollection;
    }

    public int hashCode() {
        int iHashCode = this.featureCollection.hashCode();
        RouteLineDynamicEventData routeLineDynamicEventData = this.dynamicData;
        return (iHashCode * 31) + (routeLineDynamicEventData == null ? 0 : routeLineDynamicEventData.hashCode());
    }

    public RouteLineEventData(FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData) {
        featureCollection.getClass();
        this.featureCollection = featureCollection;
        this.dynamicData = routeLineDynamicEventData;
    }

    public static /* synthetic */ RouteLineEventData copy$default(RouteLineEventData routeLineEventData, FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData, int i, Object obj) {
        if ((i & 1) != 0) {
            featureCollection = routeLineEventData.featureCollection;
        }
        if ((i & 2) != 0) {
            routeLineDynamicEventData = routeLineEventData.dynamicData;
        }
        return routeLineEventData.copy(featureCollection, routeLineDynamicEventData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineEventData)) {
            return false;
        }
        RouteLineEventData routeLineEventData = (RouteLineEventData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureCollection, routeLineEventData.featureCollection}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dynamicData, routeLineEventData.dynamicData}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "RouteLineEventData(featureCollection=" + this.featureCollection + ", dynamicData=" + this.dynamicData + ')';
    }

    public final RouteLineEventData copy(FeatureCollection featureCollection, RouteLineDynamicEventData routeLineDynamicEventData) {
        featureCollection.getClass();
        return new RouteLineEventData(featureCollection, routeLineDynamicEventData);
    }
}
