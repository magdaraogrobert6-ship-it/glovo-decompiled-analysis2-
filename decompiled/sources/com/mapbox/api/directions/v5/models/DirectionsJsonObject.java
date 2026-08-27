package com.mapbox.api.directions.v5.models;

import com.google.android.gms.internal.mlkit_vision_face.zzky;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsJsonObject implements Serializable {
    public abstract Map<String, SerializableJsonElement> unrecognized();

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        return gsonBuilder.create().toJson(this);
    }

    public static abstract class Builder<T extends Builder> {
        public abstract T unrecognized(Map<String, SerializableJsonElement> map);

        public T unrecognizedJsonProperties(Map<String, JsonElement> map) {
            return (T) unrecognized(zzky.toSerializableProperties(map));
        }
    }

    public final Map<String, JsonElement> getUnrecognizedJsonProperties() {
        return zzky.fromSerializableProperties(unrecognized());
    }

    public final Set<String> getUnrecognizedPropertiesNames() {
        Map<String, SerializableJsonElement> mapUnrecognized = unrecognized();
        return mapUnrecognized != null ? mapUnrecognized.keySet() : Collections.EMPTY_SET;
    }

    public final JsonElement getUnrecognizedProperty(String str) {
        SerializableJsonElement serializableJsonElement;
        Map<String, SerializableJsonElement> mapUnrecognized = unrecognized();
        if (mapUnrecognized == null || (serializableJsonElement = mapUnrecognized.get(str)) == null) {
            return null;
        }
        return serializableJsonElement.element;
    }
}
