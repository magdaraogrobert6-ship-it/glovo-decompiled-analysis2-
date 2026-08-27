package com.mapbox.common.location;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationService {
    AccuracyAuthorization getAccuracyAuthorization();

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest locationProviderRequest);

    PermissionStatus getPermissionStatus();

    boolean isAvailable();

    void registerObserver(LocationServiceObserver locationServiceObserver);

    void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory deviceLocationProviderFactory);

    void unregisterObserver(LocationServiceObserver locationServiceObserver);

    public static final class DefaultImpls {
        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    locationProviderRequest = null;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return locationService.getDeviceLocationProvider(deviceLocationProviderType, locationProviderRequest, z);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
            return null;
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, LocationProviderRequest locationProviderRequest, int i, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
                return null;
            }
            if ((i & 1) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(locationProviderRequest);
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest, int i, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
                return null;
            }
            if ((i & 2) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(extendedLocationProviderParameters, locationProviderRequest);
        }
    }
}
