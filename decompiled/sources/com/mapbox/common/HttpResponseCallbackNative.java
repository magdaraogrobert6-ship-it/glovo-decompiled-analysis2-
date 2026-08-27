package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpResponseCallbackNative implements HttpResponseCallback {
    private long peer;

    public static class HttpResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpResponseCallbackNative.cleanNativePeer(this.peer);
        }

        public HttpResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpResponseCallback
    public native void run(HttpResponse httpResponse);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private HttpResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpResponseCallbackPeerCleaner(j));
    }
}
