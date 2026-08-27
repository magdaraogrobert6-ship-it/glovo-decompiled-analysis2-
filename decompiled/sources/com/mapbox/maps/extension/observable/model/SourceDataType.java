package com.mapbox.maps.extension.observable.model;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public enum SourceDataType {
    METADATA("metadata"),
    TILE("tile");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    SourceDataType(String str) {
        this.value = str;
    }
}
