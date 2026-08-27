package com.mapbox.common.geofencing;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes5.dex */
public interface RemoveFeatureCallback {
    void run(Expected<GeofencingError, None> expected);
}
