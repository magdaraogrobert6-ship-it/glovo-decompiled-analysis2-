package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class CompassUpdateCallbackNative implements CompassUpdateCallback {
    private long peer;

    public static class CompassUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CompassUpdateCallbackNative.cleanNativePeer(this.peer);
        }

        public CompassUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.CompassUpdateCallback
    public native void run(CompassData compassData);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CompassUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CompassUpdateCallbackPeerCleaner(j));
    }
}
