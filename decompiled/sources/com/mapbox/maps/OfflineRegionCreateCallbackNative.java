package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class OfflineRegionCreateCallbackNative implements OfflineRegionCreateCallback {
    private long peer;

    public static class OfflineRegionCreateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCreateCallbackNative.cleanNativePeer(this.peer);
        }

        public OfflineRegionCreateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.OfflineRegionCreateCallback
    public native void run(Expected<String, OfflineRegion> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OfflineRegionCreateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionCreateCallbackPeerCleaner(j));
    }
}
