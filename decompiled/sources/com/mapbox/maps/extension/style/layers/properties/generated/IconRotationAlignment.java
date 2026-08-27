package com.mapbox.maps.extension.style.layers.properties.generated;

/* JADX INFO: loaded from: classes2.dex */
public final class IconRotationAlignment implements LayerProperty {
    public static final IconRotationAlignment MAP = new IconRotationAlignment();

    public final boolean equals(Object obj) {
        return obj instanceof IconRotationAlignment;
    }

    public final int hashCode() {
        return 107868;
    }

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public final String getValue() {
        return "map";
    }

    public final String toString() {
        return "IconRotationAlignment(value=map)";
    }
}
