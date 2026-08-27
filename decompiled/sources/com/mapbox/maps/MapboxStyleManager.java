package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import java.util.HashMap;
import java.util.List;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public class MapboxStyleManager {
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final float pixelRatio;
    private final StyleManager styleManager;

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    public final MapLoadingErrorDelegate getMapLoadingErrorDelegate() {
        return this.mapLoadingErrorDelegate;
    }

    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    public final StyleManager getStyleManager() {
        return this.styleManager;
    }

    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<FeaturesetDescriptor> styleFeaturesets = this.styleManager.getStyleFeaturesets();
        styleFeaturesets.getClass();
        return styleFeaturesets;
    }

    public CameraOptions getStyleDefaultCamera() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        CameraOptions styleDefaultCamera = this.styleManager.getStyleDefaultCamera();
        styleDefaultCamera.getClass();
        return styleDefaultCamera;
    }

    @MapboxExperimental
    public String getStyleGlyphURL() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleGlyphURL = this.styleManager.getStyleGlyphURL();
        styleGlyphURL.getClass();
        return styleGlyphURL;
    }

    public List<StyleObjectInfo> getStyleImports() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleImports = this.styleManager.getStyleImports();
        styleImports.getClass();
        return styleImports;
    }

    public String getStyleJSON() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleJSON = this.styleManager.getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public List<StyleObjectInfo> getStyleLayers() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLayers = this.styleManager.getStyleLayers();
        styleLayers.getClass();
        return styleLayers;
    }

    public List<StyleObjectInfo> getStyleLights() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLights = this.styleManager.getStyleLights();
        styleLights.getClass();
        return styleLights;
    }

    public List<String> getStyleSlots() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<String> styleSlots = this.styleManager.getStyleSlots();
        styleSlots.getClass();
        return styleSlots;
    }

    public List<StyleObjectInfo> getStyleSources() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleSources = this.styleManager.getStyleSources();
        styleSources.getClass();
        return styleSources;
    }

    public TransitionOptions getStyleTransition() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        TransitionOptions styleTransition = this.styleManager.getStyleTransition();
        styleTransition.getClass();
        return styleTransition;
    }

    public String getStyleURI() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleURI = this.styleManager.getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    public boolean isStyleLoaded() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.isStyleLoaded();
    }

    @MapboxExperimental
    public void setInitialStyleColorTheme() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setInitialStyleColorTheme();
    }

    public MapboxStyleManager(StyleManager styleManager, float f, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        styleManager.getClass();
        mapLoadingErrorDelegate.getClass();
        this.styleManager = styleManager;
        this.pixelRatio = f;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
    }

    public Expected<String, None> addGeoJSONSourceFeatures(String str, String str2, List<Feature> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        Expected<String, None> expectedAddGeoJSONSourceFeatures = this.styleManager.addGeoJSONSourceFeatures(str, str2, list);
        expectedAddGeoJSONSourceFeatures.getClass();
        return expectedAddGeoJSONSourceFeatures;
    }

    public final Expected<String, None> addImage(String str, Image image, boolean z) {
        str.getClass();
        image.getClass();
        float f = this.pixelRatio;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        return addStyleImage(str, f, image, z, instance_delegatelambda0Var, instance_delegatelambda0Var, null);
    }

    public Expected<String, None> addPersistentStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.styleManager.addPersistentStyleCustomLayer(str, customLayerHost, layerPosition);
        expectedAddPersistentStyleCustomLayer.getClass();
        return expectedAddPersistentStyleCustomLayer;
    }

    public Expected<String, None> addPersistentStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleLayer = this.styleManager.addPersistentStyleLayer(value, layerPosition);
        expectedAddPersistentStyleLayer.getClass();
        return expectedAddPersistentStyleLayer;
    }

    public Expected<String, None> addStyleCustomGeometrySource(String str, CustomGeometrySourceOptions customGeometrySourceOptions) {
        str.getClass();
        customGeometrySourceOptions.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.styleManager.addStyleCustomGeometrySource(str, customGeometrySourceOptions);
        expectedAddStyleCustomGeometrySource.getClass();
        return expectedAddStyleCustomGeometrySource;
    }

    public Expected<String, None> addStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomLayer = this.styleManager.addStyleCustomLayer(str, customLayerHost, layerPosition);
        expectedAddStyleCustomLayer.getClass();
        return expectedAddStyleCustomLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String str, CustomRasterSourceOptions customRasterSourceOptions) {
        str.getClass();
        customRasterSourceOptions.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomRasterSource = this.styleManager.addStyleCustomRasterSource(str, customRasterSourceOptions);
        expectedAddStyleCustomRasterSource.getClass();
        return expectedAddStyleCustomRasterSource;
    }

    public Expected<String, None> addStyleImage(String str, float f, Image image, boolean z, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent) {
        str.getClass();
        image.getClass();
        list.getClass();
        list2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImage = this.styleManager.addStyleImage(str, f, image, z, list, list2, imageContent);
        expectedAddStyleImage.getClass();
        return expectedAddStyleImage;
    }

    public Expected<String, None> addStyleImportFromJSON(String str, String str2, HashMap<String, Value> map, ImportPosition importPosition) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromJSON = this.styleManager.addStyleImportFromJSON(str, str2, map, importPosition);
        expectedAddStyleImportFromJSON.getClass();
        return expectedAddStyleImportFromJSON;
    }

    public Expected<String, None> addStyleImportFromURI(String str, String str2, HashMap<String, Value> map, ImportPosition importPosition) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromURI = this.styleManager.addStyleImportFromURI(str, str2, map, importPosition);
        expectedAddStyleImportFromURI.getClass();
        return expectedAddStyleImportFromURI;
    }

    public Expected<String, None> addStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleLayer = this.styleManager.addStyleLayer(value, layerPosition);
        expectedAddStyleLayer.getClass();
        return expectedAddStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleModel = this.styleManager.addStyleModel(str, str2);
        expectedAddStyleModel.getClass();
        return expectedAddStyleModel;
    }

    public Expected<String, None> addStyleSource(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleSource = this.styleManager.addStyleSource(str, value);
        expectedAddStyleSource.getClass();
        return expectedAddStyleSource;
    }

    public StylePropertyValue getStyleAtmosphereProperty(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleAtmosphereProperty = this.styleManager.getStyleAtmosphereProperty(str);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public Image getStyleImage(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.getStyleImage(str);
    }

    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, HashMap<String, StylePropertyValue>> styleImportConfigProperties = this.styleManager.getStyleImportConfigProperties(str);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, StylePropertyValue> styleImportConfigProperty = this.styleManager.getStyleImportConfigProperty(str, str2);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    public Expected<String, Value> getStyleImportSchema(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleImportSchema = this.styleManager.getStyleImportSchema(str);
        styleImportSchema.getClass();
        return styleImportSchema;
    }

    public Expected<String, Value> getStyleLayerProperties(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleLayerProperties = this.styleManager.getStyleLayerProperties(str);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public StylePropertyValue getStyleLayerProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLayerProperty = this.styleManager.getStyleLayerProperty(str, str2);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public StylePropertyValue getStyleLightProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLightProperty = this.styleManager.getStyleLightProperty(str, str2);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public StylePropertyValue getStyleProjectionProperty(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleProjectionProperty = this.styleManager.getStyleProjectionProperty(str);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleRainProperty(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleRainProperty = this.styleManager.getStyleRainProperty(str);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleSnowProperty(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSnowProperty = this.styleManager.getStyleSnowProperty(str);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    public Expected<String, Value> getStyleSourceProperties(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleSourceProperties = this.styleManager.getStyleSourceProperties(str);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public StylePropertyValue getStyleSourceProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSourceProperty = this.styleManager.getStyleSourceProperty(str, str2);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public StylePropertyValue getStyleTerrainProperty(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleTerrainProperty = this.styleManager.getStyleTerrainProperty(str);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public boolean hasStyleImage(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleImage(str);
    }

    @MapboxExperimental
    public boolean hasStyleModel(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleModel(str);
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String str, CoordinateBounds coordinateBounds) {
        str.getClass();
        coordinateBounds.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.styleManager.invalidateStyleCustomGeometrySourceRegion(str, coordinateBounds);
        expectedInvalidateStyleCustomGeometrySourceRegion.getClass();
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String str, CanonicalTileID canonicalTileID) {
        str.getClass();
        canonicalTileID.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.styleManager.invalidateStyleCustomGeometrySourceTile(str, canonicalTileID);
        expectedInvalidateStyleCustomGeometrySourceTile.getClass();
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public Expected<String, Boolean> isStyleLayerPersistent(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.styleManager.isStyleLayerPersistent(str);
        expectedIsStyleLayerPersistent.getClass();
        return expectedIsStyleLayerPersistent;
    }

    public Expected<String, None> moveStyleImport(String str, ImportPosition importPosition) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleImport = this.styleManager.moveStyleImport(str, importPosition);
        expectedMoveStyleImport.getClass();
        return expectedMoveStyleImport;
    }

    public Expected<String, None> moveStyleLayer(String str, LayerPosition layerPosition) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleLayer = this.styleManager.moveStyleLayer(str, layerPosition);
        expectedMoveStyleLayer.getClass();
        return expectedMoveStyleLayer;
    }

    public Expected<String, None> removeGeoJSONSourceFeatures(String str, String str2, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        Expected<String, None> expectedRemoveGeoJSONSourceFeatures = this.styleManager.removeGeoJSONSourceFeatures(str, str2, list);
        expectedRemoveGeoJSONSourceFeatures.getClass();
        return expectedRemoveGeoJSONSourceFeatures;
    }

    public Expected<String, None> removeStyleImage(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImage = this.styleManager.removeStyleImage(str);
        expectedRemoveStyleImage.getClass();
        return expectedRemoveStyleImage;
    }

    public Expected<String, None> removeStyleImport(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImport = this.styleManager.removeStyleImport(str);
        expectedRemoveStyleImport.getClass();
        return expectedRemoveStyleImport;
    }

    public Expected<String, None> removeStyleLayer(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleLayer = this.styleManager.removeStyleLayer(str);
        expectedRemoveStyleLayer.getClass();
        return expectedRemoveStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleModel = this.styleManager.removeStyleModel(str);
        expectedRemoveStyleModel.getClass();
        return expectedRemoveStyleModel;
    }

    public Expected<String, None> removeStyleSource(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSource = this.styleManager.removeStyleSource(str);
        expectedRemoveStyleSource.getClass();
        return expectedRemoveStyleSource;
    }

    public Expected<String, None> removeStyleSourceUnchecked(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSourceUnchecked = this.styleManager.removeStyleSourceUnchecked(str);
        expectedRemoveStyleSourceUnchecked.getClass();
        return expectedRemoveStyleSourceUnchecked;
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, String str2) {
        str.getClass();
        str2.getClass();
        return setImportColorTheme(str, ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(str2), StylePropertyValueKind.CONSTANT)));
    }

    public Expected<String, None> setStyleAtmosphere(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphere = this.styleManager.setStyleAtmosphere(value);
        styleAtmosphere.getClass();
        return styleAtmosphere;
    }

    public Expected<String, None> setStyleAtmosphereProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphereProperty = this.styleManager.setStyleAtmosphereProperty(str, value);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public Expected<String, None> setStyleCustomGeometrySourceTileData(String str, CanonicalTileID canonicalTileID, List<Feature> list) {
        str.getClass();
        canonicalTileID.getClass();
        list.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomGeometrySourceTileData = this.styleManager.setStyleCustomGeometrySourceTileData(str, canonicalTileID, list);
        styleCustomGeometrySourceTileData.getClass();
        return styleCustomGeometrySourceTileData;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String str, List<CustomRasterSourceTileData> list) {
        str.getClass();
        list.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomRasterSourceTileData = this.styleManager.setStyleCustomRasterSourceTileData(str, list);
        styleCustomRasterSourceTileData.getClass();
        return styleCustomRasterSourceTileData;
    }

    public Expected<String, None> setStyleGeoJSONSourceData(String str, String str2, GeoJSONSourceData geoJSONSourceData) {
        str.getClass();
        str2.getClass();
        geoJSONSourceData.getClass();
        Expected<String, None> styleGeoJSONSourceData = this.styleManager.setStyleGeoJSONSourceData(str, str2, geoJSONSourceData);
        styleGeoJSONSourceData.getClass();
        return styleGeoJSONSourceData;
    }

    @MapboxExperimental
    public void setStyleGlyphURL(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleGlyphURL(str);
    }

    public Expected<String, None> setStyleImportConfigProperties(String str, HashMap<String, Value> map) {
        str.getClass();
        map.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperties = this.styleManager.setStyleImportConfigProperties(str, map);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    public Expected<String, None> setStyleImportConfigProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperty = this.styleManager.setStyleImportConfigProperty(str, str2, value);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    public Expected<String, None> setStyleLayerProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperties = this.styleManager.setStyleLayerProperties(str, value);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    @MapboxExperimental
    public Cancelable setStyleLayerPropertiesAsync(String str, Value value, AsyncOperationResultCallback asyncOperationResultCallback) {
        str.getClass();
        value.getClass();
        asyncOperationResultCallback.getClass();
        Cancelable styleLayerPropertiesAsync = this.styleManager.setStyleLayerPropertiesAsync(str, value, asyncOperationResultCallback);
        styleLayerPropertiesAsync.getClass();
        return styleLayerPropertiesAsync;
    }

    public Expected<String, None> setStyleLayerProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperty = this.styleManager.setStyleLayerProperty(str, str2, value);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    @MapboxExperimental
    public Cancelable setStyleLayerPropertyAsync(String str, String str2, Value value, AsyncOperationResultCallback asyncOperationResultCallback) {
        str.getClass();
        str2.getClass();
        value.getClass();
        asyncOperationResultCallback.getClass();
        Cancelable styleLayerPropertyAsync = this.styleManager.setStyleLayerPropertyAsync(str, str2, value, asyncOperationResultCallback);
        styleLayerPropertyAsync.getClass();
        return styleLayerPropertyAsync;
    }

    public Expected<String, None> setStyleLightProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLightProperty = this.styleManager.setStyleLightProperty(str, str2, value);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public Expected<String, None> setStyleLights(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLights = this.styleManager.setStyleLights(value);
        styleLights.getClass();
        return styleLights;
    }

    public Expected<String, None> setStyleProjection(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjection = this.styleManager.setStyleProjection(value);
        styleProjection.getClass();
        return styleProjection;
    }

    public Expected<String, None> setStyleProjectionProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjectionProperty = this.styleManager.setStyleProjectionProperty(str, value);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRain(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRain = this.styleManager.setStyleRain(value);
        styleRain.getClass();
        return styleRain;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRainProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRainProperty = this.styleManager.setStyleRainProperty(str, value);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnow(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnow = this.styleManager.setStyleSnow(value);
        styleSnow.getClass();
        return styleSnow;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnowProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnowProperty = this.styleManager.setStyleSnowProperty(str, value);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    public Expected<String, None> setStyleSourceProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperties = this.styleManager.setStyleSourceProperties(str, value);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSourceProperty(String str, String str2, String str3, Value value) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(str, str2, str3, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public Expected<String, None> setStyleTerrain(Value value) {
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrain = this.styleManager.setStyleTerrain(value);
        styleTerrain.getClass();
        return styleTerrain;
    }

    public Expected<String, None> setStyleTerrainProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrainProperty = this.styleManager.setStyleTerrainProperty(str, value);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleTransition(transitionOptions);
    }

    public boolean styleLayerExists(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleLayerExists(str);
    }

    public boolean styleSourceExists(String str) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleSourceExists(str);
    }

    public Expected<String, None> updateGeoJSONSourceFeatures(String str, String str2, List<Feature> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        Expected<String, None> expectedUpdateGeoJSONSourceFeatures = this.styleManager.updateGeoJSONSourceFeatures(str, str2, list);
        expectedUpdateGeoJSONSourceFeatures.getClass();
        return expectedUpdateGeoJSONSourceFeatures;
    }

    public Expected<String, None> updateStyleImageSourceImage(String str, Image image) {
        str.getClass();
        image.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.styleManager.updateStyleImageSourceImage(str, image);
        expectedUpdateStyleImageSourceImage.getClass();
        return expectedUpdateStyleImageSourceImage;
    }

    public Expected<String, None> updateStyleImportWithJSON(String str, String str2, HashMap<String, Value> map) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithJSON = this.styleManager.updateStyleImportWithJSON(str, str2, map);
        expectedUpdateStyleImportWithJSON.getClass();
        return expectedUpdateStyleImportWithJSON;
    }

    public Expected<String, None> updateStyleImportWithURI(String str, String str2, HashMap<String, Value> map) {
        str.getClass();
        str2.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithURI = this.styleManager.updateStyleImportWithURI(str, str2, map);
        expectedUpdateStyleImportWithURI.getClass();
        return expectedUpdateStyleImportWithURI;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String str) {
        str.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(str), StylePropertyValueKind.CONSTANT)));
    }

    public final Expected<String, None> addImage(String str, Image image) {
        str.getClass();
        image.getClass();
        return addImage(str, image, false);
    }

    public final Expected<String, None> addImage(String str, Bitmap bitmap, boolean z) {
        str.getClass();
        bitmap.getClass();
        return addImage(str, ExtensionUtils.toMapboxImage(bitmap), z);
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleColorTheme = this.styleManager.setStyleColorTheme(colorTheme);
        styleColorTheme.getClass();
        return styleColorTheme;
    }

    public final Expected<String, None> addImage(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        return addImage(str, bitmap, false);
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        bitmap.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, ColorTheme colorTheme) {
        str.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> importColorTheme = this.styleManager.setImportColorTheme(str, colorTheme);
        importColorTheme.getClass();
        return importColorTheme;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        image.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(image));
    }

    public Expected<String, None> setStyleSourceProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(str, str2, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        return setImportColorTheme(str, ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, Image image) {
        str.getClass();
        image.getClass();
        return setImportColorTheme(str, ColorTheme.valueOf(image));
    }
}
