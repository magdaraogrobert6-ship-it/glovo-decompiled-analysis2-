package com.mapbox.navigation.ui.maps.route.line.model;

import java.util.Arrays;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineGranularDistances {
    public final double completeDistance;
    public final RouteLineDistancesIndex[][] legsDistances;
    public final RouteLineDistancesIndex[] routeDistances;
    public final RouteLineDistancesIndex[][][] stepsDistances;

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.completeDistance);
        int iHashCode2 = Arrays.hashCode(this.routeDistances);
        return Arrays.deepHashCode(this.stepsDistances) + ((Arrays.deepHashCode(this.legsDistances) + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public RouteLineGranularDistances(double d, RouteLineDistancesIndex[] routeLineDistancesIndexArr, RouteLineDistancesIndex[][] routeLineDistancesIndexArr2, RouteLineDistancesIndex[][][] routeLineDistancesIndexArr3) {
        this.completeDistance = d;
        this.routeDistances = routeLineDistancesIndexArr;
        this.legsDistances = routeLineDistancesIndexArr2;
        this.stepsDistances = routeLineDistancesIndexArr3;
    }

    public final String toString() {
        return "RouteLineGranularDistances(completeDistance=" + this.completeDistance + ", routeDistances=" + Arrays.toString(this.routeDistances) + ", legsDistances=" + Arrays.toString(this.legsDistances) + ", stepsDistances=" + Arrays.toString(this.stepsDistances) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteLineGranularDistances.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteLineGranularDistances routeLineGranularDistances = (RouteLineGranularDistances) obj;
        return this.completeDistance == routeLineGranularDistances.completeDistance && Arrays.equals(this.routeDistances, routeLineGranularDistances.routeDistances) && onContentCardClicked.RemoteActionCompatParcelizer(this.legsDistances, routeLineGranularDistances.legsDistances) && onContentCardClicked.RemoteActionCompatParcelizer(this.stepsDistances, routeLineGranularDistances.stepsDistances);
    }
}
