package com.mapbox.navigation.ui.maps.route.line.model;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NavigationRouteLine {
    private final String identifier;
    private final NavigationRoute route;

    public final String getIdentifier() {
        return this.identifier;
    }

    public final NavigationRoute getRoute() {
        return this.route;
    }

    public int hashCode() {
        int iHashCode = this.route.hashCode();
        String str = this.identifier;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public NavigationRouteLine(NavigationRoute navigationRoute, String str) {
        navigationRoute.getClass();
        this.route = navigationRoute;
        this.identifier = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavigationRouteLine(route=");
        sb.append(this.route);
        sb.append(", identifier=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.identifier, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationRouteLine.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NavigationRouteLine navigationRouteLine = (NavigationRouteLine) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, navigationRouteLine.route}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.identifier, navigationRouteLine.identifier}, getCieXyz.write())).booleanValue();
    }
}
