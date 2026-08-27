package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdSpeedLimitAnnotationArrayNative implements RdSpeedLimitAnnotationArray {
    protected long peer;

    public static class RdSpeedLimitAnnotationArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdSpeedLimitAnnotationArrayNative.cleanNativePeer(this.peer);
        }

        public RdSpeedLimitAnnotationArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdSpeedLimitAnnotationArray
    public native RdSpeedLimitAnnotation get(long j);

    @Override // com.mapbox.navigator.route_data.RdSpeedLimitAnnotationArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdSpeedLimitAnnotationArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdSpeedLimitAnnotationArrayPeerCleaner(j));
    }
}
