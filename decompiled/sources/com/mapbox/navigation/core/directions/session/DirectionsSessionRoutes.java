package com.mapbox.navigation.core.directions.session;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.getCutText;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsSessionRoutes {
    public final List acceptedRoutes;
    public final List ignoredRoutes;
    public final getCutText setRoutesInfo;

    public final int hashCode() {
        return this.setRoutesInfo.hashCode() + c8$$ExternalSyntheticOutline0.m(this.ignoredRoutes, this.acceptedRoutes.hashCode() * 31, 31);
    }

    public DirectionsSessionRoutes(List list, List list2, getCutText getcuttext) {
        getcuttext.getClass();
        this.acceptedRoutes = list;
        this.ignoredRoutes = list2;
        this.setRoutesInfo = getcuttext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsSessionRoutes)) {
            return false;
        }
        DirectionsSessionRoutes directionsSessionRoutes = (DirectionsSessionRoutes) obj;
        if (!this.acceptedRoutes.equals(directionsSessionRoutes.acceptedRoutes) || !this.ignoredRoutes.equals(directionsSessionRoutes.ignoredRoutes)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.setRoutesInfo, directionsSessionRoutes.setRoutesInfo}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DirectionsSessionRoutes(acceptedRoutes=" + this.acceptedRoutes + ", ignoredRoutes=" + this.ignoredRoutes + ", setRoutesInfo=" + this.setRoutesInfo + ')';
    }
}
