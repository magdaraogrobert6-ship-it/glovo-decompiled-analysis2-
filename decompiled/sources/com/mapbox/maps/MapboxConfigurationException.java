package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxConfigurationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConfigurationException(String str) {
        super(str);
        str.getClass();
    }

    public MapboxConfigurationException() {
        super("Using MapView, MapSurface, Snapshotter or other Map components requires providing a valid access token when inflating or creating the map.\nProvide the token by either:\n  1. Creating a mapbox_access_token string resource.\n  2. Or programmatically calling `MapboxOptions.accessToken = <your_access_token>`.\nThe access token parameter is required when using a Mapbox service.\nPlease see https://www.mapbox.com/help/create-api-access-token/ to learn how to create one.\nMore information in this guide https://www.mapbox.com/help/first-steps-android-sdk/#access-tokens.");
    }
}
