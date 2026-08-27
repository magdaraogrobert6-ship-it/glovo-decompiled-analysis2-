package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class HttpServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceFactory.cleanNativePeer(this.peer);
        }

        public HttpServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native HttpServiceInterface getInstance();

    private static native void nativeSelfRegister();

    public static native void reset();

    public static native Cancelable setCancellationCallback(HttpServiceCancellationCallback httpServiceCancellationCallback);

    public static native void setHttpServiceInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    public static native void setMaxRequestsPerHost(byte b);

    public static native void setUserDefined(HttpServiceInterface httpServiceInterface);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public HttpServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HttpServiceFactoryPeerCleaner(j));
    }
}
