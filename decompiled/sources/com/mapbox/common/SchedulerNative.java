package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class SchedulerNative implements Scheduler {
    protected long peer;

    public static class SchedulerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SchedulerNative.cleanNativePeer(this.peer);
        }

        public SchedulerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.Scheduler
    public native SchedulerType getType();

    @Override // com.mapbox.common.Scheduler
    public native void schedule(Task task, TaskOptions taskOptions);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SchedulerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SchedulerPeerCleaner(j));
    }
}
