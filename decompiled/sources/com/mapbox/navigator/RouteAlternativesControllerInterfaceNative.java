package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RouteAlternativesControllerInterfaceNative implements RouteAlternativesControllerInterface {
    protected long peer;

    public static class RouteAlternativesControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteAlternativesControllerInterfaceNative.cleanNativePeer(this.peer);
        }

        public RouteAlternativesControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void addObserver(RouteAlternativesObserver routeAlternativesObserver);

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void removeAllObservers();

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void removeObserver(RouteAlternativesObserver routeAlternativesObserver);

    @Override // com.mapbox.navigator.RouteAlternativesControllerInterface
    public native void setRouteAlternativesOptions(RouteAlternativesOptions routeAlternativesOptions);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteAlternativesControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteAlternativesControllerInterfacePeerCleaner(j));
    }
}
