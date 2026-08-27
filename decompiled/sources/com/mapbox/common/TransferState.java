package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum TransferState {
    PENDING,
    IN_PROGRESS,
    FAILED,
    FINISHED;

    private int getValue() {
        return ordinal();
    }
}
