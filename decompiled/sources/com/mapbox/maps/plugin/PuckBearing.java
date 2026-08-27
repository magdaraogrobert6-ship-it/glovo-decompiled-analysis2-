package com.mapbox.maps.plugin;

/* JADX INFO: loaded from: classes2.dex */
public enum PuckBearing {
    HEADING("heading"),
    COURSE("course");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    PuckBearing(String str) {
        this.value = str;
    }
}
