package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes5.dex */
final class RouteGeometrySmootherNative implements RouteGeometrySmoother {
    protected long peer;

    public static class RouteGeometrySmootherPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteGeometrySmootherNative.cleanNativePeer(this.peer);
        }

        public RouteGeometrySmootherPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteGeometrySmoother
    public native Cancelable smoothLaneGroupGeometries(RouteLaneGuidance routeLaneGuidance, SmoothedGeometryCallback smoothedGeometryCallback);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteGeometrySmootherNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteGeometrySmootherPeerCleaner(j));
    }
}
