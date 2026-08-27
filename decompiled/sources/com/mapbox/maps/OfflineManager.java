package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TilesetDescriptor;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class OfflineManager {
    protected long peer;

    public static class OfflineManagerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineManager.cleanNativePeer(this.peer);
        }

        public OfflineManagerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize();

    private static native void nativeSelfRegister();

    public native TilesetDescriptor createTilesetDescriptor(TilesetDescriptorOptions tilesetDescriptorOptions);

    public native void getAllStylePacks(StylePacksCallback stylePacksCallback);

    public native void getStylePack(String str, StylePackCallback stylePackCallback);

    public native void getStylePackMetadata(String str, StylePackMetadataCallback stylePackMetadataCallback);

    public native Cancelable loadStylePack(String str, StylePackLoadOptions stylePackLoadOptions, StylePackCallback stylePackCallback);

    public native Cancelable loadStylePack(String str, StylePackLoadOptions stylePackLoadOptions, StylePackLoadProgressCallback stylePackLoadProgressCallback, StylePackCallback stylePackCallback);

    public native void removeStylePack(String str);

    public native void removeStylePack(String str, StylePackCallback stylePackCallback);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineManager() {
        initialize();
    }

    public OfflineManager(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineManagerPeerCleaner(j));
    }
}
