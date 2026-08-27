package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class TileStoreFilter {
    protected long peer;

    public static class TileStoreFilterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreFilter.cleanNativePeer(this.peer);
        }

        public TileStoreFilterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native TileStoreFilter make();

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public native TileStoreFilter byDomain(TileDataDomain tileDataDomain);

    @MapboxExperimental
    public native TileStoreFilter byStylePack(String str);

    @MapboxExperimental
    public native TileStoreFilter byTileDataset(String str);

    @MapboxExperimental
    public native TileStoreFilter byTileRegion(String str);

    @MapboxExperimental
    public native TileStoreFilter byTileVersion(String str);

    @MapboxExperimental
    public native TileStoreFilter excludeResources();

    @MapboxExperimental
    public native TileStoreFilter excludeTiles();

    @MapboxExperimental
    public native TileStoreFilter excludeUnavailable();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreFilter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreFilterPeerCleaner(j));
    }
}
