package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class AmbientCacheClearingCallbackNative implements AmbientCacheClearingCallback {
    private long peer;

    public static class AmbientCacheClearingCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AmbientCacheClearingCallbackNative.cleanNativePeer(this.peer);
        }

        public AmbientCacheClearingCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.AmbientCacheClearingCallback
    public native void run(Expected<CacheClearingError, Long> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private AmbientCacheClearingCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AmbientCacheClearingCallbackPeerCleaner(j));
    }
}
