package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.FormOfWay;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class LineAttributes implements Serializable {
    private final int bearing;
    private final FormOfWay formOfWay;
    private final OpenLRFunctionalRoadClass functionalRoadClass;

    public int getBearing() {
        return this.bearing;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public OpenLRFunctionalRoadClass getFunctionalRoadClass() {
        return this.functionalRoadClass;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.functionalRoadClass, this.formOfWay, Integer.valueOf(this.bearing));
    }

    public LineAttributes(OpenLRFunctionalRoadClass openLRFunctionalRoadClass, FormOfWay formOfWay, int i) {
        this.functionalRoadClass = openLRFunctionalRoadClass;
        this.formOfWay = formOfWay;
        this.bearing = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[functionalRoadClass: ");
        sb.append(RecordUtils.fieldToString(this.functionalRoadClass));
        sb.append(", formOfWay: ");
        sb.append(RecordUtils.fieldToString(this.formOfWay));
        sb.append(", bearing: ");
        return SweepGradientShader9KIMszodefault.serializer(this.bearing, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAttributes lineAttributes = (LineAttributes) obj;
        return Objects.equals(this.functionalRoadClass, lineAttributes.functionalRoadClass) && Objects.equals(this.formOfWay, lineAttributes.formOfWay) && this.bearing == lineAttributes.bearing;
    }
}
