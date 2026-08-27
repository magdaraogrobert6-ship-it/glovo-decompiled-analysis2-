package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ShieldSpriteAttribute extends DirectionsJsonObject implements Serializable {
    public abstract Integer height();

    public abstract Integer pixelRatio();

    public abstract List<Double> placeholder();

    public abstract Boolean visible();

    public abstract Integer width();

    public abstract Integer x();

    public abstract Integer y();

    public static TypeAdapter<ShieldSpriteAttribute> typeAdapter(Gson gson) {
        return new AutoValue_ShieldSpriteAttribute.GsonTypeAdapter(gson);
    }
}
