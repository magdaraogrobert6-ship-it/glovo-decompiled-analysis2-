package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class TilesUpdateAvailabilityCallbackNative implements TilesUpdateAvailabilityCallback {
    private long peer;

    public static class TilesUpdateAvailabilityCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TilesUpdateAvailabilityCallbackNative.cleanNativePeer(this.peer);
        }

        public TilesUpdateAvailabilityCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.TilesUpdateAvailabilityCallback
    public native void run(boolean z, RoadGraphVersionInfo roadGraphVersionInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TilesUpdateAvailabilityCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TilesUpdateAvailabilityCallbackPeerCleaner(j));
    }
}
