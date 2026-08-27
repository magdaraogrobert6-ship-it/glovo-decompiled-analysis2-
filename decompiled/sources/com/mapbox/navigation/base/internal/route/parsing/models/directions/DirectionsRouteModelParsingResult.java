package com.mapbox.navigation.base.internal.route.parsing.models.directions;

import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsRouteModelParsingResult {
    public final DirectionsParsedRouteData data;
    public final x operations;

    public final int hashCode() {
        return this.operations.hashCode() + (this.data.hashCode() * 31);
    }

    public DirectionsRouteModelParsingResult(DirectionsParsedRouteData directionsParsedRouteData, x xVar) {
        this.data = directionsParsedRouteData;
        this.operations = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsRouteModelParsingResult)) {
            return false;
        }
        DirectionsRouteModelParsingResult directionsRouteModelParsingResult = (DirectionsRouteModelParsingResult) obj;
        return this.data.equals(directionsRouteModelParsingResult.data) && this.operations.equals(directionsRouteModelParsingResult.operations);
    }

    public final String toString() {
        return "DirectionsRouteModelParsingResult(data=" + this.data + ", operations=" + this.operations + ')';
    }
}
