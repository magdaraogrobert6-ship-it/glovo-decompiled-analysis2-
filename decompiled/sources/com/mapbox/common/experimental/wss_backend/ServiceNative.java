package com.mapbox.common.experimental.wss_backend;

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

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void cancelConnection(long j, ResultCallback resultCallback);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native long connect(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void setPingTimeout(long j);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void write(long j, Data data);

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
