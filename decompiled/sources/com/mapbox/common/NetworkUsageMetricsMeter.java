package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkUsageMetricsMeter {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class NetworkUsageMetricsMeterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            NetworkUsageMetricsMeter.cleanNativePeer(this.peer);
        }

        public NetworkUsageMetricsMeterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native void onBytesTransferred(String str, int i, int i2);

    public static native void onHttpCodeReceived(int i);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public NetworkUsageMetricsMeter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NetworkUsageMetricsMeterPeerCleaner(j));
    }
}
