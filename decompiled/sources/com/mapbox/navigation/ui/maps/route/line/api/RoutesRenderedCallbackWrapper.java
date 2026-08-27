package com.mapbox.navigation.ui.maps.route.line.api;

import com.huawei.location.ut;
import com.mapbox.maps.MapboxMap;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRenderedCallbackWrapper {
    public final ut callback;
    public final MapboxMap map;

    public final int hashCode() {
        return this.callback.hashCode() + (this.map.hashCode() * 31);
    }

    public RoutesRenderedCallbackWrapper(MapboxMap mapboxMap, ut utVar) {
        mapboxMap.getClass();
        this.map = mapboxMap;
        this.callback = utVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoutesRenderedCallbackWrapper) {
            RoutesRenderedCallbackWrapper routesRenderedCallbackWrapper = (RoutesRenderedCallbackWrapper) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.map, routesRenderedCallbackWrapper.map}, getCieXyz.write())).booleanValue() && this.callback == routesRenderedCallbackWrapper.callback;
        }
        return false;
    }

    public final String toString() {
        return "RoutesRenderedCallbackWrapper(map=" + this.map + ", callback=" + this.callback + ')';
    }
}
