package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.directions.route.DirectionsRouteContext;
import com.mapbox.geojson.Point;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouteInterfaceNative implements RouteInterface {
    protected long peer;

    public static class RouteInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteInterfaceNative.cleanNativePeer(this.peer);
        }

        public RouteInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteInterface
    public native DirectionsRouteContext getDirectionsRouteContext();

    @Override // com.mapbox.navigator.RouteInterface
    public native Long getExpirationTimeMs();

    @Override // com.mapbox.navigator.RouteInterface
    public native Date getLastRefreshTimestamp();

    @Override // com.mapbox.navigator.RouteInterface
    public native MapboxAPI getMapboxAPI();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getRequestUri();

    @Override // com.mapbox.navigator.RouteInterface
    public native DataRef getResponseJsonRef();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getResponseUuid();

    @Override // com.mapbox.navigator.RouteInterface
    public native List<Point> getRouteGeometry();

    @Override // com.mapbox.navigator.RouteInterface
    public native String getRouteId();

    @Override // com.mapbox.navigator.RouteInterface
    public native int getRouteIndex();

    @Override // com.mapbox.navigator.RouteInterface
    public native RouteInfo getRouteInfo();

    @Override // com.mapbox.navigator.RouteInterface
    public native RouterOrigin getRouterOrigin();

    @Override // com.mapbox.navigator.RouteInterface
    public native List<Waypoint> getWaypoints();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteInterfacePeerCleaner(j));
    }
}
