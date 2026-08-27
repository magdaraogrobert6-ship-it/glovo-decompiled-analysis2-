package com.mapbox.navigation.base.internal.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class AlternativesInfo {
    public final RouteResponseInfo routeResponseInfo;

    public final int hashCode() {
        return Integer.hashCode(this.routeResponseInfo.sizeBytes);
    }

    public AlternativesInfo(RouteResponseInfo routeResponseInfo) {
        this.routeResponseInfo = routeResponseInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlternativesInfo) && this.routeResponseInfo.equals(((AlternativesInfo) obj).routeResponseInfo);
    }

    public final String toString() {
        return "AlternativesInfo(routeResponseInfo=" + this.routeResponseInfo + ')';
    }
}
