package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class TelemetryNative implements Telemetry {
    protected long peer;

    public static class TelemetryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryNative.cleanNativePeer(this.peer);
        }

        public TelemetryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.Telemetry
    public native void postOuterDeviceEvent(OuterDeviceAction outerDeviceAction);

    @Override // com.mapbox.navigator.Telemetry
    public native void postTelemetryCustomEvent(String str, String str2, String str3);

    @Override // com.mapbox.navigator.Telemetry
    public native void postUserFeedback(UserFeedbackMetadata userFeedbackMetadata, UserFeedback userFeedback, UserFeedbackCallback userFeedbackCallback);

    @Override // com.mapbox.navigator.Telemetry
    public native UserFeedbackHandle startBuildUserFeedbackMetadata();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryPeerCleaner(j));
    }
}
