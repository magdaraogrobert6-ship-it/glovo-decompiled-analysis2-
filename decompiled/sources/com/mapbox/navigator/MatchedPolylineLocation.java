package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedPolylineLocation implements MatchedPolylineLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MatchedPolylineLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MatchedPolylineLocation.cleanNativePeer(this.peer);
        }

        public MatchedPolylineLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native MatchedPolylinePart getMatchedPart();

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native GraphPath getPath();

    @Override // com.mapbox.navigator.MatchedPolylineLocationInterface
    public native Geometry getShape();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MatchedPolylineLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPolylineLocationPeerCleaner(j));
    }
}
