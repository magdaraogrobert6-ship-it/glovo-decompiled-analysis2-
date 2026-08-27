package com.sentiance.sdk;

import o.getBitmapFromCachelambda2;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum DetectionStatus {
    DISABLED,
    EXPIRED,
    ENABLED_BUT_BLOCKED,
    ENABLED_AND_DETECTING;

    public static DetectionStatus fromSdkStatus(SdkStatus.StartStatus startStatus) {
        int i = getBitmapFromCachelambda2.read[startStatus.ordinal()];
        if (i == 1) {
            return ENABLED_BUT_BLOCKED;
        }
        if (i != 2) {
            return i != 3 ? DISABLED : ENABLED_AND_DETECTING;
        }
        return EXPIRED;
    }
}
