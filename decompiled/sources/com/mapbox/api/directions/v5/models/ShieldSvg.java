package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShieldSvg extends DirectionsJsonObject implements Serializable {
    public abstract String svg();

    public static TypeAdapter<ShieldSvg> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSvg.GsonTypeAdapter(gson);
    }
}
