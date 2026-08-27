package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class OfflineRegionStatusCallbackNative implements OfflineRegionStatusCallback {
    private long peer;

    public static class OfflineRegionStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionStatusCallbackNative.cleanNativePeer(this.peer);
        }

        public OfflineRegionStatusCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.OfflineRegionStatusCallback
    public native void run(Expected<String, OfflineRegionStatus> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OfflineRegionStatusCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionStatusCallbackPeerCleaner(j));
    }
}
