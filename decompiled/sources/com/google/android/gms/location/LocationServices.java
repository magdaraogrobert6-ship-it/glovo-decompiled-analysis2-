package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import o.accessgetNumLockcp;
import o.accessgetNumPad2cp;
import o.accessgetNumPad8cp;
import o.getMediaStopEK5gGoQ;
import o.getMediaTopMenuEK5gGoQ;
import o.getMoveEndEK5gGoQ;
import o.getMuhenkanEK5gGoQ;
import o.getMultiplyEK5gGoQ;
import o.getMusicEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public class LocationServices {

    @Deprecated
    public static final accessgetNumLockcp API = getMediaStopEK5gGoQ.RemoteActionCompatParcelizer;

    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new getMediaTopMenuEK5gGoQ();

    @Deprecated
    public static final GeofencingApi GeofencingApi = new getMultiplyEK5gGoQ();

    @Deprecated
    public static final SettingsApi SettingsApi = new com.google.android.gms.dynamite.zzj(10);

    private LocationServices() {
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity) {
        return new getMediaStopEK5gGoQ(activity, activity, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }

    public static FusedOrientationProviderClient getFusedOrientationProviderClient(Activity activity) {
        return new getMoveEndEK5gGoQ(activity);
    }

    public static GeofencingClient getGeofencingClient(Activity activity) {
        return new getMuhenkanEK5gGoQ(activity);
    }

    public static SettingsClient getSettingsClient(Activity activity) {
        return new getMusicEK5gGoQ(activity);
    }

    public static FusedOrientationProviderClient getFusedOrientationProviderClient(Context context) {
        return new getMoveEndEK5gGoQ(context);
    }

    public static GeofencingClient getGeofencingClient(Context context) {
        return new getMuhenkanEK5gGoQ(context);
    }

    public static SettingsClient getSettingsClient(Context context) {
        return new getMusicEK5gGoQ(context);
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        return new getMediaStopEK5gGoQ(context, null, getMediaStopEK5gGoQ.RemoteActionCompatParcelizer, accessgetNumPad2cp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, accessgetNumPad8cp.IconCompatParcelizer);
    }
}
