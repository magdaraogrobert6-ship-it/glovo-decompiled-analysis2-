package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RdIntersectionNative implements RdIntersection {
    protected long peer;

    public static class RdIntersectionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdIntersectionNative.cleanNativePeer(this.peer);
        }

        public RdIntersectionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native List<Integer> bearings();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native List<RdRoadClass> classes();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native List<Boolean> entry();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native Integer geometryIndex();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native Byte inIndex();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native List<RdLane> lanes();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native Point location();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native Byte outIndex();

    @Override // com.mapbox.navigator.route_data.RdIntersection
    public native boolean railwayCrossing();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdIntersectionNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdIntersectionPeerCleaner(j));
    }
}
