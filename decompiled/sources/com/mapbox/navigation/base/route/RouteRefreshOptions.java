package com.mapbox.navigation.base.route;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefreshOptions {
    public final String toString() {
        return "RouteRefreshOptions(intervalMillis=300000)";
    }

    public final int hashCode() {
        return Long.hashCode(300000L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteRefreshOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }
}
