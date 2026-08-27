package com.mapbox.navigation.core.reroute;

import java.util.ArrayList;
import o.getOnAutofillText;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeMapboxRerouteController$RerouteResponseParsingResult$RoutesAvailable extends getOnAutofillText {
    public final ArrayList newRoutes;

    public final int hashCode() {
        return Integer.hashCode(0) + (this.newRoutes.hashCode() * 31);
    }

    public NativeMapboxRerouteController$RerouteResponseParsingResult$RoutesAvailable(ArrayList arrayList) {
        this.newRoutes = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NativeMapboxRerouteController$RerouteResponseParsingResult$RoutesAvailable) && this.newRoutes.equals(((NativeMapboxRerouteController$RerouteResponseParsingResult$RoutesAvailable) obj).newRoutes);
    }

    public final String toString() {
        return "RoutesAvailable(newRoutes=" + this.newRoutes + ", primaryRouteLegIndex=0)";
    }
}
