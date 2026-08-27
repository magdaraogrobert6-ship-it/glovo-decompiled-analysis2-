package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.route_data.RdRouteAnnotation;
import com.mapbox.navigator.route_data.RdRouteData;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class RouteDataAccessor implements RouteDataAccessorInterface {
    protected long peer;

    public static class RouteDataAccessorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteDataAccessor.cleanNativePeer(this.peer);
        }

        public RouteDataAccessorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native RdRouteAnnotation getRouteAnnotation(RouteInterface routeInterface);

    @MapboxExperimental
    public static native RdRouteData getRouteData(RouteInterface routeInterface);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteDataAccessor(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouteDataAccessorPeerCleaner(j));
    }
}
