package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum HttpMethod {
    GET("Get"),
    HEAD("Head"),
    POST("Post");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    HttpMethod(String str) {
        this.str = str;
    }
}
