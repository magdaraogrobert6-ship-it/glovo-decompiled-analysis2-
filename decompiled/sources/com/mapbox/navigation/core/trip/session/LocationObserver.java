package com.mapbox.navigation.core.trip.session;

import com.mapbox.common.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationObserver {
    void onNewLocationMatcherResult(LocationMatcherResult locationMatcherResult);

    void onNewRawLocation(Location location);
}
