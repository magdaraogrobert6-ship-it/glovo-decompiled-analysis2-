package com.mapbox.navigation.core.lifecycle;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.options.NavigationOptions;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigationProvider;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.accessisRenderNodeCompatiblecp;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationOwner {
    public boolean attached;
    public MapboxNavigation mapboxNavigation;
    public MapboxNavigation$$ExternalSyntheticLambda4 navigationOptionsProvider;
    public final CopyOnWriteArraySet services = new CopyOnWriteArraySet();
    public final MapboxNavigationOwner$carAppLifecycleObserver$1 carAppLifecycleObserver = new DefaultLifecycleObserver() { // from class: com.mapbox.navigation.core.lifecycle.MapboxNavigationOwner$carAppLifecycleObserver$1
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
            accessisrendernodecompatiblecp.getClass();
            LoggerProviderKt.logI("onStart", "MapboxNavigationOwner");
            MapboxNavigation mapboxNavigation = MapboxNavigationProvider.mapboxNavigation;
            if (mapboxNavigation != null && !mapboxNavigation.isDestroyed) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("MapboxNavigation should only be created by the MapboxNavigationOwner");
                return;
            }
            MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4 = this.this$0.navigationOptionsProvider;
            if (mapboxNavigation$$ExternalSyntheticLambda4 == null) {
                removeNodeAtDepth.serializer("navigationOptionsProvider");
                throw null;
            }
            NavigationOptions navigationOptions = (NavigationOptions) mapboxNavigation$$ExternalSyntheticLambda4.f$0;
            LoggerProviderKt.logD("create()", "MapboxNavigationProvider");
            MapboxNavigation mapboxNavigation2 = MapboxNavigationProvider.mapboxNavigation;
            if (mapboxNavigation2 != null) {
                mapboxNavigation2.onDestroy$navigation_release();
            }
            MapboxNavigationProvider.mapboxNavigation = new MapboxNavigation(navigationOptions);
            for (MapboxNavigationObserver mapboxNavigationObserver : MapboxNavigationProvider.observers) {
                MapboxNavigation mapboxNavigation3 = MapboxNavigationProvider.mapboxNavigation;
                mapboxNavigation3.getClass();
                mapboxNavigationObserver.onAttached(mapboxNavigation3);
            }
            MapboxNavigation mapboxNavigation4 = MapboxNavigationProvider.mapboxNavigation;
            mapboxNavigation4.getClass();
            MapboxNavigationOwner mapboxNavigationOwner = this.this$0;
            mapboxNavigationOwner.mapboxNavigation = mapboxNavigation4;
            mapboxNavigationOwner.attached = true;
            Iterator it = mapboxNavigationOwner.services.iterator();
            while (it.hasNext()) {
                ((MapboxNavigationObserver) it.next()).onAttached(mapboxNavigation4);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
            accessisrendernodecompatiblecp.getClass();
            LoggerProviderKt.logI("onStop", "MapboxNavigationOwner");
            MapboxNavigationOwner mapboxNavigationOwner = this.this$0;
            mapboxNavigationOwner.attached = false;
            for (MapboxNavigationObserver mapboxNavigationObserver : mapboxNavigationOwner.services) {
                MapboxNavigation mapboxNavigation = mapboxNavigationOwner.mapboxNavigation;
                mapboxNavigation.getClass();
                mapboxNavigationObserver.onDetached(mapboxNavigation);
            }
            MapboxNavigationProvider.destroy();
            mapboxNavigationOwner.mapboxNavigation = null;
        }
    };
}
