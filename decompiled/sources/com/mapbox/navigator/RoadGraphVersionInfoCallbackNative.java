package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RoadGraphVersionInfoCallbackNative implements RoadGraphVersionInfoCallback {
    private long peer;

    public static class RoadGraphVersionInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadGraphVersionInfoCallbackNative.cleanNativePeer(this.peer);
        }

        public RoadGraphVersionInfoCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadGraphVersionInfoCallback
    public native void run(boolean z, RoadGraphVersionInfo roadGraphVersionInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RoadGraphVersionInfoCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadGraphVersionInfoCallbackPeerCleaner(j));
    }
}
