package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdLegNative implements RdLeg {
    protected long peer;

    public static class RdLegPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdLegNative.cleanNativePeer(this.peer);
        }

        public RdLegPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdLeg
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdLeg
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdLeg
    public native RdStepArray steps();

    @Override // com.mapbox.navigator.route_data.RdLeg
    public native String summary();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdLegNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdLegPeerCleaner(j));
    }
}
