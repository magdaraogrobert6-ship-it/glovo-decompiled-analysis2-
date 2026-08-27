package com.mapbox.navigation.base.internal.utils;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteResponseInfo {
    public final int sizeBytes;

    public final int hashCode() {
        return Integer.hashCode(this.sizeBytes);
    }

    public RouteResponseInfo(int i) {
        this.sizeBytes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteResponseInfo) && this.sizeBytes == ((RouteResponseInfo) obj).sizeBytes;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("RouteResponseInfo(sizeBytes="), this.sizeBytes, ')');
    }
}
