package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpServiceCancellationCallbackNative implements HttpServiceCancellationCallback {
    private long peer;

    public static class HttpServiceCancellationCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceCancellationCallbackNative.cleanNativePeer(this.peer);
        }

        public HttpServiceCancellationCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpServiceCancellationCallback
    public native void run(long j, HttpRequest httpRequest);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private HttpServiceCancellationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceCancellationCallbackPeerCleaner(j));
    }
}
