package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class ResetCallbackNative implements ResetCallback {
    private long peer;

    public static class ResetCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ResetCallbackNative.cleanNativePeer(this.peer);
        }

        public ResetCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ResetCallback
    public native void run();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResetCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResetCallbackPeerCleaner(j));
    }
}
