package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdCongestionLevelArrayNative implements RdCongestionLevelArray {
    protected long peer;

    public static class RdCongestionLevelArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdCongestionLevelArrayNative.cleanNativePeer(this.peer);
        }

        public RdCongestionLevelArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdCongestionLevelArray
    public native RdCongestionLevel get(long j);

    @Override // com.mapbox.navigator.route_data.RdCongestionLevelArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdCongestionLevelArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdCongestionLevelArrayPeerCleaner(j));
    }
}
