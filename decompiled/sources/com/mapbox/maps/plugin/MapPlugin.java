package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public interface MapPlugin {
    void cleanup();

    void initialize();

    void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl);
}
