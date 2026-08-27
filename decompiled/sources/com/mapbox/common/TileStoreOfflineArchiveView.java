package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class TileStoreOfflineArchiveView {
    protected long peer;

    public static class TileStoreOfflineArchiveViewPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileStoreOfflineArchiveView.cleanNativePeer(this.peer);
        }

        public TileStoreOfflineArchiveViewPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native Expected<TileStoreImportError, TileStoreOfflineArchiveView> make(List<Long> list);

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public native HashMap<String, TileRegion> getRegions();

    @MapboxExperimental
    public native long getRequiredResourceBytes();

    @MapboxExperimental
    public native long getRequiredResourceCount();

    @MapboxExperimental
    public native List<String> getStylePackURIs();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreOfflineArchiveView(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreOfflineArchiveViewPeerCleaner(j));
    }
}
