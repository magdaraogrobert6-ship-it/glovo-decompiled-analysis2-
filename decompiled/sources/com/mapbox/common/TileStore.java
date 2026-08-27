package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TileStore {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class TileStorePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStore.cleanNativePeer(this.peer);
        }

        public TileStorePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native TileStore create();

    @Deprecated
    public static native TileStore create(String str);

    private static native void nativeSelfRegister();

    public static native Expected<String, None> setRootPath(String str);

    public native void addObserver(TileStoreObserver tileStoreObserver);

    @MapboxExperimental
    public native Cancelable applyTileRegionUpdate(String str, TileRegionApplyUpdateOptions tileRegionApplyUpdateOptions, TileRegionLoadProgressCallback tileRegionLoadProgressCallback, TileRegionCallback tileRegionCallback);

    public native void clearAmbientCache(AmbientCacheClearingCallback ambientCacheClearingCallback);

    public native void clearAmbientCache(AmbientCacheClearingCallback ambientCacheClearingCallback, TileStoreAmbientCacheFilterOptions tileStoreAmbientCacheFilterOptions);

    public native void computeCoveredArea(List<TilesetDescriptor> list, TileRegionGeometryCallback tileRegionGeometryCallback);

    public native Cancelable estimateTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionEstimateOptions tileRegionEstimateOptions, TileRegionEstimateProgressCallback tileRegionEstimateProgressCallback, TileRegionEstimateResultCallback tileRegionEstimateResultCallback);

    public native Cancelable estimateTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionEstimateProgressCallback tileRegionEstimateProgressCallback, TileRegionEstimateResultCallback tileRegionEstimateResultCallback);

    public native void getAllTileRegions(TileRegionsCallback tileRegionsCallback);

    public native void getTileRegion(String str, TileRegionCallback tileRegionCallback);

    public native void getTileRegionGeometry(String str, TileRegionGeometryCallback tileRegionGeometryCallback);

    public native void getTileRegionMetadata(String str, TileRegionMetadataCallback tileRegionMetadataCallback);

    public native void getTileRegionTilesets(String str, TileRegionTilesetsCallback tileRegionTilesetsCallback);

    @MapboxExperimental
    public native Cancelable importArchive(TileStoreImportOptions tileStoreImportOptions, TileStoreImportProgressCallback tileStoreImportProgressCallback, TileStoreImportCompleteCallback tileStoreImportCompleteCallback);

    public native Cancelable loadResource(ResourceDescription resourceDescription, ResourceLoadOptions resourceLoadOptions, ResourceLoadProgressCallback resourceLoadProgressCallback, ResourceLoadResultCallback resourceLoadResultCallback);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionCallback tileRegionCallback);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionLoadProgressCallback tileRegionLoadProgressCallback, TileRegionCallback tileRegionCallback);

    @MapboxExperimental
    public native Cancelable prepareTileRegionUpdate(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionLoadProgressCallback tileRegionLoadProgressCallback, TileRegionCallback tileRegionCallback);

    public native void removeObserver(TileStoreObserver tileStoreObserver);

    public native void removeTileRegion(String str);

    public native void removeTileRegion(String str, TileRegionCallback tileRegionCallback);

    @MapboxExperimental
    public native void removeTileRegionUpdate(String str, TileRegionCallback tileRegionCallback);

    public native void setOption(String str, Value value);

    public native void setOption(String str, TileDataDomain tileDataDomain, Value value);

    public native Cancelable subscribeForEvent(String str, TileStoreGenericEventCallback tileStoreGenericEventCallback);

    public native void tileRegionContainsDescriptors(String str, List<TilesetDescriptor> list, TileRegionBooleanCallback tileRegionBooleanCallback);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStore(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStorePeerCleaner(j));
    }
}
