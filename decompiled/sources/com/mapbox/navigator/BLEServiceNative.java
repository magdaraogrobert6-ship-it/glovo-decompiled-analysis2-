package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class BLEServiceNative implements BLEService {
    protected long peer;

    public static class BLEServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BLEServiceNative.cleanNativePeer(this.peer);
        }

        public BLEServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.BLEService
    public native int registerScanResultCallback(ScanResultCallback scanResultCallback);

    @Override // com.mapbox.navigator.BLEService
    public native void unregisterCallback(int i);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BLEServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new BLEServicePeerCleaner(j));
    }
}
