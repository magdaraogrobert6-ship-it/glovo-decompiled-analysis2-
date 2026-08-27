package com.mapbox.navigation.core.reroute;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.util.APKUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class RerouteStateV2$RouteFetched extends APKUtil {
    public final String routerOrigin;

    public final int hashCode() {
        return this.routerOrigin.hashCode();
    }

    public RerouteStateV2$RouteFetched(String str) {
        this.routerOrigin = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RouteFetched(routerOrigin='"), this.routerOrigin, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RerouteStateV2$RouteFetched.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.routerOrigin.equals(((RerouteStateV2$RouteFetched) obj).routerOrigin);
    }
}
