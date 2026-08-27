package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Map extends CameraManager {

    /* JADX INFO: loaded from: classes4.dex */
    public static class MapPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Map.cleanNativePeer(this.peer);
        }

        public MapPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native RenderBackendType getSupportedRenderBackend();

    private native void initialize(MapClient mapClient, MapOptions mapOptions);

    private static native void nativeSelfRegister();

    public native Cancelable addInteraction(Interaction interaction);

    public native Expected<String, None> addViewAnnotation(String str, ViewAnnotationOptions viewAnnotationOptions);

    public native void createRenderer();

    public native IVulkanManager createVulkanManager();

    public native void destroyRenderer();

    public native void dispatch(PlatformEventInfo platformEventInfo);

    public native List<String> getAttributions();

    public native MapCenterAltitudeMode getCenterAltitudeMode();

    public native List<MapDebugOptions> getDebug();

    public native Double getElevation(Point point);

    public native Cancelable getFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, QueryFeatureStateCallback queryFeatureStateCallback);

    public native Cancelable getFeatureState(String str, String str2, String str3, QueryFeatureStateCallback queryFeatureStateCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native IndoorManager getIndoorManager();

    public native MapOptions getMapOptions();

    public long getNativePtr() {
        return this.peer;
    }

    public native byte getPrefetchZoomDelta();

    @com.mapbox.annotation.MapboxExperimental
    public native float getScaleFactor();

    @com.mapbox.annotation.MapboxExperimental
    public native List<Vec2> getScreenCullingShape();

    public native Size getSize();

    @com.mapbox.annotation.MapboxExperimental
    public native HashSet<String> getViewAnnotationAvoidLayers();

    public native Expected<String, ViewAnnotationOptions> getViewAnnotationOptions(String str);

    public native boolean isGestureInProgress();

    public native boolean isUserAnimationInProgress();

    public native Cancelable queryFeatureExtensions(String str, Feature feature, String str2, String str3, HashMap<String, Value> map, QueryFeatureExtensionCallback queryFeatureExtensionCallback);

    public native Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback);

    public native Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, List<FeaturesetQueryTarget> list, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native Cancelable queryRenderedRasterValues(ScreenCoordinate screenCoordinate, RenderedRasterQueryOptions renderedRasterQueryOptions, QueryRenderedRasterValuesCallback queryRenderedRasterValuesCallback);

    public native Cancelable querySourceFeatures(FeaturesetQueryTarget featuresetQueryTarget, QuerySourceFeaturesCallback querySourceFeaturesCallback);

    public native Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback);

    public native void reduceMemoryUse();

    public native Cancelable removeFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, String str, FeatureStateOperationCallback featureStateOperationCallback);

    public native Cancelable removeFeatureState(String str, String str2, String str3, String str4, FeatureStateOperationCallback featureStateOperationCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native void removeFeatureStateExpression(long j, FeatureStateOperationCallback featureStateOperationCallback);

    public native Expected<String, None> removeViewAnnotation(String str);

    public native void render();

    @com.mapbox.annotation.MapboxExperimental
    public native void resetFeatureStateExpressions(FeatureStateOperationCallback featureStateOperationCallback);

    public native Cancelable resetFeatureStates(FeaturesetDescriptor featuresetDescriptor, FeatureStateOperationCallback featureStateOperationCallback);

    public native Cancelable resetFeatureStates(String str, String str2, FeatureStateOperationCallback featureStateOperationCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native void resetThreadServiceType();

    @com.mapbox.annotation.MapboxExperimental
    public native void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint);

    public native void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode);

    public native void setConstrainMode(ConstrainMode constrainMode);

    public native void setDebug(List<MapDebugOptions> list, boolean z);

    public native Cancelable setFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, Value value, FeatureStateOperationCallback featureStateOperationCallback);

    public native Cancelable setFeatureState(String str, String str2, String str3, Value value, FeatureStateOperationCallback featureStateOperationCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native void setFeatureStateExpression(long j, FeaturesetDescriptor featuresetDescriptor, Value value, Value value2, FeatureStateOperationCallback featureStateOperationCallback);

    public native void setGestureInProgress(boolean z);

    public native void setNorthOrientation(NorthOrientation northOrientation);

    public native void setPrefetchZoomDelta(byte b);

    @com.mapbox.annotation.MapboxExperimental
    public native void setScaleFactor(float f);

    @com.mapbox.annotation.MapboxExperimental
    public native void setScreenCullingShape(List<Vec2> list);

    public native void setSize(Size size);

    public native void setTileCacheBudget(TileCacheBudget tileCacheBudget);

    public native void setUserAnimationInProgress(boolean z);

    @com.mapbox.annotation.MapboxExperimental
    public native Expected<String, None> setViewAnnotationAvoidLayers(HashSet<String> hashSet);

    public native void setViewAnnotationPositionsUpdateListener(ViewAnnotationPositionsUpdateListener viewAnnotationPositionsUpdateListener);

    public native void setViewportMode(ViewportMode viewportMode);

    public native void startPerformanceStatisticsCollection(PerformanceStatisticsOptions performanceStatisticsOptions, PerformanceStatisticsCallback performanceStatisticsCallback);

    public native void stopPerformanceStatisticsCollection();

    public native void triggerRepaint();

    public native Expected<String, None> updateViewAnnotation(String str, ViewAnnotationOptions viewAnnotationOptions);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Map(MapClient mapClient, MapOptions mapOptions) {
        super(0L);
        initialize(mapClient, mapOptions);
    }

    public Map(long j) {
        super(0L);
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapPeerCleaner(j));
    }
}
