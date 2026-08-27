package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineSwitch {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class OfflineSwitchPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitch.cleanNativePeer(this.peer);
        }

        public OfflineSwitchPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native OfflineSwitch getInstance();

    private static native void nativeSelfRegister();

    public static native void reset();

    public native boolean isMapboxStackConnected();

    public native void registerObserver(OfflineSwitchObserver offlineSwitchObserver);

    public native void setMapboxStackConnected(boolean z);

    public native void unregisterObserver(OfflineSwitchObserver offlineSwitchObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineSwitch(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineSwitchPeerCleaner(j));
    }
}
