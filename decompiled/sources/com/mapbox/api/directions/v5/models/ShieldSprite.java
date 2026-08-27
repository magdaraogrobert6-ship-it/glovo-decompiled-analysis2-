package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShieldSprite extends DirectionsJsonObject implements Serializable {
    public abstract ShieldSpriteAttribute spriteAttributes();

    public abstract String spriteName();

    public static TypeAdapter<ShieldSprite> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSprite.GsonTypeAdapter(gson);
    }
}
