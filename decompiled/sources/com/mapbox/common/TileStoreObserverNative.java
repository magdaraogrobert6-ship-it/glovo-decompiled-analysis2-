package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes5.dex */
final class TileStoreObserverNative implements TileStoreObserver {
    protected long peer;

    public static class TileStoreObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreObserverNative.cleanNativePeer(this.peer);
        }

        public TileStoreObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionGeometryChanged(String str, Geometry geometry);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadFinished(String str, Expected<TileRegionError, TileRegion> expected);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadProgress(String str, TileRegionLoadProgress tileRegionLoadProgress);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionMetadataChanged(String str, Value value);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionRemoved(String str);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileStoreObserverPeerCleaner(j));
    }
}
