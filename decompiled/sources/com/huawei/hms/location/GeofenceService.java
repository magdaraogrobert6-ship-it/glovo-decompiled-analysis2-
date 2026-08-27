package com.huawei.hms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hms.locationSdk.m0;
import com.huawei.hms.locationSdk.t;
import com.huawei.hms.locationSdk.v0;
import java.util.List;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class GeofenceService {
    private m0 locationClient;

    public setShouldUseDispatchDrawui createGeofenceList(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        return this.locationClient.a(geofenceRequest, pendingIntent);
    }

    public setShouldUseDispatchDrawui deleteGeofenceList(PendingIntent pendingIntent) {
        return this.locationClient.a(pendingIntent);
    }

    public GeofenceService(Activity activity) {
        this.locationClient = t.d(activity, (v0) null);
    }

    public setShouldUseDispatchDrawui deleteGeofenceList(List<String> list) {
        return this.locationClient.a(list);
    }

    public GeofenceService(Context context) {
        this.locationClient = t.d(context, (v0) null);
    }
}
