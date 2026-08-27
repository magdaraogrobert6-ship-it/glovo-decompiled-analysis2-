package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedPolygonLocation implements MatchedPolygonLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MatchedPolygonLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MatchedPolygonLocation.cleanNativePeer(this.peer);
        }

        public MatchedPolygonLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native List<Position> getEntries();

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native List<Position> getExits();

    @Override // com.mapbox.navigator.MatchedPolygonLocationInterface
    public native Geometry getShape();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MatchedPolygonLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPolygonLocationPeerCleaner(j));
    }
}
