package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdIntersectionArrayForEachCallbackNative implements RdIntersectionArrayForEachCallback {
    private long peer;

    public static class RdIntersectionArrayForEachCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdIntersectionArrayForEachCallbackNative.cleanNativePeer(this.peer);
        }

        public RdIntersectionArrayForEachCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdIntersectionArrayForEachCallback
    public native void run(Integer num);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RdIntersectionArrayForEachCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdIntersectionArrayForEachCallbackPeerCleaner(j));
    }
}
