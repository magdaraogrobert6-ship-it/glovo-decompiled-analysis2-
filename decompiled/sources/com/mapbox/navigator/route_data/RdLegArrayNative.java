package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdLegArrayNative implements RdLegArray {
    protected long peer;

    public static class RdLegArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdLegArrayNative.cleanNativePeer(this.peer);
        }

        public RdLegArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdLegArray
    public native RdLeg get(long j);

    @Override // com.mapbox.navigator.route_data.RdLegArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdLegArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdLegArrayPeerCleaner(j));
    }
}
