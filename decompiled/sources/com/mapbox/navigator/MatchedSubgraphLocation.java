package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedSubgraphLocation implements MatchedSubgraphLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MatchedSubgraphLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MatchedSubgraphLocation.cleanNativePeer(this.peer);
        }

        public MatchedSubgraphLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native HashMap<Long, SubgraphEdge> getEdges();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native List<Position> getEnters();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native List<Position> getExits();

    @Override // com.mapbox.navigator.MatchedSubgraphLocationInterface
    public native Geometry getShape();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MatchedSubgraphLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedSubgraphLocationPeerCleaner(j));
    }
}
