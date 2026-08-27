package com.mapbox.navigation.base.utils;

import o.disposeCurrentNodes;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DecodeUtils$RouteList$AddResult$Added extends disposeCurrentNodes {
    public final DecodeUtils.CachedRouteInfo evicted;

    public DecodeUtils$RouteList$AddResult$Added(DecodeUtils.CachedRouteInfo cachedRouteInfo) {
        this.evicted = cachedRouteInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecodeUtils$RouteList$AddResult$Added)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.evicted, ((DecodeUtils$RouteList$AddResult$Added) obj).evicted}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Added(evicted=" + this.evicted + ')';
    }

    public final int hashCode() {
        DecodeUtils.CachedRouteInfo cachedRouteInfo = this.evicted;
        if (cachedRouteInfo == null) {
            return 0;
        }
        return cachedRouteInfo.hashCode();
    }
}
