package com.mapbox.navigation.ui.maps.route.arrow.model;

import com.mapbox.geojson.FeatureCollection;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrowAddedValue {
    public final FeatureCollection arrowHeadFeatureCollection;
    public final FeatureCollection arrowShaftFeatureCollection;

    public final int hashCode() {
        return this.arrowHeadFeatureCollection.hashCode() + (this.arrowShaftFeatureCollection.hashCode() * 31);
    }

    public ArrowAddedValue(FeatureCollection featureCollection, FeatureCollection featureCollection2) {
        this.arrowShaftFeatureCollection = featureCollection;
        this.arrowHeadFeatureCollection = featureCollection2;
    }

    public final String toString() {
        return "ArrowAddedValue(arrowShaftFeatureCollection=" + this.arrowShaftFeatureCollection + ", arrowHeadFeatureCollection=" + this.arrowHeadFeatureCollection + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ArrowAddedValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ArrowAddedValue arrowAddedValue = (ArrowAddedValue) obj;
        return this.arrowShaftFeatureCollection.equals(arrowAddedValue.arrowShaftFeatureCollection) && this.arrowHeadFeatureCollection.equals(arrowAddedValue.arrowHeadFeatureCollection);
    }
}
