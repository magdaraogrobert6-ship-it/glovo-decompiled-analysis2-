package com.sentiance.sdk.eventtimeline.timelines.creators;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public enum SafetyScoreType {
    SMOOTH("smooth"),
    FOCUS("focus"),
    CALL_WHILE_MOVING("call_while_moving"),
    LEGAL("legal"),
    OVERALL("overall"),
    HARSH_BRAKING("harsh_braking"),
    HARSH_TURNING("harsh_turning"),
    HARSH_ACCELERATION("harsh_acceleration"),
    WRONG_WAY_DRIVING("wrong_way_driving"),
    ATTENTION("attention");

    public final String value;

    SafetyScoreType(String str) {
        this.value = str;
    }

    @SuppressLint
    public static SafetyScoreType of(String str) {
        for (SafetyScoreType safetyScoreType : values()) {
            if (safetyScoreType.value.equals(str)) {
                return safetyScoreType;
            }
        }
        return null;
    }
}
