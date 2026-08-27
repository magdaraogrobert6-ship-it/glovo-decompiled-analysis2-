package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public enum ConfigurationOptionsSource {
    LOCAL("Local"),
    SERVER("Server");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ConfigurationOptionsSource(String str) {
        this.str = str;
    }
}
