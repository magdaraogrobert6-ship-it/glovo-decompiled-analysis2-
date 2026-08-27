package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum PartialPolylineDistanceCalculationStrategy {
    ONLY_MATCHED,
    BY_INPUT_GEOMETRY;

    private int getValue() {
        return ordinal();
    }
}
