package com.mapbox.navigation.core.lifecycle;

import com.mapbox.navigation.core.internal.lifecycle.CarAppLifecycleOwner;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import o.isAdapterPositionOnScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationAppDelegate {
    public boolean isSetup;
    public final isAdapterPositionOnScreen mapboxNavigationOwner$delegate = new isAdapterPositionOnScreen(MapboxNavigationApp$lifecycleOwner$2.INSTANCE$3);
    public final isAdapterPositionOnScreen carAppLifecycleOwner$delegate = new isAdapterPositionOnScreen(MapboxNavigationApp$lifecycleOwner$2.INSTANCE$2);
    public final isAdapterPositionOnScreen lifecycleOwner$delegate = new isAdapterPositionOnScreen(new SearchOptionsKt$validateLimit$1(10, this));

    public final CarAppLifecycleOwner getCarAppLifecycleOwner() {
        return (CarAppLifecycleOwner) this.carAppLifecycleOwner$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final MapboxNavigationOwner getMapboxNavigationOwner() {
        return (MapboxNavigationOwner) this.mapboxNavigationOwner$delegate.MediaSessionCompatResultReceiverWrapper();
    }
}
