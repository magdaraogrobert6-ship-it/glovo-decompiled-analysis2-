package com.mapbox.navigation.core.routerefresh;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefreshStateResult {
    public final String message;
    public final String state;

    public final int hashCode() {
        int iHashCode = this.state.hashCode();
        String str = this.message;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public RouteRefreshStateResult(String str, String str2) {
        str.getClass();
        this.state = str;
        this.message = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteRefreshStateResult(state='");
        sb.append(this.state);
        sb.append("', message=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.message, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteRefreshStateResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteRefreshStateResult routeRefreshStateResult = (RouteRefreshStateResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, routeRefreshStateResult.state}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, routeRefreshStateResult.message}, getCieXyz.write())).booleanValue();
    }
}
