package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleMonitorFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class LifecycleMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorFactory.cleanNativePeer(this.peer);
        }

        public LifecycleMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native LifecycleMonitorInterface getOrCreate();

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LifecycleMonitorFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LifecycleMonitorFactoryPeerCleaner(j));
    }
}
