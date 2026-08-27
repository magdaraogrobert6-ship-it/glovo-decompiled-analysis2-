package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class OfflineRegionManager {
    protected long peer;

    public static class OfflineRegionManagerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionManager.cleanNativePeer(this.peer);
        }

        public OfflineRegionManagerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize();

    private static native void nativeSelfRegister();

    public native void createOfflineRegion(OfflineRegionGeometryDefinition offlineRegionGeometryDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void createOfflineRegion(OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void getOfflineRegions(OfflineRegionCallback offlineRegionCallback);

    public native void mergeOfflineDatabase(String str, OfflineDatabaseMergeCallback offlineDatabaseMergeCallback);

    public native void setOfflineMapboxTileCountLimit(long j);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineRegionManager() {
        initialize();
    }

    public OfflineRegionManager(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionManagerPeerCleaner(j));
    }
}
