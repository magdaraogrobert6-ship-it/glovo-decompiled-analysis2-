package com.mapbox.maps.extension.style.sources.generated;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Polygon;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.HashMap;
import java.util.List;
import o.isAdapterPositionOnScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class GeoJsonSource extends Source {
    public static final HandlerThread workerThread;
    public String currentData;
    public String currentDataId;
    public GeoJson currentGeoJson;
    public final isAdapterPositionOnScreen mainHandler$delegate;
    public final isAdapterPositionOnScreen workerHandler$delegate;

    public final class Builder {
        public String dataId;
        public Polygon geoJson;
        public final HashMap properties;
        public final String sourceId;
        public final HashMap volatileProperties;

        public final void buffer(long j) {
            this.properties.put("buffer", new PropertyValue("buffer", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(j))));
        }

        public final GeoJsonSource build() {
            this.properties.put(RemoteMessageConst.DATA, new PropertyValue(RemoteMessageConst.DATA, TypeUtils.INSTANCE.wrapToValue("")));
            return new GeoJsonSource(this);
        }

        public final void maxzoom(long j) {
            this.properties.put("maxzoom", new PropertyValue("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(j))));
        }

        public final void tolerance(double d) {
            this.properties.put("tolerance", new PropertyValue("tolerance", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(d))));
        }

        public Builder(String str) {
            str.getClass();
            this.sourceId = str;
            this.properties = new HashMap();
            this.volatileProperties = new HashMap();
            this.dataId = "";
        }
    }

    public GeoJsonSource(Builder builder) {
        super(builder.sourceId);
        getSourceProperties$extension_style_release().putAll(builder.properties);
        getVolatileSourceProperties$extension_style_release().putAll(builder.volatileProperties);
        this.currentGeoJson = builder.geoJson;
        this.currentData = null;
        this.currentDataId = builder.dataId;
        this.workerHandler$delegate = new isAdapterPositionOnScreen(GeoJsonSource$mainHandler$2.INSTANCE$1);
        this.mainHandler$delegate = new isAdapterPositionOnScreen(GeoJsonSource$mainHandler$2.INSTANCE);
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public final String getType$extension_style_release() {
        return "geojson";
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public final void bindTo(MapboxStyleManager mapboxStyleManager) {
        mapboxStyleManager.getClass();
        super.bindTo(mapboxStyleManager);
        GeoJson geoJson = this.currentGeoJson;
        if (geoJson != null) {
            setGeoJson(geoJson, this.currentDataId);
        }
        String str = this.currentData;
        if (str != null) {
            String str2 = this.currentDataId;
            GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(str);
            geoJSONSourceDataValueOf.getClass();
            MapboxStyleManager mapboxStyleManager2 = this.delegate;
            if (mapboxStyleManager2 != null) {
                isAdapterPositionOnScreen isadapterpositiononscreen = this.workerHandler$delegate;
                ((Handler) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).removeCallbacksAndMessages(null);
                ((Handler) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).post(new Schedulers$$ExternalSyntheticLambda1(mapboxStyleManager2, this, str2, geoJSONSourceDataValueOf, 2));
            }
            this.currentData = str;
            this.currentDataId = str2;
            this.currentGeoJson = null;
        }
    }

    public final void setGeoJson(GeoJson geoJson, String str) {
        GeoJSONSourceData geoJSONSourceDataValueOf;
        geoJson.getClass();
        if (geoJson instanceof Feature) {
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf((Feature) geoJson);
            geoJSONSourceDataValueOf.getClass();
        } else if (geoJson instanceof Geometry) {
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf((Geometry) geoJson);
            geoJSONSourceDataValueOf.getClass();
        } else {
            if (!(geoJson instanceof FeatureCollection)) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Incorrect GeoJson data format");
                return;
            }
            List<Feature> listFeatures = ((FeatureCollection) geoJson).features();
            listFeatures.getClass();
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(listFeatures);
            geoJSONSourceDataValueOf.getClass();
        }
        GeoJSONSourceData geoJSONSourceData = geoJSONSourceDataValueOf;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager != null) {
            isAdapterPositionOnScreen isadapterpositiononscreen = this.workerHandler$delegate;
            ((Handler) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).removeCallbacksAndMessages(null);
            ((Handler) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).post(new Schedulers$$ExternalSyntheticLambda1(mapboxStyleManager, this, str, geoJSONSourceData, 2));
        }
        this.currentGeoJson = geoJson;
        this.currentDataId = str;
        this.currentData = null;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("GEOJSON_PARSER", 0);
        handlerThread.start();
        workerThread = handlerThread;
    }
}
