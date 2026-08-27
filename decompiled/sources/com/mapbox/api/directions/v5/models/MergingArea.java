package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MergingArea extends DirectionsJsonObject {

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface Type {
    }

    @Type
    public abstract String type();

    public static TypeAdapter<MergingArea> typeAdapter(Gson gson) {
        return new AutoValue_MergingArea.GsonTypeAdapter(gson);
    }
}
