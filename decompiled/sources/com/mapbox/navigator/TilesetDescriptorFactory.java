package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TilesetDescriptor;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class TilesetDescriptorFactory implements TilesetDescriptorFactoryInterface {
    protected long peer;

    public static class TilesetDescriptorFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptorFactory.cleanNativePeer(this.peer);
        }

        public TilesetDescriptorFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native TilesetDescriptor build(String str, String str2, boolean z);

    public static native void cleanNativePeer(long j);

    public static native TilesetDescriptor getLatest(CacheHandle cacheHandle, boolean z);

    public static native TilesetDescriptor getSpecificVersion(CacheHandle cacheHandle, String str, boolean z);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TilesetDescriptorFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TilesetDescriptorFactoryPeerCleaner(j));
    }
}
