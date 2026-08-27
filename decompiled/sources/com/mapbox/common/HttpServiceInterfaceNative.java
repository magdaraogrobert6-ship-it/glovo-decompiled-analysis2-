package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class HttpServiceInterfaceNative implements HttpServiceInterface {
    protected long peer;

    public static class HttpServiceInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterfaceNative.cleanNativePeer(this.peer);
        }

        public HttpServiceInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelRequest(long j, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelUpload(long j, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long download(DownloadOptions downloadOptions, DownloadStatusCallback downloadStatusCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long request(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setMaxRequestsPerHost(byte b);

    @Override // com.mapbox.common.HttpServiceInterface
    @Deprecated
    public native boolean supportsKeepCompression();

    @Override // com.mapbox.common.HttpServiceInterface
    public native long upload(UploadOptions uploadOptions, UploadStatusCallback uploadStatusCallback);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public HttpServiceInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new HttpServiceInterfacePeerCleaner(j));
    }
}
