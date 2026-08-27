package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RouteRefreshObserverNative implements RouteRefreshObserver {
    protected long peer;

    public static class RouteRefreshObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteRefreshObserverNative.cleanNativePeer(this.peer);
        }

        public RouteRefreshObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshAnnotationsUpdated(RouteIdentifier routeIdentifier, String str, int i, int i2);

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshCancelled(RouteIdentifier routeIdentifier);

    @Override // com.mapbox.navigator.RouteRefreshObserver
    public native void onRouteRefreshFailed(RouteIdentifier routeIdentifier, RouteRefreshError routeRefreshError);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteRefreshObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteRefreshObserverPeerCleaner(j));
    }
}
