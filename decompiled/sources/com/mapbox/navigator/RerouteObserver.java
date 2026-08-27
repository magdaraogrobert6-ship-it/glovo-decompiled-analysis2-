package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes3.dex */
public interface RerouteObserver {
    void onRerouteCancelled();

    boolean onRerouteDetected(String str);

    void onRerouteFailed(RerouteError rerouteError);

    void onRerouteReceived(DataRef dataRef, String str, RouterOrigin routerOrigin);

    void onSwitchToAlternative(RouteInterface routeInterface, int i);
}
