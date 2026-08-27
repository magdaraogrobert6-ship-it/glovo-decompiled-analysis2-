package com.mapbox.navigator;

import com.mapbox.common.Cancelable;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TilesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface TilesManagerHandleInterface {
    void addOfflineCache(TilesConfig tilesConfig, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle, BillingProductType billingProductType);

    Cancelable checkHDUpdateAvailable(TilesUpdateAvailabilityCallback tilesUpdateAvailabilityCallback);

    Cancelable checkUpdateAvailable(TilesUpdateAvailabilityCallback tilesUpdateAvailabilityCallback);

    Cancelable currentHDVersion(CurrentTilesVersionCallback currentTilesVersionCallback);

    Cancelable currentVersion(CurrentTilesVersionCallback currentTilesVersionCallback);

    void pinHDVersion(String str);

    void pinVersion(String str);

    void subscribeOnHDVersionChanged(OnVersionChangedCallback onVersionChangedCallback);

    void subscribeOnVersionChanged(OnVersionChangedCallback onVersionChangedCallback);

    TilesetDescriptor tilesetDescriptor(List<TileDataDomain> list);
}
