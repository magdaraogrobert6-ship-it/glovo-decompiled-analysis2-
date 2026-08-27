package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsResponse extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract DirectionsResponse autoBuild();

        public abstract Builder routes(List<DirectionsRoute> list);

        public abstract List<DirectionsRoute> routes();

        public abstract String uuid();

        public DirectionsResponse build() {
            ArrayList arrayList = new ArrayList(routes().size());
            for (int i = 0; i < routes().size(); i++) {
                arrayList.add(i, routes().get(i).toBuilder().routeIndex(String.valueOf(i)).requestUuid(uuid()).build());
            }
            routes(arrayList);
            return autoBuild();
        }
    }

    public abstract String code();

    public abstract String message();

    public abstract Metadata metadata();

    public abstract List<DirectionsRoute> routes();

    public abstract Builder toBuilder();

    public abstract String uuid();

    public abstract List<DirectionsWaypoint> waypoints();

    private static Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        return gsonBuilder.create();
    }

    public static TypeAdapter<DirectionsResponse> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsResponse.GsonTypeAdapter(gson);
    }

    public static DirectionsResponse fromJson(Reader reader) {
        return ((DirectionsResponse) createGson().fromJson(reader, DirectionsResponse.class)).toBuilder().build();
    }
}
