package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdLegClosureArrayNative implements RdLegClosureArray {
    protected long peer;

    public static class RdLegClosureArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdLegClosureArrayNative.cleanNativePeer(this.peer);
        }

        public RdLegClosureArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdLegClosureArray
    public native RdLegClosure get(long j);

    @Override // com.mapbox.navigator.route_data.RdLegClosureArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdLegClosureArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdLegClosureArrayPeerCleaner(j));
    }
}
