package com.mapbox.api.directionsrefresh.v1;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRefreshResponse;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_DirectionsRouteRefresh;
import com.mapbox.api.directionsrefresh.v1.models.AutoValue_RouteLegRefresh;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValueGson_DirectionsRefreshAdapterFactory extends DirectionsRefreshAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (AutoValue_DirectionsRefreshResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_DirectionsRefreshResponse.typeAdapter(gson);
        }
        if (AutoValue_DirectionsRouteRefresh.class.isAssignableFrom(rawType)) {
            return AutoValue_DirectionsRouteRefresh.typeAdapter(gson);
        }
        if (AutoValue_RouteLegRefresh.class.isAssignableFrom(rawType)) {
            return AutoValue_RouteLegRefresh.typeAdapter(gson);
        }
        return null;
    }
}
