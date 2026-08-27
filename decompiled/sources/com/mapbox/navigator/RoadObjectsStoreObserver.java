package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface RoadObjectsStoreObserver {
    void onCustomRoadObjectAddingCancelled(String str);

    void onCustomRoadObjectMatched(String str);

    void onCustomRoadObjectMatchingFailed(String str);

    void onRoadObjectAdded(String str);

    void onRoadObjectRemoved(String str);

    void onRoadObjectUpdated(String str);
}
