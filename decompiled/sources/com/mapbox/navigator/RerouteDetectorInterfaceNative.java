package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class RerouteDetectorInterfaceNative implements RerouteDetectorInterface {
    protected long peer;

    public static class RerouteDetectorInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RerouteDetectorInterfaceNative.cleanNativePeer(this.peer);
        }

        public RerouteDetectorInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void cancelReroute();

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void forceReroute(ForceRerouteReason forceRerouteReason);

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native void forceReroute(ForceRerouteReason forceRerouteReason, ForceRerouteCallback forceRerouteCallback);

    @Override // com.mapbox.navigator.RerouteDetectorInterface
    public native boolean isReroute();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RerouteDetectorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RerouteDetectorInterfacePeerCleaner(j));
    }
}
