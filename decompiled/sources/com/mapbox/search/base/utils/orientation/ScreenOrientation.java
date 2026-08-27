package com.mapbox.search.base.utils.orientation;

/* JADX INFO: loaded from: classes3.dex */
public enum ScreenOrientation {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");

    private final String rawValue;

    public final String getRawValue() {
        return this.rawValue;
    }

    ScreenOrientation(String str) {
        this.rawValue = str;
    }
}
