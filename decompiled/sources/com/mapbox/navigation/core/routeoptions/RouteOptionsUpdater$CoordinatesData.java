package com.mapbox.navigation.core.routeoptions;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteOptionsUpdater$CoordinatesData {
    public final List coordinates;
    public final int nextCoordinateIndex;
    public final int remainingCoordinates;

    public final int hashCode() {
        return Integer.hashCode(this.remainingCoordinates) + af$$ExternalSyntheticOutline0.m(this.nextCoordinateIndex, this.coordinates.hashCode() * 31, 31);
    }

    public RouteOptionsUpdater$CoordinatesData(List list, int i, int i2) {
        this.coordinates = list;
        this.nextCoordinateIndex = i;
        this.remainingCoordinates = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteOptionsUpdater$CoordinatesData)) {
            return false;
        }
        RouteOptionsUpdater$CoordinatesData routeOptionsUpdater$CoordinatesData = (RouteOptionsUpdater$CoordinatesData) obj;
        return this.coordinates.equals(routeOptionsUpdater$CoordinatesData.coordinates) && this.nextCoordinateIndex == routeOptionsUpdater$CoordinatesData.nextCoordinateIndex && this.remainingCoordinates == routeOptionsUpdater$CoordinatesData.remainingCoordinates;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoordinatesData(coordinates=");
        sb.append(this.coordinates);
        sb.append(", nextCoordinateIndex=");
        sb.append(this.nextCoordinateIndex);
        sb.append(", remainingCoordinates=");
        return af$$ExternalSyntheticOutline0.m(sb, this.remainingCoordinates, ')');
    }
}
