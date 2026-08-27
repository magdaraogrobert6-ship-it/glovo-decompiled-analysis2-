package com.mapbox.navigation.core.routerefresh;

import com.mapbox.bindgen.DataRef;
import o.getCieXyz;
import o.getPageLeft;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresherStatus$Success extends getPageLeft {
    public final DataRef refreshResponse;

    public final int hashCode() {
        return this.refreshResponse.hashCode();
    }

    public RouteRefresherStatus$Success(DataRef dataRef) {
        dataRef.getClass();
        this.refreshResponse = dataRef;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteRefresherStatus$Success)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshResponse, ((RouteRefresherStatus$Success) obj).refreshResponse}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Success(refreshResponse=" + this.refreshResponse + ')';
    }
}
