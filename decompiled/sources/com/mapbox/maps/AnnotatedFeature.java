package com.mapbox.maps;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotatedFeature {
    private Type type;
    private Object value;

    public enum Type {
        GEOMETRY,
        ANNOTATED_LAYER_FEATURE
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static AnnotatedFeature valueOf(Geometry geometry) {
        return new AnnotatedFeature(geometry);
    }

    public boolean isAnnotatedLayerFeature() {
        return this.type == Type.ANNOTATED_LAYER_FEATURE;
    }

    public boolean isGeometry() {
        return this.type == Type.GEOMETRY;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public AnnotatedFeature(Geometry geometry) {
        this.type = Type.GEOMETRY;
        this.value = geometry;
    }

    public static AnnotatedFeature valueOf(AnnotatedLayerFeature annotatedLayerFeature) {
        return new AnnotatedFeature(annotatedLayerFeature);
    }

    public AnnotatedLayerFeature getAnnotatedLayerFeature() {
        if (isAnnotatedLayerFeature()) {
            return (AnnotatedLayerFeature) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (AnnotatedLayerFeature)");
        return null;
    }

    public Geometry getGeometry() {
        if (isGeometry()) {
            return (Geometry) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (Geometry)");
        return null;
    }

    public AnnotatedFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        this.type = Type.ANNOTATED_LAYER_FEATURE;
        this.value = annotatedLayerFeature;
    }
}
