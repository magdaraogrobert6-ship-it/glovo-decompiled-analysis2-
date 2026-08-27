package com.mapbox.common.location;

import android.os.Looper;
import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationProvider {
    void addLocationObserver(LocationObserver locationObserver);

    void addLocationObserver(LocationObserver locationObserver, Looper looper);

    Cancelable getLastLocation(GetLocationCallback getLocationCallback);

    void removeLocationObserver(LocationObserver locationObserver);
}
