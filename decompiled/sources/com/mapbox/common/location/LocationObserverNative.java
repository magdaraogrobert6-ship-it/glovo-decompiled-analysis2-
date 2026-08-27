package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class LocationObserverNative implements LocationObserver {
    protected long peer;

    public static class LocationObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LocationObserverNative.cleanNativePeer(this.peer);
        }

        public LocationObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.location.LocationObserver
    public native void onLocationUpdateReceived(List<Location> list);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LocationObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationObserverPeerCleaner(j));
    }
}
