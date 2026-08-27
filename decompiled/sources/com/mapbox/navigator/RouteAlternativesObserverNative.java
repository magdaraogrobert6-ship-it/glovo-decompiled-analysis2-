package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouteAlternativesObserverNative implements RouteAlternativesObserver {
    protected long peer;

    public static class RouteAlternativesObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteAlternativesObserverNative.cleanNativePeer(this.peer);
        }

        public RouteAlternativesObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public native void onError(String str);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    @Deprecated
    public native void onOnlinePrimaryRouteAvailable(RouteInterface routeInterface);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    @Deprecated
    public native void onRouteAlternativesChanged(List<RouteAlternative> list, List<RouteAlternative> list2);

    @Override // com.mapbox.navigator.RouteAlternativesObserver
    public native void onRouteAlternativesUpdated(RouteInterface routeInterface, List<RouteAlternative> list, List<RouteAlternative> list2);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteAlternativesObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteAlternativesObserverPeerCleaner(j));
    }
}
