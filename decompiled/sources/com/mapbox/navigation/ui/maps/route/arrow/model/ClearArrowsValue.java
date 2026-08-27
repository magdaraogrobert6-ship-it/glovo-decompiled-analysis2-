package com.mapbox.navigation.ui.maps.route.arrow.model;

import com.mapbox.geojson.FeatureCollection;

/* JADX INFO: loaded from: classes2.dex */
public final class ClearArrowsValue {
    public final FeatureCollection arrowHeadFeatureCollection;
    public final FeatureCollection arrowShaftFeatureCollection;

    public final int hashCode() {
        return this.arrowHeadFeatureCollection.hashCode() + (this.arrowShaftFeatureCollection.hashCode() * 31);
    }

    public ClearArrowsValue(FeatureCollection featureCollection, FeatureCollection featureCollection2) {
        this.arrowShaftFeatureCollection = featureCollection;
        this.arrowHeadFeatureCollection = featureCollection2;
    }

    public final String toString() {
        return "ClearArrowsValue(arrowShaftFeatureCollection=" + this.arrowShaftFeatureCollection + ", arrowHeadFeatureCollection=" + this.arrowHeadFeatureCollection + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ClearArrowsValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ClearArrowsValue clearArrowsValue = (ClearArrowsValue) obj;
        return this.arrowShaftFeatureCollection.equals(clearArrowsValue.arrowShaftFeatureCollection) && this.arrowHeadFeatureCollection.equals(clearArrowsValue.arrowHeadFeatureCollection);
    }
}
