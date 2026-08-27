package com.huawei.hms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.ArrayList;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class GeofenceData {
    public static final String KEY_ERROR_CODE = "hms_error_code";
    private static final String KEY_GEOFENCE_BUNDLE = "com.huawei.hms.location.geofence.geofence_list_bundle";
    public static final String KEY_GEOFENCE_LIST = "com.huawei.hms.location.geofence.geofence_list";
    public static final String KEY_LOCATION = "com.huawei.hms.location.geofence.location";
    public static final String KEY_TRANSITION = "com.huawei.hms.location.geofence.conversion";
    private final int conversion;
    private final List<Geofence> convertingGeofenceList;
    private final Location convertingLocation;
    private final int errorCode;

    public int getConversion() {
        return this.conversion;
    }

    public List<Geofence> getConvertingGeofenceList() {
        return this.convertingGeofenceList;
    }

    public Location getConvertingLocation() {
        return this.convertingLocation;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public boolean isFailure() {
        return this.errorCode != -1;
    }

    public boolean isSuccess() {
        return this.errorCode == -1;
    }

    private GeofenceData(int i, int i2, List<Geofence> list, Location location) {
        this.errorCode = i;
        this.conversion = i2;
        this.convertingGeofenceList = list;
        this.convertingLocation = location;
    }

    public static GeofenceData getDataFromIntent(Intent intent) {
        ArrayList parcelableArrayListExtra = null;
        if (intent == null) {
            return null;
        }
        SafeIntent safeIntent = new SafeIntent(intent, 0);
        int intExtra = safeIntent.getIntExtra(KEY_ERROR_CODE, -1);
        int intExtra2 = safeIntent.getIntExtra(KEY_TRANSITION, -1);
        int i = (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4) ? intExtra2 : -1;
        Location location = (Location) safeIntent.getParcelableExtra(KEY_LOCATION);
        ArrayList arrayList = new ArrayList();
        Bundle bundleExtra = safeIntent.getBundleExtra(KEY_GEOFENCE_BUNDLE);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        try {
            parcelableArrayListExtra = bundleExtra.getParcelableArrayList(KEY_GEOFENCE_LIST);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getParcelableArrayList exception: "), th);
        }
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = safeIntent.getParcelableArrayListExtra(KEY_GEOFENCE_LIST);
        }
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0) {
            arrayList.addAll(parcelableArrayListExtra);
        }
        return new GeofenceData(intExtra, i, arrayList, location);
    }
}
