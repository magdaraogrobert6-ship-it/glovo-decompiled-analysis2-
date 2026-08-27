package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class MovementInfoCallbackNative implements MovementInfoCallback {
    private long peer;

    public static class MovementInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MovementInfoCallbackNative.cleanNativePeer(this.peer);
        }

        public MovementInfoCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MovementInfoCallback
    public native void run(Expected<String, MovementInfo> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MovementInfoCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementInfoCallbackPeerCleaner(j));
    }
}
