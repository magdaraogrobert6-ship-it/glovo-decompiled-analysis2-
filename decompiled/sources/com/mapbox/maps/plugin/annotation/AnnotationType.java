package com.mapbox.maps.plugin.annotation;

/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationType {
    PolygonAnnotation(1),
    PolylineAnnotation(2),
    PointAnnotation(3),
    CircleAnnotation(4);

    private int value;

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    AnnotationType(int i) {
        this.value = i;
    }
}
