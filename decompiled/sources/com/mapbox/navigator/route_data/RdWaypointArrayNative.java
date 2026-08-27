package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdWaypointArrayNative implements RdWaypointArray {
    protected long peer;

    public static class RdWaypointArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdWaypointArrayNative.cleanNativePeer(this.peer);
        }

        public RdWaypointArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdWaypointArray
    public native RdWaypoint get(long j);

    @Override // com.mapbox.navigator.route_data.RdWaypointArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdWaypointArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdWaypointArrayPeerCleaner(j));
    }
}
