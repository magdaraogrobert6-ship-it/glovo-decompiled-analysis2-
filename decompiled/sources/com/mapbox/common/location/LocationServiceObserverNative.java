package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class LocationServiceObserverNative implements LocationServiceObserver {
    protected long peer;

    public static class LocationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceObserverNative.cleanNativePeer(this.peer);
        }

        public LocationServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAvailabilityChanged(boolean z);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onPermissionStatusChanged(PermissionStatus permissionStatus);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LocationServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationServiceObserverPeerCleaner(j));
    }
}
