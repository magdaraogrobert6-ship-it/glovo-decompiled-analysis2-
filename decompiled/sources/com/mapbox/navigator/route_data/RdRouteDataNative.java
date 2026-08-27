package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdRouteDataNative implements RdRouteData {
    protected long peer;

    public static class RdRouteDataPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdRouteDataNative.cleanNativePeer(this.peer);
        }

        public RdRouteDataPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native RdCoordinateArray geometry();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native RdLegArray legs();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native String voiceLocale();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native RdWaypointArray waypoints();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native double weight();

    @Override // com.mapbox.navigator.route_data.RdRouteData
    public native String weightName();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdRouteDataNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdRouteDataPeerCleaner(j));
    }
}
