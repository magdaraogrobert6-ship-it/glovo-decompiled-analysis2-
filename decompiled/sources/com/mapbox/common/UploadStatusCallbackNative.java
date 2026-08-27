package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class UploadStatusCallbackNative implements UploadStatusCallback {
    private long peer;

    public static class UploadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UploadStatusCallbackNative.cleanNativePeer(this.peer);
        }

        public UploadStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.UploadStatusCallback
    public native void run(UploadStatus uploadStatus);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private UploadStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UploadStatusCallbackPeerCleaner(j));
    }
}
