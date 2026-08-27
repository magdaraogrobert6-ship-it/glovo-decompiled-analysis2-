package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class Style extends MapboxStyleManager {
    public static final Companion Companion = new Companion(null);
    public static final String DARK = "mapbox://styles/mapbox/dark-v11";
    public static final String LIGHT = "mapbox://styles/mapbox/light-v11";
    public static final String MAPBOX_STREETS = "mapbox://styles/mapbox/streets-v12";
    public static final String OUTDOORS = "mapbox://styles/mapbox/outdoors-v12";
    public static final String SATELLITE = "mapbox://styles/mapbox/satellite-v9";
    public static final String SATELLITE_STREETS = "mapbox://styles/mapbox/satellite-streets-v12";
    public static final String STANDARD = "mapbox://styles/mapbox/standard";
    public static final String STANDARD_SATELLITE = "mapbox://styles/mapbox/standard-satellite";
    private static final String TAG = "Mbgl-Style";
    public static final String TRAFFIC_DAY = "mapbox://styles/mapbox/traffic-day-v2";
    public static final String TRAFFIC_NIGHT = "mapbox://styles/mapbox/traffic-night-v2";
    private volatile boolean isStyleValid;

    public interface OnStyleLoaded {
        void onStyleLoaded(Style style);
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    public final boolean isValid() {
        return this.isStyleValid;
    }

    public final void markInvalid$maps_sdk_release() {
        this.isStyleValid = false;
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        checkNativeStyle("getFeaturesets");
        return super.getFeaturesets();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public CameraOptions getStyleDefaultCamera() {
        checkNativeStyle("getStyleDefaultCamera");
        return super.getStyleDefaultCamera();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public String getStyleGlyphURL() {
        checkNativeStyle("getStyleGlyphURL");
        return super.getStyleGlyphURL();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleImports() {
        checkNativeStyle("getStyleImports");
        return super.getStyleImports();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleJSON() {
        checkNativeStyle("getStyleJSON");
        return super.getStyleJSON();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLayers() {
        checkNativeStyle("getStyleLayers");
        return super.getStyleLayers();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLights() {
        checkNativeStyle("getStyleLights");
        return super.getStyleLights();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<String> getStyleSlots() {
        checkNativeStyle("getStyleSlots");
        return super.getStyleSlots();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleSources() {
        checkNativeStyle("getStyleSources");
        return super.getStyleSources();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public TransitionOptions getStyleTransition() {
        checkNativeStyle("getStyleTransition");
        return super.getStyleTransition();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleURI() {
        checkNativeStyle("getStyleURI");
        return super.getStyleURI();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean isStyleLoaded() {
        checkNativeStyle("isStyleLoaded");
        return super.isStyleLoaded();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Style(StyleManager styleManager, float f, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        super(styleManager, f, mapLoadingErrorDelegate);
        styleManager.getClass();
        mapLoadingErrorDelegate.getClass();
        this.isStyleValid = true;
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addGeoJSONSourceFeatures(String str, String str2, List<Feature> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing addGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.addGeoJSONSourceFeatures(str, str2, list);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        checkNativeStyle("addPersistentStyleCustomLayer");
        return super.addPersistentStyleCustomLayer(str, customLayerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomGeometrySource(String str, CustomGeometrySourceOptions customGeometrySourceOptions) {
        str.getClass();
        customGeometrySourceOptions.getClass();
        checkNativeStyle("addStyleCustomGeometrySource");
        return super.addStyleCustomGeometrySource(str, customGeometrySourceOptions);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition) {
        str.getClass();
        customLayerHost.getClass();
        checkNativeStyle("addStyleCustomLayer");
        return super.addStyleCustomLayer(str, customLayerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String str, CustomRasterSourceOptions customRasterSourceOptions) {
        str.getClass();
        customRasterSourceOptions.getClass();
        checkNativeStyle("addStyleCustomRasterSource");
        return super.addStyleCustomRasterSource(str, customRasterSourceOptions);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImage(String str, float f, Image image, boolean z, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent) {
        str.getClass();
        image.getClass();
        list.getClass();
        list2.getClass();
        checkNativeStyle("addStyleImage");
        return super.addStyleImage(str, f, image, z, list, list2, imageContent);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromJSON(String str, String str2, HashMap<String, Value> map, ImportPosition importPosition) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("addStyleImportFromJSON");
        return super.addStyleImportFromJSON(str, str2, map, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromURI(String str, String str2, HashMap<String, Value> map, ImportPosition importPosition) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("addStyleImportFromURI");
        return super.addStyleImportFromURI(str, str2, map, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("addStyleModel");
        return super.addStyleModel(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleSource(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("addStyleSource");
        return super.addStyleSource(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("getStyleImportConfigProperty");
        return super.getStyleImportConfigProperty(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLayerProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("getStyleLayerProperty");
        return super.getStyleLayerProperty(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLightProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("getStyleLightProperty");
        return super.getStyleLightProperty(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleSourceProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("getStyleSourceProperty");
        return super.getStyleSourceProperty(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String str, CoordinateBounds coordinateBounds) {
        str.getClass();
        coordinateBounds.getClass();
        checkNativeStyle("invalidateStyleCustomGeometrySourceRegion");
        return super.invalidateStyleCustomGeometrySourceRegion(str, coordinateBounds);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String str, CanonicalTileID canonicalTileID) {
        str.getClass();
        canonicalTileID.getClass();
        checkNativeStyle("invalidateStyleCustomGeometrySourceTile");
        return super.invalidateStyleCustomGeometrySourceTile(str, canonicalTileID);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeGeoJSONSourceFeatures(String str, String str2, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing removeGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.removeGeoJSONSourceFeatures(str, str2, list);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(str, bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphereProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("setStyleAtmosphereProperty");
        return super.setStyleAtmosphereProperty(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleCustomGeometrySourceTileData(String str, CanonicalTileID canonicalTileID, List<Feature> list) {
        str.getClass();
        canonicalTileID.getClass();
        list.getClass();
        checkNativeStyle("setStyleCustomGeometrySourceTileData");
        return super.setStyleCustomGeometrySourceTileData(str, canonicalTileID, list);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String str, List<CustomRasterSourceTileData> list) {
        str.getClass();
        list.getClass();
        checkNativeStyle("setStyleCustomRasterSourceTileData");
        return super.setStyleCustomRasterSourceTileData(str, list);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleGeoJSONSourceData(String str, String str2, GeoJSONSourceData geoJSONSourceData) {
        str.getClass();
        str2.getClass();
        geoJSONSourceData.getClass();
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing setStyleGeoJSONSourceData) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.setStyleGeoJSONSourceData(str, str2, geoJSONSourceData);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperties(String str, HashMap<String, Value> map) {
        str.getClass();
        map.getClass();
        checkNativeStyle("setStyleImportConfigProperties");
        return super.setStyleImportConfigProperties(str, map);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        checkNativeStyle("setStyleImportConfigProperty");
        return super.setStyleImportConfigProperty(str, str2, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("setStyleLayerProperties");
        return super.setStyleLayerProperties(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        checkNativeStyle("setStyleLayerProperty");
        return super.setStyleLayerProperty(str, str2, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLightProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        checkNativeStyle("setStyleLightProperty");
        return super.setStyleLightProperty(str, str2, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjectionProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("setStyleProjectionProperty");
        return super.setStyleProjectionProperty(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperties(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("setStyleSourceProperties");
        return super.setStyleSourceProperties(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleSourceProperty(String str, String str2, String str3, Value value) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        value.getClass();
        checkNativeStyle("setStyleSourceProperty");
        return super.setStyleSourceProperty(str, str2, str3, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrainProperty(String str, Value value) {
        str.getClass();
        value.getClass();
        checkNativeStyle("setStyleTerrainProperty");
        return super.setStyleTerrainProperty(str, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateGeoJSONSourceFeatures(String str, String str2, List<Feature> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        if (!this.isStyleValid) {
            MapboxLogger.logW(TAG, "Style object (accessing updateGeoJSONSourceFeatures) should not be stored and used after MapView is destroyed or new style has been loaded.");
        }
        return super.updateGeoJSONSourceFeatures(str, str2, list);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImageSourceImage(String str, Image image) {
        str.getClass();
        image.getClass();
        checkNativeStyle("updateStyleImageSourceImage");
        return super.updateStyleImageSourceImage(str, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithJSON(String str, String str2, HashMap<String, Value> map) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("updateStyleImportWithJSON");
        return super.updateStyleImportWithJSON(str, str2, map);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithURI(String str, String str2, HashMap<String, Value> map) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("updateStyleImportWithURI");
        return super.updateStyleImportWithURI(str, str2, map);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        checkNativeStyle("addPersistentStyleLayer");
        return super.addPersistentStyleLayer(value, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleLayer(Value value, LayerPosition layerPosition) {
        value.getClass();
        checkNativeStyle("addStyleLayer");
        return super.addStyleLayer(value, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleAtmosphereProperty(String str) {
        str.getClass();
        checkNativeStyle("getStyleAtmosphereProperty");
        return super.getStyleAtmosphereProperty(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Image getStyleImage(String str) {
        str.getClass();
        checkNativeStyle("getStyleImage");
        return super.getStyleImage(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String str) {
        str.getClass();
        checkNativeStyle("getStyleImportConfigProperties");
        return super.getStyleImportConfigProperties(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleImportSchema(String str) {
        str.getClass();
        checkNativeStyle("getStyleImportSchema");
        return super.getStyleImportSchema(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleLayerProperties(String str) {
        str.getClass();
        checkNativeStyle("getStyleLayerProperties");
        return super.getStyleLayerProperties(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleProjectionProperty(String str) {
        str.getClass();
        checkNativeStyle("getStyleProjectionProperty");
        return super.getStyleProjectionProperty(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleSourceProperties(String str) {
        str.getClass();
        checkNativeStyle("getStyleSourceProperties");
        return super.getStyleSourceProperties(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleTerrainProperty(String str) {
        str.getClass();
        checkNativeStyle("getStyleTerrainProperty");
        return super.getStyleTerrainProperty(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean hasStyleImage(String str) {
        str.getClass();
        checkNativeStyle("hasStyleImage");
        return super.hasStyleImage(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public boolean hasStyleModel(String str) {
        str.getClass();
        checkNativeStyle("hasStyleModel");
        return super.hasStyleModel(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Boolean> isStyleLayerPersistent(String str) {
        str.getClass();
        checkNativeStyle("isStyleLayerPersistent");
        return super.isStyleLayerPersistent(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleImport(String str, ImportPosition importPosition) {
        str.getClass();
        checkNativeStyle("moveStyleImport");
        return super.moveStyleImport(str, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleLayer(String str, LayerPosition layerPosition) {
        str.getClass();
        checkNativeStyle("moveStyleLayer");
        return super.moveStyleLayer(str, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImage(String str) {
        str.getClass();
        checkNativeStyle("removeStyleImage");
        return super.removeStyleImage(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImport(String str) {
        str.getClass();
        checkNativeStyle("removeStyleImport");
        return super.removeStyleImport(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleLayer(String str) {
        str.getClass();
        checkNativeStyle("removeStyleLayer");
        return super.removeStyleLayer(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String str) {
        str.getClass();
        checkNativeStyle("removeStyleModel");
        return super.removeStyleModel(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleSource(String str) {
        str.getClass();
        checkNativeStyle("removeStyleSource");
        return super.removeStyleSource(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphere(Value value) {
        value.getClass();
        checkNativeStyle("setStyleAtmosphere");
        return super.setStyleAtmosphere(value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        bitmap.getClass();
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public void setStyleGlyphURL(String str) {
        str.getClass();
        checkNativeStyle("setStyleGlyphURL");
        super.setStyleGlyphURL(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLights(Value value) {
        value.getClass();
        checkNativeStyle("setStyleLights");
        return super.setStyleLights(value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjection(Value value) {
        value.getClass();
        checkNativeStyle("setStyleProjection");
        return super.setStyleProjection(value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrain(Value value) {
        value.getClass();
        checkNativeStyle("setStyleTerrain");
        return super.setStyleTerrain(value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        checkNativeStyle("setStyleTransition");
        super.setStyleTransition(transitionOptions);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleLayerExists(String str) {
        str.getClass();
        checkNativeStyle("styleLayerExists");
        return super.styleLayerExists(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleSourceExists(String str) {
        str.getClass();
        checkNativeStyle("styleSourceExists");
        return super.styleSourceExists(str);
    }

    private final void checkNativeStyle(String str) {
        if (this.isStyleValid) {
            return;
        }
        MapboxLogger.logW(TAG, "Style object (accessing " + str + ") should not be stored and used after MapView is destroyed or new style has been loaded.");
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String str) {
        str.getClass();
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(str);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, ColorTheme colorTheme) {
        str.getClass();
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(str, colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        image.getClass();
        checkNativeStyle("setStyleColorTheme");
        return super.setStyleColorTheme(image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, String str2) {
        str.getClass();
        str2.getClass();
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(str, str2);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String str, Image image) {
        str.getClass();
        image.getClass();
        checkNativeStyle("setImportColorTheme");
        return super.setImportColorTheme(str, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperty(String str, String str2, Value value) {
        str.getClass();
        str2.getClass();
        value.getClass();
        checkNativeStyle("setStyleSourceProperty");
        return super.setStyleSourceProperty(str, str2, value);
    }
}
