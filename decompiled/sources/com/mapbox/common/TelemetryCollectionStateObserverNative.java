package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class TelemetryCollectionStateObserverNative implements TelemetryCollectionStateObserver {
    protected long peer;

    public static class TelemetryCollectionStateObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryCollectionStateObserverNative.cleanNativePeer(this.peer);
        }

        public TelemetryCollectionStateObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TelemetryCollectionStateObserver
    public native void onStateChanged(TelemetryCollectionState telemetryCollectionState);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryCollectionStateObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TelemetryCollectionStateObserverPeerCleaner(j));
    }
}
