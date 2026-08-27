package com.mapbox.navigator;

/* JADX INFO: loaded from: classes4.dex */
public interface RouteRefreshObserver {
    void onRouteRefreshAnnotationsUpdated(RouteIdentifier routeIdentifier, String str, int i, int i2);

    void onRouteRefreshCancelled(RouteIdentifier routeIdentifier);

    void onRouteRefreshFailed(RouteIdentifier routeIdentifier, RouteRefreshError routeRefreshError);
}
