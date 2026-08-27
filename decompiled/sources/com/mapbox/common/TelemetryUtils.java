package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes4.dex */
public final class TelemetryUtils {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TelemetryUtilsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtils.cleanNativePeer(this.peer);
        }

        public TelemetryUtilsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native TelemetryCollectionState getClientServerEventsCollectionState();

    public static native boolean getEventsCollectionState();

    public static native String getUserID();

    private native void initialize();

    private static native void nativeSelfRegister();

    public static native void setEventsCollectionState(boolean z, TelemetryUtilsResponseCallback telemetryUtilsResponseCallback);

    public native void registerTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public native void unregisterTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryUtils() {
        initialize();
    }

    public TelemetryUtils(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryUtilsPeerCleaner(j));
    }
}
