package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class CurrentTilesVersionCallbackNative implements CurrentTilesVersionCallback {
    private long peer;

    public static class CurrentTilesVersionCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CurrentTilesVersionCallbackNative.cleanNativePeer(this.peer);
        }

        public CurrentTilesVersionCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.CurrentTilesVersionCallback
    public native void run(boolean z, RoadGraphVersionInfo roadGraphVersionInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CurrentTilesVersionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CurrentTilesVersionCallbackPeerCleaner(j));
    }
}
