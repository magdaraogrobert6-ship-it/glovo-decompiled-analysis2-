package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes4.dex */
public final class TelemetryService {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TelemetryServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryService.cleanNativePeer(this.peer);
        }

        public TelemetryServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native TelemetryService getOrCreate();

    private static native void nativeSelfRegister();

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryService(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryServicePeerCleaner(j));
    }
}
