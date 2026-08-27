package com.sentiance.sdk.devicestate;

import com.huawei.hms.support.api.location.common.LocationConstant;

/* JADX INFO: loaded from: classes3.dex */
public enum Permission {
    COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
    GOOGLE_ACTIVITY_RECOGNITION("com.google.android.gms.permission.ACTIVITY_RECOGNITION"),
    IGNORE_BATTERY_OPTIMIZATIONS("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"),
    ACTIVITY_RECOGNITION("android.permission.ACTIVITY_RECOGNITION"),
    HIGH_SAMPLING_RATE("android.permission.HIGH_SAMPLING_RATE_SENSORS"),
    ACCESS_BACKGROUND_LOCATION(LocationConstant.BACKGROUND_PERMISSION);

    public final String fullName;

    Permission(String str) {
        this.fullName = str;
    }
}
