package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface OfflineRegionObserver {
    void errorOccurred(OfflineRegionError offlineRegionError);

    void statusChanged(OfflineRegionStatus offlineRegionStatus);
}
