package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class OfflineRegionCallbackNative implements OfflineRegionCallback {
    private long peer;

    public static class OfflineRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCallbackNative.cleanNativePeer(this.peer);
        }

        public OfflineRegionCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.OfflineRegionCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OfflineRegionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionCallbackPeerCleaner(j));
    }
}
