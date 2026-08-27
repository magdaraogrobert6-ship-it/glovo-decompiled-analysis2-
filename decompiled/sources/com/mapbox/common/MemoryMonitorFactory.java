package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMonitorFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MemoryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorFactory.cleanNativePeer(this.peer);
        }

        public MemoryMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native MemoryMonitorInterface getOrCreate();

    private static native void nativeSelfRegister();

    public static native void reset();

    public static native void setUserDefined(MemoryMonitorInterface memoryMonitorInterface);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MemoryMonitorFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MemoryMonitorFactoryPeerCleaner(j));
    }
}
