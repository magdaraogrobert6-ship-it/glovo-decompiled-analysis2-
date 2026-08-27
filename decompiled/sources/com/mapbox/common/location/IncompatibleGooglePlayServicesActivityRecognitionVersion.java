package com.mapbox.common.location;

/* JADX INFO: loaded from: classes5.dex */
public final class IncompatibleGooglePlayServicesActivityRecognitionVersion extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleGooglePlayServicesActivityRecognitionVersion(Exception exc) {
        super("Incompatible Google Play Services activity recognition version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.", exc);
        exc.getClass();
    }
}
