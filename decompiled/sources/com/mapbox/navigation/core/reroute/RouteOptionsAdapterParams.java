package com.mapbox.navigation.core.reroute;

import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteOptionsAdapterParams {
    public final GetRouteSignature signature;

    public final int hashCode() {
        return this.signature.hashCode();
    }

    public RouteOptionsAdapterParams(GetRouteSignature getRouteSignature) {
        getRouteSignature.getClass();
        this.signature = getRouteSignature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteOptionsAdapterParams)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.signature, ((RouteOptionsAdapterParams) obj).signature}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteOptionsAdapterParams(signature=" + this.signature + ')';
    }
}
