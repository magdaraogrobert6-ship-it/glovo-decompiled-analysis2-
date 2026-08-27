package com.mapbox.navigation.ui.maps.route.callout.model;

import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.route.NavigationRoute;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteCallout {
    public final long durationDifferenceWithPrimary;
    public final boolean isPrimary;
    public final NavigationRoute route;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(this.route.hashCode() * 31, 31, this.isPrimary);
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return Long.hashCode(this.durationDifferenceWithPrimary) + iM;
    }

    public RouteCallout(NavigationRoute navigationRoute, boolean z, long j) {
        this.route = navigationRoute;
        this.isPrimary = z;
        this.durationDifferenceWithPrimary = j;
    }

    public final String toString() {
        return "RouteCallout(route=" + this.route + ", isPrimary=" + this.isPrimary + ", durationDifferenceWithPrimary=" + ((Object) BrazeInAppMessageManagerExternalSyntheticLambda2.MediaBrowserCompatMediaItem(this.durationDifferenceWithPrimary)) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteCallout.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteCallout routeCallout = (RouteCallout) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route, routeCallout.route}, getCieXyz.write())).booleanValue() && this.isPrimary == routeCallout.isPrimary && BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(this.durationDifferenceWithPrimary, routeCallout.durationDifferenceWithPrimary);
    }
}
