package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum HistoryRecordType {
    UPDATE_LOCATION,
    GET_STATUS,
    SET_ROUTE,
    PUSH_HISTORY;

    private int getValue() {
        return ordinal();
    }
}
