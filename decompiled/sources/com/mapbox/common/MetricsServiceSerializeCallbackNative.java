package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
final class MetricsServiceSerializeCallbackNative implements MetricsServiceSerializeCallback {
    private long peer;

    public static class MetricsServiceSerializeCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceSerializeCallbackNative.cleanNativePeer(this.peer);
        }

        public MetricsServiceSerializeCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.MetricsServiceSerializeCallback
    public native void run(Value value);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MetricsServiceSerializeCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MetricsServiceSerializeCallbackPeerCleaner(j));
    }
}
