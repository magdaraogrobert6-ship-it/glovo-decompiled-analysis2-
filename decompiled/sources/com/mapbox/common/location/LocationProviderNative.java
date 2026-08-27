package com.mapbox.common.location;

import android.os.Looper;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;

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

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(LocationObserver locationObserver);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver, Looper looper) {
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(GetLocationCallback getLocationCallback) {
        return null;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(LocationObserver locationObserver);

    public LocationProviderNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationProviderPeerCleaner(j));
    }
}
