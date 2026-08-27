package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class LifecycleObserverNative implements LifecycleObserver {
    protected long peer;

    public static class LifecycleObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LifecycleObserverNative.cleanNativePeer(this.peer);
        }

        public LifecycleObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.LifecycleObserver
    public native void onLifecycleStateChanged(LifecycleState lifecycleState);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LifecycleObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LifecycleObserverPeerCleaner(j));
    }
}
