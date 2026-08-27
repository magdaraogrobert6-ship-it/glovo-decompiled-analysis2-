package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes4.dex */
public class PredictiveCacheController implements PredictiveCacheControllerInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class PredictiveCacheControllerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PredictiveCacheController.cleanNativePeer(this.peer);
        }

        public PredictiveCacheControllerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PredictiveCacheController(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PredictiveCacheControllerPeerCleaner(j));
    }
}
