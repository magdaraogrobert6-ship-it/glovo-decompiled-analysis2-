package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
public final class BLEServiceFactory {
    protected long peer;

    public static class BLEServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BLEServiceFactory.cleanNativePeer(this.peer);
        }

        public BLEServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native BLEService bleService();

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native void setUserDefined(BLEService bLEService);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BLEServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BLEServiceFactoryPeerCleaner(j));
    }
}
