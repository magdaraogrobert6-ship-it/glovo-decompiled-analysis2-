package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes5.dex */
final class TileRegionGeometryCallbackNative implements TileRegionGeometryCallback {
    private long peer;

    public static class TileRegionGeometryCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionGeometryCallbackNative.cleanNativePeer(this.peer);
        }

        public TileRegionGeometryCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TileRegionGeometryCallback
    public native void run(Expected<TileRegionError, Geometry> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TileRegionGeometryCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TileRegionGeometryCallbackPeerCleaner(j));
    }
}
