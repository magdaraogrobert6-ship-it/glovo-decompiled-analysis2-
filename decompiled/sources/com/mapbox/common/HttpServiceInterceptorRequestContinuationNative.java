package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpServiceInterceptorRequestContinuationNative implements HttpServiceInterceptorRequestContinuation {
    private long peer;

    public static class HttpServiceInterceptorRequestContinuationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorRequestContinuationNative.cleanNativePeer(this.peer);
        }

        public HttpServiceInterceptorRequestContinuationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpServiceInterceptorRequestContinuation
    public native void run(HttpRequestOrResponse httpRequestOrResponse);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private HttpServiceInterceptorRequestContinuationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorRequestContinuationPeerCleaner(j));
    }
}
