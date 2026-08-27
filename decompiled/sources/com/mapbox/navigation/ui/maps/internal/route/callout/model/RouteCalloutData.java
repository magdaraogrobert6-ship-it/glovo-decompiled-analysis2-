package com.mapbox.navigation.ui.maps.internal.route.callout.model;

import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteCalloutData {
    public final List callouts;

    public final int hashCode() {
        return this.callouts.hashCode();
    }

    public RouteCalloutData(List list) {
        list.getClass();
        this.callouts = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteCalloutData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.callouts, ((RouteCalloutData) obj).callouts}, getCieXyz.write())).booleanValue();
    }
}
