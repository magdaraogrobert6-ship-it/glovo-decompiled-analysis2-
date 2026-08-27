package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class ReachabilityInterfaceNative implements ReachabilityInterface {
    protected long peer;

    public static class ReachabilityInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityInterfaceNative.cleanNativePeer(this.peer);
        }

        public ReachabilityInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ReachabilityInterface
    public native long addListener(ReachabilityChanged reachabilityChanged);

    @Override // com.mapbox.common.ReachabilityInterface
    public native NetworkStatus currentNetworkStatus();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean isReachable();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean removeListener(long j);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ReachabilityInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ReachabilityInterfacePeerCleaner(j));
    }
}
