package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class LocationProviderNative implements LocationProvider {
    protected long peer;

    public static class LocationProviderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LocationProviderNative.cleanNativePeer(this.peer);
        }

        public LocationProviderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public native Point getLocation();

    @Override // com.mapbox.search.internal.bindgen.LocationProvider
    public native LonLatBBox getViewport();

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationProviderPeerCleaner(j));
    }
}
