package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class LaneGraphAccessorNative implements LaneGraphAccessor {
    protected long peer;

    public static class LaneGraphAccessorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LaneGraphAccessorNative.cleanNativePeer(this.peer);
        }

        public LaneGraphAccessorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Projection> findLaneGroupsProjections(FixDirectedCoordinate fixDirectedCoordinate, double d, Double d2, boolean z);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Projection> findLanesProjections(FixDirectedCoordinate fixDirectedCoordinate, double d, Double d2, boolean z);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneData getLaneData(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getLaneGeometry(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneGroupData getLaneGroupData(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getLaneGroupGeometry(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<LaneWidthPoint> getLaneWidthPoints(long j);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getSmoothedLaneGroupGeometry(long j, double d, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native LaneGroupData getVirtualLaneGroupData(long j, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native List<Point> getVirtualLaneGroupGeometry(long j, String str);

    @Override // com.mapbox.navigator.LaneGraphAccessor
    public native boolean isVirtualLaneGroup(long j);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LaneGraphAccessorNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LaneGraphAccessorPeerCleaner(j));
    }
}
