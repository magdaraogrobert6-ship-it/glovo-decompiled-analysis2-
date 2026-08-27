package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class SmoothedGeometryCallbackNative implements SmoothedGeometryCallback {
    private long peer;

    public static class SmoothedGeometryCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SmoothedGeometryCallbackNative.cleanNativePeer(this.peer);
        }

        public SmoothedGeometryCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.SmoothedGeometryCallback
    public native void run(Expected<SmoothedGeometryErrorType, List<SmoothedLaneGroupGeometry>> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SmoothedGeometryCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SmoothedGeometryCallbackPeerCleaner(j));
    }
}
