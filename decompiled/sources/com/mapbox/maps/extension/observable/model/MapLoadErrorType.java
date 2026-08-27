package com.mapbox.maps.extension.observable.model;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public enum MapLoadErrorType {
    STYLE("style"),
    SPRITE("sprite"),
    SOURCE("source"),
    TILE("tile"),
    GLYPHS("glyphs");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    MapLoadErrorType(String str) {
        this.value = str;
    }
}
