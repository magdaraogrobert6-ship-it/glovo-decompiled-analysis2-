package com.sentiance.sdk.eventtimeline.timelines.creators;

/* JADX INFO: loaded from: classes3.dex */
public enum CallType {
    UNKNOWN(0),
    NO_CALL(1),
    VOIP_CALL(2),
    MOBILE_CALL(3);

    public final int value;

    CallType(int i) {
        this.value = i;
    }

    public static CallType findByValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_CALL;
        }
        if (i == 2) {
            return VOIP_CALL;
        }
        if (i != 3) {
            return null;
        }
        return MOBILE_CALL;
    }
}
