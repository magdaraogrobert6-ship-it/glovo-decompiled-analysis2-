package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes4.dex */
public interface UserFeedbackCallback {
    void run(Expected<String, Point> expected);
}
