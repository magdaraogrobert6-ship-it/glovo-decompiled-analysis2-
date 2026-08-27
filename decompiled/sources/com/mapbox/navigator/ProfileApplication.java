package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum ProfileApplication {
    MOBILE("Mobile"),
    AUTO("Auto");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ProfileApplication(String str) {
        this.str = str;
    }
}
