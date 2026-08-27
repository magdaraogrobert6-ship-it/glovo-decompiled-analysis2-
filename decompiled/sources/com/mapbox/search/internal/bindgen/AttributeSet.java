package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes4.dex */
public enum AttributeSet {
    BASIC,
    PHOTOS,
    VENUE,
    VISIT;

    private int getValue() {
        return ordinal();
    }
}
