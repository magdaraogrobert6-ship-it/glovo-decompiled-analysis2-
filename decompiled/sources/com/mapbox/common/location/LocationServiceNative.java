package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class LocationServiceNative implements LocationService {
    public static final Companion Companion = new Companion(null);
    private long peer;

    public static final class LocationServicePeerCleaner implements Runnable {
        private final long peer;

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceNative.Companion.cleanNativePeer(this.peer);
        }

        public LocationServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static final native void cleanNativePeer(long j);

    @Override // com.mapbox.common.location.LocationService
    public native AccuracyAuthorization getAccuracyAuthorization();

    @Override // com.mapbox.common.location.LocationService
    public native Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest locationProviderRequest);

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationService
    public native PermissionStatus getPermissionStatus();

    @Override // com.mapbox.common.location.LocationService
    public native boolean isAvailable();

    @Override // com.mapbox.common.location.LocationService
    public native void registerObserver(LocationServiceObserver locationServiceObserver);

    public final void setPeer(long j) {
        this.peer = j;
    }

    @Override // com.mapbox.common.location.LocationService
    public native void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory deviceLocationProviderFactory);

    @Override // com.mapbox.common.location.LocationService
    public native void unregisterObserver(LocationServiceObserver locationServiceObserver);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cleanNativePeer(long j) {
            LocationServiceNative.cleanNativePeer(j);
        }

        private Companion() {
        }
    }

    public LocationServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new LocationServicePeerCleaner(j));
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z) {
        deviceLocationProviderType.getClass();
        throw new RuntimeException("There should be no native LocationService");
    }

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest) {
        extendedLocationProviderParameters.getClass();
        throw new RuntimeException("There should be no native LocationService");
    }
}
