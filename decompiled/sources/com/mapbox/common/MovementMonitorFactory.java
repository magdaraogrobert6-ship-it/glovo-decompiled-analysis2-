package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public final class MovementMonitorFactory {
    protected long peer;

    public static class MovementMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorFactory.cleanNativePeer(this.peer);
        }

        public MovementMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native MovementMonitorInterface getOrCreate();

    private static native void nativeSelfRegister();

    public static native void reset();

    public static native void setUserDefined(MovementMonitorInterface movementMonitorInterface);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MovementMonitorFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MovementMonitorFactoryPeerCleaner(j));
    }
}
