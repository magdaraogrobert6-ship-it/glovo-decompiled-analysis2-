package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedRoadObjectLocation {
    private Type type;
    private Object value;

    public enum Type {
        OPEN_LRLINE_LOCATION,
        OPEN_LRPOINT_ALONG_LINE_LOCATION,
        MATCHED_POLYLINE_LOCATION,
        MATCHED_GANTRY_LOCATION,
        MATCHED_POLYGON_LOCATION,
        MATCHED_POINT_LOCATION,
        MATCHED_SUBGRAPH_LOCATION,
        ROUTE_ALERT_LOCATION
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static MatchedRoadObjectLocation valueOf(OpenLRLineLocation openLRLineLocation) {
        return new MatchedRoadObjectLocation(openLRLineLocation);
    }

    public boolean isMatchedGantryLocation() {
        return this.type == Type.MATCHED_GANTRY_LOCATION;
    }

    public boolean isMatchedPointLocation() {
        return this.type == Type.MATCHED_POINT_LOCATION;
    }

    public boolean isMatchedPolygonLocation() {
        return this.type == Type.MATCHED_POLYGON_LOCATION;
    }

    public boolean isMatchedPolylineLocation() {
        return this.type == Type.MATCHED_POLYLINE_LOCATION;
    }

    public boolean isMatchedSubgraphLocation() {
        return this.type == Type.MATCHED_SUBGRAPH_LOCATION;
    }

    public boolean isOpenLRLineLocation() {
        return this.type == Type.OPEN_LRLINE_LOCATION;
    }

    public boolean isOpenLRPointAlongLineLocation() {
        return this.type == Type.OPEN_LRPOINT_ALONG_LINE_LOCATION;
    }

    public boolean isRouteAlertLocation() {
        return this.type == Type.ROUTE_ALERT_LOCATION;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MatchedRoadObjectLocation(OpenLRLineLocation openLRLineLocation) {
        this.type = Type.OPEN_LRLINE_LOCATION;
        this.value = openLRLineLocation;
    }

    public static MatchedRoadObjectLocation valueOf(OpenLRPointAlongLineLocation openLRPointAlongLineLocation) {
        return new MatchedRoadObjectLocation(openLRPointAlongLineLocation);
    }

    public MatchedGantryLocation getMatchedGantryLocation() {
        if (isMatchedGantryLocation()) {
            return (MatchedGantryLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MatchedGantryLocation)");
        return null;
    }

    public MatchedPointLocation getMatchedPointLocation() {
        if (isMatchedPointLocation()) {
            return (MatchedPointLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MatchedPointLocation)");
        return null;
    }

    public MatchedPolygonLocation getMatchedPolygonLocation() {
        if (isMatchedPolygonLocation()) {
            return (MatchedPolygonLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MatchedPolygonLocation)");
        return null;
    }

    public MatchedPolylineLocation getMatchedPolylineLocation() {
        if (isMatchedPolylineLocation()) {
            return (MatchedPolylineLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MatchedPolylineLocation)");
        return null;
    }

    public MatchedSubgraphLocation getMatchedSubgraphLocation() {
        if (isMatchedSubgraphLocation()) {
            return (MatchedSubgraphLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MatchedSubgraphLocation)");
        return null;
    }

    public OpenLRLineLocation getOpenLRLineLocation() {
        if (isOpenLRLineLocation()) {
            return (OpenLRLineLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (OpenLRLineLocation)");
        return null;
    }

    public OpenLRPointAlongLineLocation getOpenLRPointAlongLineLocation() {
        if (isOpenLRPointAlongLineLocation()) {
            return (OpenLRPointAlongLineLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (OpenLRPointAlongLineLocation)");
        return null;
    }

    public RouteAlertLocation getRouteAlertLocation() {
        if (isRouteAlertLocation()) {
            return (RouteAlertLocation) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (RouteAlertLocation)");
        return null;
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPolylineLocation matchedPolylineLocation) {
        return new MatchedRoadObjectLocation(matchedPolylineLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedGantryLocation matchedGantryLocation) {
        return new MatchedRoadObjectLocation(matchedGantryLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPolygonLocation matchedPolygonLocation) {
        return new MatchedRoadObjectLocation(matchedPolygonLocation);
    }

    public MatchedRoadObjectLocation(OpenLRPointAlongLineLocation openLRPointAlongLineLocation) {
        this.type = Type.OPEN_LRPOINT_ALONG_LINE_LOCATION;
        this.value = openLRPointAlongLineLocation;
    }

    public static MatchedRoadObjectLocation valueOf(MatchedPointLocation matchedPointLocation) {
        return new MatchedRoadObjectLocation(matchedPointLocation);
    }

    public static MatchedRoadObjectLocation valueOf(MatchedSubgraphLocation matchedSubgraphLocation) {
        return new MatchedRoadObjectLocation(matchedSubgraphLocation);
    }

    public static MatchedRoadObjectLocation valueOf(RouteAlertLocation routeAlertLocation) {
        return new MatchedRoadObjectLocation(routeAlertLocation);
    }

    public MatchedRoadObjectLocation(MatchedPolylineLocation matchedPolylineLocation) {
        this.type = Type.MATCHED_POLYLINE_LOCATION;
        this.value = matchedPolylineLocation;
    }

    public MatchedRoadObjectLocation(MatchedGantryLocation matchedGantryLocation) {
        this.type = Type.MATCHED_GANTRY_LOCATION;
        this.value = matchedGantryLocation;
    }

    public MatchedRoadObjectLocation(MatchedPolygonLocation matchedPolygonLocation) {
        this.type = Type.MATCHED_POLYGON_LOCATION;
        this.value = matchedPolygonLocation;
    }

    public MatchedRoadObjectLocation(MatchedPointLocation matchedPointLocation) {
        this.type = Type.MATCHED_POINT_LOCATION;
        this.value = matchedPointLocation;
    }

    public MatchedRoadObjectLocation(MatchedSubgraphLocation matchedSubgraphLocation) {
        this.type = Type.MATCHED_SUBGRAPH_LOCATION;
        this.value = matchedSubgraphLocation;
    }

    public MatchedRoadObjectLocation(RouteAlertLocation routeAlertLocation) {
        this.type = Type.ROUTE_ALERT_LOCATION;
        this.value = routeAlertLocation;
    }
}
