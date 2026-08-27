package com.mapbox.navigation.ui.maps.route.arrow.model;

import com.mapbox.geojson.Feature;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateManeuverArrowValue {
    public final Feature arrowHeadFeature;
    public final Feature arrowShaftFeature;
    public final List layerVisibilityModifications;

    public final int hashCode() {
        int iHashCode = this.layerVisibilityModifications.hashCode();
        Feature feature = this.arrowShaftFeature;
        int iHashCode2 = feature != null ? feature.hashCode() : 0;
        Feature feature2 = this.arrowHeadFeature;
        return (((iHashCode * 31) + iHashCode2) * 31) + (feature2 != null ? feature2.hashCode() : 0);
    }

    public UpdateManeuverArrowValue(List list, Feature feature, Feature feature2) {
        this.layerVisibilityModifications = list;
        this.arrowShaftFeature = feature;
        this.arrowHeadFeature = feature2;
    }

    public final String toString() {
        return "UpdateManeuverArrowValue(layerVisibilityModifications=" + this.layerVisibilityModifications + ", arrowShaftFeature=" + this.arrowShaftFeature + ", arrowHeadFeature=" + this.arrowHeadFeature + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!UpdateManeuverArrowValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        UpdateManeuverArrowValue updateManeuverArrowValue = (UpdateManeuverArrowValue) obj;
        if (!this.layerVisibilityModifications.equals(updateManeuverArrowValue.layerVisibilityModifications)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.arrowShaftFeature, updateManeuverArrowValue.arrowShaftFeature}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.arrowHeadFeature, updateManeuverArrowValue.arrowHeadFeature}, getCieXyz.write())).booleanValue();
    }
}
