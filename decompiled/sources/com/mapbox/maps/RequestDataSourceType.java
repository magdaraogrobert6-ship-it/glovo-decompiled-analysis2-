package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestDataSourceType {
    ASSET("Asset"),
    DATABASE("Database"),
    FILE_SYSTEM("FileSystem"),
    NETWORK("Network"),
    RESOURCE_LOADER("ResourceLoader");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RequestDataSourceType(String str) {
        this.str = str;
    }
}
