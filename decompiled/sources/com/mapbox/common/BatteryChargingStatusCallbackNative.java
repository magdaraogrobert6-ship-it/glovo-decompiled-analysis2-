package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class BatteryChargingStatusCallbackNative implements BatteryChargingStatusCallback {
    private long peer;

    public static class BatteryChargingStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BatteryChargingStatusCallbackNative.cleanNativePeer(this.peer);
        }

        public BatteryChargingStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.BatteryChargingStatusCallback
    public native void run(Expected<String, Boolean> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private BatteryChargingStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryChargingStatusCallbackPeerCleaner(j));
    }
}
