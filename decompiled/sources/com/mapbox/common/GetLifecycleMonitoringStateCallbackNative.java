package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class GetLifecycleMonitoringStateCallbackNative implements GetLifecycleMonitoringStateCallback {
    private long peer;

    public static class GetLifecycleMonitoringStateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleMonitoringStateCallbackNative.cleanNativePeer(this.peer);
        }

        public GetLifecycleMonitoringStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.GetLifecycleMonitoringStateCallback
    public native void run(Expected<String, LifecycleMonitoringState> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GetLifecycleMonitoringStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLifecycleMonitoringStateCallbackPeerCleaner(j));
    }
}
