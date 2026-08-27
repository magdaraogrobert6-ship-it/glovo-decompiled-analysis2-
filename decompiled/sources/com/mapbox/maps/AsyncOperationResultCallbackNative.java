package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class AsyncOperationResultCallbackNative implements AsyncOperationResultCallback {
    private long peer;

    public static class AsyncOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AsyncOperationResultCallbackNative.cleanNativePeer(this.peer);
        }

        public AsyncOperationResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.AsyncOperationResultCallback
    public native void run(Expected<String, None> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private AsyncOperationResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AsyncOperationResultCallbackPeerCleaner(j));
    }
}
