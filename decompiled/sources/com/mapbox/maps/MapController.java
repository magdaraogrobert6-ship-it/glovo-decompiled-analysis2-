package com.mapbox.maps;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.room.Room;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzcp;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.BaseGesture;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.ContextBinder;
import com.mapbox.maps.plugin.InvalidViewPluginHostException;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapPluginRegistry;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.annotation.AnnotationPluginImpl;
import com.mapbox.maps.plugin.attribution.AttributionPluginImpl;
import com.mapbox.maps.plugin.compass.CompassViewPlugin;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.gestures.GesturesPluginImplKt;
import com.mapbox.maps.plugin.indoorselector.IndoorUtils;
import com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl;
import com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.logo.LogoUtils;
import com.mapbox.maps.plugin.overlay.MapOverlayPluginImpl;
import com.mapbox.maps.plugin.scalebar.ScaleBarUtils;
import com.mapbox.maps.plugin.viewport.ViewportPluginImpl;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.maps.renderer.OnFpsChangedListener;
import com.mapbox.maps.renderer.OnMaximumFpsChangedListener;
import com.mapbox.maps.renderer.RenderThreadStatsRecorder;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.widget.Widget;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidColorSpace_androidKt;
import o.AndroidGraphicsContext_androidKt;
import o.SemanticsActions;
import o.accessclearShadowCache;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.displayInAppMessagelambda5;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageViewLifecycleListener;
import o.getRegion;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onBackInvokedlambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.supportsColorMatrixQuery;

/* JADX INFO: loaded from: classes2.dex */
public final class MapController implements MapPluginProviderDelegate, MapControllable {
    public static final Companion Companion = new Companion(null);
    private static final String PLUGIN_MISSING_TEMPLATE = "Add %s plugin dependency to the classpath take automatically load the plugin implementation.";
    public static final String TAG = "MapController";
    private static final String VIEW_HIERARCHY_MISSING_TEMPLATE = "%s plugin requires a View hierarchy to be injected, plugin is ignored.";
    private final MapboxMap _mapboxMap;
    private Integer cachedMaximumFps;
    private final CameraChangedCoalescedCallback cameraChangedCoalescedCallback;
    private final CopyOnWriteArraySet<Cancelable> cancelableSubscriberSet;
    private ContextMode contextMode;
    private final getContentViewGroupParentLayout lifecycleScope;
    private LifecycleState lifecycleState;
    private final MapInitOptions mapInitOptions;
    private final CopyOnWriteArrayList<OnMaximumFpsChangedListener> maximumFpsListeners;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private final MapPluginRegistry pluginRegistry;
    private final MapboxRenderer renderer;
    private Style style;
    private final StyleDataLoadedCallback styleDataLoadedCallback;

    public enum LifecycleState {
        STATE_STOPPED,
        STATE_STARTED,
        STATE_DESTROYED
    }

    private static /* synthetic */ void getCameraChangedCoalescedCallback$annotations() {
    }

    public static /* synthetic */ void getLifecycleState$maps_sdk_release$annotations() {
    }

    public final getContentViewGroupParentLayout getLifecycleScope$maps_sdk_release() {
        return this.lifecycleScope;
    }

    public final LifecycleState getLifecycleState$maps_sdk_release() {
        return this.lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    /* JADX INFO: renamed from: getMapboxMap, reason: merged with bridge method [inline-methods] */
    public MapboxMap getMapboxMapDeprecated() {
        return this._mapboxMap;
    }

    public final Integer getMaximumFps$maps_sdk_release() {
        return this.cachedMaximumFps;
    }

    public final NativeMapImpl getNativeMap() {
        return this.nativeMap;
    }

    public final MapboxRenderer getRenderer$maps_sdk_release() {
        return this.renderer;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onDestroy() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_DESTROYED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        YieldKt.write(this.lifecycleScope, (CancellationException) null);
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        if (mapPluginRegistry.isDestroyed) {
            MapboxLogger.logW("MapPluginRegistry", "onDestroy() called more than once.");
        }
        mapPluginRegistry.isDestroyed = true;
        Iterator it = onContentCardDismissed.PlaybackStateCompat(mapPluginRegistry.plugins.values()).iterator();
        while (it.hasNext()) {
            ((MapPlugin) it.next()).cleanup();
        }
        this.nativeObserver.onDestroy();
        this.renderer.onDestroy();
        getMapboxMapDeprecated().onDestroy$maps_sdk_release();
        this.style = null;
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onResume() {
        this.renderer.onResume();
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStart() {
        String styleUri;
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STARTED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Style styleDeprecated = getMapboxMapDeprecated().getStyleDeprecated();
        if (styleDeprecated != null && styleDeprecated != this.style) {
            this.style = styleDeprecated;
            Iterator it = this.pluginRegistry.styleObserverPlugins.iterator();
            while (it.hasNext()) {
                ((MapStyleObserverPlugin) it.next()).onStyleChanged(styleDeprecated);
            }
        }
        NativeObserver nativeObserver = this.nativeObserver;
        this.cancelableSubscriberSet.add(NativeObserver.subscribeCameraChangedCoalesced$default(nativeObserver, this.cameraChangedCoalescedCallback, null, 2, null));
        this.cancelableSubscriberSet.add(NativeObserver.subscribeStyleDataLoaded$default(nativeObserver, this.styleDataLoadedCallback, null, null, 6, null));
        this.renderer.onStart();
        if (!getMapboxMapDeprecated().isStyleLoadInitiated$maps_sdk_release() && (styleUri = this.mapInitOptions.getStyleUri()) != null) {
            MapboxMap.loadStyle$default(getMapboxMapDeprecated(), styleUri, (Style.OnStyleLoaded) null, 2, (Object) null);
        }
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        mapPluginRegistry.setMapState(MapPluginRegistry.State.STARTED);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onStop() {
        LifecycleState lifecycleState = this.lifecycleState;
        LifecycleState lifecycleState2 = LifecycleState.STATE_STOPPED;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        this.lifecycleState = lifecycleState2;
        Iterator<T> it = this.cancelableSubscriberSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableSubscriberSet.clear();
        this.renderer.onStop();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        mapPluginRegistry.setMapState(MapPluginRegistry.State.STOPPED);
        MapProvider.INSTANCE.flushPendingEvents();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapController(MapboxRenderer mapboxRenderer, MapInitOptions mapInitOptions) {
        mapboxRenderer.getClass();
        mapInitOptions.getClass();
        this.maximumFpsListeners = new CopyOnWriteArrayList<>();
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.lifecycleScope = YieldKt.write(YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read.IconCompatParcelizer())), new getInAppMessageViewLifecycleListener("MapControllerLifecycleScope"));
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.renderer = mapboxRenderer;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = mapInitOptions.getMapOptions().getContextMode();
        MapProvider mapProvider = MapProvider.INSTANCE;
        NativeMapImpl nativeMapWrapper = mapProvider.getNativeMapWrapper(mapInitOptions, mapboxRenderer);
        this.nativeMap = nativeMapWrapper;
        NativeObserver nativeObserver = new NativeObserver(nativeMapWrapper);
        this.nativeObserver = nativeObserver;
        MapboxMap mapboxMap = mapProvider.getMapboxMap(nativeMapWrapper, nativeObserver, mapInitOptions.getMapOptions().getPixelRatio());
        this._mapboxMap = mapboxMap;
        getMapboxMapDeprecated().setRenderHandler$maps_sdk_release(mapboxRenderer.getRenderThread$maps_sdk_release().getRenderHandlerThread$maps_sdk_release().getHandler$maps_sdk_release());
        this.pluginRegistry = mapProvider.getMapPluginRegistry(getMapboxMapDeprecated(), this, mapProvider.getMapTelemetryInstance(mapInitOptions.getContext()), mapProvider.getMapGeofencingConsent());
        this.cameraChangedCoalescedCallback = new MapController$$ExternalSyntheticLambda1(this);
        this.styleDataLoadedCallback = new MapController$$ExternalSyntheticLambda1(this);
        mapboxRenderer.setMap(nativeMapWrapper);
        CameraOptions cameraOptions = mapInitOptions.getCameraOptions();
        if (cameraOptions != null) {
            getMapboxMapDeprecated().setCamera(cameraOptions);
        }
        mapboxMap.initializeAccessibility$maps_sdk_release(mapInitOptions.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MapController mapController, CameraChangedCoalesced cameraChangedCoalesced) {
        mapController.getClass();
        cameraChangedCoalesced.getClass();
        MapPluginRegistry mapPluginRegistry = mapController.pluginRegistry;
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        mapPluginRegistry.onCameraMove(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapController mapController, StyleDataLoaded styleDataLoaded) {
        mapController.getClass();
        styleDataLoaded.getClass();
        if (styleDataLoaded.getType() == StyleDataLoadedType.STYLE) {
            mapController.getMapboxMapDeprecated().getStyle(new MapboxMap$$ExternalSyntheticLambda22(1, mapController));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2$lambda$1(MapController mapController, Style style) {
        mapController.getClass();
        style.getClass();
        mapController.style = style;
        Iterator it = mapController.pluginRegistry.styleObserverPlugins.iterator();
        while (it.hasNext()) {
            ((MapStyleObserverPlugin) it.next()).onStyleChanged(style);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(MapPluginRegistry mapPluginRegistry, CameraChangedCoalesced cameraChangedCoalesced) {
        mapPluginRegistry.getClass();
        cameraChangedCoalesced.getClass();
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        mapPluginRegistry.onCameraMove(cameraState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRendererSetupErrorListener$lambda$12(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener) {
        mapController.getClass();
        rendererSetupErrorListener.getClass();
        mapController.renderer.getRenderThread$maps_sdk_release().addRendererStateListener(rendererSetupErrorListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChanged$lambda$9(MapController mapController, int i, int i2) {
        mapController.getClass();
        mapController.renderer.onSurfaceChanged(i, i2);
        mapController.nativeMap.setSizeSet$maps_sdk_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRendererSetupErrorListener$lambda$13(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener) {
        mapController.getClass();
        rendererSetupErrorListener.getClass();
        mapController.renderer.getRenderThread$maps_sdk_release().removeRendererStateListener(rendererSetupErrorListener);
    }

    public final void addOnMaximumFpsChangedListener$maps_sdk_release(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        this.maximumFpsListeners.add(onMaximumFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void addRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread$maps_sdk_release().post(new MapController$$ExternalSyntheticLambda3(this, rendererSetupErrorListener, 0));
    }

    @Override // com.mapbox.maps.MapControllable
    public void addWidget(Widget widget) {
        widget.getClass();
        if (this.contextMode != ContextMode.SHARED) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Map view or map surface must be init with MapInitOptions.mapOptions.contextMode = ContextMode.SHARED when using widgets!");
            return;
        }
        widget.setTriggerRepaintAction$maps_sdk_release(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.MapController.addWidget.1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4687invoke() {
                MapController.this.getRenderer$maps_sdk_release().scheduleRepaint();
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4687invoke();
                return createFromParcel.INSTANCE;
            }
        });
        this.renderer.getRenderThread$maps_sdk_release().addWidget(widget);
        this.renderer.scheduleRepaint();
    }

    public final void createPlugin(MapView mapView, Plugin plugin) throws InvalidViewPluginHostException {
        plugin.getClass();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        MapInitOptions mapInitOptions = this.mapInitOptions;
        LinkedHashMap linkedHashMap = mapPluginRegistry.plugins;
        mapInitOptions.getClass();
        MapPlugin mapPlugin = plugin.instance;
        String str = plugin.id;
        if (mapPluginRegistry.isDestroyed) {
            MapboxLogger.logE("MapPluginRegistry", "createPlugin('" + str + "') called after destroy.");
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("createPlugin('", str, "') from thread '");
        sbM.append(Thread.currentThread().getName());
        sbM.append('\'');
        MapboxLogger.logD("MapPluginRegistry", sbM.toString());
        if (mapPlugin == null) {
            throw new MapboxConfigurationException(m1$$ExternalSyntheticOutline0.m('!', "MapPlugin instance is missing for ", str));
        }
        if (linkedHashMap.containsKey(str)) {
            MapPlugin mapPlugin2 = (MapPlugin) linkedHashMap.get(str);
            if (mapPlugin2 != null) {
                mapPlugin2.initialize();
                return;
            }
            return;
        }
        boolean z = mapPlugin instanceof ViewPlugin;
        if (z && mapView == null) {
            throw new InvalidViewPluginHostException("Cause: " + mapPlugin.getClass());
        }
        linkedHashMap.put(str, mapPlugin);
        mapPlugin.onDelegateProvider(mapPluginRegistry.mapDelegateProvider);
        if (z) {
            ViewPlugin viewPlugin = (ViewPlugin) mapPlugin;
            mapView.getClass();
            View viewBind = viewPlugin.bind(mapView, mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
            mapView.addView(viewBind);
            viewPlugin.onPluginView(viewBind);
        }
        if (mapPlugin instanceof ContextBinder) {
            ((ContextBinder) mapPlugin).bind(mapInitOptions.getContext(), mapInitOptions.getAttrs(), mapInitOptions.getMapOptions().getPixelRatio());
        }
        if (mapPlugin instanceof MapSizePlugin) {
            mapPluginRegistry.mapSizePlugins.add(mapPlugin);
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = mapPluginRegistry.mapSize;
            if (onviewattachedtowindowlambda0 != null) {
                ((MapSizePlugin) mapPlugin).onSizeChanged(((Number) onviewattachedtowindowlambda0.serializer).intValue(), ((Number) onviewattachedtowindowlambda0.write).intValue());
            }
        }
        if (mapPlugin instanceof MapCameraPlugin) {
            mapPluginRegistry.cameraPlugins.add(mapPlugin);
        }
        if (mapPlugin instanceof GesturesPlugin) {
            mapPluginRegistry.gesturePlugins.add(mapPlugin);
        }
        if (mapPlugin instanceof MapStyleObserverPlugin) {
            mapPluginRegistry.styleObserverPlugins.add(mapPlugin);
        }
        if (mapPlugin instanceof MapboxLifecyclePluginImpl) {
            mapPluginRegistry.mapboxLifecyclePlugin = (MapboxLifecyclePluginImpl) mapPlugin;
        }
        mapPlugin.initialize();
        if (mapPluginRegistry.mapState == MapPluginRegistry.State.STARTED && (mapPlugin instanceof LifecyclePlugin)) {
            ((LifecyclePlugin) mapPlugin).onStart();
        }
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate
    public <T extends MapPlugin> T getPlugin(String str) {
        str.getClass();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        return (T) mapPluginRegistry.plugins.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0297 A[Catch: NoClassDefFoundError -> 0x02bb, InvalidViewPluginHostException -> 0x02bf, TryCatch #7 {InvalidViewPluginHostException -> 0x02bf, NoClassDefFoundError -> 0x02bb, blocks: (B:89:0x01b6, B:90:0x01bc, B:143:0x0285, B:145:0x0289, B:147:0x0297, B:149:0x029b, B:150:0x02a5, B:152:0x02a9, B:153:0x02b3, B:154:0x02ba, B:92:0x01c1, B:95:0x01c9, B:96:0x01d0, B:99:0x01d8, B:100:0x01df, B:103:0x01e7, B:104:0x01ee, B:107:0x01f6, B:108:0x01fd, B:111:0x0205, B:112:0x020c, B:115:0x0214, B:116:0x021a, B:119:0x0222, B:120:0x0228, B:123:0x022f, B:125:0x0244, B:126:0x024b, B:127:0x0252, B:130:0x0259, B:131:0x025e, B:134:0x0265, B:135:0x026b, B:138:0x0272, B:139:0x0278, B:142:0x027f), top: B:165:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x029b A[Catch: NoClassDefFoundError -> 0x02bb, InvalidViewPluginHostException -> 0x02bf, TryCatch #7 {InvalidViewPluginHostException -> 0x02bf, NoClassDefFoundError -> 0x02bb, blocks: (B:89:0x01b6, B:90:0x01bc, B:143:0x0285, B:145:0x0289, B:147:0x0297, B:149:0x029b, B:150:0x02a5, B:152:0x02a9, B:153:0x02b3, B:154:0x02ba, B:92:0x01c1, B:95:0x01c9, B:96:0x01d0, B:99:0x01d8, B:100:0x01df, B:103:0x01e7, B:104:0x01ee, B:107:0x01f6, B:108:0x01fd, B:111:0x0205, B:112:0x020c, B:115:0x0214, B:116:0x021a, B:119:0x0222, B:120:0x0228, B:123:0x022f, B:125:0x0244, B:126:0x024b, B:127:0x0252, B:130:0x0259, B:131:0x025e, B:134:0x0265, B:135:0x026b, B:138:0x0272, B:139:0x0278, B:142:0x027f), top: B:165:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02a5 A[Catch: NoClassDefFoundError -> 0x02bb, InvalidViewPluginHostException -> 0x02bf, TryCatch #7 {InvalidViewPluginHostException -> 0x02bf, NoClassDefFoundError -> 0x02bb, blocks: (B:89:0x01b6, B:90:0x01bc, B:143:0x0285, B:145:0x0289, B:147:0x0297, B:149:0x029b, B:150:0x02a5, B:152:0x02a9, B:153:0x02b3, B:154:0x02ba, B:92:0x01c1, B:95:0x01c9, B:96:0x01d0, B:99:0x01d8, B:100:0x01df, B:103:0x01e7, B:104:0x01ee, B:107:0x01f6, B:108:0x01fd, B:111:0x0205, B:112:0x020c, B:115:0x0214, B:116:0x021a, B:119:0x0222, B:120:0x0228, B:123:0x022f, B:125:0x0244, B:126:0x024b, B:127:0x0252, B:130:0x0259, B:131:0x025e, B:134:0x0265, B:135:0x026b, B:138:0x0272, B:139:0x0278, B:142:0x027f), top: B:165:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02a9 A[Catch: NoClassDefFoundError -> 0x02bb, InvalidViewPluginHostException -> 0x02bf, TryCatch #7 {InvalidViewPluginHostException -> 0x02bf, NoClassDefFoundError -> 0x02bb, blocks: (B:89:0x01b6, B:90:0x01bc, B:143:0x0285, B:145:0x0289, B:147:0x0297, B:149:0x029b, B:150:0x02a5, B:152:0x02a9, B:153:0x02b3, B:154:0x02ba, B:92:0x01c1, B:95:0x01c9, B:96:0x01d0, B:99:0x01d8, B:100:0x01df, B:103:0x01e7, B:104:0x01ee, B:107:0x01f6, B:108:0x01fd, B:111:0x0205, B:112:0x020c, B:115:0x0214, B:116:0x021a, B:119:0x0222, B:120:0x0228, B:123:0x022f, B:125:0x0244, B:126:0x024b, B:127:0x0252, B:130:0x0259, B:131:0x025e, B:134:0x0265, B:135:0x026b, B:138:0x0272, B:139:0x0278, B:142:0x027f), top: B:165:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b3 A[Catch: NoClassDefFoundError -> 0x02bb, InvalidViewPluginHostException -> 0x02bf, TryCatch #7 {InvalidViewPluginHostException -> 0x02bf, NoClassDefFoundError -> 0x02bb, blocks: (B:89:0x01b6, B:90:0x01bc, B:143:0x0285, B:145:0x0289, B:147:0x0297, B:149:0x029b, B:150:0x02a5, B:152:0x02a9, B:153:0x02b3, B:154:0x02ba, B:92:0x01c1, B:95:0x01c9, B:96:0x01d0, B:99:0x01d8, B:100:0x01df, B:103:0x01e7, B:104:0x01ee, B:107:0x01f6, B:108:0x01fd, B:111:0x0205, B:112:0x020c, B:115:0x0214, B:116:0x021a, B:119:0x0222, B:120:0x0228, B:123:0x022f, B:125:0x0244, B:126:0x024b, B:127:0x0252, B:130:0x0259, B:131:0x025e, B:134:0x0265, B:135:0x026b, B:138:0x0272, B:139:0x0278, B:142:0x027f), top: B:165:0x01b6 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0141 A[Catch: NoClassDefFoundError -> 0x015d, InvalidViewPluginHostException -> 0x0178, all -> 0x018b, TryCatch #6 {all -> 0x018b, blocks: (B:66:0x013a, B:68:0x0141, B:70:0x0145, B:71:0x014f, B:73:0x0153, B:84:0x0192, B:80:0x0178, B:75:0x0160, B:76:0x016d), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0145 A[Catch: NoClassDefFoundError -> 0x015d, InvalidViewPluginHostException -> 0x0178, all -> 0x018b, TryCatch #6 {all -> 0x018b, blocks: (B:66:0x013a, B:68:0x0141, B:70:0x0145, B:71:0x014f, B:73:0x0153, B:84:0x0192, B:80:0x0178, B:75:0x0160, B:76:0x016d), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f A[Catch: NoClassDefFoundError -> 0x015d, InvalidViewPluginHostException -> 0x0178, all -> 0x018b, TryCatch #6 {all -> 0x018b, blocks: (B:66:0x013a, B:68:0x0141, B:70:0x0145, B:71:0x014f, B:73:0x0153, B:84:0x0192, B:80:0x0178, B:75:0x0160, B:76:0x016d), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0153 A[Catch: NoClassDefFoundError -> 0x015d, InvalidViewPluginHostException -> 0x0178, all -> 0x018b, TryCatch #6 {all -> 0x018b, blocks: (B:66:0x013a, B:68:0x0141, B:70:0x0145, B:71:0x014f, B:73:0x0153, B:84:0x0192, B:80:0x0178, B:75:0x0160, B:76:0x016d), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0160 A[Catch: NoClassDefFoundError -> 0x015d, InvalidViewPluginHostException -> 0x0178, all -> 0x018b, TryCatch #6 {all -> 0x018b, blocks: (B:66:0x013a, B:68:0x0141, B:70:0x0145, B:71:0x014f, B:73:0x0153, B:84:0x0192, B:80:0x0178, B:75:0x0160, B:76:0x016d), top: B:163:0x013a }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void initializePlugins(MapInitOptions mapInitOptions, MapView mapView) throws Throwable {
        MapController mapController;
        MapPlugin mapboxLifecyclePluginImpl;
        MapController mapController2;
        MapView mapView2;
        MapPlugin mapboxLifecyclePluginImpl2;
        MapController mapController3 = this;
        mapInitOptions.getClass();
        Iterator<Plugin> it = mapInitOptions.getPlugins().iterator();
        while (it.hasNext()) {
            Plugin next = it.next();
            boolean platformTracingEnabled = com.mapbox.common.MapboxTracing.INSTANCE.getPlatformTracingEnabled();
            Iterator<Plugin> it2 = it;
            String str = VIEW_HIERARCHY_MISSING_TEMPLATE;
            if (platformTracingEnabled) {
                String str2 = next.id;
                Trace.beginSection("mbx: ".concat("maps-sdk: createPlugin: ".concat(str2)));
                try {
                    switch (str2.hashCode()) {
                        case -2043316830:
                            if (str2.equals("MAPBOX_LIFECYCLE_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new MapboxLifecyclePluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            try {
                                try {
                                    mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                                    if (next instanceof SemanticsActions) {
                                        if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                            getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                        } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                            getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Trace.endSection();
                                    throw th;
                                }
                            } catch (InvalidViewPluginHostException unused) {
                                MapboxLogger.logI(TAG, String.format(str, Arrays.copyOf(new Object[]{next}, 1)));
                            } catch (NoClassDefFoundError unused2) {
                                MapboxLogger.logI(TAG, String.format(PLUGIN_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{str2}, 1)));
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case -1778826934:
                            if (str2.equals("MAPBOX_COMPASS_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new CompassViewPlugin();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case -1553017881:
                            if (str2.equals("MAPBOX_ANNOTATION_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new AnnotationPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case -351591069:
                            if (str2.equals("MAPBOX_INDOOR_SELECTOR_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = IndoorUtils.createIndoorSelectorPlugin();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case -245209278:
                            if (str2.equals("MAPBOX_GESTURES_PLUGIN_ID")) {
                                Context context = mapInitOptions.getContext();
                                AttributeSet attrs = mapInitOptions.getAttrs();
                                float pixelRatio = mapInitOptions.getMapOptions().getPixelRatio();
                                context.getClass();
                                mapboxLifecyclePluginImpl2 = attrs != null ? new GesturesPluginImpl(context, attrs, pixelRatio) : new GesturesPluginImpl(context, pixelRatio);
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case -229667997:
                            if (str2.equals("MAPBOX_LOGO_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = LogoUtils.createLogoPlugin();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 571477697:
                            if (str2.equals("MAPBOX_SCALEBAR_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = ScaleBarUtils.createScaleBarPlugin();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 876236958:
                            if (str2.equals("MAPBOX_VIEWPORT_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new ViewportPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 962011255:
                            if (str2.equals("MAPBOX_ATTRIBUTION_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new AttributionPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 1272100549:
                            if (str2.equals("MAPBOX_MAP_OVERLAY_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new MapOverlayPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 1380638813:
                            if (str2.equals("MAPBOX_CAMERA_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new CameraAnimationsPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        case 1896827019:
                            if (str2.equals("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl2 = new LocationComponentPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl2 = next.instance;
                                if (mapboxLifecyclePluginImpl2 == null) {
                                    mapController2 = this;
                                    mapView2 = mapView;
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                        default:
                            mapboxLifecyclePluginImpl2 = next.instance;
                            if (mapboxLifecyclePluginImpl2 == null) {
                                mapController2 = this;
                                mapView2 = mapView;
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                            mapController2 = this;
                            mapView2 = mapView;
                            mapController2.createPlugin(mapView2, new getRegion(str2, mapboxLifecyclePluginImpl2));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl2 instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl2);
                                } else if (mapboxLifecyclePluginImpl2 instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl2);
                                }
                            }
                            Trace.endSection();
                            mapController = mapController2;
                            break;
                    }
                } catch (InvalidViewPluginHostException unused3) {
                    mapController2 = this;
                    mapView2 = mapView;
                    str = str;
                } catch (NoClassDefFoundError unused4) {
                    mapController2 = this;
                    mapView2 = mapView;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                mapController = mapController3;
                try {
                    String str3 = next.id;
                    switch (str3.hashCode()) {
                        case -2043316830:
                            if (str3.equals("MAPBOX_LIFECYCLE_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new MapboxLifecyclePluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case -1778826934:
                            if (str3.equals("MAPBOX_COMPASS_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new CompassViewPlugin();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case -1553017881:
                            if (str3.equals("MAPBOX_ANNOTATION_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new AnnotationPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case -351591069:
                            if (str3.equals("MAPBOX_INDOOR_SELECTOR_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = IndoorUtils.createIndoorSelectorPlugin();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case -245209278:
                            if (str3.equals("MAPBOX_GESTURES_PLUGIN_ID")) {
                                Context context2 = mapInitOptions.getContext();
                                AttributeSet attrs2 = mapInitOptions.getAttrs();
                                float pixelRatio2 = mapInitOptions.getMapOptions().getPixelRatio();
                                context2.getClass();
                                mapboxLifecyclePluginImpl = attrs2 != null ? new GesturesPluginImpl(context2, attrs2, pixelRatio2) : new GesturesPluginImpl(context2, pixelRatio2);
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case -229667997:
                            if (str3.equals("MAPBOX_LOGO_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = LogoUtils.createLogoPlugin();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 571477697:
                            if (str3.equals("MAPBOX_SCALEBAR_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = ScaleBarUtils.createScaleBarPlugin();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 876236958:
                            if (str3.equals("MAPBOX_VIEWPORT_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new ViewportPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 962011255:
                            if (str3.equals("MAPBOX_ATTRIBUTION_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new AttributionPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 1272100549:
                            if (str3.equals("MAPBOX_MAP_OVERLAY_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new MapOverlayPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 1380638813:
                            if (str3.equals("MAPBOX_CAMERA_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new CameraAnimationsPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        case 1896827019:
                            if (str3.equals("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID")) {
                                mapboxLifecyclePluginImpl = new LocationComponentPluginImpl();
                            } else {
                                mapboxLifecyclePluginImpl = next.instance;
                                if (mapboxLifecyclePluginImpl == null) {
                                    throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                                }
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                        default:
                            mapboxLifecyclePluginImpl = next.instance;
                            if (mapboxLifecyclePluginImpl == null) {
                                throw new MapboxConfigurationException("Custom non Mapbox plugins must have non-null `instance` parameter!");
                            }
                            mapController.createPlugin(mapView, new getRegion(next.id, mapboxLifecyclePluginImpl));
                            if (next instanceof SemanticsActions) {
                                if (mapboxLifecyclePluginImpl instanceof CameraAnimationsPlugin) {
                                    getMapboxMapDeprecated().setCameraAnimationsPlugin$maps_sdk_release((CameraAnimationsPlugin) mapboxLifecyclePluginImpl);
                                } else if (mapboxLifecyclePluginImpl instanceof GesturesPlugin) {
                                    getMapboxMapDeprecated().setGesturesPlugin$maps_sdk_release((GesturesPlugin) mapboxLifecyclePluginImpl);
                                }
                            }
                            break;
                    }
                } catch (InvalidViewPluginHostException unused5) {
                    MapboxLogger.logI(TAG, String.format(str, Arrays.copyOf(new Object[]{next}, 1)));
                } catch (NoClassDefFoundError unused6) {
                    MapboxLogger.logI(TAG, String.format(PLUGIN_MISSING_TEMPLATE, Arrays.copyOf(new Object[]{next.id}, 1)));
                }
            }
            mapController3 = mapController;
            it = it2;
        }
    }

    public final void onAttachedToWindow$maps_sdk_release(final MapView mapView) {
        mapView.getClass();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        if (mapPluginRegistry.mapboxLifecyclePlugin != null) {
            final ViewLifecycleOwner viewLifecycleOwner = new ViewLifecycleOwner(mapView);
            MapboxLogger.logD("MapboxLifecyclePlugin", "registerLifecycleObserver is called");
            final zzcp zzcpVar = new zzcp(4, mapView);
            mapView.getContext().registerComponentCallbacks(zzcpVar);
            viewLifecycleOwner.viewLifecycleRegistry.IconCompatParcelizer(new accessclearShadowCache() { // from class: com.mapbox.maps.plugin.lifecycle.MapboxLifecyclePluginImpl$registerLifecycleObserver$1
                @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_DESTROY)
                public final void onDestroy() {
                    supportsColorMatrixQuery lifecycle;
                    MapboxLogger.logI("MapboxLifecyclePlugin", "onDestroy is called, MapboxLifecycleObserver will be notified.");
                    mapView.onDestroy();
                    ViewLifecycleOwner viewLifecycleOwner2 = viewLifecycleOwner;
                    viewLifecycleOwner2.viewLifecycleRegistry.read(this);
                    accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = viewLifecycleOwner2.hostingLifecycleOwner;
                    if (accessisrendernodecompatiblecp != null && (lifecycle = accessisrendernodecompatiblecp.getLifecycle()) != null) {
                        lifecycle.read(viewLifecycleOwner2.hostingLifecycleObserver);
                    }
                    View view = (View) viewLifecycleOwner2.viewWeakReference.get();
                    if (view != null) {
                        view.removeOnAttachStateChangeListener(viewLifecycleOwner2.attachStateChangeListener);
                    }
                    mapView.getContext().unregisterComponentCallbacks(zzcpVar);
                }

                @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_RESUME)
                public final void onResume() {
                    MapboxLogger.logI("MapboxLifecyclePlugin", "onResume is called, MapboxLifecycleObserver will be notified.");
                    mapView.onResume();
                }

                @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_START)
                public final void onStart() {
                    MapboxLogger.logI("MapboxLifecyclePlugin", "onStart is called, MapboxLifecycleObserver will be notified.");
                    mapView.onStart();
                }

                @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_STOP)
                public final void onStop() {
                    MapboxLogger.logI("MapboxLifecyclePlugin", "onStop is called, MapboxLifecycleObserver will be notified.");
                    mapView.onStop();
                }
            });
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        Iterator it = mapPluginRegistry.gesturePlugins.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                GesturesPluginImpl gesturesPluginImpl = (GesturesPluginImpl) ((GesturesPlugin) it.next());
                gesturesPluginImpl.getClass();
                if (!gesturesPluginImpl.checkCleanedUp("onGenericMotionEvent") && (motionEvent.getSource() & 2) == 2 && motionEvent.getActionMasked() == 8 && gesturesPluginImpl.internalSettings.pinchToZoomEnabled) {
                    CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(gesturesPluginImpl.protectedCameraAnimatorOwners));
                    float axisValue = motionEvent.getAxisValue(9);
                    MapboxMap mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                    if (mapboxMap == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    double zoom = mapboxMap.getCameraState().getZoom();
                    CameraAnimationsPlugin cameraAnimationsPlugin2 = gesturesPluginImpl.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin2 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    ScreenCoordinate anchor = ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).getAnchor();
                    ScreenCoordinate screenCoordinateAccess$toScreenCoordinate = GesturesPluginImplKt.access$toScreenCoordinate(motionEvent);
                    if (gesturesPluginImpl.cameraAnimationsPlugin == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    double dLog = Math.log(axisValue) / displayInAppMessagelambda5.write;
                    CameraAnimationsPlugin cameraAnimationsPlugin3 = gesturesPluginImpl.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin3 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinateAccess$toScreenCoordinate).zoom(Double.valueOf(dLog + zoom)).build();
                    cameraOptionsBuild.getClass();
                    MapAnimationOptions mapAnimationOptions = GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS;
                    TuplesKt.easeTo$default(cameraAnimationsPlugin3, cameraOptionsBuild);
                    CameraAnimationsPlugin cameraAnimationsPlugin4 = gesturesPluginImpl.cameraAnimationsPlugin;
                    if (cameraAnimationsPlugin4 == null) {
                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin4).setAnchor(anchor);
                } else if (z) {
                }
                z = true;
            }
            return z;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void onSizeChanged(int i, int i2) {
        this.nativeMap.setSizeSet$maps_sdk_release(false);
        this.renderer.queueRenderEvent(new MapController$$ExternalSyntheticLambda4(i, i2, 0, this));
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        mapPluginRegistry.getClass();
        mapPluginRegistry.mapSize = new onViewAttachedToWindowlambda0(Integer.valueOf(i), Integer.valueOf(i2));
        Iterator it = mapPluginRegistry.mapSizePlugins.iterator();
        while (it.hasNext()) {
            ((MapSizePlugin) it.next()).onSizeChanged(i, i2);
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Iterator it = this.pluginRegistry.gesturePlugins.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                GesturesPluginImpl gesturesPluginImpl = (GesturesPluginImpl) ((GesturesPlugin) it.next());
                ArrayList arrayList = gesturesPluginImpl.scheduledAnimators;
                if (!gesturesPluginImpl.checkCleanedUp("onTouchEvent") && (motionEvent.getButtonState() == 0 || motionEvent.getButtonState() == 1)) {
                    if (motionEvent.getActionMasked() == 0) {
                        gesturesPluginImpl.unregisterScheduledAnimators();
                    }
                    AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                    if (androidGesturesManager == null) {
                        removeNodeAtDepth.serializer("gesturesManager");
                        throw null;
                    }
                    boolean z2 = false;
                    for (BaseGesture baseGesture : androidGesturesManager.detectors) {
                        MotionEvent motionEvent2 = baseGesture.previousEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            baseGesture.previousEvent = null;
                        }
                        MotionEvent motionEvent3 = baseGesture.currentEvent;
                        if (motionEvent3 != null) {
                            baseGesture.previousEvent = MotionEvent.obtain(motionEvent3);
                            baseGesture.currentEvent.recycle();
                            baseGesture.currentEvent = null;
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        baseGesture.currentEvent = motionEventObtain;
                        baseGesture.gestureDuration = motionEventObtain.getEventTime() - baseGesture.currentEvent.getDownTime();
                        if (baseGesture.analyzeEvent(motionEvent)) {
                            z2 = true;
                        }
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 1) {
                        gesturesPluginImpl.doubleTapFinished();
                        CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl.coreGesturesHandler;
                        if (coreGesturesHandler == null) {
                            removeNodeAtDepth.serializer("coreGesturesHandler");
                            throw null;
                        }
                        coreGesturesHandler.notifyCoreTouchEnded();
                        if (!arrayList.isEmpty()) {
                            gesturesPluginImpl.animationsTimeoutHandler.removeCallbacksAndMessages(null);
                            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
                            if (cameraAnimationsPlugin == null) {
                                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                throw null;
                            }
                            Object[] array = arrayList.toArray(new ValueAnimator[0]);
                            array.getClass();
                            ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) array;
                            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).registerAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((ValueAnimator) it2.next()).start();
                            }
                            arrayList.clear();
                        }
                    } else if (actionMasked == 3) {
                        arrayList.clear();
                        CoreGesturesHandler coreGesturesHandler2 = gesturesPluginImpl.coreGesturesHandler;
                        if (coreGesturesHandler2 == null) {
                            removeNodeAtDepth.serializer("coreGesturesHandler");
                            throw null;
                        }
                        coreGesturesHandler2.notifyCoreTouchEnded();
                        gesturesPluginImpl.doubleTapFinished();
                    } else if (actionMasked == 5) {
                        gesturesPluginImpl.doubleTapFinished();
                    }
                    if (z2) {
                        continue;
                    }
                    z = true;
                }
                if (z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void queueEvent(Runnable runnable, boolean z) {
        runnable.getClass();
        MapboxRenderer mapboxRenderer = this.renderer;
        if (z) {
            mapboxRenderer.queueRenderEvent(runnable);
        } else {
            mapboxRenderer.queueNonRenderEvent(runnable);
        }
    }

    public final void removeOnMaximumFpsChangedListener$maps_sdk_release(OnMaximumFpsChangedListener onMaximumFpsChangedListener) {
        onMaximumFpsChangedListener.getClass();
        this.maximumFpsListeners.remove(onMaximumFpsChangedListener);
    }

    public final void removePlugin(String str) {
        str.getClass();
        MapPluginRegistry mapPluginRegistry = this.pluginRegistry;
        LinkedHashMap linkedHashMap = mapPluginRegistry.plugins;
        if (mapPluginRegistry.isDestroyed) {
            MapboxLogger.logE("MapPluginRegistry", "removePlugin('" + str + "') called after destroy.");
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("removePlugin('", str, "') from thread '");
        sbM.append(Thread.currentThread().getName());
        sbM.append('\'');
        MapboxLogger.logD("MapPluginRegistry", sbM.toString());
        MapPlugin mapPlugin = (MapPlugin) linkedHashMap.get(str);
        if (mapPlugin instanceof MapCameraPlugin) {
            mapPluginRegistry.cameraPlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof GesturesPlugin) {
            mapPluginRegistry.gesturePlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapStyleObserverPlugin) {
            mapPluginRegistry.styleObserverPlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapSizePlugin) {
            mapPluginRegistry.mapSizePlugins.remove(mapPlugin);
        } else if (mapPlugin instanceof MapboxLifecyclePluginImpl) {
            mapPluginRegistry.mapboxLifecyclePlugin = null;
        }
        if (mapPlugin != null) {
            mapPlugin.cleanup();
        }
        linkedHashMap.remove(str);
        MapboxLogger.logI("MapPluginRegistry", "Removed plugin: " + str + " from the Map.");
    }

    @Override // com.mapbox.maps.MapControllable
    public void removeRendererSetupErrorListener(RendererSetupErrorListener rendererSetupErrorListener) {
        rendererSetupErrorListener.getClass();
        this.renderer.getRenderThread$maps_sdk_release().getRenderHandlerThread$maps_sdk_release().post(new MapController$$ExternalSyntheticLambda3(this, rendererSetupErrorListener, 1));
    }

    @Override // com.mapbox.maps.MapControllable
    public boolean removeWidget(Widget widget) {
        widget.getClass();
        boolean zRemoveWidget = this.renderer.getRenderThread$maps_sdk_release().removeWidget(widget);
        if (zRemoveWidget) {
            this.renderer.scheduleRepaint();
        }
        return zRemoveWidget;
    }

    public final void setLifecycleState$maps_sdk_release(LifecycleState lifecycleState) {
        lifecycleState.getClass();
        this.lifecycleState = lifecycleState;
    }

    @Override // com.mapbox.maps.MapControllable
    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        onFpsChangedListener.getClass();
        this.renderer.setOnFpsChangedListener(onFpsChangedListener);
    }

    @Override // com.mapbox.maps.MapControllable
    public void setRenderThreadStatsRecorder(RenderThreadStatsRecorder renderThreadStatsRecorder) {
        renderThreadStatsRecorder.getClass();
        this.renderer.getRenderThread$maps_sdk_release().setRenderThreadStatsRecorder$maps_sdk_release(renderThreadStatsRecorder);
    }

    @Override // com.mapbox.maps.MapControllable
    public void snapshot(MapView.OnSnapshotReady onSnapshotReady) {
        onSnapshotReady.getClass();
        this.renderer.snapshot(onSnapshotReady);
    }

    @Override // com.mapbox.maps.MapboxLifecycleObserver
    public void onLowMemory() {
        getMapboxMapDeprecated().reduceMemoryUse();
    }

    public static /* synthetic */ void initializePlugins$default(MapController mapController, MapInitOptions mapInitOptions, MapView mapView, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            mapView = null;
        }
        mapController.initializePlugins(mapInitOptions, mapView);
    }

    public final void clearMaximumFps$maps_sdk_release() {
        if (this.cachedMaximumFps != null) {
            this.cachedMaximumFps = null;
            this.renderer.clearMaximumFps();
            Iterator<T> it = this.maximumFpsListeners.iterator();
            while (it.hasNext()) {
                ((OnMaximumFpsChangedListener) it.next()).onMaximumFpsChanged(null);
            }
        }
    }

    @Override // com.mapbox.maps.MapControllable
    public void setMaximumFps(int i) {
        Integer num = this.cachedMaximumFps;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.cachedMaximumFps = Integer.valueOf(i);
        this.renderer.setMaximumFps(i);
        Iterator<T> it = this.maximumFpsListeners.iterator();
        while (it.hasNext()) {
            ((OnMaximumFpsChangedListener) it.next()).onMaximumFpsChanged(Integer.valueOf(i));
        }
    }

    public final void setScreenRefreshRate$maps_sdk_release(int i) {
        if (i <= 0) {
            MapboxLogger.logW(TAG, "Invalid refresh rate " + i + ". It must be positive!");
            return;
        }
        this.renderer.getRenderThread$maps_sdk_release().setScreenRefreshRate(i);
    }

    @Override // com.mapbox.maps.MapControllable
    public Bitmap snapshot() {
        return this.renderer.snapshot();
    }

    public MapController(MapboxRenderer mapboxRenderer, NativeObserver nativeObserver, MapInitOptions mapInitOptions, ContextMode contextMode, NativeMapImpl nativeMapImpl, MapboxMap mapboxMap, MapPluginRegistry mapPluginRegistry, StyleDataLoadedCallback styleDataLoadedCallback) {
        mapboxRenderer.getClass();
        nativeObserver.getClass();
        mapInitOptions.getClass();
        nativeMapImpl.getClass();
        mapboxMap.getClass();
        mapPluginRegistry.getClass();
        styleDataLoadedCallback.getClass();
        this.maximumFpsListeners = new CopyOnWriteArrayList<>();
        this.cancelableSubscriberSet = new CopyOnWriteArraySet<>();
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.lifecycleScope = YieldKt.write(YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read.IconCompatParcelizer())), new getInAppMessageViewLifecycleListener("MapControllerLifecycleScope"));
        this.lifecycleState = LifecycleState.STATE_STOPPED;
        this.renderer = mapboxRenderer;
        this.nativeObserver = nativeObserver;
        this.mapInitOptions = mapInitOptions;
        this.contextMode = contextMode;
        this.nativeMap = nativeMapImpl;
        this._mapboxMap = mapboxMap;
        this.pluginRegistry = mapPluginRegistry;
        this.cameraChangedCoalescedCallback = new MapboxNavigation$$ExternalSyntheticLambda4(1, mapPluginRegistry);
        this.styleDataLoadedCallback = styleDataLoadedCallback;
    }
}
