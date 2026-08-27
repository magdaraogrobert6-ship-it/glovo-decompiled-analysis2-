package com.mapbox.api.matching.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MapMatchingMatching implements Serializable {
    public static TypeAdapter typeAdapter(Gson gson) {
        return new AutoValue_MapMatchingMatching.GsonTypeAdapter(gson);
    }
}
