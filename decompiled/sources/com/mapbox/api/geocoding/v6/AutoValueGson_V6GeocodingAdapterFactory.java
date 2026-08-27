package com.mapbox.api.geocoding.v6;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.geocoding.v5.models.AutoValue_CarmenContext;
import com.mapbox.api.geocoding.v5.models.AutoValue_CarmenFeature;
import com.mapbox.api.geocoding.v5.models.AutoValue_GeocodingResponse;
import com.mapbox.api.geocoding.v5.models.AutoValue_RoutablePoint;
import com.mapbox.api.geocoding.v5.models.AutoValue_RoutablePoints;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6BatchResponse;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6Context;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6ContextAddress;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6ContextElement;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6Coordinates;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6Feature;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6MatchCode;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6Properties;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6Response;
import com.mapbox.api.geocoding.v6.models.AutoValue_V6RoutablePoint;
import com.mapbox.api.matching.v5.models.AutoValue_MapMatchingError;
import com.mapbox.api.matching.v5.models.AutoValue_MapMatchingResponse;
import com.mapbox.api.matching.v5.models.AutoValue_MapMatchingTracepoint;
import com.mapbox.api.matching.v5.models.MapMatchingMatching;
import com.mapbox.api.matrix.v1.models.AutoValue_MatrixResponse;
import com.mapbox.api.optimization.v1.models.AutoValue_OptimizationResponse;
import com.mapbox.api.optimization.v1.models.AutoValue_OptimizationWaypoint;
import com.mapbox.api.routetiles.v1.versions.models.AutoValue_RouteTileVersionsResponse;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValueGson_V6GeocodingAdapterFactory extends V6GeocodingAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (AutoValue_CarmenContext.class.isAssignableFrom(rawType)) {
            return AutoValue_CarmenContext.typeAdapter(gson);
        }
        if (AutoValue_CarmenFeature.class.isAssignableFrom(rawType)) {
            return AutoValue_CarmenFeature.typeAdapter(gson);
        }
        if (AutoValue_GeocodingResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_GeocodingResponse.typeAdapter(gson);
        }
        if (AutoValue_RoutablePoint.class.isAssignableFrom(rawType)) {
            return AutoValue_RoutablePoint.typeAdapter(gson);
        }
        if (AutoValue_RoutablePoints.class.isAssignableFrom(rawType)) {
            return AutoValue_RoutablePoints.typeAdapter(gson);
        }
        if (AutoValue_V6ForwardGeocodingRequestOptions.class.isAssignableFrom(rawType)) {
            return new AutoValue_V6ForwardGeocodingRequestOptions.GsonTypeAdapter(gson);
        }
        if (AutoValue_V6ReverseGeocodingRequestOptions.class.isAssignableFrom(rawType)) {
            return new AutoValue_V6ReverseGeocodingRequestOptions.GsonTypeAdapter(gson);
        }
        if (AutoValue_V6BatchResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_V6BatchResponse.typeAdapter(gson);
        }
        if (AutoValue_V6Context.class.isAssignableFrom(rawType)) {
            return AutoValue_V6Context.typeAdapter(gson);
        }
        if (AutoValue_V6ContextAddress.class.isAssignableFrom(rawType)) {
            return AutoValue_V6ContextAddress.typeAdapter(gson);
        }
        if (AutoValue_V6ContextElement.class.isAssignableFrom(rawType)) {
            return AutoValue_V6ContextElement.typeAdapter(gson);
        }
        if (AutoValue_V6Coordinates.class.isAssignableFrom(rawType)) {
            return AutoValue_V6Coordinates.typeAdapter(gson);
        }
        if (AutoValue_V6Feature.class.isAssignableFrom(rawType)) {
            return AutoValue_V6Feature.typeAdapter(gson);
        }
        if (AutoValue_V6MatchCode.class.isAssignableFrom(rawType)) {
            return AutoValue_V6MatchCode.typeAdapter(gson);
        }
        if (AutoValue_V6Properties.class.isAssignableFrom(rawType)) {
            return AutoValue_V6Properties.typeAdapter(gson);
        }
        if (AutoValue_V6Response.class.isAssignableFrom(rawType)) {
            return AutoValue_V6Response.typeAdapter(gson);
        }
        if (AutoValue_V6RoutablePoint.class.isAssignableFrom(rawType)) {
            return AutoValue_V6RoutablePoint.typeAdapter(gson);
        }
        if (AutoValue_MapMatchingError.class.isAssignableFrom(rawType)) {
            return AutoValue_MapMatchingError.typeAdapter(gson);
        }
        if (MapMatchingMatching.class.isAssignableFrom(rawType)) {
            return MapMatchingMatching.typeAdapter(gson);
        }
        if (AutoValue_MapMatchingResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_MapMatchingResponse.typeAdapter(gson);
        }
        if (AutoValue_MapMatchingTracepoint.class.isAssignableFrom(rawType)) {
            return AutoValue_MapMatchingTracepoint.typeAdapter(gson);
        }
        if (AutoValue_MatrixResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_MatrixResponse.typeAdapter(gson);
        }
        if (AutoValue_OptimizationResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_OptimizationResponse.typeAdapter(gson);
        }
        if (AutoValue_OptimizationWaypoint.class.isAssignableFrom(rawType)) {
            return AutoValue_OptimizationWaypoint.typeAdapter(gson);
        }
        if (AutoValue_RouteTileVersionsResponse.class.isAssignableFrom(rawType)) {
            return AutoValue_RouteTileVersionsResponse.typeAdapter(gson);
        }
        return null;
    }
}
