package com.mapbox.navigation.base.internal.route.parsing.models.directions;

import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationRouteParsingSuccessfulResult {
    public final ArrayList routes;

    public final int hashCode() {
        return this.routes.hashCode();
    }

    public NavigationRouteParsingSuccessfulResult(ArrayList arrayList) {
        this.routes = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NavigationRouteParsingSuccessfulResult) && this.routes.equals(((NavigationRouteParsingSuccessfulResult) obj).routes);
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline1.m(new StringBuilder("NavigationRouteParsingSuccessfulResult(routes="), this.routes, ')');
    }
}
