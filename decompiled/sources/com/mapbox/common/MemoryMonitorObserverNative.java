package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class MemoryMonitorObserverNative implements MemoryMonitorObserver {
    protected long peer;

    public static class MemoryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorObserverNative.cleanNativePeer(this.peer);
        }

        public MemoryMonitorObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MemoryMonitorObserver
    public native void onMemoryMonitorAlert(MemoryMonitorStatus memoryMonitorStatus);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MemoryMonitorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MemoryMonitorObserverPeerCleaner(j));
    }
}
