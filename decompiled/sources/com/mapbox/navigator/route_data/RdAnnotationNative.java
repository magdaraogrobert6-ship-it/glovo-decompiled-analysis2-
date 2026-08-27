package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdAnnotationNative implements RdAnnotation {
    protected long peer;

    public static class RdAnnotationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdAnnotationNative.cleanNativePeer(this.peer);
        }

        public RdAnnotationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdCongestionLevelArray congestion();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdU32OptionalArray congestionNumeric();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdF64Array distance();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdF64Array duration();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdSpeedLimitAnnotationArray maxspeed();

    @Override // com.mapbox.navigator.route_data.RdAnnotation
    public native RdF64Array speed();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdAnnotationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdAnnotationPeerCleaner(j));
    }
}
