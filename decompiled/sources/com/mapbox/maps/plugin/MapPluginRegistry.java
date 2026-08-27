package com.mapbox.maps.plugin;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapPluginRegistry {
    public boolean isDestroyed;
    public final MapDelegateProviderImpl mapDelegateProvider;
    public onViewAttachedToWindowlambda0 mapSize;
    public MapboxLifecyclePluginImpl mapboxLifecyclePlugin;
    public State mapState = State.STOPPED;
    public final LinkedHashMap plugins = new LinkedHashMap();
    public final CopyOnWriteArraySet cameraPlugins = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet gesturePlugins = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet styleObserverPlugins = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet mapSizePlugins = new CopyOnWriteArraySet();

    public enum State {
        STARTED,
        STOPPED
    }

    public final void onCameraMove(CameraState cameraState) {
        for (MapCameraPlugin mapCameraPlugin : this.cameraPlugins) {
            Point center = cameraState.getCenter();
            center.getClass();
            double zoom = cameraState.getZoom();
            double pitch = cameraState.getPitch();
            double bearing = cameraState.getBearing();
            EdgeInsets padding = cameraState.getPadding();
            padding.getClass();
            mapCameraPlugin.onCameraMove(center, padding, zoom, pitch, bearing);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapPluginRegistry(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.mapDelegateProvider = mapDelegateProviderImpl;
    }

    public final void setMapState(State state) {
        if (state != this.mapState) {
            this.mapState = state;
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            LinkedHashMap linkedHashMap = this.plugins;
            if (i == 1) {
                for (MapPlugin mapPlugin : onContentCardDismissed.PlaybackStateCompat(linkedHashMap.values())) {
                    if (mapPlugin instanceof LifecyclePlugin) {
                        ((LifecyclePlugin) mapPlugin).onStart();
                    }
                }
                return;
            }
            if (i != 2) {
                return;
            }
            for (MapPlugin mapPlugin2 : onContentCardDismissed.PlaybackStateCompat(linkedHashMap.values())) {
                if (mapPlugin2 instanceof LifecyclePlugin) {
                    ((LifecyclePlugin) mapPlugin2).onStop();
                }
            }
        }
    }
}
