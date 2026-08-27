package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface RerouteControllerInterface {
    void cancel();

    void reroute(String str, RerouteCallback rerouteCallback);

    void setOptionsAdapter(RouteOptionsAdapter routeOptionsAdapter);
}
