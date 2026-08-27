package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public interface NavigatorObserver {
    void onRoutesChanged(RoutesChangeInfo routesChangeInfo);

    void onStatus(NavigationStatusOrigin navigationStatusOrigin, NavigationStatus navigationStatus);
}
