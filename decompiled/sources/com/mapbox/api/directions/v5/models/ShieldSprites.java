package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShieldSprites extends DirectionsJsonObject implements Serializable {
    public abstract List<ShieldSprite> sprites();

    public static TypeAdapter<ShieldSprites> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSprites.GsonTypeAdapter(gson);
    }
}
