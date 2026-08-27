package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes5.dex */
final class TelemetryUtilsResponseCallbackNative implements TelemetryUtilsResponseCallback {
    private long peer;

    public static class TelemetryUtilsResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtilsResponseCallbackNative.cleanNativePeer(this.peer);
        }

        public TelemetryUtilsResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TelemetryUtilsResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TelemetryUtilsResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryUtilsResponseCallbackPeerCleaner(j));
    }
}
