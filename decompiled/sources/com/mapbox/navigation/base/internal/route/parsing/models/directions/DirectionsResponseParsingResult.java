package com.mapbox.navigation.base.internal.route.parsing.models.directions;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.RouteOptions;
import java.util.ArrayList;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsResponseParsingResult {
    public final String responseUUID;
    public final RouteOptions routeOptions;
    public final ArrayList routesParsingResult;

    public final int hashCode() {
        int iHashCode = this.routesParsingResult.hashCode();
        int iHashCode2 = this.routeOptions.hashCode();
        String str = this.responseUUID;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (str == null ? 0 : str.hashCode());
    }

    public DirectionsResponseParsingResult(ArrayList arrayList, RouteOptions routeOptions, String str) {
        this.routesParsingResult = arrayList;
        this.routeOptions = routeOptions;
        this.responseUUID = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsResponseParsingResult)) {
            return false;
        }
        DirectionsResponseParsingResult directionsResponseParsingResult = (DirectionsResponseParsingResult) obj;
        if (!this.routesParsingResult.equals(directionsResponseParsingResult.routesParsingResult) || !this.routeOptions.equals(directionsResponseParsingResult.routeOptions)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseUUID, directionsResponseParsingResult.responseUUID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionsResponseParsingResult(routesParsingResult=");
        sb.append(this.routesParsingResult);
        sb.append(", routeOptions=");
        sb.append(this.routeOptions);
        sb.append(", responseUUID=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.responseUUID, ')');
    }
}
