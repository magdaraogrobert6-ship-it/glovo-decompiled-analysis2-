package com.mapbox.navigator;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ElectronicHorizonObserver {
    void onPositionUpdated(ElectronicHorizonPosition electronicHorizonPosition, List<RoadObjectDistance> list);

    void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    void onRoadObjectPassed(RoadObjectPassInfo roadObjectPassInfo);
}
