package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface RouteAlternativesControllerInterface {
    void addObserver(RouteAlternativesObserver routeAlternativesObserver);

    void removeAllObservers();

    void removeObserver(RouteAlternativesObserver routeAlternativesObserver);

    void setRouteAlternativesOptions(RouteAlternativesOptions routeAlternativesOptions);
}
