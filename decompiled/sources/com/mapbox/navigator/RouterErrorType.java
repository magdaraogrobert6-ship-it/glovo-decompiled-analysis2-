package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RouterErrorType {
    UNKNOWN("Unknown"),
    REQUEST_CANCELLED("RequestCancelled"),
    THROTTLING_ERROR("ThrottlingError"),
    INPUT_ERROR("InputError"),
    NETWORK_ERROR("NetworkError"),
    AUTHENTICATION_ERROR("AuthenticationError"),
    ROUTE_CREATION_ERROR("RouteCreationError"),
    MAP_MATCHING_CREATION_ERROR("MapMatchingCreationError"),
    MISSING_TILES_ERROR("MissingTilesError"),
    ROUTE_NOT_FOUND_ON_SERVER("RouteNotFoundOnServer");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RouterErrorType(String str) {
        this.str = str;
    }
}
