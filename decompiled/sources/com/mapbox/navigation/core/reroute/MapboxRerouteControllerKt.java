package com.mapbox.navigation.core.reroute;

import com.mapbox.navigation.core.internal.router.GetRouteSignature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxRerouteControllerKt {
    public static final GetRouteSignature deviationSignature = new GetRouteSignature(GetRouteSignature.Reason.REROUTE_BY_DEVIATION, GetRouteSignature.Origin.SDK);

    static {
        GetRouteSignature.Reason reason = GetRouteSignature.Reason.REROUTE_OTHER;
        GetRouteSignature.Origin origin = GetRouteSignature.Origin.APP;
        reason.getClass();
        origin.getClass();
    }
}
