package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class CustomLayerMapProjectionNative implements CustomLayerMapProjection {
    protected long peer;

    public static class CustomLayerMapProjectionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerMapProjectionNative.cleanNativePeer(this.peer);
        }

        public CustomLayerMapProjectionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> convertMercatorModelMatrix(List<Double> list, boolean z);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getModelMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getTransitionMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native float getTransitionPhase();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CustomLayerMapProjectionNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CustomLayerMapProjectionPeerCleaner(j));
    }
}
