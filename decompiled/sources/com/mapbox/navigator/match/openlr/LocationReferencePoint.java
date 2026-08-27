package com.mapbox.navigator.match.openlr;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.FormOfWay;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class LocationReferencePoint implements Serializable {
    private final int bearing;
    private final Point coord;
    private final int distanceToNextPoint;
    private final FormOfWay formOfWay;
    private final OpenLRFunctionalRoadClass functionalRoadClass;
    private final OpenLRFunctionalRoadClass lowestFunctionRoadClassToNextPoint;

    public int getBearing() {
        return this.bearing;
    }

    public Point getCoord() {
        return this.coord;
    }

    public int getDistanceToNextPoint() {
        return this.distanceToNextPoint;
    }

    public FormOfWay getFormOfWay() {
        return this.formOfWay;
    }

    public OpenLRFunctionalRoadClass getFunctionalRoadClass() {
        return this.functionalRoadClass;
    }

    public OpenLRFunctionalRoadClass getLowestFunctionRoadClassToNextPoint() {
        return this.lowestFunctionRoadClassToNextPoint;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        Point point = this.coord;
        OpenLRFunctionalRoadClass openLRFunctionalRoadClass = this.functionalRoadClass;
        FormOfWay formOfWay = this.formOfWay;
        int i = this.bearing;
        return Objects.hash(point, openLRFunctionalRoadClass, formOfWay, Integer.valueOf(i), this.lowestFunctionRoadClassToNextPoint, Integer.valueOf(this.distanceToNextPoint));
    }

    public LocationReferencePoint(Point point, OpenLRFunctionalRoadClass openLRFunctionalRoadClass, FormOfWay formOfWay, int i, OpenLRFunctionalRoadClass openLRFunctionalRoadClass2, int i2) {
        this.coord = point;
        this.functionalRoadClass = openLRFunctionalRoadClass;
        this.formOfWay = formOfWay;
        this.bearing = i;
        this.lowestFunctionRoadClassToNextPoint = openLRFunctionalRoadClass2;
        this.distanceToNextPoint = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[coord: ");
        c8$$ExternalSyntheticOutline0.m(this.coord, sb, ", functionalRoadClass: ");
        sb.append(RecordUtils.fieldToString(this.functionalRoadClass));
        sb.append(", formOfWay: ");
        sb.append(RecordUtils.fieldToString(this.formOfWay));
        sb.append(", bearing: ");
        IconCompatParcelizer.write(this.bearing, ", lowestFunctionRoadClassToNextPoint: ", sb);
        sb.append(RecordUtils.fieldToString(this.lowestFunctionRoadClassToNextPoint));
        sb.append(", distanceToNextPoint: ");
        return SweepGradientShader9KIMszodefault.serializer(this.distanceToNextPoint, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationReferencePoint locationReferencePoint = (LocationReferencePoint) obj;
        return Objects.equals(this.coord, locationReferencePoint.coord) && Objects.equals(this.functionalRoadClass, locationReferencePoint.functionalRoadClass) && Objects.equals(this.formOfWay, locationReferencePoint.formOfWay) && this.bearing == locationReferencePoint.bearing && Objects.equals(this.lowestFunctionRoadClassToNextPoint, locationReferencePoint.lowestFunctionRoadClassToNextPoint) && this.distanceToNextPoint == locationReferencePoint.distanceToNextPoint;
    }
}
