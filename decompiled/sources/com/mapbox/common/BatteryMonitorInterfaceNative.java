package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class BatteryMonitorInterfaceNative implements BatteryMonitorInterface {
    protected long peer;

    public static class BatteryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }

        public BatteryMonitorInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BatteryMonitorInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BatteryMonitorInterfacePeerCleaner(j));
    }
}
