package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public class TileStoreImportOptions {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TileStoreImportOptionsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreImportOptions.cleanNativePeer(this.peer);
        }

        public TileStoreImportOptionsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native TileStoreImportOptions make();

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public native List<Long> getArchiveFileDescriptors();

    @MapboxExperimental
    public native TileStoreFilter getFilter();

    @MapboxExperimental
    public native long getMaxImportChunkSize();

    @MapboxExperimental
    public native Point getStartLocation();

    @MapboxExperimental
    public native TileStoreImportOptions setArchiveFileDescriptors(List<Long> list);

    @MapboxExperimental
    public native TileStoreImportOptions setFilter(TileStoreFilter tileStoreFilter);

    @MapboxExperimental
    public native TileStoreImportOptions setMaxImportChunkSize(long j);

    @MapboxExperimental
    public native TileStoreImportOptions startLocation(Point point);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreImportOptions(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreImportOptionsPeerCleaner(j));
    }
}
