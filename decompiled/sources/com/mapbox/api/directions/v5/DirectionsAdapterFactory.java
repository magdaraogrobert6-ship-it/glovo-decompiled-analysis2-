package com.mapbox.api.directions.v5;

import com.google.gson.TypeAdapterFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_DirectionsAdapterFactory();
    }
}
