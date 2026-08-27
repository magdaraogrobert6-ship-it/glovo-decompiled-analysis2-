package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdIntersectionArrayNative implements RdIntersectionArray {
    protected long peer;

    public static class RdIntersectionArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdIntersectionArrayNative.cleanNativePeer(this.peer);
        }

        public RdIntersectionArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdIntersectionArray
    public native void forEach(RdIntersectionArrayForEachCallback rdIntersectionArrayForEachCallback);

    @Override // com.mapbox.navigator.route_data.RdIntersectionArray
    public native RdIntersection get(long j);

    @Override // com.mapbox.navigator.route_data.RdIntersectionArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdIntersectionArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdIntersectionArrayPeerCleaner(j));
    }
}
