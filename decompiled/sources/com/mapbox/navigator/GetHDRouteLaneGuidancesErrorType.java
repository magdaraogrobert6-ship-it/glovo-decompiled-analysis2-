package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum GetHDRouteLaneGuidancesErrorType {
    NOT_READY("NotReady"),
    CANCELLED("Cancelled");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    GetHDRouteLaneGuidancesErrorType(String str) {
        this.str = str;
    }
}
