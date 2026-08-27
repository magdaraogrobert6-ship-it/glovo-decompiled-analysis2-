package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class DownloadStatusCallbackNative implements DownloadStatusCallback {
    private long peer;

    public static class DownloadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DownloadStatusCallbackNative.cleanNativePeer(this.peer);
        }

        public DownloadStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.DownloadStatusCallback
    public native void run(DownloadStatus downloadStatus);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private DownloadStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DownloadStatusCallbackPeerCleaner(j));
    }
}
