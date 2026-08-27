package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.location.DeviceLocationProvider;

/* JADX INFO: loaded from: classes5.dex */
public final class TelemetryLocationProvider {
    protected long peer;

    public static class TelemetryLocationProviderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TelemetryLocationProvider.cleanNativePeer(this.peer);
        }

        public TelemetryLocationProviderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native DeviceLocationProvider getDeviceLocationProvider();

    private static native void nativeSelfRegister();

    public static native void setDeviceLocationProvider(DeviceLocationProvider deviceLocationProvider);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TelemetryLocationProvider(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryLocationProviderPeerCleaner(j));
    }
}
