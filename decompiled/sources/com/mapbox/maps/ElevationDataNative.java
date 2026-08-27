package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class ElevationDataNative implements ElevationData {
    protected long peer;

    public static class ElevationDataPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ElevationDataNative.cleanNativePeer(this.peer);
        }

        public ElevationDataPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.ElevationData
    public native Double getElevation(Point point);

    @Override // com.mapbox.maps.ElevationData
    public native double getTerrainExaggeration();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ElevationDataNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ElevationDataPeerCleaner(j));
    }
}
