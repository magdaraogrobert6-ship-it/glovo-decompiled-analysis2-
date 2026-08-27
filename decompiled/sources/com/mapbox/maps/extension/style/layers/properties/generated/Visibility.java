package com.mapbox.maps.extension.style.layers.properties.generated;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class Visibility implements LayerProperty {
    public final String value;
    public static final Visibility VISIBLE = new Visibility("visible");
    public static final Visibility NONE = new Visibility("none");

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public Visibility(String str) {
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Visibility) {
            return this.value.equals(((Visibility) obj).value);
        }
        return false;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Visibility(value="), this.value, ')');
    }
}
