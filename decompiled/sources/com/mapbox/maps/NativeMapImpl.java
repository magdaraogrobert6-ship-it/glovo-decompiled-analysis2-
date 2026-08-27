package com.mapbox.maps;

import android.os.Handler;
import android.os.Looper;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeMapImpl {
    private final Handler mainHandler;
    private final Map map;
    private volatile boolean sizeSet;
    private CopyOnWriteArrayList<r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0> sizeSetCallbackList;

    public final Map getMap() {
        return this.map;
    }

    public final boolean getSizeSet$maps_sdk_release() {
        return this.sizeSet;
    }

    public final void createRenderer() {
        this.map.createRenderer();
    }

    public final void destroyRenderer() {
        this.map.destroyRenderer();
    }

    public final List<String> getAttributions() {
        List<String> attributions = this.map.getAttributions();
        attributions.getClass();
        return attributions;
    }

    public final CameraBounds getBounds() {
        CameraBounds bounds = this.map.getBounds();
        bounds.getClass();
        return bounds;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = this.map.getCameraState();
        cameraState.getClass();
        return cameraState;
    }

    public final MapCenterAltitudeMode getCenterAltitudeMode() {
        MapCenterAltitudeMode centerAltitudeMode = this.map.getCenterAltitudeMode();
        centerAltitudeMode.getClass();
        return centerAltitudeMode;
    }

    public final List<MapDebugOptions> getDebug() {
        List<MapDebugOptions> debug = this.map.getDebug();
        debug.getClass();
        return debug;
    }

    public final FreeCameraOptions getFreeCameraOptions() {
        FreeCameraOptions freeCameraOptions = this.map.getFreeCameraOptions();
        freeCameraOptions.getClass();
        return freeCameraOptions;
    }

    @MapboxExperimental
    public final IndoorManager getIndoorManager() {
        IndoorManager indoorManager = this.map.getIndoorManager();
        indoorManager.getClass();
        return indoorManager;
    }

    public final MapOptions getMapOptions() {
        MapOptions mapOptions = this.map.getMapOptions();
        mapOptions.getClass();
        return mapOptions;
    }

    public final byte getPrefetchZoomDelta() {
        return this.map.getPrefetchZoomDelta();
    }

    public final boolean getRenderWorldCopies() {
        return this.map.getRenderWorldCopies();
    }

    @MapboxExperimental
    public final float getScaleFactor() {
        return this.map.getScaleFactor();
    }

    public final List<Vec2> getScreenCullingShape() {
        List<Vec2> screenCullingShape = this.map.getScreenCullingShape();
        screenCullingShape.getClass();
        return screenCullingShape;
    }

    public final Size getSize() {
        Size size = this.map.getSize();
        size.getClass();
        return size;
    }

    public final CameraOptions getStyleDefaultCamera() {
        CameraOptions styleDefaultCamera = this.map.getStyleDefaultCamera();
        styleDefaultCamera.getClass();
        return styleDefaultCamera;
    }

    public final String getStyleJSON() {
        String styleJSON = this.map.getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public final List<StyleObjectInfo> getStyleLayers() {
        List<StyleObjectInfo> styleLayers = this.map.getStyleLayers();
        styleLayers.getClass();
        return styleLayers;
    }

    public final List<StyleObjectInfo> getStyleLights() {
        List<StyleObjectInfo> styleLights = this.map.getStyleLights();
        styleLights.getClass();
        return styleLights;
    }

    public final List<StyleObjectInfo> getStyleSources() {
        List<StyleObjectInfo> styleSources = this.map.getStyleSources();
        styleSources.getClass();
        return styleSources;
    }

    public final TransitionOptions getStyleTransition() {
        TransitionOptions styleTransition = this.map.getStyleTransition();
        styleTransition.getClass();
        return styleTransition;
    }

    public final String getStyleURI() {
        String styleURI = this.map.getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    public final HashSet<String> getViewAnnotationAvoidLayers() {
        HashSet<String> viewAnnotationAvoidLayers = this.map.getViewAnnotationAvoidLayers();
        viewAnnotationAvoidLayers.getClass();
        return viewAnnotationAvoidLayers;
    }

    public final IVulkanManager getVulkanManager() {
        return this.map.createVulkanManager();
    }

    public final boolean isGestureInProgress() {
        return this.map.isGestureInProgress();
    }

    public final boolean isStyleLoaded() {
        return this.map.isStyleLoaded();
    }

    public final boolean isUserAnimationInProgress() {
        return this.map.isUserAnimationInProgress();
    }

    public final void reduceMemoryUse() {
        this.map.reduceMemoryUse();
    }

    public final void render() {
        this.map.render();
    }

    @MapboxExperimental
    public final void resetThreadServiceType() {
        this.map.resetThreadServiceType();
    }

    public final void setGestureInProgress(boolean z) {
        this.map.setGestureInProgress(z);
    }

    public final void setPrefetchZoomDelta(byte b) {
        this.map.setPrefetchZoomDelta(b);
    }

    public final void setRenderWorldCopies(boolean z) {
        this.map.setRenderWorldCopies(z);
    }

    @MapboxExperimental
    public final void setScaleFactor(float f) {
        this.map.setScaleFactor(f);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        this.map.setTileCacheBudget(tileCacheBudget);
    }

    public final void setUserAnimationInProgress(boolean z) {
        this.map.setUserAnimationInProgress(z);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers(HashSet<String> hashSet) {
        Expected<String, None> viewAnnotationAvoidLayers = this.map.setViewAnnotationAvoidLayers(hashSet);
        viewAnnotationAvoidLayers.getClass();
        return viewAnnotationAvoidLayers;
    }

    public final void setViewAnnotationPositionsUpdateListener(ViewAnnotationPositionsUpdateListener viewAnnotationPositionsUpdateListener) {
        this.map.setViewAnnotationPositionsUpdateListener(viewAnnotationPositionsUpdateListener);
    }

    public final void stopPerformanceStatisticsCollection() {
        this.map.stopPerformanceStatisticsCollection();
    }

    public final void triggerRepaint() {
        this.map.triggerRepaint();
    }

    public NativeMapImpl(Map map) {
        map.getClass();
        this.map = map;
        this.sizeSetCallbackList = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_sizeSet_$lambda$1(NativeMapImpl nativeMapImpl) {
        nativeMapImpl.getClass();
        if (nativeMapImpl.sizeSet) {
            Iterator<T> it = nativeMapImpl.sizeSetCallbackList.iterator();
            while (it.hasNext()) {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it.next()).invoke();
            }
            nativeMapImpl.sizeSetCallbackList.clear();
        }
    }

    public final Cancelable addInteraction(Interaction interaction) {
        interaction.getClass();
        Cancelable cancelableAddInteraction = this.map.addInteraction(interaction);
        cancelableAddInteraction.getClass();
        return cancelableAddInteraction;
    }

    public final Expected<String, None> addPersistentStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.map.addPersistentStyleCustomLayer(str, customLayerHost, layerPosition);
        expectedAddPersistentStyleCustomLayer.getClass();
        return expectedAddPersistentStyleCustomLayer;
    }

    public final Expected<String, None> addPersistentStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        Expected<String, None> expectedAddPersistentStyleLayer = this.map.addPersistentStyleLayer(value, layerPosition);
        expectedAddPersistentStyleLayer.getClass();
        return expectedAddPersistentStyleLayer;
    }

    public final Expected<String, None> addStyleCustomGeometrySource(String str, CustomGeometrySourceOptions customGeometrySourceOptions) {
        str.getClass();
        customGeometrySourceOptions.getClass();
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.map.addStyleCustomGeometrySource(str, customGeometrySourceOptions);
        expectedAddStyleCustomGeometrySource.getClass();
        return expectedAddStyleCustomGeometrySource;
    }

    public final Expected<String, None> addStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        Expected<String, None> expectedAddStyleCustomLayer = this.map.addStyleCustomLayer(str, customLayerHost, layerPosition);
        expectedAddStyleCustomLayer.getClass();
        return expectedAddStyleCustomLayer;
    }

    public final Expected<String, None> addStyleImage(String str, float f, Image image, boolean z, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent) {
        str.getClass();
        image.getClass();
        list.getClass();
        list2.getClass();
        Expected<String, None> expectedAddStyleImage = this.map.addStyleImage(str, f, image, z, list, list2, imageContent);
        expectedAddStyleImage.getClass();
        return expectedAddStyleImage;
    }

    public final Expected<String, None> addStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        Expected<String, None> expectedAddStyleLayer = this.map.addStyleLayer(value, layerPosition);
        expectedAddStyleLayer.getClass();
        return expectedAddStyleLayer;
    }

    public final Expected<String, None> addStyleModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        Expected<String, None> expectedAddStyleModel = this.map.addStyleModel(str, str2);
        expectedAddStyleModel.getClass();
        return expectedAddStyleModel;
    }

    public final Expected<String, None> addStyleSource(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> expectedAddStyleSource = this.map.addStyleSource(str, value);
        expectedAddStyleSource.getClass();
        return expectedAddStyleSource;
    }

    public final Expected<String, None> addViewAnnotation(String str, ViewAnnotationOptions viewAnnotationOptions) {
        str.getClass();
        viewAnnotationOptions.getClass();
        Expected<String, None> expectedAddViewAnnotation = this.map.addViewAnnotation(str, viewAnnotationOptions);
        expectedAddViewAnnotation.getClass();
        return expectedAddViewAnnotation;
    }

    public final CameraOptions cameraForCoordinateBounds(CoordinateBounds coordinateBounds, EdgeInsets edgeInsets, Double d, Double d2, Double d3, ScreenCoordinate screenCoordinate) {
        coordinateBounds.getClass();
        CameraOptions cameraOptionsCameraForCoordinateBounds = this.map.cameraForCoordinateBounds(coordinateBounds, edgeInsets, d, d2, d3, screenCoordinate);
        cameraOptionsCameraForCoordinateBounds.getClass();
        return cameraOptionsCameraForCoordinateBounds;
    }

    public final CameraOptions cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, ScreenBox screenBox) {
        list.getClass();
        cameraOptions.getClass();
        screenBox.getClass();
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(list, cameraOptions, screenBox);
        cameraOptionsCameraForCoordinates.getClass();
        return cameraOptionsCameraForCoordinates;
    }

    public final CameraOptions cameraForDrag(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        CameraOptions cameraOptionsCameraForDrag = this.map.cameraForDrag(screenCoordinate, screenCoordinate2);
        cameraOptionsCameraForDrag.getClass();
        return cameraOptionsCameraForDrag;
    }

    public final CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets edgeInsets, Double d, Double d2) {
        geometry.getClass();
        CameraOptions cameraOptionsCameraForGeometry = this.map.cameraForGeometry(geometry, edgeInsets, d, d2);
        cameraOptionsCameraForGeometry.getClass();
        return cameraOptionsCameraForGeometry;
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = this.map.coordinateBoundsForCamera(cameraOptions);
        coordinateBoundsCoordinateBoundsForCamera.getClass();
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCameraUnwrapped = this.map.coordinateBoundsForCameraUnwrapped(cameraOptions);
        coordinateBoundsCoordinateBoundsForCameraUnwrapped.getClass();
        return coordinateBoundsCoordinateBoundsForCameraUnwrapped;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCamera = this.map.coordinateBoundsZoomForCamera(cameraOptions);
        coordinateBoundsZoomCoordinateBoundsZoomForCamera.getClass();
        return coordinateBoundsZoomCoordinateBoundsZoomForCamera;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped = this.map.coordinateBoundsZoomForCameraUnwrapped(cameraOptions);
        coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped.getClass();
        return coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped;
    }

    public final Point coordinateForPixel(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        Point pointCoordinateForPixel = this.map.coordinateForPixel(screenCoordinate);
        pointCoordinateForPixel.getClass();
        return pointCoordinateForPixel;
    }

    public final CoordinateInfo coordinateInfoForPixel(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        CoordinateInfo coordinateInfoCoordinateInfoForPixel = this.map.coordinateInfoForPixel(screenCoordinate);
        coordinateInfoCoordinateInfoForPixel.getClass();
        return coordinateInfoCoordinateInfoForPixel;
    }

    public final List<Point> coordinatesForPixels(List<ScreenCoordinate> list) {
        list.getClass();
        List<Point> listCoordinatesForPixels = this.map.coordinatesForPixels(list);
        listCoordinatesForPixels.getClass();
        return listCoordinatesForPixels;
    }

    public final List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> list) {
        list.getClass();
        List<CoordinateInfo> listCoordinatesInfoForPixels = this.map.coordinatesInfoForPixels(list);
        listCoordinatesInfoForPixels.getClass();
        return listCoordinatesInfoForPixels;
    }

    public final void dispatch(PlatformEventInfo platformEventInfo) {
        platformEventInfo.getClass();
        this.map.dispatch(platformEventInfo);
    }

    public final Double getElevation(Point point) {
        point.getClass();
        return this.map.getElevation(point);
    }

    public final Cancelable getFeatureState(String str, String str2, String str3, QueryFeatureStateCallback queryFeatureStateCallback) {
        str.getClass();
        str3.getClass();
        queryFeatureStateCallback.getClass();
        Cancelable featureState = this.map.getFeatureState(str, str2, str3, queryFeatureStateCallback);
        featureState.getClass();
        return featureState;
    }

    public final StylePropertyValue getStyleAtmosphereProperty(String str) {
        str.getClass();
        StylePropertyValue styleAtmosphereProperty = this.map.getStyleAtmosphereProperty(str);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public final Image getStyleImage(String str) {
        str.getClass();
        return this.map.getStyleImage(str);
    }

    public final Expected<String, Value> getStyleLayerProperties(String str) {
        str.getClass();
        Expected<String, Value> styleLayerProperties = this.map.getStyleLayerProperties(str);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public final StylePropertyValue getStyleLayerProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        StylePropertyValue styleLayerProperty = this.map.getStyleLayerProperty(str, str2);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public final StylePropertyValue getStyleLightProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        StylePropertyValue styleLightProperty = this.map.getStyleLightProperty(str, str2);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public final StylePropertyValue getStyleProjectionProperty(String str) {
        str.getClass();
        StylePropertyValue styleProjectionProperty = this.map.getStyleProjectionProperty(str);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    public final Expected<String, Value> getStyleSourceProperties(String str) {
        str.getClass();
        Expected<String, Value> styleSourceProperties = this.map.getStyleSourceProperties(str);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public final StylePropertyValue getStyleSourceProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        StylePropertyValue styleSourceProperty = this.map.getStyleSourceProperty(str, str2);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public final StylePropertyValue getStyleTerrainProperty(String str) {
        str.getClass();
        StylePropertyValue styleTerrainProperty = this.map.getStyleTerrainProperty(str);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public final Expected<String, ViewAnnotationOptions> getViewAnnotationOptions(String str) {
        str.getClass();
        Expected<String, ViewAnnotationOptions> viewAnnotationOptions = this.map.getViewAnnotationOptions(str);
        viewAnnotationOptions.getClass();
        return viewAnnotationOptions;
    }

    public final boolean hasStyleImage(String str) {
        str.getClass();
        return this.map.hasStyleImage(str);
    }

    public final boolean hasStyleModel(String str) {
        str.getClass();
        return this.map.hasStyleModel(str);
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String str, CoordinateBounds coordinateBounds) {
        str.getClass();
        coordinateBounds.getClass();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.map.invalidateStyleCustomGeometrySourceRegion(str, coordinateBounds);
        expectedInvalidateStyleCustomGeometrySourceRegion.getClass();
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceTile(String str, CanonicalTileID canonicalTileID) {
        str.getClass();
        canonicalTileID.getClass();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.map.invalidateStyleCustomGeometrySourceTile(str, canonicalTileID);
        expectedInvalidateStyleCustomGeometrySourceTile.getClass();
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public final Expected<String, Boolean> isStyleLayerPersistent(String str) {
        str.getClass();
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.map.isStyleLayerPersistent(str);
        expectedIsStyleLayerPersistent.getClass();
        return expectedIsStyleLayerPersistent;
    }

    public final Expected<String, None> moveStyleLayer(String str, LayerPosition layerPosition) {
        str.getClass();
        Expected<String, None> expectedMoveStyleLayer = this.map.moveStyleLayer(str, layerPosition);
        expectedMoveStyleLayer.getClass();
        return expectedMoveStyleLayer;
    }

    public final ScreenCoordinate pixelForCoordinate(Point point) {
        point.getClass();
        ScreenCoordinate screenCoordinatePixelForCoordinate = this.map.pixelForCoordinate(point);
        screenCoordinatePixelForCoordinate.getClass();
        return screenCoordinatePixelForCoordinate;
    }

    public final List<ScreenCoordinate> pixelsForCoordinates(List<Point> list) {
        list.getClass();
        List<ScreenCoordinate> listPixelsForCoordinates = this.map.pixelsForCoordinates(list);
        listPixelsForCoordinates.getClass();
        return listPixelsForCoordinates;
    }

    public final Cancelable queryFeatureExtensions(String str, Feature feature, String str2, String str3, HashMap<String, Value> map, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        str.getClass();
        feature.getClass();
        str2.getClass();
        str3.getClass();
        queryFeatureExtensionCallback.getClass();
        Cancelable cancelableQueryFeatureExtensions = this.map.queryFeatureExtensions(str, feature, str2, str3, map, queryFeatureExtensionCallback);
        cancelableQueryFeatureExtensions.getClass();
        return cancelableQueryFeatureExtensions;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback) {
        renderedQueryGeometry.getClass();
        renderedQueryOptions.getClass();
        queryRenderedFeaturesCallback.getClass();
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, queryRenderedFeaturesCallback);
        cancelableQueryRenderedFeatures.getClass();
        return cancelableQueryRenderedFeatures;
    }

    @MapboxExperimental
    public final Cancelable queryRenderedRasterValues(ScreenCoordinate screenCoordinate, RenderedRasterQueryOptions renderedRasterQueryOptions, QueryRenderedRasterValuesCallback queryRenderedRasterValuesCallback) {
        screenCoordinate.getClass();
        renderedRasterQueryOptions.getClass();
        queryRenderedRasterValuesCallback.getClass();
        Cancelable cancelableQueryRenderedRasterValues = this.map.queryRenderedRasterValues(screenCoordinate, renderedRasterQueryOptions, queryRenderedRasterValuesCallback);
        cancelableQueryRenderedRasterValues.getClass();
        return cancelableQueryRenderedRasterValues;
    }

    public final Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback) {
        str.getClass();
        sourceQueryOptions.getClass();
        querySourceFeaturesCallback.getClass();
        Cancelable cancelableQuerySourceFeatures = this.map.querySourceFeatures(str, sourceQueryOptions, querySourceFeaturesCallback);
        cancelableQuerySourceFeatures.getClass();
        return cancelableQuerySourceFeatures;
    }

    public final Cancelable removeFeatureState(String str, String str2, String str3, String str4, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str3.getClass();
        featureStateOperationCallback.getClass();
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(str, str2, str3, str4, featureStateOperationCallback);
        cancelableRemoveFeatureState.getClass();
        return cancelableRemoveFeatureState;
    }

    @MapboxExperimental
    public final void removeFeatureStateExpression(int i, FeatureStateOperationCallback featureStateOperationCallback) {
        featureStateOperationCallback.getClass();
        this.map.removeFeatureStateExpression(i, featureStateOperationCallback);
    }

    public final Expected<String, None> removeStyleImage(String str) {
        str.getClass();
        Expected<String, None> expectedRemoveStyleImage = this.map.removeStyleImage(str);
        expectedRemoveStyleImage.getClass();
        return expectedRemoveStyleImage;
    }

    public final Expected<String, None> removeStyleLayer(String str) {
        str.getClass();
        Expected<String, None> expectedRemoveStyleLayer = this.map.removeStyleLayer(str);
        expectedRemoveStyleLayer.getClass();
        return expectedRemoveStyleLayer;
    }

    public final Expected<String, None> removeStyleModel(String str) {
        str.getClass();
        Expected<String, None> expectedRemoveStyleModel = this.map.removeStyleModel(str);
        expectedRemoveStyleModel.getClass();
        return expectedRemoveStyleModel;
    }

    public final Expected<String, None> removeStyleSource(String str) {
        str.getClass();
        Expected<String, None> expectedRemoveStyleSource = this.map.removeStyleSource(str);
        expectedRemoveStyleSource.getClass();
        return expectedRemoveStyleSource;
    }

    public final Expected<String, None> removeViewAnnotation(String str) {
        str.getClass();
        Expected<String, None> expectedRemoveViewAnnotation = this.map.removeViewAnnotation(str);
        expectedRemoveViewAnnotation.getClass();
        return expectedRemoveViewAnnotation;
    }

    @MapboxExperimental
    public final void resetFeatureStateExpressions(FeatureStateOperationCallback featureStateOperationCallback) {
        featureStateOperationCallback.getClass();
        this.map.resetFeatureStateExpressions(featureStateOperationCallback);
    }

    public final Cancelable resetFeatureStates(String str, String str2, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        featureStateOperationCallback.getClass();
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(str, str2, featureStateOperationCallback);
        cancelableResetFeatureStates.getClass();
        return cancelableResetFeatureStates;
    }

    public final Expected<String, None> setBounds(CameraBoundsOptions cameraBoundsOptions) {
        cameraBoundsOptions.getClass();
        Expected<String, None> bounds = this.map.setBounds(cameraBoundsOptions);
        bounds.getClass();
        return bounds;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        this.map.setCamera(cameraOptions);
    }

    @MapboxExperimental
    public final void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        cameraAnimationHint.getClass();
        this.map.setCameraAnimationHint(cameraAnimationHint);
    }

    public final void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode) {
        mapCenterAltitudeMode.getClass();
        this.map.setCenterAltitudeMode(mapCenterAltitudeMode);
    }

    public final void setConstrainMode(ConstrainMode constrainMode) {
        constrainMode.getClass();
        this.map.setConstrainMode(constrainMode);
    }

    public final void setDebug(List<? extends MapDebugOptions> list, boolean z) {
        list.getClass();
        this.map.setDebug(list, z);
    }

    public final Cancelable setFeatureState(String str, String str2, String str3, Value value, FeatureStateOperationCallback featureStateOperationCallback) {
        str.getClass();
        str3.getClass();
        value.getClass();
        featureStateOperationCallback.getClass();
        Cancelable featureState = this.map.setFeatureState(str, str2, str3, value, featureStateOperationCallback);
        featureState.getClass();
        return featureState;
    }

    @MapboxExperimental
    public final void setFeatureStateExpression(int i, FeaturesetDescriptor featuresetDescriptor, Value value, Value value2, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetDescriptor.getClass();
        value.getClass();
        value2.getClass();
        featureStateOperationCallback.getClass();
        this.map.setFeatureStateExpression(i, featuresetDescriptor, value, value2, featureStateOperationCallback);
    }

    public final void setNorthOrientation(NorthOrientation northOrientation) {
        northOrientation.getClass();
        this.map.setNorthOrientation(northOrientation);
    }

    public final void setScreenCullingShape(List<Vec2> list) {
        list.getClass();
        this.map.setScreenCullingShape(list);
    }

    public final void setSize(Size size) {
        size.getClass();
        this.map.setSize(size);
        setSizeSet$maps_sdk_release(true);
    }

    public final void setSizeSet$maps_sdk_release(boolean z) {
        synchronized (this) {
            if (z) {
                if (!this.sizeSet) {
                    Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        Iterator<T> it = this.sizeSetCallbackList.iterator();
                        while (it.hasNext()) {
                            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) it.next()).invoke();
                        }
                        this.sizeSetCallbackList.clear();
                    } else {
                        this.mainHandler.post(new Sentry$$ExternalSyntheticLambda5(11, this));
                    }
                }
            }
            this.sizeSet = z;
        }
    }

    public final Expected<String, None> setStyleAtmosphere(Value value) {
        value.getClass();
        Expected<String, None> styleAtmosphere = this.map.setStyleAtmosphere(value);
        styleAtmosphere.getClass();
        return styleAtmosphere;
    }

    public final Expected<String, None> setStyleAtmosphereProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> styleAtmosphereProperty = this.map.setStyleAtmosphereProperty(str, value);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public final Expected<String, None> setStyleCustomGeometrySourceTileData(String str, CanonicalTileID canonicalTileID, List<Feature> list) {
        str.getClass();
        canonicalTileID.getClass();
        list.getClass();
        Expected<String, None> styleCustomGeometrySourceTileData = this.map.setStyleCustomGeometrySourceTileData(str, canonicalTileID, list);
        styleCustomGeometrySourceTileData.getClass();
        return styleCustomGeometrySourceTileData;
    }

    public final Expected<String, None> setStyleGeoJSONSourceData(String str, String str2, GeoJSONSourceData geoJSONSourceData) {
        str.getClass();
        str2.getClass();
        geoJSONSourceData.getClass();
        Expected<String, None> styleGeoJSONSourceData = this.map.setStyleGeoJSONSourceData(str, str2, geoJSONSourceData);
        styleGeoJSONSourceData.getClass();
        return styleGeoJSONSourceData;
    }

    public final void setStyleJSON(String str) {
        str.getClass();
        this.map.setStyleJSON(str);
    }

    public final Expected<String, None> setStyleLayerProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> styleLayerProperties = this.map.setStyleLayerProperties(str, value);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public final Expected<String, None> setStyleLayerProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        Expected<String, None> styleLayerProperty = this.map.setStyleLayerProperty(str, str2, value);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public final Expected<String, None> setStyleLightProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        Expected<String, None> styleLightProperty = this.map.setStyleLightProperty(str, str2, value);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public final Expected<String, None> setStyleLights(Value value) {
        value.getClass();
        Expected<String, None> styleLights = this.map.setStyleLights(value);
        styleLights.getClass();
        return styleLights;
    }

    public final Expected<String, None> setStyleProjection(Value value) {
        value.getClass();
        Expected<String, None> styleProjection = this.map.setStyleProjection(value);
        styleProjection.getClass();
        return styleProjection;
    }

    public final Expected<String, None> setStyleProjectionProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> styleProjectionProperty = this.map.setStyleProjectionProperty(str, value);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    public final Expected<String, None> setStyleSourceProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> styleSourceProperties = this.map.setStyleSourceProperties(str, value);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleSourceProperty(String str, String str2, String str3, Value value) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        value.getClass();
        Expected<String, None> styleSourceProperty = this.map.setStyleSourceProperty(str, str2, str3, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public final Expected<String, None> setStyleTerrain(Value value) {
        value.getClass();
        Expected<String, None> styleTerrain = this.map.setStyleTerrain(value);
        styleTerrain.getClass();
        return styleTerrain;
    }

    public final Expected<String, None> setStyleTerrainProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        Expected<String, None> styleTerrainProperty = this.map.setStyleTerrainProperty(str, value);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public final void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        this.map.setStyleTransition(transitionOptions);
    }

    public final void setStyleURI(String str) {
        str.getClass();
        this.map.setStyleURI(str);
    }

    public final void setViewportMode(ViewportMode viewportMode) {
        viewportMode.getClass();
        this.map.setViewportMode(viewportMode);
    }

    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions performanceStatisticsOptions, PerformanceStatisticsCallback performanceStatisticsCallback) {
        performanceStatisticsOptions.getClass();
        performanceStatisticsCallback.getClass();
        this.map.startPerformanceStatisticsCollection(performanceStatisticsOptions, performanceStatisticsCallback);
    }

    public final boolean styleLayerExists(String str) {
        str.getClass();
        return this.map.styleLayerExists(str);
    }

    public final boolean styleSourceExists(String str) {
        str.getClass();
        return this.map.styleSourceExists(str);
    }

    @MapboxExperimental
    public final Cancelable subscribe(String str, GenericEventCallback genericEventCallback) {
        str.getClass();
        genericEventCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(str, genericEventCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        List<CanonicalTileID> listTileCover = this.map.tileCover(tileCoverOptions, cameraOptions);
        listTileCover.getClass();
        return listTileCover;
    }

    public final Expected<String, None> updateStyleImageSourceImage(String str, Image image) {
        str.getClass();
        image.getClass();
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.map.updateStyleImageSourceImage(str, image);
        expectedUpdateStyleImageSourceImage.getClass();
        return expectedUpdateStyleImageSourceImage;
    }

    public final Expected<String, None> updateViewAnnotation(String str, ViewAnnotationOptions viewAnnotationOptions) {
        str.getClass();
        viewAnnotationOptions.getClass();
        Expected<String, None> expectedUpdateViewAnnotation = this.map.updateViewAnnotation(str, viewAnnotationOptions);
        expectedUpdateViewAnnotation.getClass();
        return expectedUpdateViewAnnotation;
    }

    public final void whenMapSizeReady(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if (this.sizeSet) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            this.sizeSetCallbackList.add(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public final void setCamera(FreeCameraOptions freeCameraOptions) {
        freeCameraOptions.getClass();
        this.map.setCamera(freeCameraOptions);
    }

    public final Cancelable resetFeatureStates(FeaturesetDescriptor featuresetDescriptor, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetDescriptor.getClass();
        featureStateOperationCallback.getClass();
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(featuresetDescriptor, featureStateOperationCallback);
        cancelableResetFeatureStates.getClass();
        return cancelableResetFeatureStates;
    }

    public final Cancelable subscribe(MapIdleCallback mapIdleCallback) {
        mapIdleCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(mapIdleCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(MapLoadingErrorCallback mapLoadingErrorCallback) {
        mapLoadingErrorCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadingErrorCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleLoadedCallback styleLoadedCallback) {
        styleLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> list, EdgeInsets edgeInsets, Double d, Double d2) {
        list.getClass();
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(list, edgeInsets, d, d2);
        cameraOptionsCameraForCoordinates.getClass();
        return cameraOptionsCameraForCoordinates;
    }

    public final Cancelable getFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, QueryFeatureStateCallback queryFeatureStateCallback) {
        featuresetDescriptor.getClass();
        featuresetFeatureId.getClass();
        queryFeatureStateCallback.getClass();
        Cancelable featureState = this.map.getFeatureState(featuresetDescriptor, featuresetFeatureId, queryFeatureStateCallback);
        featureState.getClass();
        return featureState;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, List<FeaturesetQueryTarget> list, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback) {
        renderedQueryGeometry.getClass();
        list.getClass();
        queryRenderedFeaturesCallback.getClass();
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(renderedQueryGeometry, list, queryRenderedFeaturesCallback);
        cancelableQueryRenderedFeatures.getClass();
        return cancelableQueryRenderedFeatures;
    }

    public final Cancelable removeFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, String str, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetDescriptor.getClass();
        featuresetFeatureId.getClass();
        featureStateOperationCallback.getClass();
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(featuresetDescriptor, featuresetFeatureId, str, featureStateOperationCallback);
        cancelableRemoveFeatureState.getClass();
        return cancelableRemoveFeatureState;
    }

    public final Cancelable subscribe(StyleDataLoadedCallback styleDataLoadedCallback) {
        styleDataLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Expected<String, CameraOptions> cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d, ScreenCoordinate screenCoordinate) {
        list.getClass();
        cameraOptions.getClass();
        Expected<String, CameraOptions> expectedCameraForCoordinates = this.map.cameraForCoordinates(list, cameraOptions, edgeInsets, d, screenCoordinate);
        expectedCameraForCoordinates.getClass();
        return expectedCameraForCoordinates;
    }

    public final Cancelable subscribe(SourceDataLoadedCallback sourceDataLoadedCallback) {
        sourceDataLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(SourceAddedCallback sourceAddedCallback) {
        sourceAddedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceAddedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable setFeatureState(FeaturesetDescriptor featuresetDescriptor, FeaturesetFeatureId featuresetFeatureId, Value value, FeatureStateOperationCallback featureStateOperationCallback) {
        featuresetDescriptor.getClass();
        featuresetFeatureId.getClass();
        value.getClass();
        featureStateOperationCallback.getClass();
        Cancelable featureState = this.map.setFeatureState(featuresetDescriptor, featuresetFeatureId, value, featureStateOperationCallback);
        featureState.getClass();
        return featureState;
    }

    public final Expected<String, None> setStyleSourceProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        Expected<String, None> styleSourceProperty = this.map.setStyleSourceProperty(str, str2, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public final Cancelable subscribe(SourceRemovedCallback sourceRemovedCallback) {
        sourceRemovedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceRemovedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleImageMissingCallback styleImageMissingCallback) {
        styleImageMissingCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageMissingCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        styleImageRemoveUnusedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageRemoveUnusedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(CameraChangedCallback cameraChangedCallback) {
        cameraChangedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Cancelable subscribe(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        cameraChangedCoalescedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCoalescedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(RenderFrameStartedCallback renderFrameStartedCallback) {
        renderFrameStartedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameStartedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        renderFrameFinishedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameFinishedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(ResourceRequestCallback resourceRequestCallback) {
        resourceRequestCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(resourceRequestCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(MapLoadedCallback mapLoadedCallback) {
        mapLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }
}
