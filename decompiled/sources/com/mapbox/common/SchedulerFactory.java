package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public class SchedulerFactory {
    protected long peer;

    public static class SchedulerFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SchedulerFactory.cleanNativePeer(this.peer);
        }

        public SchedulerFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native Scheduler createSequenced();

    public static native Scheduler createSequenced(ThreadServiceType threadServiceType);

    public static native Scheduler createSingleThreaded();

    public static native Scheduler createSingleThreaded(ThreadServiceType threadServiceType);

    private static native void nativeSelfRegister();

    public static native Scheduler threadPool();

    public static native Scheduler threadPool(ThreadServiceType threadServiceType);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SchedulerFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SchedulerFactoryPeerCleaner(j));
    }
}
