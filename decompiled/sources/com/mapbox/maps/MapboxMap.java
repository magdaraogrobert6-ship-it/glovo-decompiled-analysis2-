package com.mapbox.maps;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Handler;
import android.webkit.URLUtil;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.StyleContract$StyleExtension;
import com.mapbox.maps.extension.style.StyleExtensionImpl$Builder;
import com.mapbox.maps.extension.style.StyleExtensionImplKt;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.delegates.MapListenerDelegate;
import com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate;
import com.mapbox.maps.plugin.delegates.MapProjectionDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.plugin.delegates.listeners.OnCameraChangeListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapIdleListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadErrorListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameFinishedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameStartedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceAddedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceRemovedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageMissingListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageUnusedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleLoadedListener;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o.RtlBoundsComparator;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxMap extends MapboxStyleManager implements MapTransformDelegate, MapProjectionDelegate, MapFeatureQueryDelegate, MapListenerDelegate, MapPluginExtensionsDelegate, MapCameraManagerDelegate, MapInteractionDelegate {
    public static final Companion Companion = new Companion(null);
    public static final /* synthetic */ String QFE_CHILDREN = "children";
    public static final /* synthetic */ long QFE_DEFAULT_LIMIT = 10;
    public static final /* synthetic */ long QFE_DEFAULT_OFFSET = 0;
    public static final /* synthetic */ String QFE_EXPANSION_ZOOM = "expansion-zoom";
    public static final /* synthetic */ String QFE_LEAVES = "leaves";
    public static final /* synthetic */ String QFE_LIMIT = "limit";
    public static final /* synthetic */ String QFE_OFFSET = "offset";
    public static final /* synthetic */ String QFE_SUPER_CLUSTER = "supercluster";
    private static final String TAG = "Mbgl-MapboxMap";
    private Context accessibilityContext;
    private CameraAnimationsPlugin cameraAnimationsPlugin;
    private ComponentCallbacks configCallbacks;
    private float currentSystemFontScale;
    private GesturesPlugin gesturesPlugin;
    private final List<Cancelable> interactions;
    private boolean isMapValid;
    private boolean isStyleLoadInitiated;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private boolean performanceCollectionStatisticsStarted;
    private Handler renderHandler;
    private SymbolScaleBehavior scaleBehavior;
    private Style style;
    private final StyleObserver styleObserver;
    private final LogThrottlers throttlers;

    /* JADX INFO: renamed from: com.mapbox.maps.MapboxMap$cameraForCoordinates$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ CameraOptions $camera;
        final /* synthetic */ List<Point> $coordinates;
        final /* synthetic */ EdgeInsets $coordinatesPadding;
        final /* synthetic */ Double $maxZoom;
        final /* synthetic */ ScreenCoordinate $offset;
        final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $result;
        final /* synthetic */ MapboxMap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, MapboxMap mapboxMap, List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate) {
            super(0);
            this.$result = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            this.this$0 = mapboxMap;
            this.$coordinates = list;
            this.$camera = cameraOptions;
            this.$coordinatesPadding = edgeInsets;
            this.$maxZoom = d;
            this.$offset = screenCoordinate;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4701invoke() {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.$result;
            CameraOptions valueOrElse = this.this$0.nativeMap.cameraForCoordinates(MapboxMap.Companion.calculateBoundingBox(this.$coordinates), this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset).getValueOrElse(new MapboxMap$$ExternalSyntheticLambda13(this.$coordinates, this.$camera, this.$coordinatesPadding, this.$maxZoom, this.$offset, this.this$0, 1));
            valueOrElse.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(valueOrElse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CameraOptions invoke$lambda$1(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, String str) {
            list.getClass();
            cameraOptions.getClass();
            mapboxMap.getClass();
            str.getClass();
            MapboxLogger.logW(MapboxMap.TAG, "Error occurred in asynchronous cameraForCoordinates(coordinates: " + list + ", camera: " + cameraOptions + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d + ", offset: " + screenCoordinate + ", mapSize: " + mapboxMap.nativeMap.getSize() + "): " + str + ", empty cameraState will be returned");
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
            cameraOptionsBuild.getClass();
            return cameraOptionsBuild;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4701invoke();
            return createFromParcel.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$33() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIndoor$annotations() {
    }

    public static /* synthetic */ void getScaleBehavior$maps_sdk_release$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getSymbolScaleBehavior$annotations() {
    }

    private final void initializeStyleLoad(Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4) {
        this.style = null;
        this.styleObserver.setLoadStyleListener(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
        this.isStyleLoadInitiated = true;
    }

    private final void registerConfigurationObserver() {
        synchronized (this) {
            Context context = this.accessibilityContext;
            if (context == null) {
                return;
            }
            if (this.configCallbacks != null) {
                return;
            }
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: com.mapbox.maps.MapboxMap.registerConfigurationObserver.1
                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    configuration.getClass();
                    float f = configuration.fontScale;
                    if (f != MapboxMap.this.currentSystemFontScale && MapboxMap.this.isMapValid) {
                        MapboxMap.this.currentSystemFontScale = f;
                        MapboxMap.this.applyCurrentScale();
                    }
                }
            };
            this.configCallbacks = componentCallbacks;
            context.registerComponentCallbacks(componentCallbacks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFeatureState$lambda$39() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFeatureState$lambda$27() {
    }

    public final /* synthetic */ CameraAnimationsPlugin getCameraAnimationsPlugin$maps_sdk_release() {
        return this.cameraAnimationsPlugin;
    }

    public final /* synthetic */ GesturesPlugin getGesturesPlugin$maps_sdk_release() {
        return this.gesturesPlugin;
    }

    public final /* synthetic */ NativeObserver getNativeObserver$maps_sdk_release() {
        return this.nativeObserver;
    }

    public final /* synthetic */ Handler getRenderHandler$maps_sdk_release() {
        return this.renderHandler;
    }

    public final SymbolScaleBehavior getScaleBehavior$maps_sdk_release() {
        return this.scaleBehavior;
    }

    public final SymbolScaleBehavior getSymbolScaleBehavior() {
        return this.scaleBehavior;
    }

    public final /* synthetic */ boolean isStyleLoadInitiated$maps_sdk_release() {
        return this.isStyleLoadInitiated;
    }

    public final boolean isValid() {
        return this.isMapValid;
    }

    public final /* synthetic */ void setCameraAnimationsPlugin$maps_sdk_release(CameraAnimationsPlugin cameraAnimationsPlugin) {
        this.cameraAnimationsPlugin = cameraAnimationsPlugin;
    }

    public final /* synthetic */ void setGesturesPlugin$maps_sdk_release(GesturesPlugin gesturesPlugin) {
        this.gesturesPlugin = gesturesPlugin;
    }

    public final /* synthetic */ void setRenderHandler$maps_sdk_release(Handler handler) {
        this.renderHandler = handler;
    }

    public final /* synthetic */ void setStyle$maps_sdk_release(Style style) {
        this.style = style;
    }

    public final /* synthetic */ void setStyleLoadInitiated$maps_sdk_release(boolean z) {
        this.isStyleLoadInitiated = z;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
            asyncOperationResultCallback.getClass();
            MapsResourceOptions.clearData(asyncOperationResultCallback);
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver) {
            nativeMapImpl.getClass();
            nativeObserver.getClass();
            styleObserver.getClass();
            return new MapboxMap(nativeMapImpl, nativeObserver, styleObserver, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Point> calculateBoundingBox(List<Point> list) {
            if (list.size() <= 2) {
                return list;
            }
            double d = Double.NEGATIVE_INFINITY;
            double d2 = Double.POSITIVE_INFINITY;
            double d3 = Double.POSITIVE_INFINITY;
            double d4 = Double.NEGATIVE_INFINITY;
            for (Point point : list) {
                double dLongitude = point.longitude();
                double dLatitude = point.latitude();
                if (d2 > dLongitude) {
                    d2 = dLongitude;
                }
                if (d3 > dLatitude) {
                    d3 = dLatitude;
                }
                if (d < dLongitude) {
                    d = dLongitude;
                }
                if (d4 < dLatitude) {
                    d4 = dLatitude;
                }
            }
            return SQLite.read(Point.fromLngLat(d2, d3), Point.fromLngLat(d, d4));
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f) {
            nativeMapImpl.getClass();
            nativeObserver.getClass();
            return new MapboxMap(nativeMapImpl, nativeObserver, f, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCurrentScale() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mapping$maps_sdk_release = this.scaleBehavior.getMapping$maps_sdk_release();
        if (mapping$maps_sdk_release == null) {
            mapping$maps_sdk_release = SymbolScaleBehavior.Companion.getDefaultMapping$maps_sdk_release();
        }
        setScaleFactor(((Number) mapping$maps_sdk_release.invoke(Float.valueOf(this.currentSystemFontScale))).floatValue());
    }

    private final void checkNativeMap(String str, boolean z) {
        if (z) {
            ThreadChecker.INSTANCE.throwIfNotMainThread();
        }
        if (this.isMapValid) {
            return;
        }
        MapboxLogger.logW(TAG, ff$$ExternalSyntheticOutline0.m("MapboxMap object (accessing ", str, ") should not be stored and used after MapView is destroyed."), this.throttlers.get(str));
    }

    private final ScreenCoordinate clampScreenCoordinate(ScreenCoordinate screenCoordinate) {
        Size size = this.nativeMap.getSize();
        double x = screenCoordinate.getX();
        double y = screenCoordinate.getY();
        if (screenCoordinate.getX() < 0.0d || screenCoordinate.getX() > size.getWidth()) {
            x = MathKt.write(screenCoordinate.getX());
        }
        if (screenCoordinate.getY() < 0.0d || screenCoordinate.getY() > size.getHeight()) {
            y = MathKt.write(screenCoordinate.getY());
        }
        return (0.0d > x || x > ((double) size.getWidth()) || 0.0d > y || y > ((double) size.getHeight())) ? new ScreenCoordinate(-1.0d, -1.0d) : new ScreenCoordinate(x, y);
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        Companion.clearData(asyncOperationResultCallback);
    }

    private final void unregisterConfigurationObserver() {
        synchronized (this) {
            Context context = this.accessibilityContext;
            if (context == null) {
                return;
            }
            ComponentCallbacks componentCallbacks = this.configCallbacks;
            if (componentCallbacks != null) {
                try {
                    try {
                        context.unregisterComponentCallbacks(componentCallbacks);
                    } catch (Exception e) {
                        MapboxLogger.logW(TAG, "Failed to unregister configuration observer: " + e.getMessage());
                    }
                    this.configCallbacks = null;
                } catch (Throwable th) {
                    this.configCallbacks = null;
                    throw th;
                }
            }
        }
    }

    @MapboxExperimental
    public final MapboxMapRecorder createRecorder() {
        Expected<String, MapRecorder> expectedCreateInstance = MapRecorder.createInstance(this.nativeMap.getMap());
        if (expectedCreateInstance.isValue()) {
            MapRecorder value = expectedCreateInstance.getValue();
            value.getClass();
            return new MapboxMapRecorder(value);
        }
        String error = expectedCreateInstance.getError();
        if (error == null) {
            error = "Error occurred in MapboxMap.createRecorder!";
        }
        throw new RuntimeException(error);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final Map getNativeMap() {
        return this.nativeMap.getMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NativeObserver nativeObserver, MapLoadingError mapLoadingError) {
        nativeObserver.getClass();
        mapLoadingError.getClass();
        nativeObserver.sendMapLoadingError(mapLoadingError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapboxMap mapboxMap, MapLoadingError mapLoadingError) {
        mapboxMap.getClass();
        mapLoadingError.getClass();
        mapboxMap.nativeObserver.sendMapLoadingError(mapLoadingError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(MapboxMap mapboxMap, Style style) {
        mapboxMap.getClass();
        style.getClass();
        mapboxMap.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addInteraction$lambda$24(MapboxMap mapboxMap, Cancelable cancelable) {
        mapboxMap.getClass();
        cancelable.getClass();
        mapboxMap.interactions.remove(cancelable);
        cancelable.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$17(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, MapboxMap mapboxMap, String str) {
        list.getClass();
        cameraOptions.getClass();
        mapboxMap.getClass();
        str.getClass();
        MapboxLogger.logW(TAG, "Error occurred in synchronous cameraForCoordinates(coordinates: " + list + ", camera: " + cameraOptions + ", coordinatesPadding: " + edgeInsets + ", maxZoom: " + d + ", offset: " + screenCoordinate + ", mapSize: " + mapboxMap.nativeMap.getSize() + "): " + str + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$32$lambda$31(FeatureStateCallback featureStateCallback, FeaturesetFeature featuresetFeature, Expected expected) {
        featureStateCallback.getClass();
        featuresetFeature.getClass();
        expected.getClass();
        expected.onValue(new MapboxMap$$ExternalSyntheticLambda5(featuresetFeature, featureStateCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$32$lambda$31$lambda$30(FeatureStateCallback featureStateCallback, FeaturesetFeature featuresetFeature, Value value) {
        featureStateCallback.getClass();
        featuresetFeature.getClass();
        value.getClass();
        featureStateCallback.onFeatureState(featuresetFeature.getDescriptor().getFeatureState(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$36(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Expected expected) {
        featureStateCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        expected.getClass();
        expected.onValue(new MapboxMap$$ExternalSyntheticLambda7(featureStateCallback, typedFeaturesetDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$36$lambda$35(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Value value) {
        featureStateCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        value.getClass();
        featureStateCallback.onFeatureState(typedFeaturesetDescriptor.getFeatureState(value));
    }

    private final boolean isValidUri(String str) {
        return setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "mapbox://", true) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "asset://", true) || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "file://", true) || URLUtil.isValidUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$10(StyleContract$StyleExtension styleContract$StyleExtension, Style style) {
        styleContract$StyleExtension.getClass();
        style.getClass();
        BlockRunner blockRunner = (BlockRunner) styleContract$StyleExtension;
        Iterator it = blockRunner.getSources().iterator();
        while (it.hasNext()) {
            ((Source) it.next()).bindTo(style);
        }
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : blockRunner.getLayers()) {
            ((Layer) onviewattachedtowindowlambda0.serializer).bindTo(style, (LayerPosition) onviewattachedtowindowlambda0.write);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$13(StyleContract$StyleExtension styleContract$StyleExtension, Style style) {
        styleContract$StyleExtension.getClass();
        style.getClass();
        BlockRunner blockRunner = (BlockRunner) styleContract$StyleExtension;
        Iterator it = blockRunner.getImages().iterator();
        if (it.hasNext()) {
            ((RtlBoundsComparator) it.next()).getClass();
            throw null;
        }
        Iterator it2 = blockRunner.getModels().iterator();
        if (it2.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it2.next());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$7(StyleContract$StyleExtension styleContract$StyleExtension, Style style) {
        styleContract$StyleExtension.getClass();
        style.getClass();
        TransitionOptions transition = ((BlockRunner) styleContract$StyleExtension).getTransition();
        if (transition != null) {
            style.setStyleTransition(transition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$46(QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, Expected expected) {
        queryRenderedFeaturesetFeaturesCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        expected.getClass();
        expected.onValue(new MapboxMap$$ExternalSyntheticLambda12(typedFeaturesetDescriptor, queryRenderedFeaturesetFeaturesCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$46$lambda$45(QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor, List list) {
        queryRenderedFeaturesetFeaturesCallback.getClass();
        typedFeaturesetDescriptor.getClass();
        list.getClass();
        ArrayList<QueriedRenderedFeature> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((QueriedRenderedFeature) obj).getQueriedFeature().getFeature().geometry() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (QueriedRenderedFeature queriedRenderedFeature : arrayList) {
            Feature feature = queriedRenderedFeature.getQueriedFeature().getFeature();
            feature.getClass();
            FeaturesetFeatureId featuresetFeatureId = queriedRenderedFeature.getQueriedFeature().getFeaturesetFeatureId();
            String featureNamespace = featuresetFeatureId != null ? featuresetFeatureId.getFeatureNamespace() : null;
            Value state = queriedRenderedFeature.getQueriedFeature().getState();
            state.getClass();
            arrayList2.add(typedFeaturesetDescriptor.getFeaturesetFeature(feature, featureNamespace, state));
        }
        queryRenderedFeaturesetFeaturesCallback.onQueryRenderedFeatures(arrayList2);
    }

    public final /* synthetic */ Expected addViewAnnotation$maps_sdk_release(String str, ViewAnnotationOptions viewAnnotationOptions) {
        str.getClass();
        viewAnnotationOptions.getClass();
        checkNativeMap$default(this, "addViewAnnotation", false, 2, null);
        return this.nativeMap.addViewAnnotation(str, viewAnnotationOptions);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate
    public Object cameraAnimationsPlugin(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin != null) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cameraAnimationsPlugin);
        }
        MapboxLogger.logW(TAG, "Either camera plugin is not added to the MapView or MapView has already been destroyed; MapboxMap camera extension functions are no-op.");
        return null;
    }

    @MapboxDelicateApi
    public CameraOptions cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate) {
        list.getClass();
        cameraOptions.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        if (this.nativeMap.getSizeSet$maps_sdk_release()) {
            CameraOptions valueOrElse = this.nativeMap.cameraForCoordinates(Companion.calculateBoundingBox(list), cameraOptions, edgeInsets, d, screenCoordinate).getValueOrElse(new MapboxMap$$ExternalSyntheticLambda13(list, cameraOptions, edgeInsets, d, screenCoordinate, this, 0));
            valueOrElse.getClass();
            return valueOrElse;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraOptions cameraForDrag(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        checkNativeMap$default(this, "cameraForDrag", false, 2, null);
        return this.nativeMap.cameraForDrag(screenCoordinate, screenCoordinate2);
    }

    public Point coordinateForProjectedMeters(ProjectedMeters projectedMeters) {
        projectedMeters.getClass();
        Point pointCoordinateForProjectedMeters = Projection.coordinateForProjectedMeters(projectedMeters);
        pointCoordinateForProjectedMeters.getClass();
        return pointCoordinateForProjectedMeters;
    }

    @Override // com.mapbox.maps.plugin.delegates.MapPluginExtensionsDelegate
    public Object gesturesPlugin(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        GesturesPlugin gesturesPlugin = this.gesturesPlugin;
        if (gesturesPlugin != null) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(gesturesPlugin);
        }
        MapboxLogger.logW(TAG, "Either gestures plugin is not added to the MapView or MapView has already been destroyed; MapboxMap gestures extension functions are no-op.");
        return null;
    }

    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(FeaturesetFeature<FS> featuresetFeature, FeatureStateCallback<FS> featureStateCallback) {
        Cancelable featureState;
        featuresetFeature.getClass();
        featureStateCallback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null && (featureState = this.nativeMap.getFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, new MapboxMap$$ExternalSyntheticLambda5(featuresetFeature, featureStateCallback))) != null) {
            return featureState;
        }
        MapboxMap$$ExternalSyntheticLambda1 mapboxMap$$ExternalSyntheticLambda1 = new MapboxMap$$ExternalSyntheticLambda1(1);
        MapboxLogger.logW(TAG, "getFeatureState called but featuresetFeature.id is NULL!");
        return mapboxMap$$ExternalSyntheticLambda1;
    }

    public final Cancelable getGeoJsonClusterChildren(String str, Feature feature, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return this.nativeMap.queryFeatureExtensions(str, feature, QFE_SUPER_CLUSTER, QFE_CHILDREN, null, queryFeatureExtensionCallback);
    }

    public final Cancelable getGeoJsonClusterExpansionZoom(String str, Feature feature, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return this.nativeMap.queryFeatureExtensions(str, feature, QFE_SUPER_CLUSTER, QFE_EXPANSION_ZOOM, null, queryFeatureExtensionCallback);
    }

    public final Cancelable getGeoJsonClusterLeaves(String str, Feature feature, long j, long j2, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return this.nativeMap.queryFeatureExtensions(str, feature, QFE_SUPER_CLUSTER, QFE_LEAVES, onMove.serializer(new onViewAttachedToWindowlambda0(QFE_LIMIT, new Value(j)), new onViewAttachedToWindowlambda0(QFE_OFFSET, new Value(j2))), queryFeatureExtensionCallback);
    }

    public final void initializeAccessibility$maps_sdk_release(Context context) {
        context.getClass();
        this.accessibilityContext = context.getApplicationContext();
        this.currentSystemFontScale = context.getResources().getConfiguration().fontScale;
    }

    @onItemDismisslambda0
    public final void loadStyleJson(String str, Style.OnStyleLoaded onStyleLoaded) {
        str.getClass();
        onStyleLoaded.getClass();
        loadStyleUri(str, null, onStyleLoaded, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public MercatorCoordinate project(Point point, double d) {
        point.getClass();
        MercatorCoordinate mercatorCoordinateProject = Projection.project(point, d);
        mercatorCoordinateProject.getClass();
        return mercatorCoordinateProject;
    }

    public ProjectedMeters projectedMetersForCoordinate(Point point) {
        point.getClass();
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = Projection.projectedMetersForCoordinate(point);
        projectedMetersProjectedMetersForCoordinate.getClass();
        return projectedMetersProjectedMetersForCoordinate;
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Value value, QueryRenderedFeaturesetFeaturesCallback<FF> queryRenderedFeaturesetFeaturesCallback) {
        typedFeaturesetDescriptor.getClass();
        queryRenderedFeaturesetFeaturesCallback.getClass();
        checkNativeMap$default(this, "queryRenderedFeatures", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (renderedQueryGeometry == null) {
            renderedQueryGeometry = RenderedQueryGeometry.valueOf(new ScreenBox(new ScreenCoordinate(0.0d, 0.0d), new ScreenCoordinate(getSize().getWidth(), getSize().getHeight())));
        }
        renderedQueryGeometry.getClass();
        return nativeMapImpl.queryRenderedFeatures(renderedQueryGeometry, (List<FeaturesetQueryTarget>) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new FeaturesetQueryTarget(typedFeaturesetDescriptor.toFeaturesetDescriptor(), value, null)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), new MapboxMap$$ExternalSyntheticLambda12(typedFeaturesetDescriptor, queryRenderedFeaturesetFeaturesCallback));
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    @MapboxExperimental
    public Cancelable queryRenderedRasterValues(ScreenCoordinate screenCoordinate, RenderedRasterQueryOptions renderedRasterQueryOptions, QueryRenderedRasterValuesCallback queryRenderedRasterValuesCallback) {
        screenCoordinate.getClass();
        renderedRasterQueryOptions.getClass();
        queryRenderedRasterValuesCallback.getClass();
        checkNativeMap("queryRenderedRasterValues", false);
        return this.nativeMap.queryRenderedRasterValues(screenCoordinate, renderedRasterQueryOptions, queryRenderedRasterValuesCallback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    public Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback) {
        str.getClass();
        sourceQueryOptions.getClass();
        querySourceFeaturesCallback.getClass();
        checkNativeMap("querySourceFeatures", false);
        return this.nativeMap.querySourceFeatures(str, sourceQueryOptions, querySourceFeaturesCallback);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetFeature.getClass();
        featureStateOperationCallback.getClass();
        int i = 2;
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null) {
            Cancelable cancelableRemoveFeatureState = this.nativeMap.removeFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, fsk != null ? fsk.getKey() : null, featureStateOperationCallback);
            if (cancelableRemoveFeatureState != null) {
                return cancelableRemoveFeatureState;
            }
        }
        MapboxMap$$ExternalSyntheticLambda1 mapboxMap$$ExternalSyntheticLambda1 = new MapboxMap$$ExternalSyntheticLambda1(i);
        MapboxLogger.logW(TAG, "removeFeatureState called but featuresetFeature.id is NULL!");
        return mapboxMap$$ExternalSyntheticLambda1;
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> typedFeaturesetDescriptor, FeatureStateOperationCallback featureStateOperationCallback) {
        typedFeaturesetDescriptor.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(typedFeaturesetDescriptor.toFeaturesetDescriptor(), featureStateOperationCallback);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs, FeatureStateOperationCallback featureStateOperationCallback) {
        Cancelable featureState;
        featuresetFeature.getClass();
        fs.getClass();
        featureStateOperationCallback.getClass();
        int i = 0;
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null && (featureState = this.nativeMap.setFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, fs.getInternalState(), featureStateOperationCallback)) != null) {
            return featureState;
        }
        MapboxMap$$ExternalSyntheticLambda1 mapboxMap$$ExternalSyntheticLambda1 = new MapboxMap$$ExternalSyntheticLambda1(i);
        MapboxLogger.logW(TAG, "setFeatureState called but featuresetFeature.id is NULL!");
        return mapboxMap$$ExternalSyntheticLambda1;
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public <FS extends FeatureState> void setFeatureStateExpression(int i, TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, Value value, FS fs, FeatureStateOperationCallback featureStateOperationCallback) {
        typedFeaturesetDescriptor.getClass();
        value.getClass();
        fs.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "setFeatureStateExpression", false, 2, null);
        this.nativeMap.setFeatureStateExpression(i, typedFeaturesetDescriptor.toFeaturesetDescriptor(), value, fs.getInternalState(), featureStateOperationCallback);
    }

    public final void setScaleBehavior$maps_sdk_release(SymbolScaleBehavior symbolScaleBehavior) {
        symbolScaleBehavior.getClass();
        this.scaleBehavior = symbolScaleBehavior;
    }

    @MapboxExperimental
    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions performanceStatisticsOptions, PerformanceStatisticsCallback performanceStatisticsCallback) {
        performanceStatisticsOptions.getClass();
        performanceStatisticsCallback.getClass();
        checkNativeMap$default(this, "startPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.startPerformanceStatisticsCollection(performanceStatisticsOptions, performanceStatisticsCallback);
        this.performanceCollectionStatisticsStarted = true;
    }

    @MapboxExperimental
    public Cancelable subscribeGenericEvent(String str, GenericEventCallback genericEventCallback) {
        str.getClass();
        genericEventCallback.getClass();
        checkNativeMap$default(this, "subscribeGenericEvent", false, 2, null);
        return NativeObserver.subscribeGenericEvent$default(this.nativeObserver, str, genericEventCallback, null, 4, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public Point unproject(MercatorCoordinate mercatorCoordinate, double d) {
        mercatorCoordinate.getClass();
        Point pointUnproject = Projection.unproject(mercatorCoordinate, d);
        pointUnproject.getClass();
        return pointUnproject;
    }

    public final /* synthetic */ Expected updateViewAnnotation$maps_sdk_release(String str, ViewAnnotationOptions viewAnnotationOptions) {
        str.getClass();
        viewAnnotationOptions.getClass();
        checkNativeMap$default(this, "updateViewAnnotation", false, 2, null);
        return this.nativeMap.updateViewAnnotation(str, viewAnnotationOptions);
    }

    private final void applyStyle(String str) {
        boolean zIsValidUri = isValidUri(str);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (zIsValidUri) {
            nativeMapImpl.setStyleURI(str);
            return;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            str = "{}";
        }
        nativeMapImpl.setStyleJSON(str);
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return Projection.getMetersPerPixelAtLatitude(d, getCameraState().getZoom());
    }

    public final /* synthetic */ void onDestroy$maps_sdk_release() {
        unregisterConfigurationObserver();
        this.accessibilityContext = null;
        if (this.performanceCollectionStatisticsStarted) {
            stopPerformanceStatisticsCollection();
        }
        this.cameraAnimationsPlugin = null;
        this.gesturesPlugin = null;
        Iterator<T> it = this.interactions.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactions.clear();
        this.styleObserver.onDestroy();
        this.isMapValid = false;
        this.throttlers.clear();
    }

    public static /* synthetic */ void checkNativeMap$default(MapboxMap mapboxMap, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mapboxMap.checkNativeMap(str, z);
    }

    public final List<String> getAttributions() {
        checkNativeMap$default(this, "getAttributions", false, 2, null);
        return this.nativeMap.getAttributions();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraBounds getBounds() {
        checkNativeMap$default(this, "getBounds", false, 2, null);
        return this.nativeMap.getBounds();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public CameraState getCameraState() {
        checkNativeMap$default(this, "cameraState", false, 2, null);
        return this.nativeMap.getCameraState();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public MapCenterAltitudeMode getCenterAltitudeMode() {
        checkNativeMap$default(this, "getCenterAltitudeMode", false, 2, null);
        return this.nativeMap.getCenterAltitudeMode();
    }

    @onItemDismisslambda0
    public final List<MapDebugOptions> getDebug() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return this.nativeMap.getDebug();
    }

    public final Set<MapDebugOptions> getDebugOptions$maps_sdk_release() {
        checkNativeMap$default(this, "getDebug", false, 2, null);
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.nativeMap.getDebug());
    }

    public FreeCameraOptions getFreeCameraOptions() {
        checkNativeMap$default(this, "getFreeCameraOptions", false, 2, null);
        return this.nativeMap.getFreeCameraOptions();
    }

    public final IndoorManager getIndoor() {
        checkNativeMap$default(this, "indoor", false, 2, null);
        return this.nativeMap.getIndoorManager();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public MapOptions getMapOptions() {
        checkNativeMap$default(this, "getMapOptions", false, 2, null);
        return this.nativeMap.getMapOptions();
    }

    public final byte getPrefetchZoomDelta() {
        checkNativeMap$default(this, "getPrefetchZoomDelta", false, 2, null);
        return this.nativeMap.getPrefetchZoomDelta();
    }

    public final boolean getRenderWorldCopies() {
        checkNativeMap$default(this, "getRenderWorldCopies", false, 2, null);
        return this.nativeMap.getRenderWorldCopies();
    }

    public final float getScaleFactor$maps_sdk_release() {
        checkNativeMap$default(this, "getScaleFactor", false, 2, null);
        return this.nativeMap.getScaleFactor();
    }

    @MapboxExperimental
    public final List<Vec2> getScreenCullingShape() {
        checkNativeMap$default(this, "getScreenCullingShape", false, 2, null);
        return this.nativeMap.getScreenCullingShape();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public Size getSize() {
        checkNativeMap$default(this, "getSize", false, 2, null);
        return this.nativeMap.getSize();
    }

    @MapboxExperimental
    public final HashSet<String> getViewAnnotationAvoidLayers$maps_sdk_release() {
        checkNativeMap$default(this, "getViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.getViewAnnotationAvoidLayers();
    }

    public boolean isGestureInProgress() {
        checkNativeMap$default(this, "isGestureInProgress", false, 2, null);
        return this.nativeMap.isGestureInProgress();
    }

    public boolean isUserAnimationInProgress() {
        checkNativeMap$default(this, "isUserAnimationInProgress", false, 2, null);
        return this.nativeMap.isUserAnimationInProgress();
    }

    @onItemDismisslambda0
    public final void loadStyleUri(String str, final TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        str.getClass();
        loadStyle(StyleExtensionImplKt.style(str, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.MapboxMap.loadStyleUri.1
            {
                super(1);
            }

            public final void invoke(StyleExtensionImpl$Builder styleExtensionImpl$Builder) {
                styleExtensionImpl$Builder.getClass();
                TransitionOptions transitionOptions2 = transitionOptions;
                if (transitionOptions2 != null) {
                    TransitionOptions.Builder builder = new TransitionOptions.Builder();
                    transitionOptions2.toBuilder();
                    TransitionOptions transitionOptionsBuild = builder.build();
                    transitionOptionsBuild.getClass();
                    styleExtensionImpl$Builder.transition = transitionOptionsBuild;
                }
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StyleExtensionImpl$Builder) obj);
                return createFromParcel.INSTANCE;
            }
        }), onStyleLoaded);
    }

    private final void setScaleFactor(float f) {
        checkNativeMap$default(this, "setScaleFactor", false, 2, null);
        this.nativeMap.setScaleFactor(f);
    }

    public final void reduceMemoryUse() {
        checkNativeMap$default(this, "reduceMemoryUse", false, 2, null);
        this.nativeMap.reduceMemoryUse();
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setGestureInProgress(boolean z) {
        checkNativeMap$default(this, "setGestureInProgress", false, 2, null);
        this.nativeMap.setGestureInProgress(z);
    }

    public final void setPrefetchZoomDelta(byte b) {
        checkNativeMap$default(this, "setPrefetchZoomDelta", false, 2, null);
        this.nativeMap.setPrefetchZoomDelta(b);
    }

    public final void setRenderWorldCopies(boolean z) {
        checkNativeMap$default(this, "setRenderWorldCopies", false, 2, null);
        this.nativeMap.setRenderWorldCopies(z);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        checkNativeMap$default(this, "setTileCacheBudget", false, 2, null);
        this.nativeMap.setTileCacheBudget(tileCacheBudget);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    public void setUserAnimationInProgress(boolean z) {
        checkNativeMap$default(this, "setUserAnimationInProgress", false, 2, null);
        this.nativeMap.setUserAnimationInProgress(z);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers$maps_sdk_release(HashSet<String> hashSet) {
        checkNativeMap$default(this, "setViewAnnotationAvoidLayers", false, 2, null);
        return this.nativeMap.setViewAnnotationAvoidLayers(hashSet);
    }

    public final /* synthetic */ void setViewAnnotationPositionsUpdateListener$maps_sdk_release(DelegatingViewAnnotationPositionsUpdateListener delegatingViewAnnotationPositionsUpdateListener) {
        checkNativeMap$default(this, "setViewAnnotationPositionsUpdateListener", false, 2, null);
        this.nativeMap.setViewAnnotationPositionsUpdateListener(delegatingViewAnnotationPositionsUpdateListener);
    }

    @MapboxExperimental
    public final void stopPerformanceStatisticsCollection() {
        checkNativeMap$default(this, "stopPerformanceStatisticsCollection", false, 2, null);
        this.nativeMap.stopPerformanceStatisticsCollection();
        this.performanceCollectionStatisticsStarted = false;
    }

    public final void triggerRepaint() {
        checkNativeMap$default(this, "triggerRepaint", false, 2, null);
        this.nativeMap.triggerRepaint();
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f) {
        super(nativeMapImpl.getMap(), f, new PerseusInitializerImpl$$ExternalSyntheticLambda0(6, nativeObserver));
        this.isMapValid = true;
        this.throttlers = new LogThrottlers(0L, 1, null);
        this.interactions = new ArrayList();
        this.scaleBehavior = SymbolScaleBehavior.Companion.fixed(1.0f);
        this.currentSystemFontScale = 1.0f;
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = new StyleObserver(nativeMapImpl.getMap(), new MapboxMap$$ExternalSyntheticLambda22(0, this), nativeObserver, f, new PerseusInitializerImpl$$ExternalSyntheticLambda0(7, this));
    }

    public static /* synthetic */ Cancelable resetFeatureStates$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeatureStateOperationCallback featureStateOperationCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            featureStateOperationCallback = new MapboxMap$$ExternalSyntheticLambda0(27);
        }
        return mapboxMap.resetFeatureStates((TypedFeaturesetDescriptor<?, ?>) typedFeaturesetDescriptor, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            featureStateOperationCallback = new MapboxMap$$ExternalSyntheticLambda0(25);
        }
        return mapboxMap.setFeatureState((FeaturesetFeature<FeatureState>) featuresetFeature, featureState, featureStateOperationCallback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapInteractionDelegate
    @MapboxExperimental
    public Cancelable addInteraction(MapInteraction mapInteraction) {
        mapInteraction.getClass();
        checkNativeMap$default(this, "addInteraction", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        Interaction interaction = mapInteraction.coreInteraction;
        interaction.getClass();
        final Cancelable cancelableAddInteraction = nativeMapImpl.addInteraction(interaction);
        this.interactions.add(cancelableAddInteraction);
        return new Cancelable() { // from class: com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda16
            @Override // com.mapbox.common.Cancelable
            public final void cancel() {
                MapboxMap.addInteraction$lambda$24(this.f$0, cancelableAddInteraction);
            }
        };
    }

    @onItemDismisslambda0
    public void addOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        checkNativeMap$default(this, "addOnCameraChangeListener", false, 2, null);
        this.nativeObserver.addOnCameraChangeListener(onCameraChangeListener);
    }

    @onItemDismisslambda0
    public void addOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        checkNativeMap$default(this, "addOnMapIdleListener", false, 2, null);
        this.nativeObserver.addOnMapIdleListener(onMapIdleListener);
    }

    @onItemDismisslambda0
    public void addOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        checkNativeMap$default(this, "addOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.addOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @onItemDismisslambda0
    public void addOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        checkNativeMap$default(this, "addOnMapLoadedListener", false, 2, null);
        this.nativeObserver.addOnMapLoadedListener(onMapLoadedListener);
    }

    @onItemDismisslambda0
    public void addOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        checkNativeMap$default(this, "addOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @onItemDismisslambda0
    public void addOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        checkNativeMap$default(this, "addOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.addOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @onItemDismisslambda0
    public void addOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        checkNativeMap$default(this, "addOnSourceAddedListener", false, 2, null);
        this.nativeObserver.addOnSourceAddedListener(onSourceAddedListener);
    }

    @onItemDismisslambda0
    public void addOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        checkNativeMap$default(this, "addOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @onItemDismisslambda0
    public void addOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        checkNativeMap$default(this, "addOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.addOnSourceRemovedListener(onSourceRemovedListener);
    }

    @onItemDismisslambda0
    public void addOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        checkNativeMap$default(this, "addOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @onItemDismisslambda0
    public void addOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        checkNativeMap$default(this, "addOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.addOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @onItemDismisslambda0
    public void addOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        checkNativeMap$default(this, "addOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.addOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @onItemDismisslambda0
    public void addOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        checkNativeMap$default(this, "addOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.addOnStyleLoadedListener(onStyleLoadedListener);
    }

    @onItemDismisslambda0
    public CameraOptions cameraForCoordinateBounds(CoordinateBounds coordinateBounds, EdgeInsets edgeInsets, Double d, Double d2, Double d3, ScreenCoordinate screenCoordinate) {
        coordinateBounds.getClass();
        checkNativeMap$default(this, "cameraForCoordinateBounds", false, 2, null);
        return this.nativeMap.cameraForCoordinateBounds(coordinateBounds, edgeInsets, d, d2, d3, screenCoordinate);
    }

    @onItemDismisslambda0
    public CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets edgeInsets, Double d, Double d2) {
        geometry.getClass();
        checkNativeMap$default(this, "cameraForGeometry", false, 2, null);
        return this.nativeMap.cameraForGeometry(geometry, edgeInsets, d, d2);
    }

    public CoordinateBounds coordinateBoundsForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "coordinateBoundsForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsForCamera(cameraOptions);
    }

    public CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "coordinateBoundsForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsForCameraUnwrapped(cameraOptions);
    }

    public CoordinateBounds coordinateBoundsForRect(RectF rectF) {
        rectF.getClass();
        checkNativeMap$default(this, "coordinateBoundsForRect", false, 2, null);
        if (rectF.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("RectF must not be empty");
            return null;
        }
        List<Point> listCoordinatesForPixels = this.nativeMap.coordinatesForPixels((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new ScreenCoordinate[]{new ScreenCoordinate(rectF.bottom, rectF.left), new ScreenCoordinate(rectF.top, rectF.right)}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer()));
        return new CoordinateBounds(listCoordinatesForPixels.get(0), listCoordinatesForPixels.get(1));
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "coordinateBoundsZoomForCamera", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCamera(cameraOptions);
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "coordinateBoundsZoomForCameraUnwrapped", false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCameraUnwrapped(cameraOptions);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public Point coordinateForPixel(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        checkNativeMap$default(this, "coordinateForPixel", false, 2, null);
        return this.nativeMap.coordinateForPixel(screenCoordinate);
    }

    public CoordinateInfo coordinateInfoForPixel(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        checkNativeMap$default(this, "coordinateInfoForPixel", false, 2, null);
        return this.nativeMap.coordinateInfoForPixel(screenCoordinate);
    }

    public List<Point> coordinatesForPixels(List<ScreenCoordinate> list) {
        list.getClass();
        checkNativeMap$default(this, "coordinatesForPixels", false, 2, null);
        return this.nativeMap.coordinatesForPixels(new ArrayList(list));
    }

    public List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> list) {
        list.getClass();
        checkNativeMap$default(this, "coordinatesInfoForPixels", false, 2, null);
        return this.nativeMap.coordinatesInfoForPixels(list);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapInteractionDelegate
    @MapboxExperimental
    public void dispatch(PlatformEventInfo platformEventInfo) {
        platformEventInfo.getClass();
        checkNativeMap$default(this, "dispatch", false, 2, null);
        this.nativeMap.dispatch(platformEventInfo);
    }

    public void executeOnRenderThread(Runnable runnable) {
        runnable.getClass();
        checkNativeMap$default(this, "executeOnRenderThread", false, 2, null);
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public final Double getElevation(Point point) {
        point.getClass();
        checkNativeMap$default(this, "getElevation", false, 2, null);
        return this.nativeMap.getElevation(point);
    }

    public final void getStyle(Style.OnStyleLoaded onStyleLoaded) {
        onStyleLoaded.getClass();
        createFromParcel createfromparcel = null;
        checkNativeMap$default(this, "getStyle", false, 2, null);
        Style styleDeprecated = getStyleDeprecated();
        if (styleDeprecated != null) {
            onStyleLoaded.onStyleLoaded(styleDeprecated);
            createfromparcel = createFromParcel.INSTANCE;
        }
        if (createfromparcel == null) {
            this.styleObserver.addGetStyleListener(onStyleLoaded);
        }
    }

    public final /* synthetic */ Expected getViewAnnotationOptions$maps_sdk_release(String str) {
        str.getClass();
        checkNativeMap$default(this, "getViewAnnotationOptions", false, 2, null);
        return this.nativeMap.getViewAnnotationOptions(str);
    }

    public final void loadStyle(StyleContract$StyleExtension styleContract$StyleExtension, Style.OnStyleLoaded onStyleLoaded) {
        styleContract$StyleExtension.getClass();
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        initializeStyleLoad(onStyleLoaded, new MapboxMap$$ExternalSyntheticLambda2(0, styleContract$StyleExtension), new MapboxMap$$ExternalSyntheticLambda2(2, styleContract$StyleExtension), new MapboxMap$$ExternalSyntheticLambda2(1, styleContract$StyleExtension));
        applyStyle(((BlockRunner) styleContract$StyleExtension).getStyle());
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public ScreenCoordinate pixelForCoordinate(Point point) {
        point.getClass();
        checkNativeMap$default(this, "pixelForCoordinate", false, 2, null);
        return clampScreenCoordinate(this.nativeMap.pixelForCoordinate(point));
    }

    public List<ScreenCoordinate> pixelsForCoordinates(List<Point> list) {
        list.getClass();
        checkNativeMap$default(this, "pixelsForCoordinates", false, 2, null);
        List<ScreenCoordinate> listPixelsForCoordinates = this.nativeMap.pixelsForCoordinates(new ArrayList(list));
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listPixelsForCoordinates, 10));
        Iterator<T> it = listPixelsForCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(clampScreenCoordinate((ScreenCoordinate) it.next()));
        }
        return arrayList;
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public void removeFeatureStateExpression(int i, FeatureStateOperationCallback featureStateOperationCallback) {
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "removeFeatureStateExpression", false, 2, null);
        this.nativeMap.removeFeatureStateExpression(i, featureStateOperationCallback);
    }

    @onItemDismisslambda0
    public void removeOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        onCameraChangeListener.getClass();
        checkNativeMap$default(this, "removeOnCameraChangeListener", false, 2, null);
        this.nativeObserver.removeOnCameraChangeListener(onCameraChangeListener);
    }

    @onItemDismisslambda0
    public void removeOnMapIdleListener(OnMapIdleListener onMapIdleListener) {
        onMapIdleListener.getClass();
        checkNativeMap$default(this, "removeOnMapIdleListener", false, 2, null);
        this.nativeObserver.removeOnMapIdleListener(onMapIdleListener);
    }

    @onItemDismisslambda0
    public void removeOnMapLoadErrorListener(OnMapLoadErrorListener onMapLoadErrorListener) {
        onMapLoadErrorListener.getClass();
        checkNativeMap$default(this, "removeOnMapLoadErrorListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @onItemDismisslambda0
    public void removeOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        onMapLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnMapLoadedListener", false, 2, null);
        this.nativeObserver.removeOnMapLoadedListener(onMapLoadedListener);
    }

    @onItemDismisslambda0
    public void removeOnRenderFrameFinishedListener(OnRenderFrameFinishedListener onRenderFrameFinishedListener) {
        onRenderFrameFinishedListener.getClass();
        checkNativeMap$default(this, "removeOnRenderFrameFinishedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @onItemDismisslambda0
    public void removeOnRenderFrameStartedListener(OnRenderFrameStartedListener onRenderFrameStartedListener) {
        onRenderFrameStartedListener.getClass();
        checkNativeMap$default(this, "removeOnRenderFrameStartedListener", false, 2, null);
        this.nativeObserver.removeOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @onItemDismisslambda0
    public void removeOnSourceAddedListener(OnSourceAddedListener onSourceAddedListener) {
        onSourceAddedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceAddedListener", false, 2, null);
        this.nativeObserver.removeOnSourceAddedListener(onSourceAddedListener);
    }

    @onItemDismisslambda0
    public void removeOnSourceDataLoadedListener(OnSourceDataLoadedListener onSourceDataLoadedListener) {
        onSourceDataLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @onItemDismisslambda0
    public void removeOnSourceRemovedListener(OnSourceRemovedListener onSourceRemovedListener) {
        onSourceRemovedListener.getClass();
        checkNativeMap$default(this, "removeOnSourceRemovedListener", false, 2, null);
        this.nativeObserver.removeOnSourceRemovedListener(onSourceRemovedListener);
    }

    @onItemDismisslambda0
    public void removeOnStyleDataLoadedListener(OnStyleDataLoadedListener onStyleDataLoadedListener) {
        onStyleDataLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleDataLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @onItemDismisslambda0
    public void removeOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        onStyleImageMissingListener.getClass();
        checkNativeMap$default(this, "removeOnStyleImageMissingListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @onItemDismisslambda0
    public void removeOnStyleImageUnusedListener(OnStyleImageUnusedListener onStyleImageUnusedListener) {
        onStyleImageUnusedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleImageUnusedListener", false, 2, null);
        this.nativeObserver.removeOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @onItemDismisslambda0
    public void removeOnStyleLoadedListener(OnStyleLoadedListener onStyleLoadedListener) {
        onStyleLoadedListener.getClass();
        checkNativeMap$default(this, "removeOnStyleLoadedListener", false, 2, null);
        this.nativeObserver.removeOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected removeViewAnnotation$maps_sdk_release(String str) {
        str.getClass();
        checkNativeMap$default(this, "removeViewAnnotation", false, 2, null);
        return this.nativeMap.removeViewAnnotation(str);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public void resetFeatureStateExpressions(FeatureStateOperationCallback featureStateOperationCallback) {
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "resetFeatureStateExpressions", false, 2, null);
        this.nativeMap.resetFeatureStateExpressions(featureStateOperationCallback);
    }

    public Expected<String, None> setBounds(CameraBoundsOptions cameraBoundsOptions) {
        cameraBoundsOptions.getClass();
        checkNativeMap$default(this, "setBounds", false, 2, null);
        return this.nativeMap.setBounds(cameraBoundsOptions);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(cameraOptions);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapTransformDelegate
    @MapboxExperimental
    public void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        cameraAnimationHint.getClass();
        checkNativeMap$default(this, "setCameraAnimationHint", false, 2, null);
        this.nativeMap.setCameraAnimationHint(cameraAnimationHint);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode) {
        mapCenterAltitudeMode.getClass();
        checkNativeMap$default(this, "setCenterAltitudeMode", false, 2, null);
        this.nativeMap.setCenterAltitudeMode(mapCenterAltitudeMode);
    }

    public void setConstrainMode(ConstrainMode constrainMode) {
        constrainMode.getClass();
        checkNativeMap$default(this, "setConstrainMode", false, 2, null);
        this.nativeMap.setConstrainMode(constrainMode);
    }

    @onItemDismisslambda0
    public final void setDebug(List<? extends MapDebugOptions> list, boolean z) {
        list.getClass();
        checkNativeMap$default(this, "setDebug", false, 2, null);
        this.nativeMap.setDebug(list, z);
    }

    public final void setDebugOptions$maps_sdk_release(Set<? extends MapDebugOptions> set) {
        set.getClass();
        checkNativeMap$default(this, "setDebug", false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        nativeMapImpl.setDebug(nativeMapImpl.getDebug(), false);
        this.nativeMap.setDebug(onContentCardDismissed.PlaybackStateCompat(set), true);
    }

    public void setNorthOrientation(NorthOrientation northOrientation) {
        northOrientation.getClass();
        checkNativeMap$default(this, "setNorthOrientation", false, 2, null);
        this.nativeMap.setNorthOrientation(northOrientation);
    }

    @MapboxExperimental
    public final void setScreenCullingShape(List<Vec2> list) {
        list.getClass();
        checkNativeMap$default(this, "setScreenCullingShape", false, 2, null);
        this.nativeMap.setScreenCullingShape(list);
    }

    public final void setSymbolScaleBehavior(SymbolScaleBehavior symbolScaleBehavior) {
        symbolScaleBehavior.getClass();
        checkNativeMap$default(this, "symbolScaleBehavior", false, 2, null);
        this.scaleBehavior = symbolScaleBehavior;
        if (symbolScaleBehavior.isSystem$maps_sdk_release()) {
            registerConfigurationObserver();
            applyCurrentScale();
        } else if (symbolScaleBehavior.isFixed$maps_sdk_release()) {
            unregisterConfigurationObserver();
            Float scaleFactor$maps_sdk_release = symbolScaleBehavior.getScaleFactor$maps_sdk_release();
            if (scaleFactor$maps_sdk_release != null) {
                setScaleFactor(scaleFactor$maps_sdk_release.floatValue());
            }
        }
    }

    public void setViewportMode(ViewportMode viewportMode) {
        viewportMode.getClass();
        checkNativeMap$default(this, "setViewportMode", false, 2, null);
        this.nativeMap.setViewportMode(viewportMode);
    }

    public Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback) {
        cameraChangedCallback.getClass();
        checkNativeMap$default(this, "subscribeCameraChanged", false, 2, null);
        return NativeObserver.subscribeCameraChanged$default(this.nativeObserver, cameraChangedCallback, null, null, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapListenerDelegate
    @com.mapbox.annotation.MapboxExperimental
    public Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        cameraChangedCoalescedCallback.getClass();
        checkNativeMap$default(this, "subscribeCameraChangedCoalesced", false, 2, null);
        return NativeObserver.subscribeCameraChangedCoalesced$default(this.nativeObserver, cameraChangedCoalescedCallback, null, 2, null);
    }

    public Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback) {
        mapIdleCallback.getClass();
        checkNativeMap$default(this, "subscribeMapIdle", false, 2, null);
        return NativeObserver.subscribeMapIdle$default(this.nativeObserver, mapIdleCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback) {
        mapLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeMapLoaded", false, 2, null);
        return NativeObserver.subscribeMapLoaded$default(this.nativeObserver, mapLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        mapLoadingErrorCallback.getClass();
        checkNativeMap$default(this, "subscribeMapLoadingError", false, 2, null);
        return NativeObserver.subscribeMapLoadingError$default(this.nativeObserver, mapLoadingErrorCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        renderFrameFinishedCallback.getClass();
        checkNativeMap$default(this, "subscribeRenderFrameFinished", false, 2, null);
        return NativeObserver.subscribeRenderFrameFinished$default(this.nativeObserver, renderFrameFinishedCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback) {
        renderFrameStartedCallback.getClass();
        checkNativeMap$default(this, "subscribeRenderFrameStarted", false, 2, null);
        return NativeObserver.subscribeRenderFrameStarted$default(this.nativeObserver, renderFrameStartedCallback, null, null, 6, null);
    }

    public Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback) {
        resourceRequestCallback.getClass();
        checkNativeMap$default(this, "subscribeResourceRequest", false, 2, null);
        return NativeObserver.subscribeResourceRequest$default(this.nativeObserver, resourceRequestCallback, null, 2, null);
    }

    public Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback) {
        sourceAddedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceAdded", false, 2, null);
        return NativeObserver.subscribeSourceAdded$default(this.nativeObserver, sourceAddedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback) {
        sourceDataLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceDataLoaded", false, 2, null);
        return NativeObserver.subscribeSourceDataLoaded$default(this.nativeObserver, sourceDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback) {
        sourceRemovedCallback.getClass();
        checkNativeMap$default(this, "subscribeSourceRemoved", false, 2, null);
        return NativeObserver.subscribeSourceRemoved$default(this.nativeObserver, sourceRemovedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        styleDataLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleDataLoaded", false, 2, null);
        return NativeObserver.subscribeStyleDataLoaded$default(this.nativeObserver, styleDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        styleImageMissingCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleImageMissing", false, 2, null);
        return NativeObserver.subscribeStyleImageMissing$default(this.nativeObserver, styleImageMissingCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        styleImageRemoveUnusedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleImageRemoveUnused", false, 2, null);
        return NativeObserver.subscribeStyleImageRemoveUnused$default(this.nativeObserver, styleImageRemoveUnusedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        styleLoadedCallback.getClass();
        checkNativeMap$default(this, "subscribeStyleLoaded", false, 2, null);
        return NativeObserver.subscribeStyleLoaded$default(this.nativeObserver, styleLoadedCallback, null, null, 6, null);
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        checkNativeMap$default(this, "tileCover", false, 2, null);
        return this.nativeMap.tileCover(tileCoverOptions, cameraOptions);
    }

    @MapboxExperimental
    public final void whenSizeReady(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        checkNativeMap$default(this, "whenSizeReady", false, 2, null);
        this.nativeMap.whenMapSizeReady(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public static /* synthetic */ Cancelable queryRenderedFeatures$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Value value, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            renderedQueryGeometry = null;
        }
        if ((i & 4) != 0) {
            value = null;
        }
        return mapboxMap.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, value, queryRenderedFeaturesetFeaturesCallback);
    }

    @onItemDismisslambda0
    public final void loadStyleJson(String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        str.getClass();
        loadStyleUri(str, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @onItemDismisslambda0
    public final void loadStyleJson(String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        str.getClass();
        loadStyleUri(str, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            featureStateKey = null;
        }
        if ((i & 4) != 0) {
            featureStateOperationCallback = new MapboxMap$$ExternalSyntheticLambda0(23);
        }
        return mapboxMap.removeFeatureState(featuresetFeature, featureStateKey, featureStateOperationCallback);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapProjectionDelegate
    public double getMetersPerPixelAtLatitude(double d, double d2) {
        return Projection.getMetersPerPixelAtLatitude(d, d2);
    }

    @onItemDismisslambda0
    public final void loadStyleJson(String str) {
        str.getClass();
        loadStyleUri(str, null, null, null);
    }

    public static /* synthetic */ void initializeStyleLoad$default(MapboxMap mapboxMap, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i, Object obj) {
        if ((i & 1) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i & 8) != 0) {
            onStyleLoaded4 = null;
        }
        mapboxMap.initializeStyleLoad(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract$StyleExtension styleContract$StyleExtension, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            transitionOptions = null;
        }
        if ((i & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyle(styleContract$StyleExtension, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            transitionOptions = null;
        }
        if ((i & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleJson(str, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            transitionOptions = null;
        }
        if ((i & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 8) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleUri(str, transitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i, Object obj) {
        if ((i & 8) != 0) {
            featureStateOperationCallback = new MapboxMap$$ExternalSyntheticLambda0(0);
        }
        return mapboxMap.setFeatureState((TypedFeaturesetDescriptor<FeatureState, ?>) typedFeaturesetDescriptor, featuresetFeatureId, featureState, featureStateOperationCallback);
    }

    @onItemDismisslambda0
    public final void loadStyleUri(String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        str.getClass();
        loadStyleUri(str, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @onItemDismisslambda0
    public final void loadStyleUri(String str, Style.OnStyleLoaded onStyleLoaded) {
        str.getClass();
        onStyleLoaded.getClass();
        loadStyleUri(str, null, onStyleLoaded, null);
    }

    @onItemDismisslambda0
    public final void loadStyleUri(String str) {
        str.getClass();
        loadStyleUri(str, null, null, null);
    }

    public void setCamera(FreeCameraOptions freeCameraOptions) {
        freeCameraOptions.getClass();
        checkNativeMap$default(this, "setCamera", false, 2, null);
        this.nativeMap.setCamera(freeCameraOptions);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract$StyleExtension styleContract$StyleExtension, Style.OnStyleLoaded onStyleLoaded, int i, Object obj) {
        if ((i & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(styleContract$StyleExtension, onStyleLoaded);
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleJson(str, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyleUri(str, onStyleLoaded, onMapLoadErrorListener);
    }

    public static /* synthetic */ Cancelable getGeoJsonClusterLeaves$default(MapboxMap mapboxMap, String str, Feature feature, long j, long j2, QueryFeatureExtensionCallback queryFeatureExtensionCallback, int i, Object obj) {
        return mapboxMap.getGeoJsonClusterLeaves(str, feature, (i & 4) != 0 ? 10L : j, (i & 8) != 0 ? 0L : j2, queryFeatureExtensionCallback);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, int i, Object obj) {
        if ((i & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(str, onStyleLoaded);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            featureStateKey = null;
        }
        if ((i & 8) != 0) {
            featureStateOperationCallback = new MapboxMap$$ExternalSyntheticLambda0(26);
        }
        return mapboxMap.removeFeatureState(typedFeaturesetDescriptor, featuresetFeatureId, featureStateKey, featureStateOperationCallback);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, StyleContract$StyleExtension styleContract$StyleExtension, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener, int i, Object obj) {
        if ((i & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i & 4) != 0) {
            onMapLoadErrorListener = null;
        }
        mapboxMap.loadStyle(styleContract$StyleExtension, onStyleLoaded, onMapLoadErrorListener);
    }

    public Cancelable resetFeatureStates(String str, String str2, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "resetFeatureState", false, 2, null);
        return this.nativeMap.resetFeatureStates(str, str2, featureStateOperationCallback);
    }

    public final Cancelable resetFeatureStates(String str, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        featureStateOperationCallback.getClass();
        return resetFeatureStates(str, null, featureStateOperationCallback);
    }

    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> typedFeaturesetDescriptor) {
        typedFeaturesetDescriptor.getClass();
        return resetFeatureStates$default(this, typedFeaturesetDescriptor, null, 2, null);
    }

    /* JADX INFO: renamed from: getStyle, reason: merged with bridge method [inline-methods] */
    public final Style getStyleDeprecated() {
        checkNativeMap$default(this, "getStyle", false, 2, null);
        return this.style;
    }

    public final void loadStyle(String str) {
        str.getClass();
        loadStyle$default(this, str, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    public final void loadStyle(String str, Style.OnStyleLoaded onStyleLoaded) {
        str.getClass();
        checkNativeMap$default(this, "loadStyle", false, 2, null);
        initializeStyleLoad$default(this, onStyleLoaded, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda6
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                style.getClass();
            }
        }, null, null, 12, null);
        applyStyle(str);
    }

    public final void loadStyle(StyleContract$StyleExtension styleContract$StyleExtension) {
        styleContract$StyleExtension.getClass();
        loadStyle$default(this, styleContract$StyleExtension, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @onItemDismisslambda0
    public final void loadStyle(StyleContract$StyleExtension styleContract$StyleExtension, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleContract$StyleExtension.getClass();
        loadStyle(styleContract$StyleExtension, onStyleLoaded);
    }

    @onItemDismisslambda0
    public final void loadStyle(StyleContract$StyleExtension styleContract$StyleExtension, Style.OnStyleLoaded onStyleLoaded, OnMapLoadErrorListener onMapLoadErrorListener) {
        styleContract$StyleExtension.getClass();
        loadStyle(styleContract$StyleExtension, onStyleLoaded);
    }

    public final Cancelable getGeoJsonClusterLeaves(String str, Feature feature, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return getGeoJsonClusterLeaves$default(this, str, feature, 0L, 0L, queryFeatureExtensionCallback, 12, null);
    }

    public final Cancelable getGeoJsonClusterLeaves(String str, Feature feature, long j, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        queryFeatureExtensionCallback.getClass();
        return getGeoJsonClusterLeaves$default(this, str, feature, j, 0L, queryFeatureExtensionCallback, 8, null);
    }

    public final Cancelable getFeatureState(String str, String str2, QueryFeatureStateCallback queryFeatureStateCallback) {
        str.getClass();
        str2.getClass();
        queryFeatureStateCallback.getClass();
        return getFeatureState(str, null, str2, queryFeatureStateCallback);
    }

    public Cancelable getFeatureState(String str, String str2, String str3, QueryFeatureStateCallback queryFeatureStateCallback) {
        str.getClass();
        str3.getClass();
        queryFeatureStateCallback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(str, str2, str3, queryFeatureStateCallback);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk) {
        featuresetFeature.getClass();
        return removeFeatureState$default(this, featuresetFeature, fsk, null, 4, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureStateCallback<FS> featureStateCallback) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        featureStateCallback.getClass();
        checkNativeMap$default(this, "getFeatureState", false, 2, null);
        return this.nativeMap.getFeatureState(typedFeaturesetDescriptor.toFeaturesetDescriptor(), featuresetFeatureId, new MapboxMap$$ExternalSyntheticLambda7(featureStateCallback, typedFeaturesetDescriptor));
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        return removeFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, null, null, 12, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FS fs) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        fs.getClass();
        return setFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, fs, null, 8, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FSK fsk) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        return removeFeatureState$default(this, typedFeaturesetDescriptor, featuresetFeatureId, fsk, null, 8, null);
    }

    public Cancelable setFeatureState(String str, String str2, String str3, Value value, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str3.getClass();
        value.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(str, str2, str3, value, featureStateOperationCallback);
    }

    public Cancelable removeFeatureState(String str, String str2, String str3, String str4, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str3.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(str, str2, str3, str4, featureStateOperationCallback);
    }

    public final Cancelable setFeatureState(String str, String str2, Value value, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str2.getClass();
        value.getClass();
        featureStateOperationCallback.getClass();
        return setFeatureState(str, null, str2, value, featureStateOperationCallback);
    }

    public final Cancelable removeFeatureState(String str, String str2, String str3, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str3.getClass();
        featureStateOperationCallback.getClass();
        return removeFeatureState(str, str2, str3, null, featureStateOperationCallback);
    }

    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS fs) {
        featuresetFeature.getClass();
        fs.getClass();
        return setFeatureState$default(this, featuresetFeature, fs, null, 4, null);
    }

    public final Cancelable removeFeatureState(String str, String str2, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str2.getClass();
        featureStateOperationCallback.getClass();
        return removeFeatureState(str, null, str2, null, featureStateOperationCallback);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FS fs, FeatureStateOperationCallback featureStateOperationCallback) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        fs.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "setFeatureState", false, 2, null);
        return this.nativeMap.setFeatureState(typedFeaturesetDescriptor.toFeaturesetDescriptor(), featuresetFeatureId, fs.getInternalState(), featureStateOperationCallback);
    }

    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature) {
        featuresetFeature.getClass();
        return removeFeatureState$default(this, featuresetFeature, null, null, 6, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FSK fsk, FeatureStateOperationCallback featureStateOperationCallback) {
        typedFeaturesetDescriptor.getClass();
        featuresetFeatureId.getClass();
        featureStateOperationCallback.getClass();
        checkNativeMap$default(this, "removeFeatureState", false, 2, null);
        return this.nativeMap.removeFeatureState(typedFeaturesetDescriptor.toFeaturesetDescriptor(), featuresetFeatureId, fsk != null ? fsk.getKey() : null, featureStateOperationCallback);
    }

    @onItemDismisslambda0
    public CameraOptions cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, ScreenBox screenBox) {
        list.getClass();
        cameraOptions.getClass();
        screenBox.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(Companion.calculateBoundingBox(list), cameraOptions, screenBox);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    @onItemDismisslambda0
    public CameraOptions cameraForCoordinates(List<Point> list, EdgeInsets edgeInsets, Double d, Double d2) {
        list.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        return this.nativeMap.cameraForCoordinates(Companion.calculateBoundingBox(list), edgeInsets, d, d2);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, styleObserver);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate
    public void cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        list.getClass();
        cameraOptions.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        checkNativeMap$default(this, "cameraForCoordinates", false, 2, null);
        this.nativeMap.whenMapSizeReady(new AnonymousClass3(r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, list, cameraOptions, edgeInsets, d, screenCoordinate));
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver) {
        super(nativeMapImpl.getMap(), 1.0f, new MapboxMap$$ExternalSyntheticLambda0(24));
        this.isMapValid = true;
        this.throttlers = new LogThrottlers(0L, 1, null);
        this.interactions = new ArrayList();
        this.scaleBehavior = SymbolScaleBehavior.Companion.fixed(1.0f);
        this.currentSystemFontScale = 1.0f;
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = styleObserver;
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback<FF> queryRenderedFeaturesetFeaturesCallback) {
        typedFeaturesetDescriptor.getClass();
        queryRenderedFeaturesetFeaturesCallback.getClass();
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, null, null, queryRenderedFeaturesetFeaturesCallback, 6, null);
    }

    @Override // com.mapbox.maps.plugin.delegates.MapFeatureQueryDelegate
    public Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback) {
        renderedQueryGeometry.getClass();
        renderedQueryOptions.getClass();
        queryRenderedFeaturesCallback.getClass();
        checkNativeMap("queryRenderedFeatures", false);
        return this.nativeMap.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, queryRenderedFeaturesCallback);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, f);
    }

    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, QueryRenderedFeaturesetFeaturesCallback<FF> queryRenderedFeaturesetFeaturesCallback) {
        typedFeaturesetDescriptor.getClass();
        queryRenderedFeaturesetFeaturesCallback.getClass();
        return queryRenderedFeatures$default(this, typedFeaturesetDescriptor, renderedQueryGeometry, null, queryRenderedFeaturesetFeaturesCallback, 4, null);
    }
}
