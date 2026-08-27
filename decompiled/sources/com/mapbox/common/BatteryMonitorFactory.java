package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public final class BatteryMonitorFactory {
    protected long peer;

    public static class BatteryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorFactory.cleanNativePeer(this.peer);
        }

        public BatteryMonitorFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native BatteryMonitorInterface getOrCreate();

    private static native void nativeSelfRegister();

    public static native void reset();

    public static native void setUserDefined(BatteryMonitorInterface batteryMonitorInterface);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BatteryMonitorFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BatteryMonitorFactoryPeerCleaner(j));
    }
}
