package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public final class IncompatibleGooglePlayServicesLocationVersion extends Exception {
    public IncompatibleGooglePlayServicesLocationVersion() {
        super("Incompatible Google Play Services location version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.");
    }
}
