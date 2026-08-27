package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class MapsResourceOptions {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class MapsResourceOptionsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapsResourceOptions.cleanNativePeer(this.peer);
        }

        public MapsResourceOptionsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native void clearData(AsyncOperationResultCallback asyncOperationResultCallback);

    public static native String getAssetPath();

    public static native String getBaseURL();

    public static native String getDataPath();

    @Deprecated
    public static native TileStore getTileStore();

    @Deprecated
    public static native TileStoreUsageMode getTileStoreUsageMode();

    private static native void nativeSelfRegister();

    public static native void setAssetPath(String str);

    public static native void setBaseURL(String str);

    public static native void setDataPath(String str);

    @Deprecated
    public static native void setTileStore(TileStore tileStore);

    @Deprecated
    public static native void setTileStoreUsageMode(TileStoreUsageMode tileStoreUsageMode);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapsResourceOptions(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapsResourceOptionsPeerCleaner(j));
    }
}
