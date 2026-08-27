package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;

/* JADX INFO: loaded from: classes3.dex */
public class OpenLRPointAlongLineLocation implements OpenLRPointAlongLineLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class OpenLRPointAlongLineLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OpenLRPointAlongLineLocation.cleanNativePeer(this.peer);
        }

        public OpenLRPointAlongLineLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native Point getCoordinate();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native Orientation getOrientation();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native GraphPosition getPosition();

    @Override // com.mapbox.navigator.OpenLRPointAlongLineLocationInterface
    public native SideOfRoad getSideOfRoad();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OpenLRPointAlongLineLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OpenLRPointAlongLineLocationPeerCleaner(j));
    }
}
