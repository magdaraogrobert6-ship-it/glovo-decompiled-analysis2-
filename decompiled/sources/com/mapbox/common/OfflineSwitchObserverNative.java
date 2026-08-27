package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class OfflineSwitchObserverNative implements OfflineSwitchObserver {
    protected long peer;

    public static class OfflineSwitchObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitchObserverNative.cleanNativePeer(this.peer);
        }

        public OfflineSwitchObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.OfflineSwitchObserver
    public native void statusChanged(boolean z);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineSwitchObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineSwitchObserverPeerCleaner(j));
    }
}
