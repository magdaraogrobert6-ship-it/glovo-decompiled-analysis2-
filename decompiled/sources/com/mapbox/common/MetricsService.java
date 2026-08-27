package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public class MetricsService {
    protected long peer;

    public static class MetricsServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MetricsService.cleanNativePeer(this.peer);
        }

        public MetricsServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native void addMetricsSource(MetricsSource metricsSource);

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    public native void removeMetricsSource(MetricsSource metricsSource);

    public native void serialize(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void serializePretty(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void setTag(String str);

    public native void start(Long l);

    public native void stop();

    public native void subscribeToConfigUpdates();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MetricsService(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServicePeerCleaner(j));
    }
}
