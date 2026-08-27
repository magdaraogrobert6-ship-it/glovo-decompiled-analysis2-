package com.mapbox.navigation.tripdata.maneuver;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ManeuverState {
    public final List allManeuvers;
    public DirectionsRoute route;

    public ManeuverState() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.route = null;
        this.allManeuvers = copyOnWriteArrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManeuverState)) {
            return false;
        }
        ManeuverState maneuverState = (ManeuverState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, maneuverState.route}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.allManeuvers, maneuverState.allManeuvers}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManeuverState(route=");
        sb.append(this.route);
        sb.append(", allManeuvers=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.allManeuvers, ')');
    }

    public final int hashCode() {
        DirectionsRoute directionsRoute = this.route;
        return this.allManeuvers.hashCode() + ((directionsRoute == null ? 0 : directionsRoute.hashCode()) * 31);
    }
}
