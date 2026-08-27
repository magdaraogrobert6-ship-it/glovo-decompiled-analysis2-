package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RouterInterfaceNative implements RouterInterface {
    protected long peer;

    public static class RouterInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouterInterfaceNative.cleanNativePeer(this.peer);
        }

        public RouterInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelAll();

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteMapMatchedRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteRefreshRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native void cancelRouteRequest(long j);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRoute(String str, GetRouteOptions getRouteOptions, GetRouteSignature getRouteSignature, RouterDataRefCallback routerDataRefCallback);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRouteMapMatched(String str, GetRouteOptions getRouteOptions, RouterDataRefCallback routerDataRefCallback);

    @Override // com.mapbox.navigator.RouterInterface
    public native long getRouteRefresh(RouteRefreshOptions routeRefreshOptions, RouterRefreshCallback routerRefreshCallback);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouterInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterInterfacePeerCleaner(j));
    }
}
