package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class MovementMonitorInterfaceNative implements MovementMonitorInterface {
    protected long peer;

    public static class MovementMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorInterfaceNative.cleanNativePeer(this.peer);
        }

        public MovementMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void getMovementInfo(MovementInfoCallback movementInfoCallback);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void registerObserver(MovementModeObserver movementModeObserver);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void setMovementInfo(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void unregisterObserver(MovementModeObserver movementModeObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MovementMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementMonitorInterfacePeerCleaner(j));
    }
}
