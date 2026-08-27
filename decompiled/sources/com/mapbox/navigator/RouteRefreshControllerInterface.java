package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public interface RouteRefreshControllerInterface {
    void addObserver(RouteRefreshObserver routeRefreshObserver);

    void removeAllObservers();

    void removeObserver(RouteRefreshObserver routeRefreshObserver);
}
