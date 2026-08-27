package com.mapbox.maps;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes5.dex */
@onItemDismisslambda0
public final class MapboxTracing {
    public static final MapboxTracing INSTANCE = new MapboxTracing();
    private static final com.mapbox.common.MapboxTracing impl = com.mapbox.common.MapboxTracing.INSTANCE;

    private MapboxTracing() {
    }

    public final void disableAll() {
        impl.disableAll();
    }

    public final void enableAll() {
        impl.enableAll();
    }

    public final void enableCore() {
        impl.enableCore();
    }

    public final void enablePlatform() {
        impl.enablePlatform();
    }
}
