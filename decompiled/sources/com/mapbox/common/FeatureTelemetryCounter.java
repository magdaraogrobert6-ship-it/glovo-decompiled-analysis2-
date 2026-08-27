package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class FeatureTelemetryCounter {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class FeatureTelemetryCounterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            FeatureTelemetryCounter.cleanNativePeer(this.peer);
        }

        public FeatureTelemetryCounterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native FeatureTelemetryCounter create(String str);

    private static native void nativeSelfRegister();

    public native String getName();

    public native int getValue();

    public native void increment();

    public native void reset();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public FeatureTelemetryCounter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new FeatureTelemetryCounterPeerCleaner(j));
    }
}
