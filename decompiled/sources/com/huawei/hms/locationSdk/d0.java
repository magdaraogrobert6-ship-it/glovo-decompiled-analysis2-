package com.huawei.hms.locationSdk;

import android.app.Notification;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LogConfig;
import com.huawei.hms.support.api.entity.location.offlinelocation.OfflineLocationRequest;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public interface d0 {
    setShouldUseDispatchDrawui a();

    setShouldUseDispatchDrawui a(int i, Notification notification);

    setShouldUseDispatchDrawui a(PendingIntent pendingIntent);

    setShouldUseDispatchDrawui a(Location location);

    setShouldUseDispatchDrawui a(LocationCallback locationCallback);

    setShouldUseDispatchDrawui a(LocationRequest locationRequest);

    setShouldUseDispatchDrawui a(LocationRequest locationRequest, PendingIntent pendingIntent);

    setShouldUseDispatchDrawui a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    setShouldUseDispatchDrawui a(LocationSettingsRequest locationSettingsRequest);

    setShouldUseDispatchDrawui a(LogConfig logConfig);

    setShouldUseDispatchDrawui a(OfflineLocationRequest offlineLocationRequest);

    setShouldUseDispatchDrawui a(boolean z);

    setShouldUseDispatchDrawui b();

    setShouldUseDispatchDrawui b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);

    setShouldUseDispatchDrawui c();

    setShouldUseDispatchDrawui d();
}
