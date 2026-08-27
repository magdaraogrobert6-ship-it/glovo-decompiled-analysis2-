package com.mapbox.navigation.core.routerefresh;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getOnFillData;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefreshValidator$RouteValidationResult$Invalid extends getOnFillData {
    public final String reason;

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public RouteRefreshValidator$RouteValidationResult$Invalid(String str) {
        this.reason = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteRefreshValidator$RouteValidationResult$Invalid) && this.reason.equals(((RouteRefreshValidator$RouteValidationResult$Invalid) obj).reason);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Invalid(reason="), this.reason, ')');
    }
}
