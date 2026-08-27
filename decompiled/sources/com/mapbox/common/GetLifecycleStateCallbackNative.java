package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class GetLifecycleStateCallbackNative implements GetLifecycleStateCallback {
    private long peer;

    public static class GetLifecycleStateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleStateCallbackNative.cleanNativePeer(this.peer);
        }

        public GetLifecycleStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.GetLifecycleStateCallback
    public native void run(Expected<String, LifecycleState> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GetLifecycleStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLifecycleStateCallbackPeerCleaner(j));
    }
}
