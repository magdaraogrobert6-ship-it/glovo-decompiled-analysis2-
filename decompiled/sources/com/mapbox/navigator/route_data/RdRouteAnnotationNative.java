package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RdRouteAnnotationNative implements RdRouteAnnotation {
    protected long peer;

    public static class RdRouteAnnotationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdRouteAnnotationNative.cleanNativePeer(this.peer);
        }

        public RdRouteAnnotationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdRouteAnnotation
    public native List<RdLegAnnotation> legAnnotations();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdRouteAnnotationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdRouteAnnotationPeerCleaner(j));
    }
}
