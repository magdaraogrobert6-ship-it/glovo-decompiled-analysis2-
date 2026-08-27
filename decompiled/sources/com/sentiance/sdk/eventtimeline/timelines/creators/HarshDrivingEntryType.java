package com.sentiance.sdk.eventtimeline.timelines.creators;

import android.annotation.SuppressLint;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public enum HarshDrivingEntryType {
    NO_EVENT(0),
    ACCELERATING(1),
    BRAKING(2),
    TURN(3);

    public final int value;

    public boolean isHarshEvent() {
        return this.value > NO_EVENT.value;
    }

    HarshDrivingEntryType(int i) {
        this.value = i;
    }

    @SuppressLint
    public static HarshDrivingEntryType of(int i) {
        if (i == 0) {
            return NO_EVENT;
        }
        if (i == 1) {
            return ACCELERATING;
        }
        if (i == 2) {
            return BRAKING;
        }
        if (i == 3) {
            return TURN;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(c8$$ExternalSyntheticOutline0.m(i, "Unknown value: "));
        return null;
    }
}
