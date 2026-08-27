package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class ReachabilityChangedNative implements ReachabilityChanged {
    private long peer;

    public static class ReachabilityChangedPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityChangedNative.cleanNativePeer(this.peer);
        }

        public ReachabilityChangedPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ReachabilityChanged
    public native void run(NetworkStatus networkStatus);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ReachabilityChangedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ReachabilityChangedPeerCleaner(j));
    }
}
