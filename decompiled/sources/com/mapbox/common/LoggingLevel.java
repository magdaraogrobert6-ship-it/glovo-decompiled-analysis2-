package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum LoggingLevel {
    DEBUG("Debug"),
    INFO("Info"),
    WARNING("Warning"),
    ERROR("Error");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    LoggingLevel(String str) {
        this.str = str;
    }
}
