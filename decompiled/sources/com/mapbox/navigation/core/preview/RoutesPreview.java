package com.mapbox.navigation.core.preview;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesPreview {
    public final ArrayList alternativesMetadata;
    public final List originalRoutesList;
    public final int primaryRouteIndex;
    public final List routesList;

    public final int hashCode() {
        return Integer.hashCode(this.primaryRouteIndex) + c8$$ExternalSyntheticOutline0.m(this.originalRoutesList, r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.write(this.alternativesMetadata, this.routesList.hashCode() * 31, 31), 31);
    }

    public RoutesPreview(List list, ArrayList arrayList, List list2, int i) {
        this.routesList = list;
        this.alternativesMetadata = arrayList;
        this.originalRoutesList = list2;
        this.primaryRouteIndex = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutesPreview(routesList=");
        sb.append(this.routesList);
        sb.append(", alternativesMetadata=");
        sb.append(this.alternativesMetadata);
        sb.append(", originalRoutesList=");
        sb.append(this.originalRoutesList);
        sb.append(", primaryRouteIndex=");
        return af$$ExternalSyntheticOutline0.m(sb, this.primaryRouteIndex, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoutesPreview.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoutesPreview routesPreview = (RoutesPreview) obj;
        return this.routesList.equals(routesPreview.routesList) && this.alternativesMetadata.equals(routesPreview.alternativesMetadata) && this.originalRoutesList.equals(routesPreview.originalRoutesList) && this.primaryRouteIndex == routesPreview.primaryRouteIndex;
    }
}
