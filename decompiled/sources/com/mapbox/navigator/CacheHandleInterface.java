package com.mapbox.navigator;

import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface CacheHandleInterface {
    Cancelable getCurrentHDGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    Cancelable getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    Cancelable isHDGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);

    Cancelable isRoadGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);
}
