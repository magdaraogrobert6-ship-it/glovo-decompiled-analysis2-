package com.mapbox.navigation.navigator.internal;

import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigator.NavigationStatus;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class TripStatus {
    public final NavigationStatus navigationStatus;
    public final NavigationRoute route;

    public TripStatus(NavigationRoute navigationRoute, NavigationStatus navigationStatus) {
        this.route = navigationRoute;
        this.navigationStatus = navigationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripStatus)) {
            return false;
        }
        TripStatus tripStatus = (TripStatus) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, tripStatus.route}, getCieXyz.write())).booleanValue() && this.navigationStatus.equals(tripStatus.navigationStatus);
    }

    public final String toString() {
        return "TripStatus(route=" + this.route + ", navigationStatus=" + this.navigationStatus + ')';
    }

    public final int hashCode() {
        NavigationRoute navigationRoute = this.route;
        return this.navigationStatus.hashCode() + ((navigationRoute == null ? 0 : navigationRoute.hashCode()) * 31);
    }
}
