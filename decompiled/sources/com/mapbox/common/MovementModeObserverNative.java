package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class MovementModeObserverNative implements MovementModeObserver {
    protected long peer;

    public static class MovementModeObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MovementModeObserverNative.cleanNativePeer(this.peer);
        }

        public MovementModeObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeChanged(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeError(String str);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MovementModeObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MovementModeObserverPeerCleaner(j));
    }
}
