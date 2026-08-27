package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class ResultCallbackNative implements ResultCallback {
    private long peer;

    public static class ResultCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ResultCallbackNative.cleanNativePeer(this.peer);
        }

        public ResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ResultCallback
    public native void run(boolean z);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResultCallbackPeerCleaner(j));
    }
}
