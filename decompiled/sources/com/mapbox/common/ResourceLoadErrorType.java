package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ResourceLoadErrorType {
    ERRORED,
    UNSATISFIED,
    CANCELED,
    INVALID_ARGUMENT,
    INSUFFICIENT_STORAGE,
    INTEGRITY_CHECK_ERROR;

    private int getValue() {
        return ordinal();
    }
}
