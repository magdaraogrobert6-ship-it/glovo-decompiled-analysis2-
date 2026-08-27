package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdF64ArrayNative implements RdF64Array {
    protected long peer;

    public static class RdF64ArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdF64ArrayNative.cleanNativePeer(this.peer);
        }

        public RdF64ArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdF64Array
    public native double get(long j);

    @Override // com.mapbox.navigator.route_data.RdF64Array
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdF64ArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdF64ArrayPeerCleaner(j));
    }
}
