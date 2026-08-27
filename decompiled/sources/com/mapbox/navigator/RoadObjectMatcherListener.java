package com.mapbox.navigator;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes3.dex */
public interface RoadObjectMatcherListener {
    void onMatchingCancelled(String str);

    void onRoadObjectMatched(Expected<RoadObjectMatcherError, RoadObject> expected);
}
