package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class GeoUtils implements GeoUtilsInterface {
    protected long peer;

    public static class GeoUtilsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GeoUtils.cleanNativePeer(this.peer);
        }

        public GeoUtilsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native double calculateShapeLength(Geometry geometry);

    public static native double calculateShapeLength(Geometry geometry, int i, int i2);

    public static native void cleanNativePeer(long j);

    public static native long getTopoLinkId(Geometry geometry, int i, int i2);

    public static native Expected<String, Long> getWayId(long j);

    public static native Expected<String, List<Long>> getWayId(Geometry geometry, int i, int i2);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public GeoUtils(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new GeoUtilsPeerCleaner(j));
    }
}
