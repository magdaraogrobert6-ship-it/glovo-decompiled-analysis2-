package com.sentiance.sdk.devicestate;

import o.isGeofencesEnabledFromEnvironmentlambda3;

/* JADX INFO: loaded from: classes3.dex */
public enum LocationPermissionLevel {
    ALWAYS,
    ONLY_WHILE_IN_USE,
    NEVER;

    public byte toEventConstant() {
        int i = isGeofencesEnabledFromEnvironmentlambda3.IconCompatParcelizer[ordinal()];
        if (i != 1) {
            return i != 2 ? (byte) 3 : (byte) 5;
        }
        return (byte) 4;
    }
}
