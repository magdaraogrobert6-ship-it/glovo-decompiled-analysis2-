package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpServiceInterceptorResponseContinuationNative implements HttpServiceInterceptorResponseContinuation {
    private long peer;

    public static class HttpServiceInterceptorResponseContinuationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorResponseContinuationNative.cleanNativePeer(this.peer);
        }

        public HttpServiceInterceptorResponseContinuationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpServiceInterceptorResponseContinuation
    public native void run(HttpResponse httpResponse);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private HttpServiceInterceptorResponseContinuationNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorResponseContinuationPeerCleaner(j));
    }
}
