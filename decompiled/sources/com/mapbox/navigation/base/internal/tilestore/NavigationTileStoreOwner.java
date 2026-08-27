package com.mapbox.navigation.base.internal.tilestore;

import com.mapbox.common.TileStore;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationTileStoreOwner {
    public static final NavigationTileStoreOwner INSTANCE = new NavigationTileStoreOwner();
    public static TileStore value;

    public final TileStore invoke() {
        TileStore tileStoreCreate;
        synchronized (this) {
            tileStoreCreate = value;
            if (tileStoreCreate == null) {
                LoggerProviderKt.logD("NavigationTileStore", "No initial TileStore set. Creating default. Accessing too early?");
                tileStoreCreate = TileStore.create();
                tileStoreCreate.getClass();
                value = tileStoreCreate;
            }
        }
        return tileStoreCreate;
    }
}
