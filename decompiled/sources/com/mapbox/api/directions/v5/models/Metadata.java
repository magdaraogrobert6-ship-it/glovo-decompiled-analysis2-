package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Metadata extends DirectionsJsonObject {
    @SerializedName("map")
    public abstract Map<String, String> infoMap();

    public static TypeAdapter<Metadata> typeAdapter(Gson gson) {
        return new AutoValue_Metadata.GsonTypeAdapter(gson);
    }
}
