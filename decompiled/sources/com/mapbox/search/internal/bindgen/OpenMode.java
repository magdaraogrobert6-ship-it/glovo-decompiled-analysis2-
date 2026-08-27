package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum OpenMode {
    ALWAYS_OPEN,
    TEMPORARILY_CLOSED,
    PERMANENTLY_CLOSED,
    SCHEDULED;

    private int getValue() {
        return ordinal();
    }
}
