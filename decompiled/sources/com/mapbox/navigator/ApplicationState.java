package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum ApplicationState {
    BACKGROUND("Background"),
    FOREGROUND("Foreground");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ApplicationState(String str) {
        this.str = str;
    }
}
