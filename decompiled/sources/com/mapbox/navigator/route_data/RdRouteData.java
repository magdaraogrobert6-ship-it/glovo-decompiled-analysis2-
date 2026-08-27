package com.mapbox.navigator.route_data;

/* JADX INFO: loaded from: classes5.dex */
public interface RdRouteData {
    double distance();

    double duration();

    RdCoordinateArray geometry();

    RdLegArray legs();

    String voiceLocale();

    RdWaypointArray waypoints();

    double weight();

    String weightName();
}
