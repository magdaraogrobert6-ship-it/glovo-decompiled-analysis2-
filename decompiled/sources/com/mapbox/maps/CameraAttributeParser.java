package com.mapbox.maps;

import android.content.res.TypedArray;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAttributeParser {
    public static final CameraAttributeParser INSTANCE = new CameraAttributeParser();
    private static CameraOptions.Builder cameraOptionsBuilder;

    private CameraAttributeParser() {
    }

    private final double getCameraFloatAttribute(int i, TypedArray typedArray) {
        double d = typedArray.getFloat(i, 0.0f);
        if (cameraOptionsBuilder != null || d == 0.0d) {
            return d;
        }
        cameraOptionsBuilder = new CameraOptions.Builder();
        return d;
    }

    public final CameraOptions parseCameraOptions(TypedArray typedArray, float f) {
        CameraOptions.Builder builder;
        CameraOptions.Builder builder2;
        CameraOptions.Builder builder3;
        CameraOptions.Builder builder4;
        CameraOptions.Builder builder5;
        CameraOptions.Builder builder6;
        typedArray.getClass();
        cameraOptionsBuilder = null;
        CameraAttributeParser cameraAttributeParser = INSTANCE;
        double cameraFloatAttribute = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraZoom, typedArray);
        if (cameraFloatAttribute != 0.0d && (builder6 = cameraOptionsBuilder) != null) {
            builder6.zoom(Double.valueOf(cameraFloatAttribute));
        }
        double cameraFloatAttribute2 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraTargetLng, typedArray);
        double cameraFloatAttribute3 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraTargetLat, typedArray);
        if ((cameraFloatAttribute3 != 0.0d || cameraFloatAttribute2 != 0.0d) && (builder = cameraOptionsBuilder) != null) {
            builder.center(Point.fromLngLat(cameraFloatAttribute2, cameraFloatAttribute3));
        }
        double cameraFloatAttribute4 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraBearing, typedArray);
        if (cameraFloatAttribute4 != 0.0d && (builder5 = cameraOptionsBuilder) != null) {
            builder5.bearing(Double.valueOf(cameraFloatAttribute4));
        }
        double cameraFloatAttribute5 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPitch, typedArray);
        if (cameraFloatAttribute5 != 0.0d && (builder4 = cameraOptionsBuilder) != null) {
            builder4.pitch(Double.valueOf(cameraFloatAttribute5));
        }
        double cameraFloatAttribute6 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraAnchorX, typedArray);
        double cameraFloatAttribute7 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraAnchorY, typedArray);
        if ((cameraFloatAttribute6 != 0.0d || cameraFloatAttribute7 != 0.0d) && (builder2 = cameraOptionsBuilder) != null) {
            builder2.anchor(new ScreenCoordinate(cameraFloatAttribute6, cameraFloatAttribute7));
        }
        double cameraFloatAttribute8 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingTop, typedArray);
        double cameraFloatAttribute9 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingLeft, typedArray);
        double cameraFloatAttribute10 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingBottom, typedArray);
        double cameraFloatAttribute11 = cameraAttributeParser.getCameraFloatAttribute(R.styleable.mapbox_MapView_mapbox_cameraPaddingRight, typedArray);
        if ((cameraFloatAttribute8 != 0.0d || cameraFloatAttribute9 != 0.0d || cameraFloatAttribute10 != 0.0d || cameraFloatAttribute11 != 0.0d) && (builder3 = cameraOptionsBuilder) != null) {
            builder3.padding(new EdgeInsets(cameraFloatAttribute8, cameraFloatAttribute9, cameraFloatAttribute10, cameraFloatAttribute11));
        }
        CameraOptions.Builder builder7 = cameraOptionsBuilder;
        if (builder7 != null) {
            return builder7.build();
        }
        return null;
    }

    public static /* synthetic */ CameraOptions parseCameraOptions$default(CameraAttributeParser cameraAttributeParser, TypedArray typedArray, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return cameraAttributeParser.parseCameraOptions(typedArray, f);
    }
}
