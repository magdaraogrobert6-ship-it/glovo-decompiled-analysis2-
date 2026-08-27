package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class LifecycleMonitorInterfaceNative implements LifecycleMonitorInterface {
    protected long peer;

    public static class LifecycleMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorInterfaceNative.cleanNativePeer(this.peer);
        }

        public LifecycleMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getLifecycleState(GetLifecycleStateCallback getLifecycleStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getMonitoringState(GetLifecycleMonitoringStateCallback getLifecycleMonitoringStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void registerObserver(LifecycleObserver lifecycleObserver);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void unregisterObserver(LifecycleObserver lifecycleObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LifecycleMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LifecycleMonitorInterfacePeerCleaner(j));
    }
}
