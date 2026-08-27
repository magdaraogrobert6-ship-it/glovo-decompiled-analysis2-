package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class OfflineRegionObserverNative implements OfflineRegionObserver {
    protected long peer;

    public static class OfflineRegionObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionObserverNative.cleanNativePeer(this.peer);
        }

        public OfflineRegionObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void errorOccurred(OfflineRegionError offlineRegionError);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void statusChanged(OfflineRegionStatus offlineRegionStatus);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineRegionObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineRegionObserverPeerCleaner(j));
    }
}
