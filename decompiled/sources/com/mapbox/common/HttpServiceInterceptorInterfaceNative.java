package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpServiceInterceptorInterfaceNative implements HttpServiceInterceptorInterface {
    protected long peer;

    public static class HttpServiceInterceptorInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorInterfaceNative.cleanNativePeer(this.peer);
        }

        public HttpServiceInterceptorInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public HttpServiceInterceptorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterceptorInterfacePeerCleaner(j));
    }
}
