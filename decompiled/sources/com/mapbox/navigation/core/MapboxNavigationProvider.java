package com.mapbox.navigation.core;

import com.mapbox.navigation.core.lifecycle.MapboxNavigationObserver;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxNavigationProvider {
    public static volatile MapboxNavigation mapboxNavigation;
    public static final CopyOnWriteArrayList observers = new CopyOnWriteArrayList();

    public static final void destroy() {
        LoggerProviderKt.logD("destroy()", "MapboxNavigationProvider");
        MapboxNavigation mapboxNavigation2 = mapboxNavigation;
        if (mapboxNavigation2 != null) {
            mapboxNavigation2.onDestroy$navigation_release();
            Iterator it = observers.iterator();
            while (it.hasNext()) {
                ((MapboxNavigationObserver) it.next()).onDetached(mapboxNavigation2);
            }
        }
        mapboxNavigation = null;
    }
}
