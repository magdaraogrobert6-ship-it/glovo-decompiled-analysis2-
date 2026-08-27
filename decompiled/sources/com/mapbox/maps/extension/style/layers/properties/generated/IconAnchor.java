package com.mapbox.maps.extension.style.layers.properties.generated;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class IconAnchor implements LayerProperty {
    public final String value;
    public static final IconAnchor CENTER = new IconAnchor("center");
    public static final IconAnchor LEFT = new IconAnchor("left");
    public static final IconAnchor RIGHT = new IconAnchor("right");
    public static final IconAnchor TOP = new IconAnchor("top");
    public static final IconAnchor BOTTOM = new IconAnchor("bottom");
    public static final IconAnchor TOP_LEFT = new IconAnchor("top-left");
    public static final IconAnchor TOP_RIGHT = new IconAnchor("top-right");
    public static final IconAnchor BOTTOM_LEFT = new IconAnchor("bottom-left");
    public static final IconAnchor BOTTOM_RIGHT = new IconAnchor("bottom-right");

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public IconAnchor(String str) {
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IconAnchor) {
            return this.value.equals(((IconAnchor) obj).value);
        }
        return false;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("IconAnchor(value="), this.value, ')');
    }
}
