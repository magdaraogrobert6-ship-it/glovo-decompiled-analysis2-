package com.mapbox.navigation.ui.maps.route.callout.api;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteCalloutUiStateData {
    public final ArrayList callouts;

    public final int hashCode() {
        return this.callouts.hashCode();
    }

    public RouteCalloutUiStateData(ArrayList arrayList) {
        this.callouts = arrayList;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("RouteCalloutUiStateData(callouts="), this.callouts, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteCalloutUiStateData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.callouts.equals(((RouteCalloutUiStateData) obj).callouts);
    }
}
