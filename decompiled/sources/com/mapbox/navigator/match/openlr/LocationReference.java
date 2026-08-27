package com.mapbox.navigator.match.openlr;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public class LocationReference {
    private Type type;
    private Object value;

    public enum Type {
        LINE_LOCATION_REFERENCE,
        POINT_ALONG_LINE_LOCATION_REFERENCE,
        POIWITH_ACCESS_POINT_LOCATION_REFERENCE,
        CIRCLE_LOCATION_REFERENCE,
        RECTANGLE_LOCATION_REFERENCE,
        GRID_LOCATION_REFERENCE,
        POLYGON_LOCATION_REFERENCE,
        CLOSED_LINE_LOCATION_REFERENCE,
        GEO_COORDINATE_LOCATION_REFERENCE
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static LocationReference valueOf(LineLocationReference lineLocationReference) {
        return new LocationReference(lineLocationReference);
    }

    public boolean isCircleLocationReference() {
        return this.type == Type.CIRCLE_LOCATION_REFERENCE;
    }

    public boolean isClosedLineLocationReference() {
        return this.type == Type.CLOSED_LINE_LOCATION_REFERENCE;
    }

    public boolean isGeoCoordinateLocationReference() {
        return this.type == Type.GEO_COORDINATE_LOCATION_REFERENCE;
    }

    public boolean isGridLocationReference() {
        return this.type == Type.GRID_LOCATION_REFERENCE;
    }

    public boolean isLineLocationReference() {
        return this.type == Type.LINE_LOCATION_REFERENCE;
    }

    public boolean isPOIWithAccessPointLocationReference() {
        return this.type == Type.POIWITH_ACCESS_POINT_LOCATION_REFERENCE;
    }

    public boolean isPointAlongLineLocationReference() {
        return this.type == Type.POINT_ALONG_LINE_LOCATION_REFERENCE;
    }

    public boolean isPolygonLocationReference() {
        return this.type == Type.POLYGON_LOCATION_REFERENCE;
    }

    public boolean isRectangleLocationReference() {
        return this.type == Type.RECTANGLE_LOCATION_REFERENCE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public LocationReference(LineLocationReference lineLocationReference) {
        this.type = Type.LINE_LOCATION_REFERENCE;
        this.value = lineLocationReference;
    }

    public static LocationReference valueOf(PointAlongLineLocationReference pointAlongLineLocationReference) {
        return new LocationReference(pointAlongLineLocationReference);
    }

    public CircleLocationReference getCircleLocationReference() {
        if (isCircleLocationReference()) {
            return (CircleLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (CircleLocationReference)");
        return null;
    }

    public ClosedLineLocationReference getClosedLineLocationReference() {
        if (isClosedLineLocationReference()) {
            return (ClosedLineLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ClosedLineLocationReference)");
        return null;
    }

    public GeoCoordinateLocationReference getGeoCoordinateLocationReference() {
        if (isGeoCoordinateLocationReference()) {
            return (GeoCoordinateLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (GeoCoordinateLocationReference)");
        return null;
    }

    public GridLocationReference getGridLocationReference() {
        if (isGridLocationReference()) {
            return (GridLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (GridLocationReference)");
        return null;
    }

    public LineLocationReference getLineLocationReference() {
        if (isLineLocationReference()) {
            return (LineLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (LineLocationReference)");
        return null;
    }

    public POIWithAccessPointLocationReference getPOIWithAccessPointLocationReference() {
        if (isPOIWithAccessPointLocationReference()) {
            return (POIWithAccessPointLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (POIWithAccessPointLocationReference)");
        return null;
    }

    public PointAlongLineLocationReference getPointAlongLineLocationReference() {
        if (isPointAlongLineLocationReference()) {
            return (PointAlongLineLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PointAlongLineLocationReference)");
        return null;
    }

    public PolygonLocationReference getPolygonLocationReference() {
        if (isPolygonLocationReference()) {
            return (PolygonLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (PolygonLocationReference)");
        return null;
    }

    public RectangleLocationReference getRectangleLocationReference() {
        if (isRectangleLocationReference()) {
            return (RectangleLocationReference) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (RectangleLocationReference)");
        return null;
    }

    public static LocationReference valueOf(POIWithAccessPointLocationReference pOIWithAccessPointLocationReference) {
        return new LocationReference(pOIWithAccessPointLocationReference);
    }

    public static LocationReference valueOf(CircleLocationReference circleLocationReference) {
        return new LocationReference(circleLocationReference);
    }

    public static LocationReference valueOf(RectangleLocationReference rectangleLocationReference) {
        return new LocationReference(rectangleLocationReference);
    }

    public LocationReference(PointAlongLineLocationReference pointAlongLineLocationReference) {
        this.type = Type.POINT_ALONG_LINE_LOCATION_REFERENCE;
        this.value = pointAlongLineLocationReference;
    }

    public static LocationReference valueOf(GridLocationReference gridLocationReference) {
        return new LocationReference(gridLocationReference);
    }

    public static LocationReference valueOf(PolygonLocationReference polygonLocationReference) {
        return new LocationReference(polygonLocationReference);
    }

    public static LocationReference valueOf(ClosedLineLocationReference closedLineLocationReference) {
        return new LocationReference(closedLineLocationReference);
    }

    public LocationReference(POIWithAccessPointLocationReference pOIWithAccessPointLocationReference) {
        this.type = Type.POIWITH_ACCESS_POINT_LOCATION_REFERENCE;
        this.value = pOIWithAccessPointLocationReference;
    }

    public static LocationReference valueOf(GeoCoordinateLocationReference geoCoordinateLocationReference) {
        return new LocationReference(geoCoordinateLocationReference);
    }

    public LocationReference(CircleLocationReference circleLocationReference) {
        this.type = Type.CIRCLE_LOCATION_REFERENCE;
        this.value = circleLocationReference;
    }

    public LocationReference(RectangleLocationReference rectangleLocationReference) {
        this.type = Type.RECTANGLE_LOCATION_REFERENCE;
        this.value = rectangleLocationReference;
    }

    public LocationReference(GridLocationReference gridLocationReference) {
        this.type = Type.GRID_LOCATION_REFERENCE;
        this.value = gridLocationReference;
    }

    public LocationReference(PolygonLocationReference polygonLocationReference) {
        this.type = Type.POLYGON_LOCATION_REFERENCE;
        this.value = polygonLocationReference;
    }

    public LocationReference(ClosedLineLocationReference closedLineLocationReference) {
        this.type = Type.CLOSED_LINE_LOCATION_REFERENCE;
        this.value = closedLineLocationReference;
    }

    public LocationReference(GeoCoordinateLocationReference geoCoordinateLocationReference) {
        this.type = Type.GEO_COORDINATE_LOCATION_REFERENCE;
        this.value = geoCoordinateLocationReference;
    }
}
