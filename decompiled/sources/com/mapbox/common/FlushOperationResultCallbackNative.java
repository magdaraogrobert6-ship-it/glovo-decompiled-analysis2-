package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes5.dex */
final class FlushOperationResultCallbackNative implements FlushOperationResultCallback {
    private long peer;

    public static class FlushOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            FlushOperationResultCallbackNative.cleanNativePeer(this.peer);
        }

        public FlushOperationResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.FlushOperationResultCallback
    public native void run(Expected<String, None> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private FlushOperationResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FlushOperationResultCallbackPeerCleaner(j));
    }
}
