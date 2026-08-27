package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public enum ScrollMode {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical"),
    HORIZONTAL_AND_VERTICAL("horizontal-and-vertical");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    ScrollMode(String str) {
        this.value = str;
    }
}
