package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestErrorType {
    SUCCESS("Success"),
    NOT_FOUND("NotFound"),
    SERVER("Server"),
    CONNECTION("Connection"),
    RATE_LIMIT("RateLimit"),
    IN_OFFLINE_MODE("InOfflineMode"),
    OTHER("Other");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RequestErrorType(String str) {
        this.str = str;
    }
}
