package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public enum ModelScaleMode {
    MAP("map"),
    VIEWPORT("viewport");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    ModelScaleMode(String str) {
        this.value = str;
    }
}
