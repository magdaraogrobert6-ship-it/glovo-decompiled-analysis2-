package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RoadGraphUpdateAvailabilityCallbackNative implements RoadGraphUpdateAvailabilityCallback {
    private long peer;

    public static class RoadGraphUpdateAvailabilityCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadGraphUpdateAvailabilityCallbackNative.cleanNativePeer(this.peer);
        }

        public RoadGraphUpdateAvailabilityCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadGraphUpdateAvailabilityCallback
    public native void run(boolean z, RoadGraphVersionInfo roadGraphVersionInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RoadGraphUpdateAvailabilityCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadGraphUpdateAvailabilityCallbackPeerCleaner(j));
    }
}
