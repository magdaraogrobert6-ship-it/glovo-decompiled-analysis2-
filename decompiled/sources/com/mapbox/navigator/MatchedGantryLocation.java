package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedGantryLocation implements MatchedGantryLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MatchedGantryLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MatchedGantryLocation.cleanNativePeer(this.peer);
        }

        public MatchedGantryLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MatchedGantryLocationInterface
    public native List<Position> getPositions();

    @Override // com.mapbox.navigator.MatchedGantryLocationInterface
    public native Geometry getShape();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MatchedGantryLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedGantryLocationPeerCleaner(j));
    }
}
