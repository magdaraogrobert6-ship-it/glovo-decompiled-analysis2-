package com.mapbox.common.experimental.wss_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RequestObserverNative implements RequestObserver {
    protected long peer;

    public static class RequestObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RequestObserverNative.cleanNativePeer(this.peer);
        }

        public RequestObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onData(long j, WsOpCode wsOpCode, boolean z);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onFailed(long j, HttpRequestError httpRequestError, Integer num);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onResponse(long j, ResponseData responseData);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSucceeded(long j);

    @Override // com.mapbox.common.experimental.wss_backend.RequestObserver
    public native void onSwitchingProtocols(long j);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RequestObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RequestObserverPeerCleaner(j));
    }
}
