package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdLegAnnotationNative implements RdLegAnnotation {
    protected long peer;

    public static class RdLegAnnotationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdLegAnnotationNative.cleanNativePeer(this.peer);
        }

        public RdLegAnnotationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdLegAnnotation
    public native RdAnnotation annotation();

    @Override // com.mapbox.navigator.route_data.RdLegAnnotation
    public native RdLegClosureArray closures();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdLegAnnotationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdLegAnnotationPeerCleaner(j));
    }
}
