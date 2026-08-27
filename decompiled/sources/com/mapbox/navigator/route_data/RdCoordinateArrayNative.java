package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RdCoordinateArrayNative implements RdCoordinateArray {
    protected long peer;

    public static class RdCoordinateArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdCoordinateArrayNative.cleanNativePeer(this.peer);
        }

        public RdCoordinateArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdCoordinateArray
    public native Point get(long j);

    @Override // com.mapbox.navigator.route_data.RdCoordinateArray
    public native List<Point> rawArray();

    @Override // com.mapbox.navigator.route_data.RdCoordinateArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdCoordinateArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdCoordinateArrayPeerCleaner(j));
    }
}
