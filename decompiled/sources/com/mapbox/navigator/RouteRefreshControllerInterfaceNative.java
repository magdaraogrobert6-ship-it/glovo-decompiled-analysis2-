package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RouteRefreshControllerInterfaceNative implements RouteRefreshControllerInterface {
    protected long peer;

    public static class RouteRefreshControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteRefreshControllerInterfaceNative.cleanNativePeer(this.peer);
        }

        public RouteRefreshControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void addObserver(RouteRefreshObserver routeRefreshObserver);

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void removeAllObservers();

    @Override // com.mapbox.navigator.RouteRefreshControllerInterface
    public native void removeObserver(RouteRefreshObserver routeRefreshObserver);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteRefreshControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteRefreshControllerInterfacePeerCleaner(j));
    }
}
