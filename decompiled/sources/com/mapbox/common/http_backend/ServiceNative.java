package com.mapbox.common.http_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes5.dex */
final class ServiceNative implements Service {
    protected long peer;

    public static class ServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ServiceNative.cleanNativePeer(this.peer);
        }

        public ServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.http_backend.Service
    public native void cancelRequest(long j, ResultCallback resultCallback);

    @Override // com.mapbox.common.http_backend.Service
    public native long request(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.http_backend.Service
    public native void setMaxRequestsPerHost(byte b);

    @Override // com.mapbox.common.http_backend.Service
    public native boolean supportsKeepCompression();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ServicePeerCleaner(j));
    }
}
