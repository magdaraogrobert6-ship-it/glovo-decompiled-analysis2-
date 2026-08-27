package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class MapSnapshot {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class MapSnapshotPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshot.cleanNativePeer(this.peer);
        }

        public MapSnapshotPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native List<String> attributions();

    public native Point coordinate(ScreenCoordinate screenCoordinate);

    public native Image moveImage();

    public native ScreenCoordinate screenCoordinate(Point point);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapSnapshot(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotPeerCleaner(j));
    }
}
