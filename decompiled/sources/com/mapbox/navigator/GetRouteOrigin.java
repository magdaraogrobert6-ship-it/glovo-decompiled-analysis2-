package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum GetRouteOrigin {
    PLATFORM_SDK("PlatformSDK"),
    NN("NN"),
    CUSTOMER("Customer");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    GetRouteOrigin(String str) {
        this.str = str;
    }
}
