package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class MemoryMonitorStatusCallbackNative implements MemoryMonitorStatusCallback {
    private long peer;

    public static class MemoryMonitorStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorStatusCallbackNative.cleanNativePeer(this.peer);
        }

        public MemoryMonitorStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MemoryMonitorStatusCallback
    public native void run(Expected<String, MemoryMonitorStatus> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MemoryMonitorStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MemoryMonitorStatusCallbackPeerCleaner(j));
    }
}
