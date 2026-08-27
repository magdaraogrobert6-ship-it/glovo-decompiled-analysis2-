package com.mapbox.maps.extension.observable.model;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public enum StyleDataType {
    STYLE("style"),
    SPRITE("sprite"),
    SOURCES("sources");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    StyleDataType(String str) {
        this.value = str;
    }
}
