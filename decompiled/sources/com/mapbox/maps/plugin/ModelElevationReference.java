package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public enum ModelElevationReference {
    SEA("sea"),
    GROUND("ground");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    ModelElevationReference(String str) {
        this.value = str;
    }
}
