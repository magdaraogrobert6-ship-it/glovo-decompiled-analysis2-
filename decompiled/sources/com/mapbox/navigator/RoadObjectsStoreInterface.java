package com.mapbox.navigator;

import com.mapbox.common.Cancelable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface RoadObjectsStoreInterface {
    Cancelable addCustomRoadObject(UnmatchedRoadObject unmatchedRoadObject, MatchingOptions matchingOptions);

    @Deprecated
    void addCustomRoadObject(RoadObject roadObject);

    void addObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);

    HashMap<String, RoadObjectEdgeLocation> get(long j);

    RoadObject getRoadObject(String str);

    List<String> getRoadObjectIdsByEdgeIds(List<Long> list);

    boolean hasObservers();

    void removeAllCustomRoadObjects();

    void removeCustomRoadObject(String str);

    void removeCustomRoadObjects(List<String> list);

    void removeObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);
}
