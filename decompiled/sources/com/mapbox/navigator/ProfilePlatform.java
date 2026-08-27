package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum ProfilePlatform {
    CUSTOM("Custom"),
    IOS("IOS"),
    ANDROID("Android");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ProfilePlatform(String str) {
        this.str = str;
    }
}
