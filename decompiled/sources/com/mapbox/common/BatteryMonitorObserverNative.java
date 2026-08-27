package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class BatteryMonitorObserverNative implements BatteryMonitorObserver {
    protected long peer;

    public static class BatteryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorObserverNative.cleanNativePeer(this.peer);
        }

        public BatteryMonitorObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryChargingStatusChanged(boolean z);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryStatusError(String str);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BatteryMonitorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryMonitorObserverPeerCleaner(j));
    }
}
