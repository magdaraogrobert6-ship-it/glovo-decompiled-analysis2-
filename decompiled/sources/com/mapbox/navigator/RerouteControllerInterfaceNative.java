package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RerouteControllerInterfaceNative implements RerouteControllerInterface {
    protected long peer;

    public static class RerouteControllerInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RerouteControllerInterfaceNative.cleanNativePeer(this.peer);
        }

        public RerouteControllerInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void cancel();

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void reroute(String str, RerouteCallback rerouteCallback);

    @Override // com.mapbox.navigator.RerouteControllerInterface
    public native void setOptionsAdapter(RouteOptionsAdapter routeOptionsAdapter);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RerouteControllerInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteControllerInterfacePeerCleaner(j));
    }
}
