package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxOptions {
    public static final MapboxOptions INSTANCE = new MapboxOptions();

    private MapboxOptions() {
    }

    public static /* synthetic */ void getAccessToken$annotations() {
    }

    public static final void setAccessToken(String str) {
        str.getClass();
        MapboxOptionsImpl.setAccessToken(str);
    }

    public static final String getAccessToken() {
        String accessToken = MapboxOptionsImpl.getAccessToken();
        accessToken.getClass();
        return accessToken;
    }
}
