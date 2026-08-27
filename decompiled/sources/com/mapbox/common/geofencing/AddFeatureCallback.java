package com.mapbox.common.geofencing;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
public interface AddFeatureCallback {
    void run(Expected<GeofencingError, String> expected);
}
