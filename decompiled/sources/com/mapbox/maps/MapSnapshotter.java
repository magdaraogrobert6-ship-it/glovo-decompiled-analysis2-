package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes4.dex */
final class MapSnapshotter extends CameraManager {

    /* JADX INFO: loaded from: classes5.dex */
    public static class MapSnapshotterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshotter.cleanNativePeer(this.peer);
        }

        public MapSnapshotterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(MapSnapshotOptions mapSnapshotOptions);

    private static native void nativeSelfRegister();

    public native void cancel();

    public native Double getElevation(Point point);

    public native Size getSize();

    public native void reduceMemoryUse();

    public native void setSize(Size size);

    public native void start(SnapshotCompleteCallback snapshotCompleteCallback);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapSnapshotter(MapSnapshotOptions mapSnapshotOptions) {
        super(0L);
        initialize(mapSnapshotOptions);
    }

    public MapSnapshotter(long j) {
        super(0L);
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotterPeerCleaner(j));
    }
}
