package com.mapbox.maps.plugin.locationcomponent;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationLayerRenderer {
    void addLayers(ProtobufEncoder protobufEncoder);

    void clearBitmaps();

    void hide();

    void initializeComponents(MapboxStyleManager mapboxStyleManager);

    boolean isRendererInitialised();

    void removeLayers();

    void setAccuracyRadius(float f);

    void setBearing(double d);

    void setLatLng(Point point);

    void show();

    void slot(String str);

    void styleAccuracy(int i, int i2);

    void styleScaling(Value value);

    void updatePulsingUi(int i, float f, Float f2);

    void updateStyle(Style style);
}
