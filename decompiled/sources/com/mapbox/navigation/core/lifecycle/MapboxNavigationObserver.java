package com.mapbox.navigation.core.lifecycle;

import com.mapbox.navigation.core.MapboxNavigation;

/* JADX INFO: loaded from: classes2.dex */
public interface MapboxNavigationObserver {
    void onAttached(MapboxNavigation mapboxNavigation);

    void onDetached(MapboxNavigation mapboxNavigation);
}
