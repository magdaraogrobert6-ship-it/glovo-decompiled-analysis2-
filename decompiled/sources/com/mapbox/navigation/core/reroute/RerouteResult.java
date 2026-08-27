package com.mapbox.navigation.core.reroute;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class RerouteResult {
    public final int initialLegIndex;
    public final String origin;
    public final ArrayList routes;

    public final int hashCode() {
        int iHashCode = this.routes.hashCode();
        return this.origin.hashCode() + (((iHashCode * 31) + this.initialLegIndex) * 31);
    }

    public RerouteResult(int i, String str, ArrayList arrayList) {
        this.routes = arrayList;
        this.initialLegIndex = i;
        this.origin = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RerouteResult(routes=");
        sb.append(this.routes);
        sb.append(", initialLegIndex=");
        sb.append(this.initialLegIndex);
        sb.append(", origin=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.origin, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RerouteResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RerouteResult rerouteResult = (RerouteResult) obj;
        if (this.routes.equals(rerouteResult.routes) && this.initialLegIndex == rerouteResult.initialLegIndex) {
            return this.origin.equals(rerouteResult.origin);
        }
        return false;
    }
}
