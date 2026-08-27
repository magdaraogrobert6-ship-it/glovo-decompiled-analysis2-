package com.mapbox.navigation.core.lifecycle;

import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigationProvider;
import com.mapbox.navigation.core.internal.lifecycle.CarAppLifecycleOwner;
import com.mapbox.navigation.core.internal.lifecycle.CarAppLifecycleOwner$startedReferenceCounter$1;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.concurrent.CopyOnWriteArraySet;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.isAdapterPositionOnScreen;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationApp {
    public static final isAdapterPositionOnScreen mapboxNavigationAppDelegate$delegate = new isAdapterPositionOnScreen(MapboxNavigationApp$lifecycleOwner$2.INSTANCE$1);

    public static MapboxNavigationAppDelegate getMapboxNavigationAppDelegate() {
        return (MapboxNavigationAppDelegate) mapboxNavigationAppDelegate$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    static {
        new isAdapterPositionOnScreen(MapboxNavigationApp$lifecycleOwner$2.INSTANCE);
    }

    public static final void attach(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        LoggerProviderKt.logD("attach()", "MapboxNavigationApp");
        MapboxNavigationAppDelegate mapboxNavigationAppDelegate = getMapboxNavigationAppDelegate();
        mapboxNavigationAppDelegate.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = mapboxNavigationAppDelegate.getCarAppLifecycleOwner();
        carAppLifecycleOwner.getClass();
        LoggerProviderKt.logI("attach", "CarAppLifecycleOwner");
        accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(carAppLifecycleOwner.startedReferenceCounter);
    }

    public static final MapboxNavigation current() {
        return getMapboxNavigationAppDelegate().getMapboxNavigationOwner().mapboxNavigation;
    }

    public static final void detach(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        LoggerProviderKt.logD("detach()", "MapboxNavigationApp");
        MapboxNavigationAppDelegate mapboxNavigationAppDelegate = getMapboxNavigationAppDelegate();
        mapboxNavigationAppDelegate.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = mapboxNavigationAppDelegate.getCarAppLifecycleOwner();
        carAppLifecycleOwner.getClass();
        LoggerProviderKt.logI("detach", "CarAppLifecycleOwner");
        supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
        CarAppLifecycleOwner$startedReferenceCounter$1 carAppLifecycleOwner$startedReferenceCounter$1 = carAppLifecycleOwner.startedReferenceCounter;
        lifecycle.read(carAppLifecycleOwner$startedReferenceCounter$1);
        toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat;
        tocolorlong8_81lla.getClass();
        if (tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.RESUMED)) {
            carAppLifecycleOwner$startedReferenceCounter$1.onPause(accessisrendernodecompatiblecp);
        }
        if (tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.STARTED)) {
            carAppLifecycleOwner$startedReferenceCounter$1.onStop(accessisrendernodecompatiblecp);
        }
        if (tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.CREATED)) {
            carAppLifecycleOwner$startedReferenceCounter$1.onDestroy(accessisrendernodecompatiblecp);
        }
    }

    public static final boolean isSetup() {
        return getMapboxNavigationAppDelegate().isSetup;
    }

    public static final void setup(NavigationOptions navigationOptions) {
        LoggerProviderKt.logD("setup()", "MapboxNavigationApp");
        MapboxNavigationAppDelegate mapboxNavigationAppDelegate = getMapboxNavigationAppDelegate();
        MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = new MapboxNavigation$$ExternalSyntheticLambda4(9, navigationOptions);
        mapboxNavigationAppDelegate.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = mapboxNavigationAppDelegate.getCarAppLifecycleOwner();
        if (carAppLifecycleOwner.createdChangingConfiguration > 0 || carAppLifecycleOwner.foregroundedChangingConfiguration > 0) {
            return;
        }
        if (mapboxNavigationAppDelegate.isSetup) {
            mapboxNavigationAppDelegate.isSetup = false;
            mapboxNavigationAppDelegate.getCarAppLifecycleOwner().lifecycleRegistry.read(mapboxNavigationAppDelegate.getMapboxNavigationOwner().carAppLifecycleObserver);
            MapboxNavigationOwner mapboxNavigationOwner = mapboxNavigationAppDelegate.getMapboxNavigationOwner();
            CopyOnWriteArraySet<MapboxNavigationObserver> copyOnWriteArraySet = mapboxNavigationOwner.services;
            if (mapboxNavigationOwner.attached) {
                mapboxNavigationOwner.attached = false;
                for (MapboxNavigationObserver mapboxNavigationObserver : copyOnWriteArraySet) {
                    MapboxNavigation mapboxNavigation = mapboxNavigationOwner.mapboxNavigation;
                    mapboxNavigation.getClass();
                    mapboxNavigationObserver.onDetached(mapboxNavigation);
                }
                MapboxNavigationProvider.destroy();
                mapboxNavigationOwner.mapboxNavigation = null;
                LoggerProviderKt.logI("disabled " + copyOnWriteArraySet.size() + " observers", "MapboxNavigationOwner");
            }
        }
        MapboxNavigationOwner mapboxNavigationOwner2 = mapboxNavigationAppDelegate.getMapboxNavigationOwner();
        mapboxNavigationOwner2.getClass();
        mapboxNavigationOwner2.navigationOptionsProvider = mapboxNavigation$$ExternalSyntheticLambda4;
        mapboxNavigationAppDelegate.getCarAppLifecycleOwner().lifecycleRegistry.IconCompatParcelizer(mapboxNavigationAppDelegate.getMapboxNavigationOwner().carAppLifecycleObserver);
        mapboxNavigationAppDelegate.isSetup = true;
    }
}
