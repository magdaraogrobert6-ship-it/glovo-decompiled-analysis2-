package com.mapbox.maps.extension.style.layers.properties.generated;

/* JADX INFO: loaded from: classes2.dex */
public final class LineJoin implements LayerProperty {
    public static final LineJoin ROUND = new LineJoin();

    public final boolean equals(Object obj) {
        return obj instanceof LineJoin;
    }

    public final int hashCode() {
        return 108704142;
    }

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public final String getValue() {
        return "round";
    }

    public final String toString() {
        return "LineJoin(value=round)";
    }
}
