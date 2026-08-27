package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes3.dex */
public class RouteAlertLocation implements RouteAlertLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class RouteAlertLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteAlertLocation.cleanNativePeer(this.peer);
        }

        public RouteAlertLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteAlertLocationInterface
    public native Geometry getShape();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteAlertLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouteAlertLocationPeerCleaner(j));
    }
}
