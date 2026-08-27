package com.mapbox.navigation.core.reroute.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getPageDown;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeRerouteControllerState$RouteFetched extends getPageDown {
    public final String routerOrigin;

    public final int hashCode() {
        return this.routerOrigin.hashCode();
    }

    public NativeRerouteControllerState$RouteFetched(String str) {
        this.routerOrigin = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RouteFetched(routerOrigin='"), this.routerOrigin, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NativeRerouteControllerState$RouteFetched.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.routerOrigin.equals(((NativeRerouteControllerState$RouteFetched) obj).routerOrigin);
    }
}
