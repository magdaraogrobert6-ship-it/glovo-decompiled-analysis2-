package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class Projection {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class ProjectionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Projection.cleanNativePeer(this.peer);
        }

        public ProjectionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native Point coordinateForProjectedMeters(ProjectedMeters projectedMeters);

    public static native double getLatitudeScale(double d);

    public static native double getMetersPerPixelAtLatitude(double d, double d2);

    public static native Vec2 latLngToMercatorXY(Point point);

    private static native void nativeSelfRegister();

    public static native MercatorCoordinate project(Point point, double d);

    public static native ProjectedMeters projectedMetersForCoordinate(Point point);

    public static native Point unproject(MercatorCoordinate mercatorCoordinate, double d);

    public static native double worldSize(double d);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Projection(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ProjectionPeerCleaner(j));
    }
}
