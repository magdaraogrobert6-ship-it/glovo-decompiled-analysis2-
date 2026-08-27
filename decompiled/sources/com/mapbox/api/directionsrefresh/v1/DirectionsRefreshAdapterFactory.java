package com.mapbox.api.directionsrefresh.v1;

import com.google.gson.TypeAdapterFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsRefreshAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_DirectionsRefreshAdapterFactory();
    }
}
