package com.mapbox.navigation.base.options;

import java.net.URI;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutingTilesOptions {
    public final URI tilesBaseUri;

    public final int hashCode() {
        return ((((((this.tilesBaseUri.hashCode() * 31) - 1081373969) * 31) - 1040922121) * 923521) + 56) * 961;
    }

    public RoutingTilesOptions(URI uri) {
        this.tilesBaseUri = uri;
    }

    public final String toString() {
        return "RoutingTilesOptions(tilesBaseUri=" + this.tilesBaseUri + ", tilesDataset='mapbox', tilesProfile='driving-traffic', tilesVersion='', filePath=null, tileStore=null, minDaysBetweenServerAndLocalTilesVersion=56, hdTilesOptions=null)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutingTilesOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.tilesBaseUri.equals(((RoutingTilesOptions) obj).tilesBaseUri);
    }
}
