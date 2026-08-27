package com.mapbox.common.location;

import com.google.android.gms.common.GoogleApiAvailability;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.movement.GoogleActivityRecognition;
import com.mapbox.common.movement.ProxyGoogleActivityRecognitionClient;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceLocationProviderKt {
    private static GooglePlayServicesHelper googlePlayServicesHelper = new GooglePlayServicesHelper() { // from class: com.mapbox.common.location.GoogleDeviceLocationProviderKt$googlePlayServicesHelper$1
        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayActivityRecognitionAvailable() {
            try {
                ProxyGoogleActivityRecognitionClient.Companion.verifyAndCacheMethods$common_release();
                return true;
            } catch (Throwable th) {
                MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, "Failed to load Activity Recognition client: " + th);
                return false;
            }
        }

        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayServicesLocationAvailable() {
            return ProxyGoogleFusedLocationProviderClient.Companion.verifyAndCacheMethods$common_release();
        }

        @Override // com.mapbox.common.location.GooglePlayServicesHelper
        public boolean isGooglePlayServicesReady() {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MapboxSDKCommon.INSTANCE.getContext()) == 0;
        }
    };

    public static final GooglePlayServicesHelper getGooglePlayServicesHelper() {
        return googlePlayServicesHelper;
    }

    public static final void setGooglePlayServicesHelper(GooglePlayServicesHelper googlePlayServicesHelper2) {
        googlePlayServicesHelper2.getClass();
        googlePlayServicesHelper = googlePlayServicesHelper2;
    }
}
